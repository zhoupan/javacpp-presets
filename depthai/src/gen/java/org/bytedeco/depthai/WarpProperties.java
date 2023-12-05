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
 * Specify properties for Warp
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class WarpProperties extends WarpPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public WarpProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WarpProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WarpProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WarpProperties position(long position) {
        return (WarpProperties)super.position(position);
    }
    @Override public WarpProperties getPointer(long i) {
        return new WarpProperties((Pointer)this).offsetAddress(i);
    }

    /** Output width */
    public native int outputWidth(); public native WarpProperties outputWidth(int setter);

    /** Output height */
    public native int outputHeight(); public native WarpProperties outputHeight(int setter);

    /** Maximum output frame size in bytes (eg: 300x300 BGR image -> 300*300*3 bytes) */
    public native int outputFrameSize(); public native WarpProperties outputFrameSize(int setter);

    /** Num frames in output pool */
    public native int numFramesPool(); public native WarpProperties numFramesPool(int setter);

    /** Custom warp mesh width. Set to zero to disable */
    public native int meshWidth(); public native WarpProperties meshWidth(int setter);
    /** Custom warp mesh height. Set to zero to disable. */
    public native int meshHeight(); public native WarpProperties meshHeight(int setter);
    /** Custom warp mesh uri. Set to empty string to disable. */
    public native @StdString BytePointer meshUri(); public native WarpProperties meshUri(BytePointer setter);

    /** Warp HW IDs to use, if empty, use auto/default */
    public native @ByRef IntVector warpHwIds(); public native WarpProperties warpHwIds(IntVector setter);
    /** Interpolation type to use */
    public native Interpolation interpolation(); public native WarpProperties interpolation(Interpolation setter);
}
