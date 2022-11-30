// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * Access to send messages through XLink stream
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DataInputQueue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataInputQueue(Pointer p) { super(p); }

    public DataInputQueue(@SharedPtr XLinkConnection conn,
                       @StdString BytePointer streamName,
                       @Cast("unsigned int") int maxSize/*=16*/,
                       @Cast("bool") boolean blocking/*=true*/,
                       @Cast("std::size_t") long maxDataSize/*=dai::device::XLINK_USB_BUFFER_MAX_SIZE*/) { super((Pointer)null); allocate(conn, streamName, maxSize, blocking, maxDataSize); }
    private native void allocate(@SharedPtr XLinkConnection conn,
                       @StdString BytePointer streamName,
                       @Cast("unsigned int") int maxSize/*=16*/,
                       @Cast("bool") boolean blocking/*=true*/,
                       @Cast("std::size_t") long maxDataSize/*=dai::device::XLINK_USB_BUFFER_MAX_SIZE*/);
    public DataInputQueue(@SharedPtr XLinkConnection conn,
                       @StdString BytePointer streamName) { super((Pointer)null); allocate(conn, streamName); }
    private native void allocate(@SharedPtr XLinkConnection conn,
                       @StdString BytePointer streamName);
    public DataInputQueue(@SharedPtr XLinkConnection conn,
                       @StdString ByteBuffer streamName,
                       @Cast("unsigned int") int maxSize/*=16*/,
                       @Cast("bool") boolean blocking/*=true*/,
                       @Cast("std::size_t") long maxDataSize/*=dai::device::XLINK_USB_BUFFER_MAX_SIZE*/) { super((Pointer)null); allocate(conn, streamName, maxSize, blocking, maxDataSize); }
    private native void allocate(@SharedPtr XLinkConnection conn,
                       @StdString ByteBuffer streamName,
                       @Cast("unsigned int") int maxSize/*=16*/,
                       @Cast("bool") boolean blocking/*=true*/,
                       @Cast("std::size_t") long maxDataSize/*=dai::device::XLINK_USB_BUFFER_MAX_SIZE*/);
    public DataInputQueue(@SharedPtr XLinkConnection conn,
                       @StdString ByteBuffer streamName) { super((Pointer)null); allocate(conn, streamName); }
    private native void allocate(@SharedPtr XLinkConnection conn,
                       @StdString ByteBuffer streamName);
    public DataInputQueue(@SharedPtr XLinkConnection conn,
                       @StdString String streamName,
                       @Cast("unsigned int") int maxSize/*=16*/,
                       @Cast("bool") boolean blocking/*=true*/,
                       @Cast("std::size_t") long maxDataSize/*=dai::device::XLINK_USB_BUFFER_MAX_SIZE*/) { super((Pointer)null); allocate(conn, streamName, maxSize, blocking, maxDataSize); }
    private native void allocate(@SharedPtr XLinkConnection conn,
                       @StdString String streamName,
                       @Cast("unsigned int") int maxSize/*=16*/,
                       @Cast("bool") boolean blocking/*=true*/,
                       @Cast("std::size_t") long maxDataSize/*=dai::device::XLINK_USB_BUFFER_MAX_SIZE*/);
    public DataInputQueue(@SharedPtr XLinkConnection conn,
                       @StdString String streamName) { super((Pointer)null); allocate(conn, streamName); }
    private native void allocate(@SharedPtr XLinkConnection conn,
                       @StdString String streamName);

    /**
     * Check whether queue is closed
     */
    public native @Cast("bool") boolean isClosed();

    /**
     * Closes the queue and the underlying thread
     */
    public native @Name("close") void _close();

    /**
     * Sets maximum message size. If message is larger than specified, then an exception is issued.
     *
     * @param maxSize Maximum message size to add to queue
     */
    public native void setMaxDataSize(@Cast("std::size_t") long maxSize);

    /**
     * Gets maximum queue size.
     *
     * @return Maximum message size
     */
    public native @Cast("std::size_t") long getMaxDataSize();

    /**
     * Sets queue behavior when full (maxSize)
     *
     * @param blocking Specifies if block or overwrite the oldest message in the queue
     */
    public native void setBlocking(@Cast("bool") boolean blocking);

    /**
     * Gets current queue behavior when full (maxSize)
     *
     * @return True if blocking, false otherwise
     */
    public native @Cast("bool") boolean getBlocking();

    /**
     * Sets queue maximum size
     *
     * @param maxSize Specifies maximum number of messages in the queue
     */
    public native void setMaxSize(@Cast("unsigned int") int maxSize);

    /**
     * Gets queue maximum size
     *
     * @return Maximum queue size
     */
    public native @Cast("unsigned int") int getMaxSize();

    /**
     * Gets queues name
     *
     * @return Queue name
     */
    public native @StdString BytePointer getName();

    /**
     * Adds a raw message to the queue, which will be picked up and sent to the device.
     * Can either block if 'blocking' behavior is true or overwrite oldest
     * @param rawMsg Message to add to the queue
     */
    public native void send(@SharedPtr RawBuffer rawMsg);

    /**
     * Adds a message to the queue, which will be picked up and sent to the device.
     * Can either block if 'blocking' behavior is true or overwrite oldest
     * @param msg Message to add to the queue
     */
    public native @Name("send") void sendSharedPtr(@Const @SharedPtr @ByRef ADatatype msg);

    /**
     * Adds a message to the queue, which will be picked up and sent to the device.
     * Can either block if 'blocking' behavior is true or overwrite oldest
     * @param msg Message to add to the queue
     */
    public native void send(@Const @ByRef ADatatype msg);

    /**
     * Adds message to the queue, which will be picked up and sent to the device.
     * Can either block until timeout if 'blocking' behavior is true or overwrite oldest
     *
     * @param rawMsg Message to add to the queue
     * @param timeout Maximum duration to block in milliseconds
     */
    public native @Cast("bool") boolean send(@SharedPtr RawBuffer rawMsg, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);

    /**
     * Adds message to the queue, which will be picked up and sent to the device.
     * Can either block until timeout if 'blocking' behavior is true or overwrite oldest
     *
     * @param msg Message to add to the queue
     * @param timeout Maximum duration to block in milliseconds
     */
    public native @Cast("bool") @Name("send") boolean sendSharedPtr(@Const @SharedPtr @ByRef ADatatype msg, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);

    /**
     * Adds message to the queue, which will be picked up and sent to the device.
     * Can either block until timeout if 'blocking' behavior is true or overwrite oldest
     *
     * @param msg Message to add to the queue
     * @param timeout Maximum duration to block in milliseconds
     */
    public native @Cast("bool") boolean send(@Const @ByRef ADatatype msg, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
}
