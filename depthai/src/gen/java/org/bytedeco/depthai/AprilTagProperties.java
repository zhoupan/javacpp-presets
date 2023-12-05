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
 * Specify properties for AprilTag
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class AprilTagProperties extends AprilTagPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public AprilTagProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AprilTagProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AprilTagProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AprilTagProperties position(long position) {
        return (AprilTagProperties)super.position(position);
    }
    @Override public AprilTagProperties getPointer(long i) {
        return new AprilTagProperties((Pointer)this).offsetAddress(i);
    }

    public native @ByRef RawAprilTagConfig initialConfig(); public native AprilTagProperties initialConfig(RawAprilTagConfig setter);

    /** Whether to wait for config at 'inputConfig' IO */
    public native @Cast("bool") boolean inputConfigSync(); public native AprilTagProperties inputConfigSync(boolean setter);
}
