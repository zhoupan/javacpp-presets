// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvjpeg;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvjpeg.*;


// Pinned memory allocator using mentioned prototypes, provided to nvjpegCreate
// This allocator will be used for all pinned host memory allocations inside library
// In any way library is doing smart allocations (reallocates memory only if needed)
@Properties(inherit = org.bytedeco.cuda.presets.nvjpeg.class)
public class nvjpegPinnedAllocator_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvjpegPinnedAllocator_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvjpegPinnedAllocator_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvjpegPinnedAllocator_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvjpegPinnedAllocator_t position(long position) {
        return (nvjpegPinnedAllocator_t)super.position(position);
    }
    @Override public nvjpegPinnedAllocator_t getPointer(long i) {
        return new nvjpegPinnedAllocator_t((Pointer)this).offsetAddress(i);
    }

    public native tPinnedMalloc pinned_malloc(); public native nvjpegPinnedAllocator_t pinned_malloc(tPinnedMalloc setter);
    public native tPinnedFree pinned_free(); public native nvjpegPinnedAllocator_t pinned_free(tPinnedFree setter);
}
