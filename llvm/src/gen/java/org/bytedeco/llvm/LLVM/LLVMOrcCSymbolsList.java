// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents a list of LLVMOrcSymbolStringPoolEntryRef and the associated
 * length.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcCSymbolsList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMOrcCSymbolsList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMOrcCSymbolsList(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMOrcCSymbolsList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMOrcCSymbolsList position(long position) {
        return (LLVMOrcCSymbolsList)super.position(position);
    }
    @Override public LLVMOrcCSymbolsList getPointer(long i) {
        return new LLVMOrcCSymbolsList((Pointer)this).offsetAddress(i);
    }

  public native @ByPtrPtr LLVMOrcSymbolStringPoolEntryRef Symbols(); public native LLVMOrcCSymbolsList Symbols(LLVMOrcSymbolStringPoolEntryRef setter);
  public native @Cast("size_t") long Length(); public native LLVMOrcCSymbolsList Length(long setter);
}
