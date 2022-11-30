// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * \addtogroup LLVMCError
 *
 * \{
 */

@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMFatalErrorHandler extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMFatalErrorHandler(Pointer p) { super(p); }
    protected LLVMFatalErrorHandler() { allocate(); }
    private native void allocate();
    public native void call(@Cast("const char*") BytePointer Reason);
}
