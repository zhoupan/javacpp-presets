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
 * Size2f structure
 *
 * width, height values define the size of the shape/frame
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Size2f extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Size2f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Size2f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Size2f position(long position) {
        return (Size2f)super.position(position);
    }
    @Override public Size2f getPointer(long i) {
        return new Size2f((Pointer)this).offsetAddress(i);
    }

    public Size2f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Size2f(float width, float height) { super((Pointer)null); allocate(width, height); }
    private native void allocate(float width, float height);
    public native float width(); public native Size2f width(float setter);
    public native float height(); public native Size2f height(float setter);
}
