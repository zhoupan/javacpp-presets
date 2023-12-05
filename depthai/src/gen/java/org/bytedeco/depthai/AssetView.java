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


// This class represent a single asset
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class AssetView extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AssetView(Pointer p) { super(p); }

    public native @Cast("std::uint8_t*") BytePointer data(); public native AssetView data(BytePointer setter);
    public native @Cast("std::uint32_t") int size(); public native AssetView size(int setter);
    public native @Cast("std::uint32_t") int alignment(); public native AssetView alignment(int setter);
    public AssetView(@Cast("std::uint8_t*") BytePointer d, @Cast("std::uint32_t") int s, @Cast("std::uint32_t") int a/*=1*/) { super((Pointer)null); allocate(d, s, a); }
    private native void allocate(@Cast("std::uint8_t*") BytePointer d, @Cast("std::uint32_t") int s, @Cast("std::uint32_t") int a/*=1*/);
    public AssetView(@Cast("std::uint8_t*") BytePointer d, @Cast("std::uint32_t") int s) { super((Pointer)null); allocate(d, s); }
    private native void allocate(@Cast("std::uint8_t*") BytePointer d, @Cast("std::uint32_t") int s);
    public AssetView(@Cast("std::uint8_t*") ByteBuffer d, @Cast("std::uint32_t") int s, @Cast("std::uint32_t") int a/*=1*/) { super((Pointer)null); allocate(d, s, a); }
    private native void allocate(@Cast("std::uint8_t*") ByteBuffer d, @Cast("std::uint32_t") int s, @Cast("std::uint32_t") int a/*=1*/);
    public AssetView(@Cast("std::uint8_t*") ByteBuffer d, @Cast("std::uint32_t") int s) { super((Pointer)null); allocate(d, s); }
    private native void allocate(@Cast("std::uint8_t*") ByteBuffer d, @Cast("std::uint32_t") int s);
    public AssetView(@Cast("std::uint8_t*") byte[] d, @Cast("std::uint32_t") int s, @Cast("std::uint32_t") int a/*=1*/) { super((Pointer)null); allocate(d, s, a); }
    private native void allocate(@Cast("std::uint8_t*") byte[] d, @Cast("std::uint32_t") int s, @Cast("std::uint32_t") int a/*=1*/);
    public AssetView(@Cast("std::uint8_t*") byte[] d, @Cast("std::uint32_t") int s) { super((Pointer)null); allocate(d, s); }
    private native void allocate(@Cast("std::uint8_t*") byte[] d, @Cast("std::uint32_t") int s);
}
