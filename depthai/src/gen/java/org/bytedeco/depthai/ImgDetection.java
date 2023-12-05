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


/** ImgDetection structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ImgDetection extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ImgDetection() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImgDetection(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImgDetection(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ImgDetection position(long position) {
        return (ImgDetection)super.position(position);
    }
    @Override public ImgDetection getPointer(long i) {
        return new ImgDetection((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int label(); public native ImgDetection label(int setter);
    public native float confidence(); public native ImgDetection confidence(float setter);
    public native float xmin(); public native ImgDetection xmin(float setter);
    public native float ymin(); public native ImgDetection ymin(float setter);
    public native float xmax(); public native ImgDetection xmax(float setter);
    public native float ymax(); public native ImgDetection ymax(float setter);
}
