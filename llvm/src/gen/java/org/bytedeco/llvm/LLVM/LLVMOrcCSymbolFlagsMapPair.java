// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Represents a pair of a symbol name and LLVMJITSymbolFlags.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcCSymbolFlagsMapPair extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMOrcCSymbolFlagsMapPair() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMOrcCSymbolFlagsMapPair(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMOrcCSymbolFlagsMapPair(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMOrcCSymbolFlagsMapPair position(long position) {
        return (LLVMOrcCSymbolFlagsMapPair)super.position(position);
    }
    @Override public LLVMOrcCSymbolFlagsMapPair getPointer(long i) {
        return new LLVMOrcCSymbolFlagsMapPair((Pointer)this).offsetAddress(i);
    }

  public native LLVMOrcSymbolStringPoolEntryRef Name(); public native LLVMOrcCSymbolFlagsMapPair Name(LLVMOrcSymbolStringPoolEntryRef setter);
  public native @ByRef LLVMJITSymbolFlags Flags(); public native LLVMOrcCSymbolFlagsMapPair Flags(LLVMJITSymbolFlags setter);
}
