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
 * \brief MonoCamera node. For use with grayscale sensors.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class MonoCamera extends ColorCameraPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MonoCamera(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public MonoCamera(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public MonoCamera(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr MonoCameraProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr MonoCameraProperties props);

    /**
     * Initial control options to apply to sensor
     */
    @MemberGetter public native @ByRef CameraControl initialControl();

    /**
     * Input for CameraControl message, which can modify camera parameters in runtime
     * Default queue is blocking with size 8
     */
    @MemberGetter public native @ByRef Input inputControl();

    /**
     * Outputs ImgFrame message that carries RAW8 encoded (grayscale) frame data.
     *
     * Suitable for use StereoDepth node. Processed by ISP
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Outputs ImgFrame message that carries RAW10-packed (MIPI CSI-2 format) frame data.
     *
     * Captured directly from the camera sensor
     */
    @MemberGetter public native @ByRef Output raw();

    /**
     * Outputs metadata-only ImgFrame message as an early indicator of an incoming frame.
     *
     * It's sent on the MIPI SoF (start-of-frame) event, just after the exposure of the current frame
     * has finished and before the exposure for next frame starts.
     * Could be used to synchronize various processes with camera capture.
     * Fields populated: camera id, sequence number, timestamp
     */
    @MemberGetter public native @ByRef Output frameEvent();

    /**
     * Specify which board socket to use
     * @param boardSocket Board socket to use
     */
    public native void setBoardSocket(CameraBoardSocket boardSocket);
    public native void setBoardSocket(@Cast("dai::CameraBoardSocket") int boardSocket);

    /**
     * Retrieves which board socket to use
     * @return Board socket to use
     */
    public native CameraBoardSocket getBoardSocket();

    // Set which mono camera to use
    public native @Deprecated void setCamId(@Cast("int64_t") long id);

    // Get which mono camera to use
    public native @Cast("int64_t") @Deprecated long getCamId();

    /** Set camera image orientation */
    public native void setImageOrientation(CameraImageOrientation imageOrientation);
    public native void setImageOrientation(@Cast("dai::CameraImageOrientation") int imageOrientation);

    /** Get camera image orientation */
    public native CameraImageOrientation getImageOrientation();

    /** Set sensor resolution */
    public native void setResolution(@ByVal MonoCameraProperties.SensorResolution resolution);

    /** Get sensor resolution */
    public native @ByVal MonoCameraProperties.SensorResolution getResolution();

    /**
     * Set rate at which camera should produce frames
     * @param fps Rate in frames per second
     */
    public native void setFps(float fps);

    /**
     * Get rate at which camera should produce frames
     * @return Rate in frames per second
     */
    public native float getFps();

    /** Get sensor resolution as size */
    public native @ByVal @Cast("std::tuple<int,int>*") Pointer getResolutionSize();
    /** Get sensor resolution width */
    public native int getResolutionWidth();
    /** Get sensor resolution height */
    public native int getResolutionHeight();

    /** Set number of frames in main (ISP output) pool */
    public native void setNumFramesPool(int num);
    /** Set number of frames in raw pool */
    public native void setRawNumFramesPool(int num);

    /** Get number of frames in main (ISP output) pool */
    public native int getNumFramesPool();
    /** Get number of frames in raw pool */
    public native int getRawNumFramesPool();
}
