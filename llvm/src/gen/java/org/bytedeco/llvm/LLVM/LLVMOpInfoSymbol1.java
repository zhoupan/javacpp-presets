// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * The initial support in LLVM MC for the most general form of a relocatable
 * expression is "AddSymbol - SubtractSymbol + Offset".  For some Darwin targets
 * this full form is encoded in the relocation information so that AddSymbol and
 * SubtractSymbol can be link edited independent of each other.  Many other
 * platforms only allow a relocatable expression of the form AddSymbol + Offset
 * to be encoded.
 *
 * The LLVMOpInfoCallback() for the TagType value of 1 uses the struct
 * LLVMOpInfo1.  The value of the relocatable expression for the operand,
 * including any PC adjustment, is passed in to the call back in the Value
 * field.  The symbolic information about the operand is returned using all
 * the fields of the structure with the Offset of the relocatable expression
 * returned in the Value field.  It is possible that some symbols in the
 * relocatable expression were assembly temporary symbols, for example
 * "Ldata - LpicBase + constant", and only the Values of the symbols without
 * symbol names are present in the relocation information.  The VariantKind
 * type is one of the Target specific #defines below and is used to print
 * operands like "_foo\GOT", ":lower16:_foo", etc.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOpInfoSymbol1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMOpInfoSymbol1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMOpInfoSymbol1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMOpInfoSymbol1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMOpInfoSymbol1 position(long position) {
        return (LLVMOpInfoSymbol1)super.position(position);
    }
    @Override public LLVMOpInfoSymbol1 getPointer(long i) {
        return new LLVMOpInfoSymbol1((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint64_t") long Present(); public native LLVMOpInfoSymbol1 Present(long setter);  /* 1 if this symbol is present */
  public native @Cast("const char*") BytePointer Name(); public native LLVMOpInfoSymbol1 Name(BytePointer setter);  /* symbol name if not NULL */
  public native @Cast("uint64_t") long Value(); public native LLVMOpInfoSymbol1 Value(long setter);    /* symbol value if name is NULL */
}
