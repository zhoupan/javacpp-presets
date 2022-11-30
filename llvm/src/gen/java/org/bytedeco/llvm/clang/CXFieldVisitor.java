// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Visitor invoked for each field found by a traversal.
 *
 * This visitor function will be invoked for each field found by
 * \c clang_Type_visitFields. Its first argument is the cursor being
 * visited, its second argument is the client data provided to
 * \c clang_Type_visitFields.
 *
 * The visitor should return one of the \c CXVisitorResult values
 * to direct \c clang_Type_visitFields.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXFieldVisitor extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CXFieldVisitor(Pointer p) { super(p); }
    protected CXFieldVisitor() { allocate(); }
    private native void allocate();
    public native @Cast("CXVisitorResult") int call(@ByVal CXCursor C,
                                               CXClientData client_data);
}
