// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \addtogroup ximgproc_filters
 *  \{
<p>
/** \brief Main interface for all filters, that take sparse matches as an
input and produce a dense per-pixel matching (optical flow) as an output.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class SparseMatchInterpolator extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMatchInterpolator(Pointer p) { super(p); }
    /** Downcast constructor. */
    public SparseMatchInterpolator(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::ximgproc::SparseMatchInterpolator*>") void allocate(Algorithm pointer);

    /** \brief Interpolate input sparse matches.
    <p>
    @param from_image first of the two matched images, 8-bit single-channel or three-channel.
    <p>
    @param from_points points of the from_image for which there are correspondences in the
    to_image (Point2f vector or Mat of depth CV_32F)
    <p>
    @param to_image second of the two matched images, 8-bit single-channel or three-channel.
    <p>
    @param to_points points in the to_image corresponding to from_points
    (Point2f vector or Mat of depth CV_32F)
    <p>
    @param dense_flow output dense matching (two-channel CV_32F image)
     */
    public native void interpolate(@ByVal Mat from_image, @ByVal Mat from_points,
                                         @ByVal Mat to_image, @ByVal Mat to_points,
                                         @ByVal Mat dense_flow);
    public native void interpolate(@ByVal UMat from_image, @ByVal UMat from_points,
                                         @ByVal UMat to_image, @ByVal UMat to_points,
                                         @ByVal UMat dense_flow);
    public native void interpolate(@ByVal GpuMat from_image, @ByVal GpuMat from_points,
                                         @ByVal GpuMat to_image, @ByVal GpuMat to_points,
                                         @ByVal GpuMat dense_flow);
}
