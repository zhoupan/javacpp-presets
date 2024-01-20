// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// This is an safe owning holder for a PyObject, akin to pybind11's
// py::object, with two major differences:
//
//  - It is in c10/core; i.e., you can use this type in contexts where
//    you do not have a libpython dependency
//
//  - It is multi-interpreter safe (ala torchdeploy); when you fetch
//    the underlying PyObject* you are required to specify what the current
//    interpreter context is and we will check that you match it.
//
// It is INVALID to store a reference to a Tensor object in this way;
// you should just use TensorImpl directly in that case!
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SafePyObject extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SafePyObject(Pointer p) { super(p); }

  // Steals a reference to data
  public SafePyObject(@Cast("PyObject*") Pointer data, PyInterpreter pyinterpreter) { super((Pointer)null); allocate(data, pyinterpreter); }
  @UniquePtr @Name("std::make_unique<c10::SafePyObject>") private native void allocate(@Cast("PyObject*") Pointer data, PyInterpreter pyinterpreter);
  public SafePyObject(@ByRef(true) SafePyObject other) { super((Pointer)null); allocate(other); }
  @UniquePtr @Name("std::make_unique<c10::SafePyObject>") private native void allocate(@ByRef(true) SafePyObject other);

  // In principle this could be copyable if we add an incref to PyInterpreter
  // but for now it's easier to just disallow it.
  
  

  public native @ByRef PyInterpreter pyinterpreter();
  public native @Cast("PyObject*") Pointer ptr(@Const PyInterpreter arg0);

  // stop tracking the current object, and return it
  public native @Cast("PyObject*") Pointer release();
}
