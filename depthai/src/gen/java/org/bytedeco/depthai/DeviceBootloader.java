// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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


// DeviceBootloader (RAII), connects to device and maintains watchdog ...

/**
 * Represents the DepthAI bootloader with the methods to interact with it.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DeviceBootloader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceBootloader(Pointer p) { super(p); }

    // Alias

    /** Bootloader version structure */
    @NoOffset public static class Version extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Version(Pointer p) { super(p); }
    
        /** Construct Version from string */
        public Version(@StdString BytePointer v) { super((Pointer)null); allocate(v); }
        private native void allocate(@StdString BytePointer v);
        public Version(@StdString String v) { super((Pointer)null); allocate(v); }
        private native void allocate(@StdString String v);
        /** Construct Version major, minor and patch numbers */
        public Version(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch) { super((Pointer)null); allocate(major, minor, patch); }
        private native void allocate(@Cast("unsigned") int major, @Cast("unsigned") int minor, @Cast("unsigned") int patch);
        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Version other);
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Version other);
        public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Version rhs);
        public native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef Version rhs);
        public native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef Version rhs);
        public native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef Version rhs);
        /** Convert Version to string */
        public native @StdString String toString();
    }

    // constants

    /** Default Bootloader type */
    @MemberGetter public static native Type DEFAULT_TYPE();

    // Static API
    /**
     * Searches for connected devices in either UNBOOTED or BOOTLOADER states and returns first available.
     * @return Tuple of boolean and DeviceInfo. If found boolean is true and DeviceInfo describes the device. Otherwise false
     */
    public static native @ByVal @Cast("std::tuple<bool,dai::DeviceInfo>*") Pointer getFirstAvailableDevice();

    /**
     * Searches for connected devices in either UNBOOTED or BOOTLOADER states.
     * @return Vector of all found devices
     */
    public static native @StdVector DeviceInfo getAllAvailableDevices();

    /**
     * Creates application package which can be flashed to depthai device.
     * @param pipeline Pipeline from which to create the application package
     * @param pathToCmd Optional path to custom device firmware
     * @return Depthai application package
     */
    public static native @Cast("uint8_t*") @StdVector BytePointer createDepthaiApplicationPackage(@ByRef Pipeline pipeline, @StdString BytePointer pathToCmd/*=""*/);
    public static native @Cast("uint8_t*") @StdVector BytePointer createDepthaiApplicationPackage(@ByRef Pipeline pipeline);
    public static native @Cast("uint8_t*") @StdVector ByteBuffer createDepthaiApplicationPackage(@ByRef Pipeline pipeline, @StdString String pathToCmd/*=""*/);

    /**
     * Saves application package to a file which can be flashed to depthai device.
     * @param path Path where to save the application package
     * @param pipeline Pipeline from which to create the application package
     * @param pathToCmd Optional path to custom device firmware
     */
    public static native void saveDepthaiApplicationPackage(@StdString BytePointer path, @ByRef Pipeline pipeline, @StdString BytePointer pathToCmd/*=""*/);
    public static native void saveDepthaiApplicationPackage(@StdString BytePointer path, @ByRef Pipeline pipeline);
    public static native void saveDepthaiApplicationPackage(@StdString String path, @ByRef Pipeline pipeline, @StdString String pathToCmd/*=""*/);
    public static native void saveDepthaiApplicationPackage(@StdString String path, @ByRef Pipeline pipeline);

    /**
     * @return Embedded bootloader version
     */
    public static native @ByVal Version getEmbeddedBootloaderVersion();

    /**
     * @return Embedded bootloader binary
     */
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedBootloaderBinary(Type type/*=dai::DeviceBootloader::DEFAULT_TYPE*/);
    public static native @Cast("std::uint8_t*") @StdVector BytePointer getEmbeddedBootloaderBinary();
    public static native @Cast("std::uint8_t*") @StdVector ByteBuffer getEmbeddedBootloaderBinary(@Cast("dai::bootloader::Type") int type/*=dai::DeviceBootloader::DEFAULT_TYPE*/);

    

    /**
     * Connects to or boots device in bootloader mode depending on devInfo state.
     * @param devInfo DeviceInfo of which to boot or connect to
     */
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(devInfo); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo);

    /**
     * Connects to device in bootloader of specified type. Throws if it wasn't possible.
     * This constructor will automatically boot into specified bootloader type if not already running
     * @param devInfo DeviceInfo of which to boot or connect to
     * @param type Type of bootloader to boot/connect to.
     */
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, Type type) { super((Pointer)null); allocate(devInfo, type); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, Type type);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @Cast("dai::bootloader::Type") int type) { super((Pointer)null); allocate(devInfo, type); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @Cast("dai::bootloader::Type") int type);

    /**
     * Connects to or boots device in bootloader mode depending on devInfo state with a custom bootloader firmware.
     * @param devInfo DeviceInfo of which to boot or connect to
     * @param pathToBootloader Custom bootloader firmware to boot
     */
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString BytePointer pathToBootloader) { super((Pointer)null); allocate(devInfo, pathToBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString BytePointer pathToBootloader);
    public DeviceBootloader(@Const @ByRef DeviceInfo devInfo, @StdString String pathToBootloader) { super((Pointer)null); allocate(devInfo, pathToBootloader); }
    private native void allocate(@Const @ByRef DeviceInfo devInfo, @StdString String pathToBootloader);

    /**
     * \overload
     */

    /**
     * Flashes a give pipeline to the board.
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param pipeline Pipeline to flash to the board
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flash(ProgressCallback progressCallback, @ByRef Pipeline pipeline);

    /**
     * Flashes a specific depthai application package that was generated using createDepthaiApplicationPackage or saveDepthaiApplicationPackage
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param package Depthai application package to flash to the board
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(ProgressCallback progressCallback, @Cast("uint8_t*") @StdVector BytePointer _package);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(ProgressCallback progressCallback, @Cast("uint8_t*") @StdVector ByteBuffer _package);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashDepthaiApplicationPackage(ProgressCallback progressCallback, @Cast("uint8_t*") @StdVector byte[] _package);

    /**
     * Flashes bootloader to the current board
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param path Optional parameter to custom bootloader to flash
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(ProgressCallback progressCallback, @StdString BytePointer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(ProgressCallback progressCallback);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(ProgressCallback progressCallback, @StdString String path/*=""*/);

    /**
     * Flash selected bootloader to the current board
     * @param memory Memory to flash
     * @param type Bootloader type to flash
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param path Optional parameter to custom bootloader to flash
     */
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(Memory memory, Type type, ProgressCallback progressCallback, @StdString BytePointer path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(Memory memory, Type type, ProgressCallback progressCallback);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(@Cast("dai::bootloader::Memory") int memory, @Cast("dai::bootloader::Type") int type, ProgressCallback progressCallback, @StdString String path/*=""*/);
    public native @ByVal @Cast("std::tuple<bool,std::string>*") Pointer flashBootloader(@Cast("dai::bootloader::Memory") int memory, @Cast("dai::bootloader::Type") int type, ProgressCallback progressCallback);

    /**
     * Flash arbitrary data at custom offset in specified memory
     * @param memory Memory to flash
     * @param offset Offset at which to flash the given data in bytes
     * @param progressCallback Callback that sends back a value between 0..1 which signifies current flashing progress
     * @param data Data to flash
     */
    // std::tuple<bool, std::string> flashCustom(Memory memory, uint32_t offset, std::function<void(float)> progressCb, std::vector<uint8_t> data);

    /**
     * @return Version of current running bootloader
     */
    public native @ByVal Version getVersion();

    /**
     * @return True whether the bootloader running is flashed or booted by library
     */
    public native @Cast("bool") boolean isEmbeddedVersion();

    /**
     * Explicitly closes connection to device.
     * \note This function does not need to be explicitly called
     * as destructor closes the device automatically
     */
    public native @Name("close") void _close();

    /**
     * Is the device already closed (or disconnected)
     */
    public native @Cast("bool") boolean isClosed();
}
