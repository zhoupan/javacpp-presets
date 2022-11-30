// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;

@Namespace("llvm") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class Pass extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Pass() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Pass(Pointer p) { super(p); }
}
