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
 * \brief XLinkIn node. Receives messages over XLink.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkIn extends XLinkInPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkIn(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public XLinkIn(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public XLinkIn(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr XLinkInProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr XLinkInProperties props);

    /**
     * Outputs message of same type as send from host.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Specifies XLink stream name to use.
     *
     * The name should not start with double underscores '__',
     * as those are reserved for internal use.
     * @param name Stream name
     */
    public native void setStreamName(@StdString BytePointer name);
    public native void setStreamName(@StdString ByteBuffer name);
    public native void setStreamName(@StdString String name);

    /**
     * Set maximum message size it can receive
     * @param maxDataSize Maximum size in bytes
     */
    public native void setMaxDataSize(@Cast("std::uint32_t") int maxDataSize);

    /**
     * Set number of frames in pool for sending messages forward
     * @param numFrames Maximum number of frames in pool
     */
    public native void setNumFrames(@Cast("std::uint32_t") int numFrames);

    /** Get stream name */
    public native @StdString BytePointer getStreamName();
    /** Get maximum messages size in bytes */
    public native @Cast("std::uint32_t") int getMaxDataSize();
    /** Get number of frames in pool */
    public native @Cast("std::uint32_t") int getNumFrames();
}
