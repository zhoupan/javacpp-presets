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
 * Represents the DepthAI device with the methods to interact with it.
 * Implements the host-side queues to connect with XLinkIn and XLinkOut nodes
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Device extends DeviceBase {
    static { Loader.load(); }

    
        public Device(@Const @ByRef Pipeline pipeline) { super((Pointer)null); allocate(pipeline); }
        private native void allocate(@Const @ByRef Pipeline pipeline);
        public Device(@Const @ByRef Pipeline pipeline, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(pipeline, maxUsbSpeed); }
        private native void allocate(@Const @ByRef Pipeline pipeline, UsbSpeed maxUsbSpeed);
        public Device(@Const @ByRef Pipeline pipeline, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(pipeline, maxUsbSpeed); }
        private native void allocate(@Const @ByRef Pipeline pipeline, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@Const @ByRef Pipeline pipeline, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(pipeline, pathToCmd); }
        private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef Path pathToCmd);
        public Device(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(pipeline, devInfo); }
        private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo);
        public Device(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(pipeline, devInfo, maxUsbSpeed); }
        private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
        public Device(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(pipeline, devInfo, maxUsbSpeed); }
        private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(pipeline, devInfo, pathToCmd); }
        private native void allocate(@Const @ByRef Pipeline pipeline, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd);
        public Device() { super((Pointer)null); allocate(); }
        private native void allocate();
        public Device(@Cast("dai::OpenVINO::Version") int version) { super((Pointer)null); allocate(version); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version);
        public Device(@Cast("dai::OpenVINO::Version") int version, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(version, maxUsbSpeed); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version, UsbSpeed maxUsbSpeed);
        public Device(@Cast("dai::OpenVINO::Version") int version, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(version, maxUsbSpeed); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(version, pathToCmd); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef Path pathToCmd);
        public Device(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(version, devInfo); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo);
        public Device(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(version, devInfo, maxUsbSpeed); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
        public Device(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(version, devInfo, maxUsbSpeed); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(version, devInfo, pathToCmd); }
        private native void allocate(@Cast("dai::OpenVINO::Version") int version, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd);
        public Device(@ByVal Config config) { super((Pointer)null); allocate(config); }
        private native void allocate(@ByVal Config config);
        public Device(@ByVal Config config, @Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(config, devInfo); }
        private native void allocate(@ByVal Config config, @Const @ByRef DeviceInfo devInfo);
        public Device(@Const @ByRef DeviceInfo devInfo) { super((Pointer)null); allocate(devInfo); }
        private native void allocate(@Const @ByRef DeviceInfo devInfo);
        public Device(@Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(devInfo, maxUsbSpeed); }
        private native void allocate(@Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
        public Device(@Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(devInfo, maxUsbSpeed); }
        private native void allocate(@Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@StdString BytePointer nameOrDeviceId) { super((Pointer)null); allocate(nameOrDeviceId); }
        private native void allocate(@StdString BytePointer nameOrDeviceId);
        public Device(@StdString ByteBuffer nameOrDeviceId) { super((Pointer)null); allocate(nameOrDeviceId); }
        private native void allocate(@StdString ByteBuffer nameOrDeviceId);
        public Device(@StdString String nameOrDeviceId) { super((Pointer)null); allocate(nameOrDeviceId); }
        private native void allocate(@StdString String nameOrDeviceId);
        public Device(@StdString BytePointer nameOrDeviceId, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
        private native void allocate(@StdString BytePointer nameOrDeviceId, UsbSpeed maxUsbSpeed);
        public Device(@StdString ByteBuffer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
        private native void allocate(@StdString ByteBuffer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@StdString String nameOrDeviceId, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
        private native void allocate(@StdString String nameOrDeviceId, UsbSpeed maxUsbSpeed);
        public Device(@StdString BytePointer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
        private native void allocate(@StdString BytePointer nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@StdString ByteBuffer nameOrDeviceId, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
        private native void allocate(@StdString ByteBuffer nameOrDeviceId, UsbSpeed maxUsbSpeed);
        public Device(@StdString String nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(nameOrDeviceId, maxUsbSpeed); }
        private native void allocate(@StdString String nameOrDeviceId, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@ByVal Config config, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(config, maxUsbSpeed); }
        private native void allocate(@ByVal Config config, UsbSpeed maxUsbSpeed);
        public Device(@ByVal Config config, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(config, maxUsbSpeed); }
        private native void allocate(@ByVal Config config, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@ByVal Config config, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(config, pathToCmd); }
        private native void allocate(@ByVal Config config, @Const @ByRef Path pathToCmd);
        public Device(@ByVal Config config, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed) { super((Pointer)null); allocate(config, devInfo, maxUsbSpeed); }
        private native void allocate(@ByVal Config config, @Const @ByRef DeviceInfo devInfo, UsbSpeed maxUsbSpeed);
        public Device(@ByVal Config config, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed) { super((Pointer)null); allocate(config, devInfo, maxUsbSpeed); }
        private native void allocate(@ByVal Config config, @Const @ByRef DeviceInfo devInfo, @Cast("dai::UsbSpeed") int maxUsbSpeed);
        public Device(@ByVal Config config, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd) { super((Pointer)null); allocate(config, devInfo, pathToCmd); }
        private native void allocate(@ByVal Config config, @Const @ByRef DeviceInfo devInfo, @Const @ByRef Path pathToCmd);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Device(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Device(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Device position(long position) {
        return (Device)super.position(position);
    }
    @Override public Device getPointer(long i) {
        return new Device((Pointer)this).offsetAddress(i);
    }
  // inherit the ctors

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     */

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param usb2Mode (bool) Boot device using USB2 mode firmware
     */

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param maxUsbSpeed Maximum allowed USB speed
     */

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * @param pipeline Pipeline to be executed on the device
     * @param pathToCmd Path to custom device firmware
     */

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     */

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param usb2Mode (bool) Boot device using USB2 mode firmware
     */

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param maxUsbSpeed Maximum allowed USB speed
     */

    /**
     * Connects to device specified by devInfo.
     * @param pipeline Pipeline to be executed on the device
     * @param devInfo DeviceInfo which specifies which device to connect to
     * @param pathToCmd Path to custom device firmware
     */

    /**
     * Connects to any available device with a DEFAULT_SEARCH_TIME timeout.
     * Uses OpenVINO version OpenVINO::VERSION_UNIVERSAL
     */

    /**
     * \brief dtor to close the device
     */

    /** Maximum number of elements in event queue */
    @MemberGetter public static native @Cast("const std::size_t") long EVENT_QUEUE_MAXIMUM_SIZE();
    public static final long EVENT_QUEUE_MAXIMUM_SIZE = EVENT_QUEUE_MAXIMUM_SIZE();

    /**
     * Gets an output queue corresponding to stream name. If it doesn't exist it throws
     *
     * @param name Queue/stream name, created by XLinkOut node
     * @return Smart pointer to DataOutputQueue
     */
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString BytePointer name);
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString ByteBuffer name);
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString String name);

    /**
     * Gets a queue corresponding to stream name, if it exists, otherwise it throws. Also sets queue options
     *
     * @param name Queue/stream name, set in XLinkOut node
     * @param maxSize Maximum number of messages in queue
     * @param blocking Queue behavior once full. True specifies blocking and false overwriting of oldest messages. Default: true
     * @return Smart pointer to DataOutputQueue
     */
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString BytePointer name, @Cast("unsigned int") int maxSize, @Cast("bool") boolean blocking/*=true*/);
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString BytePointer name, @Cast("unsigned int") int maxSize);
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString ByteBuffer name, @Cast("unsigned int") int maxSize, @Cast("bool") boolean blocking/*=true*/);
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString ByteBuffer name, @Cast("unsigned int") int maxSize);
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString String name, @Cast("unsigned int") int maxSize, @Cast("bool") boolean blocking/*=true*/);
    public native @SharedPtr DataOutputQueue getOutputQueue(@StdString String name, @Cast("unsigned int") int maxSize);

    /**
     * Get all available output queue names
     *
     * @return Vector of output queue names
     */
    public native @ByVal StringVector getOutputQueueNames();

    /**
     * Gets an input queue corresponding to stream name. If it doesn't exist it throws
     *
     * @param name Queue/stream name, set in XLinkIn node
     * @return Smart pointer to DataInputQueue
     */
    public native @SharedPtr DataInputQueue getInputQueue(@StdString BytePointer name);
    public native @SharedPtr DataInputQueue getInputQueue(@StdString ByteBuffer name);
    public native @SharedPtr DataInputQueue getInputQueue(@StdString String name);

    /**
     * Gets an input queue corresponding to stream name. If it doesn't exist it throws. Also sets queue options
     *
     * @param name Queue/stream name, set in XLinkOut node
     * @param maxSize Maximum number of messages in queue
     * @param blocking Queue behavior once full. True: blocking, false: overwriting of oldest messages. Default: true
     * @return Smart pointer to DataInputQueue
     */
    public native @SharedPtr DataInputQueue getInputQueue(@StdString BytePointer name, @Cast("unsigned int") int maxSize, @Cast("bool") boolean blocking/*=true*/);
    public native @SharedPtr DataInputQueue getInputQueue(@StdString BytePointer name, @Cast("unsigned int") int maxSize);
    public native @SharedPtr DataInputQueue getInputQueue(@StdString ByteBuffer name, @Cast("unsigned int") int maxSize, @Cast("bool") boolean blocking/*=true*/);
    public native @SharedPtr DataInputQueue getInputQueue(@StdString ByteBuffer name, @Cast("unsigned int") int maxSize);
    public native @SharedPtr DataInputQueue getInputQueue(@StdString String name, @Cast("unsigned int") int maxSize, @Cast("bool") boolean blocking/*=true*/);
    public native @SharedPtr DataInputQueue getInputQueue(@StdString String name, @Cast("unsigned int") int maxSize);

    /**
     * Get all available input queue names
     *
     * @return Vector of input queue names
     */
    public native @ByVal StringVector getInputQueueNames();

    // void setCallback(const std::string& name, std::function<std::shared_ptr<RawBuffer>(std::shared_ptr<RawBuffer>)> cb);

    /**
     * Gets or waits until any of specified queues has received a message
     *
     * @param queueNames Names of queues for which to block
     * @param maxNumEvents Maximum number of events to remove from queue - Default is unlimited
     * @param timeout Timeout after which return regardless. If negative then wait is indefinite - Default is -1
     * @return Names of queues which received messages first
     */
    public native @ByVal StringVector getQueueEvents(@Const @ByRef StringVector queueNames,
                                                @Cast("std::size_t") long maxNumEvents/*=std::numeric_limits<std::size_t>::max()*/,
                                                @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @ByVal StringVector getQueueEvents(@Const @ByRef StringVector queueNames);

    /**
     * Gets or waits until specified queue has received a message
     *
     * @param queueName Name of queues for which to wait for
     * @param maxNumEvents Maximum number of events to remove from queue. Default is unlimited
     * @param timeout Timeout after which return regardless. If negative then wait is indefinite. Default is -1
     * @return Names of queues which received messages first
     */
    public native @ByVal StringVector getQueueEvents(@StdString BytePointer queueName,
                                                @Cast("std::size_t") long maxNumEvents/*=std::numeric_limits<std::size_t>::max()*/,
                                                @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @ByVal StringVector getQueueEvents(@StdString BytePointer queueName);
    public native @ByVal StringVector getQueueEvents(@StdString ByteBuffer queueName,
                                                @Cast("std::size_t") long maxNumEvents/*=std::numeric_limits<std::size_t>::max()*/,
                                                @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @ByVal StringVector getQueueEvents(@StdString ByteBuffer queueName);
    public native @ByVal StringVector getQueueEvents(@StdString String queueName,
                                                @Cast("std::size_t") long maxNumEvents/*=std::numeric_limits<std::size_t>::max()*/,
                                                @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @ByVal StringVector getQueueEvents(@StdString String queueName);

    /**
     * Gets or waits until any queue has received a message
     *
     * @param maxNumEvents Maximum number of events to remove from queue. Default is unlimited
     * @param timeout Timeout after which return regardless. If negative then wait is indefinite. Default is -1
     * @return Names of queues which received messages first
     */
    public native @ByVal StringVector getQueueEvents(@Cast("std::size_t") long maxNumEvents/*=std::numeric_limits<std::size_t>::max()*/,
                                                @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @ByVal StringVector getQueueEvents();

    /**
     * Gets or waits until any of specified queues has received a message
     *
     * @param queueNames Names of queues for which to wait for
     * @param timeout Timeout after which return regardless. If negative then wait is indefinite. Default is -1
     * @return Queue name which received a message first
     */
    public native @StdString BytePointer getQueueEvent(@Const @ByRef StringVector queueNames, @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @StdString BytePointer getQueueEvent(@Const @ByRef StringVector queueNames);

    /**
     * Gets or waits until specified queue has received a message
     *
     * @param queueNames Name of queues for which to wait for
     * @param timeout Timeout after which return regardless. If negative then wait is indefinite. Default is -1
     * @return Queue name which received a message
     */
    public native @StdString BytePointer getQueueEvent(@StdString BytePointer queueName, @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @StdString BytePointer getQueueEvent(@StdString BytePointer queueName);
    public native @StdString ByteBuffer getQueueEvent(@StdString ByteBuffer queueName, @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @StdString ByteBuffer getQueueEvent(@StdString ByteBuffer queueName);
    public native @StdString String getQueueEvent(@StdString String queueName, @ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @StdString String getQueueEvent(@StdString String queueName);

    /**
     * Gets or waits until any queue has received a message
     *
     * @param timeout Timeout after which return regardless. If negative then wait is indefinite. Default is -1
     * @return Queue name which received a message
     */
    public native @StdString BytePointer getQueueEvent(@ByVal(nullValue = "std::chrono::microseconds(-1)") @Cast("std::chrono::microseconds*") Pointer timeout);
    public native @StdString BytePointer getQueueEvent();
}
