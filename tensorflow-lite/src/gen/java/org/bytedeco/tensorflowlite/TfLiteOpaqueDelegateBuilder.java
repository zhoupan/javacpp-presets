// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// `TfLiteOpaqueDelegateBuilder` is used for constructing
// `TfLiteOpaqueDelegate`, see `TfLiteOpaqueDelegateCreate` below.  Note:
// This struct is not ABI stable.
//
// For forward source compatibility `TfLiteOpaqueDelegateBuilder` objects should
// be brace-initialized, so that all fields (including any that might be added
// in the future) get zero-initialized.  The purpose of each field is exactly
// the same as with `TfLiteDelegate`.
//
// WARNING: This is an experimental interface that is subject to change.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteOpaqueDelegateBuilder extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteOpaqueDelegateBuilder() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteOpaqueDelegateBuilder(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteOpaqueDelegateBuilder(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteOpaqueDelegateBuilder position(long position) {
        return (TfLiteOpaqueDelegateBuilder)super.position(position);
    }
    @Override public TfLiteOpaqueDelegateBuilder getPointer(long i) {
        return new TfLiteOpaqueDelegateBuilder((Pointer)this).offsetAddress(i);
    }

  // Data that delegate needs to identify itself. This data is owned by the
  // delegate. The delegate is owned in the user code, so the delegate is
  // responsible for deallocating this when it is destroyed.
  public native Pointer data(); public native TfLiteOpaqueDelegateBuilder data(Pointer setter);
  // Invoked by ModifyGraphWithDelegate. This prepare is called, giving the
  // delegate a view of the current graph through TfLiteContext*. It typically
  // will look at the nodes and call ReplaceNodeSubsetsWithDelegateKernels()
  // to ask the TensorFlow lite runtime to create macro-nodes to represent
  // delegated subgraphs of the original graph.
  public static class Prepare_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Prepare_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer(Pointer p) { super(p); }
      protected Prepare_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("TfLiteStatus") int call(TfLiteOpaqueContext context,
                            @Cast("TfLiteOpaqueDelegate*") TfLiteOpaqueDelegateStruct delegate, Pointer data);
  }
  public native Prepare_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer Prepare(); public native TfLiteOpaqueDelegateBuilder Prepare(Prepare_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer setter);
  // Copies the data from delegate buffer handle into raw memory of the given
  // 'tensor'. Note that the delegate is allowed to allocate the raw bytes as
  // long as it follows the rules for kTfLiteDynamic tensors, in which case this
  // cannot be null.
  public static class CopyFromBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    CopyFromBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor(Pointer p) { super(p); }
      protected CopyFromBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor() { allocate(); }
      private native void allocate();
      public native @Cast("TfLiteStatus") int call(
        TfLiteOpaqueContext context, @Cast("TfLiteOpaqueDelegate*") TfLiteOpaqueDelegateStruct delegate, Pointer data,
        @Cast("TfLiteBufferHandle") int buffer_handle, TfLiteOpaqueTensor tensor);
  }
  public native CopyFromBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor CopyFromBufferHandle(); public native TfLiteOpaqueDelegateBuilder CopyFromBufferHandle(CopyFromBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor setter);
  // Copies the data from raw memory of the given 'tensor' to delegate buffer
  // handle. This can be null if the delegate doesn't use its own buffer.
  public static class CopyToBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    CopyToBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor(Pointer p) { super(p); }
      protected CopyToBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor() { allocate(); }
      private native void allocate();
      public native @Cast("TfLiteStatus") int call(
        TfLiteOpaqueContext context, @Cast("TfLiteOpaqueDelegate*") TfLiteOpaqueDelegateStruct delegate, Pointer data,
        @Cast("TfLiteBufferHandle") int buffer_handle, TfLiteOpaqueTensor tensor);
  }
  public native CopyToBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor CopyToBufferHandle(); public native TfLiteOpaqueDelegateBuilder CopyToBufferHandle(CopyToBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_int_TfLiteOpaqueTensor setter);
  // Frees the Delegate Buffer Handle. Note: This only frees the handle, but
  // this doesn't release the underlying resource (e.g. textures). The
  // resources are either owned by application layer or the delegate.
  // This can be null if the delegate doesn't use its own buffer.
  public static class FreeBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_IntPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    FreeBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_IntPointer(Pointer p) { super(p); }
      protected FreeBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_IntPointer() { allocate(); }
      private native void allocate();
      public native void call(TfLiteOpaqueContext context,
                             @Cast("TfLiteOpaqueDelegate*") TfLiteOpaqueDelegateStruct delegate, Pointer data,
                             @Cast("TfLiteBufferHandle*") IntPointer handle);
  }
  public native FreeBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_IntPointer FreeBufferHandle(); public native TfLiteOpaqueDelegateBuilder FreeBufferHandle(FreeBufferHandle_TfLiteOpaqueContext_TfLiteOpaqueDelegateStruct_Pointer_IntPointer setter);
  // Bitmask flags. See the comments in `TfLiteDelegateFlags`.
  public native @Cast("int64_t") long flags(); public native TfLiteOpaqueDelegateBuilder flags(long setter);
}
