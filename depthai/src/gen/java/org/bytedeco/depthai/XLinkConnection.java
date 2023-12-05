// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Represents connection between host and device over XLink protocol
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkConnection extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkConnection(Pointer p) { super(p); }

    // static API

    /**
     * Returns information of all connected devices with given state
     *
     * @param state State which the devices should be in
     * @param skipInvalidDevices whether or not to skip over devices that cannot be successfully communicated with
     * @return Vector of connected device information
     */
    public static native @StdVector DeviceInfo getAllConnectedDevices(@Cast("XLinkDeviceState_t") int state/*=X_LINK_ANY_STATE*/, @Cast("bool") boolean skipInvalidDevices/*=true*/);
    public static native @StdVector DeviceInfo getAllConnectedDevices();

    /**
     * Returns information of first device with given state
     * @param state State which the device should be in
     * @return Device information
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstDevice(@Cast("XLinkDeviceState_t") int state/*=X_LINK_ANY_STATE*/, @Cast("bool") boolean skipInvalidDevices/*=true*/);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstDevice();

    /**
     * Finds a device by MX ID. Example: 14442C10D13EABCE00
     * @param mxId MyraidX ID which uniquely specifies a device
     * @param state Which state should the device be in
     * @param skipInvalidDevices Whether or not to skip devices that cannot be fully detected
     * @return Tuple of bool and DeviceInfo. Bool specifies if device was found. DeviceInfo specifies the found device
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString BytePointer mxId, @Cast("XLinkDeviceState_t") int state/*=X_LINK_ANY_STATE*/, @Cast("bool") boolean skipInvalidDevice/*=true*/);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString BytePointer mxId);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString ByteBuffer mxId, @Cast("XLinkDeviceState_t") int state/*=X_LINK_ANY_STATE*/, @Cast("bool") boolean skipInvalidDevice/*=true*/);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString ByteBuffer mxId);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString String mxId, @Cast("XLinkDeviceState_t") int state/*=X_LINK_ANY_STATE*/, @Cast("bool") boolean skipInvalidDevice/*=true*/);
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getDeviceByMxId(@StdString String mxId);

    /**
     * Tries booting the given device into bootloader state
     *
     * @param devInfo Information of device which it should boot into bootloader state
     * @return New device information if successful
     */
    public static native @ByVal DeviceInfo bootBootloader(@Const @ByRef DeviceInfo devInfo);

    /**
     * Get current accumulated profiling data
     *
     * @return ProfilingData from the specific connection
     */
    public static native @ByVal ProfilingData getGlobalProfilingData();

    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector BytePointer mvcmdBinary, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/) { super((Pointer)null); allocate(deviceDesc, mvcmdBinary, expectedState); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector BytePointer mvcmdBinary, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector BytePointer mvcmdBinary) { super((Pointer)null); allocate(deviceDesc, mvcmdBinary); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector BytePointer mvcmdBinary);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector ByteBuffer mvcmdBinary, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/) { super((Pointer)null); allocate(deviceDesc, mvcmdBinary, expectedState); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector ByteBuffer mvcmdBinary, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector ByteBuffer mvcmdBinary) { super((Pointer)null); allocate(deviceDesc, mvcmdBinary); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector ByteBuffer mvcmdBinary);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector byte[] mvcmdBinary, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/) { super((Pointer)null); allocate(deviceDesc, mvcmdBinary, expectedState); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector byte[] mvcmdBinary, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector byte[] mvcmdBinary) { super((Pointer)null); allocate(deviceDesc, mvcmdBinary); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @Cast("std::uint8_t*") @StdVector byte[] mvcmdBinary);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @ByVal Path pathToMvcmd, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/) { super((Pointer)null); allocate(deviceDesc, pathToMvcmd, expectedState); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @ByVal Path pathToMvcmd, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @ByVal Path pathToMvcmd) { super((Pointer)null); allocate(deviceDesc, pathToMvcmd); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @ByVal Path pathToMvcmd);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/) { super((Pointer)null); allocate(deviceDesc, expectedState); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc, @Cast("XLinkDeviceState_t") int expectedState/*=X_LINK_BOOTED*/);
    public XLinkConnection(@Const @ByRef DeviceInfo deviceDesc) { super((Pointer)null); allocate(deviceDesc); }
    private native void allocate(@Const @ByRef DeviceInfo deviceDesc);

    public native void setRebootOnDestruction(@Cast("bool") boolean reboot);
    public native @Cast("bool") boolean getRebootOnDestruction();

    public native int getLinkId();

    /**
     * Explicitly closes xlink connection.
     * \note This function does not need to be explicitly called
     * as destructor closes the connection automatically
     */
    public native @Name("close") void _close();

    /**
     * Is the connection already closed (or disconnected)
     *
     * \warning This function is thread-unsafe and may return outdated incorrect values. It is
     * only meant for use in simple single-threaded code. Well written code should handle
     * exceptions when calling any DepthAI apis to handle hardware events and multithreaded use.
     */
    public native @Cast("bool") boolean isClosed();

    /**
     * Get current accumulated profiling data
     *
     * @return ProfilingData from the specific connection
     */
    public native @ByVal ProfilingData getProfilingData();
}
