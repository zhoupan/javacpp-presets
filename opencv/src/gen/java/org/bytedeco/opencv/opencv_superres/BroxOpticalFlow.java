// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_superres;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;

import static org.bytedeco.opencv.global.opencv_superres.*;



        @Namespace("cv::superres") @Properties(inherit = org.bytedeco.opencv.presets.opencv_superres.class)
public class BroxOpticalFlow extends DenseOpticalFlowExt {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public BroxOpticalFlow(Pointer p) { super(p); }
            /** Downcast constructor. */
            public BroxOpticalFlow(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
            @Namespace private native @Name("dynamic_cast<cv::superres::BroxOpticalFlow*>") void allocate(Algorithm pointer);
            /** Downcast constructor. */
            public BroxOpticalFlow(DenseOpticalFlowExt pointer) { super((Pointer)null); allocate(pointer); }
            @Namespace private native @Name("dynamic_cast<cv::superres::BroxOpticalFlow*>") void allocate(DenseOpticalFlowExt pointer);
            public DenseOpticalFlowExt asDenseOpticalFlowExt() { return asDenseOpticalFlowExt(this); }
            @Namespace public static native @Name("static_cast<cv::superres::DenseOpticalFlowExt*>") DenseOpticalFlowExt asDenseOpticalFlowExt(BroxOpticalFlow pointer);
        
            /** \brief Flow smoothness
            /** @see setAlpha */
            public native double getAlpha();
            /** \copybrief getAlpha @see getAlpha */
            public native void setAlpha(double val);
            /** \brief Gradient constancy importance
            /** @see setGamma */
            public native double getGamma();
            /** \copybrief getGamma @see getGamma */
            public native void setGamma(double val);
            /** \brief Pyramid scale factor
            /** @see setScaleFactor */
            public native double getScaleFactor();
            /** \copybrief getScaleFactor @see getScaleFactor */
            public native void setScaleFactor(double val);
            /** \brief Number of lagged non-linearity iterations (inner loop)
            /** @see setInnerIterations */
            public native int getInnerIterations();
            /** \copybrief getInnerIterations @see getInnerIterations */
            public native void setInnerIterations(int val);
            /** \brief Number of warping iterations (number of pyramid levels)
            /** @see setOuterIterations */
            public native int getOuterIterations();
            /** \copybrief getOuterIterations @see getOuterIterations */
            public native void setOuterIterations(int val);
            /** \brief Number of linear system solver iterations
            /** @see setSolverIterations */
            public native int getSolverIterations();
            /** \copybrief getSolverIterations @see getSolverIterations */
            public native void setSolverIterations(int val);
        }
