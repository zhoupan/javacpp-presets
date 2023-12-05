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


/**
 * Specify properties for DetectionParser
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DetectionParserProperties extends DetectionParserPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public DetectionParserProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectionParserProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionParserProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DetectionParserProperties position(long position) {
        return (DetectionParserProperties)super.position(position);
    }
    @Override public DetectionParserProperties getPointer(long i) {
        return new DetectionParserProperties((Pointer)this).offsetAddress(i);
    }

    /** Num frames in output pool */
    public native int numFramesPool(); public native DetectionParserProperties numFramesPool(int setter);

    /** Network inputs */
    public native @ByRef StringTensorInfoMap networkInputs(); public native DetectionParserProperties networkInputs(StringTensorInfoMap setter);

    /** Options for parser */
    public native @ByRef DetectionParserOptions parser(); public native DetectionParserProperties parser(DetectionParserOptions setter);
}
