// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace torch
@Namespace("torch::serialize") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OutputArchive extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OutputArchive(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OutputArchive(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OutputArchive position(long position) {
        return (OutputArchive)super.position(position);
    }
    @Override public OutputArchive getPointer(long i) {
        return new OutputArchive((Pointer)this).position(position + i);
    }

  public OutputArchive() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Move is allowed.
  
  

  // Copy is disallowed.
  
  

  /** Writes an {@code IValue} to the {@code OutputArchive}. */
  public native void write(@StdString BytePointer key, @Const @ByRef IValue ivalue);
  public native void write(@StdString String key, @Const @ByRef IValue ivalue);

  /** Writes a {@code (key, tensor)} pair to the {@code OutputArchive}, and marks it as
   *  being or not being a buffer (non-differentiable tensor). */
  public native void write(
        @StdString BytePointer key,
        @Const @ByRef Tensor tensor,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native void write(
        @StdString BytePointer key,
        @Const @ByRef Tensor tensor);
  public native void write(
        @StdString String key,
        @Const @ByRef Tensor tensor,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native void write(
        @StdString String key,
        @Const @ByRef Tensor tensor);

  /** Writes a nested {@code OutputArchive} under the given {@code key} to this
   *  {@code OutputArchive}. */
  public native void write(@StdString BytePointer key, @ByRef OutputArchive nested_archive);
  public native void write(@StdString String key, @ByRef OutputArchive nested_archive);

  /** Saves the {@code OutputArchive} into a serialized representation in a file at
   *  {@code filename}. */
  public native void save_to(@StdString BytePointer filename);
  public native void save_to(@StdString String filename);

  /** Saves the {@code OutputArchive} into a serialized representation into the given
   *  {@code stream}. */
  public native void save_to(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Saves the {@code OutputArchive} into a serialized representation using the
   *  given writer function. */
  public native void save_to(@Const @ByRef WriteFunction func);

  /** Forwards all arguments to {@code write()}.
   *  Useful for generic code that can be re-used for both {@code OutputArchive} and
   *  {@code InputArchive} (where {@code operator()} forwards to {@code read()}). */
}