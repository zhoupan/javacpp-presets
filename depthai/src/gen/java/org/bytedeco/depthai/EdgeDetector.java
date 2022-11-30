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
 * \brief EdgeDetector node. Performs edge detection using 3x3 Sobel filter
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class EdgeDetector extends EdgeDetectorPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeDetector(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public EdgeDetector(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public EdgeDetector(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr EdgeDetectorProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr EdgeDetectorProperties props);

    /**
     * Initial config to use for edge detection.
     */
    @MemberGetter public native @ByRef EdgeDetectorConfig initialConfig();

    /**
     * Input EdgeDetectorConfig message with ability to modify parameters in runtime.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputConfig();
    /**
     * Input image on which edge detection is performed.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputImage();

    /**
     * Outputs image frame with detected edges
     */
    @MemberGetter public native @ByRef Output outputImage();

    /**
     * Passthrough message on which the calculation was performed.
     */
    @MemberGetter public native @ByRef Output passthroughInputImage();

    // Functions to set properties
    /**
     * Specify whether or not wait until configuration message arrives to inputConfig Input.
     * @param wait True to wait for configuration message, false otherwise.
     */
    public native @Deprecated void setWaitForConfigInput(@Cast("bool") boolean _wait);

    /**
     * @see setWaitForConfigInput
     * @return True if wait for inputConfig message, false otherwise
     */
    public native @Cast("bool") @Deprecated boolean getWaitForConfigInput();

    /**
     * Specify number of frames in pool.
     * @param numFramesPool How many frames should the pool have
     */
    public native void setNumFramesPool(int numFramesPool);

    /**
     * Specify maximum size of output image.
     * @param maxFrameSize Maximum frame size in bytes
     */
    public native void setMaxOutputFrameSize(int maxFrameSize);
}
