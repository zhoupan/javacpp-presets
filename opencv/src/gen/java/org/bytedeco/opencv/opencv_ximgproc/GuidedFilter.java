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


//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////

/** \brief Interface for realizations of Guided Filter.
<p>
For more details about this filter see \cite Kaiming10 .
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class GuidedFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GuidedFilter(Pointer p) { super(p); }
    /** Downcast constructor. */
    public GuidedFilter(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::ximgproc::GuidedFilter*>") void allocate(Algorithm pointer);


    /** \brief Apply Guided Filter to the filtering image.
    <p>
    @param src filtering image with any numbers of channels.
    <p>
    @param dst output image.
    <p>
    @param dDepth optional depth of the output image. dDepth can be set to -1, which will be equivalent
    to src.depth().
     */
    public native void filter(@ByVal Mat src, @ByVal Mat dst, int dDepth/*=-1*/);
    public native void filter(@ByVal Mat src, @ByVal Mat dst);
    public native void filter(@ByVal UMat src, @ByVal UMat dst, int dDepth/*=-1*/);
    public native void filter(@ByVal UMat src, @ByVal UMat dst);
    public native void filter(@ByVal GpuMat src, @ByVal GpuMat dst, int dDepth/*=-1*/);
    public native void filter(@ByVal GpuMat src, @ByVal GpuMat dst);
}
