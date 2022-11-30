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


/** EdgeDetectorConfigData configuration data structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class EdgeDetectorConfigData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EdgeDetectorConfigData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EdgeDetectorConfigData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeDetectorConfigData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EdgeDetectorConfigData position(long position) {
        return (EdgeDetectorConfigData)super.position(position);
    }
    @Override public EdgeDetectorConfigData getPointer(long i) {
        return new EdgeDetectorConfigData((Pointer)this).offsetAddress(i);
    }

    /**
     * Used for horizontal gradient computation in 3x3 Sobel filter
     * Format - 3x3 matrix, 2nd column must be 0
     * Default - +1 0 -1; +2 0 -2; +1 0 -1
     */
    public native @ByRef IntVectorVector sobelFilterHorizontalKernel(); public native EdgeDetectorConfigData sobelFilterHorizontalKernel(IntVectorVector setter);
    /**
     * Used for vertical gradient computation in 3x3 Sobel filter
     * Format - 3x3 matrix, 2nd row must be 0
     * Default - +1 +2 +1; 0 0 0; -1 -2 -1
     */
    public native @ByRef IntVectorVector sobelFilterVerticalKernel(); public native EdgeDetectorConfigData sobelFilterVerticalKernel(IntVectorVector setter);
}
