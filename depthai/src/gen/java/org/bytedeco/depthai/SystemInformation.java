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
 * SystemInformation message. Carries memory usage, cpu usage and chip temperatures.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SystemInformation extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SystemInformation(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SystemInformation(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SystemInformation position(long position) {
        return (SystemInformation)super.position(position);
    }
    @Override public SystemInformation getPointer(long i) {
        return new SystemInformation((Pointer)this).offsetAddress(i);
    }

    /**
     * Construct SystemInformation message.
     */
    public SystemInformation() { super((Pointer)null); allocate(); }
    private native void allocate();
    public SystemInformation(@SharedPtr RawSystemInformation ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawSystemInformation ptr);

    public native @ByRef MemoryInfo ddrMemoryUsage(); public native SystemInformation ddrMemoryUsage(MemoryInfo setter);
    public native @ByRef MemoryInfo cmxMemoryUsage(); public native SystemInformation cmxMemoryUsage(MemoryInfo setter);
    public native @ByRef MemoryInfo leonCssMemoryUsage(); public native SystemInformation leonCssMemoryUsage(MemoryInfo setter);
    public native @ByRef MemoryInfo leonMssMemoryUsage(); public native SystemInformation leonMssMemoryUsage(MemoryInfo setter);
    public native @ByRef CpuUsage leonCssCpuUsage(); public native SystemInformation leonCssCpuUsage(CpuUsage setter);
    public native @ByRef CpuUsage leonMssCpuUsage(); public native SystemInformation leonMssCpuUsage(CpuUsage setter);
    public native @ByRef ChipTemperature chipTemperature(); public native SystemInformation chipTemperature(ChipTemperature setter);
}
