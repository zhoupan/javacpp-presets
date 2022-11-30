// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// `TfLiteRegistrationExternal` is an external version of `TfLiteRegistration`
// for C API which doesn't use internal types (such as `TfLiteContext`) but only
// uses stable API types (such as `TfLiteOpaqueContext`). The purpose of each
// field is the exactly the same as with `TfLiteRegistration`.

@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteRegistration extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteRegistration() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteRegistration(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteRegistration(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteRegistration position(long position) {
        return (TfLiteRegistration)super.position(position);
    }
    @Override public TfLiteRegistration getPointer(long i) {
        return new TfLiteRegistration((Pointer)this).offsetAddress(i);
    }

  // Initializes the op from serialized data.
  // Called only *once* for the lifetime of the op, so any one-time allocations
  // should be made here (unless they depend on tensor sizes).
  //
  // If a built-in op:
  //   `buffer` is the op's params data (TfLiteLSTMParams*).
  //   `length` is zero.
  // If custom op:
  //   `buffer` is the op's `custom_options`.
  //   `length` is the size of the buffer.
  //
  // Returns a type-punned (i.e. void*) opaque data (e.g. a primitive pointer
  // or an instance of a struct).
  //
  // The returned pointer will be stored with the node in the `user_data` field,
  // accessible within prepare and invoke functions below.
  // NOTE: if the data is already in the desired format, simply implement this
  // function to return `nullptr` and implement the free function to be a no-op.
  public static class Init_TfLiteContext_BytePointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Init_TfLiteContext_BytePointer_long(Pointer p) { super(p); }
      protected Init_TfLiteContext_BytePointer_long() { allocate(); }
      private native void allocate();
      public native Pointer call(TfLiteContext context, @Cast("const char*") BytePointer buffer, @Cast("size_t") long length);
  }
  public native Init_TfLiteContext_BytePointer_long init(); public native TfLiteRegistration init(Init_TfLiteContext_BytePointer_long setter);

  // The pointer `buffer` is the data previously returned by an init invocation.
  public static class Free_TfLiteContext_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Free_TfLiteContext_Pointer(Pointer p) { super(p); }
      protected Free_TfLiteContext_Pointer() { allocate(); }
      private native void allocate();
      public native void call(TfLiteContext context, Pointer buffer);
  }
  public native @Name("free") Free_TfLiteContext_Pointer _free(); public native TfLiteRegistration _free(Free_TfLiteContext_Pointer setter);

  // prepare is called when the inputs this node depends on have been resized.
  // context->ResizeTensor() can be called to request output tensors to be
  // resized.
  // Can be called multiple times for the lifetime of the op.
  //
  // Returns kTfLiteOk on success.
  public static class Prepare_TfLiteContext_TfLiteNode extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Prepare_TfLiteContext_TfLiteNode(Pointer p) { super(p); }
      protected Prepare_TfLiteContext_TfLiteNode() { allocate(); }
      private native void allocate();
      public native @Cast("TfLiteStatus") int call(TfLiteContext context, TfLiteNode node);
  }
  public native Prepare_TfLiteContext_TfLiteNode prepare(); public native TfLiteRegistration prepare(Prepare_TfLiteContext_TfLiteNode setter);

  // Execute the node (should read node->inputs and output to node->outputs).
  // Returns kTfLiteOk on success.
  public static class Invoke_TfLiteContext_TfLiteNode extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Invoke_TfLiteContext_TfLiteNode(Pointer p) { super(p); }
      protected Invoke_TfLiteContext_TfLiteNode() { allocate(); }
      private native void allocate();
      public native @Cast("TfLiteStatus") int call(TfLiteContext context, TfLiteNode node);
  }
  public native Invoke_TfLiteContext_TfLiteNode invoke(); public native TfLiteRegistration invoke(Invoke_TfLiteContext_TfLiteNode setter);

  // profiling_string is called during summarization of profiling information
  // in order to group executions together. Providing a value here will cause a
  // given op to appear multiple times is the profiling report. This is
  // particularly useful for custom ops that can perform significantly
  // different calculations depending on their `user-data`.
  public static class Profiling_string_TfLiteContext_TfLiteNode extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Profiling_string_TfLiteContext_TfLiteNode(Pointer p) { super(p); }
      protected Profiling_string_TfLiteContext_TfLiteNode() { allocate(); }
      private native void allocate();
      public native @Cast("const char*") BytePointer call(@Const TfLiteContext context,
                                    @Const TfLiteNode node);
  }
  public native Profiling_string_TfLiteContext_TfLiteNode profiling_string(); public native TfLiteRegistration profiling_string(Profiling_string_TfLiteContext_TfLiteNode setter);

  // Builtin codes. If this kernel refers to a builtin this is the code
  // of the builtin. This is so we can do marshaling to other frameworks like
  // NN API.
  // Note: It is the responsibility of the registration binder to set this
  // properly.
  public native int builtin_code(); public native TfLiteRegistration builtin_code(int setter);

  // Custom op name. If the op is a builtin, this will be null.
  // Note: It is the responsibility of the registration binder to set this
  // properly.
  // WARNING: This is an experimental interface that is subject to change.
  public native @Cast("const char*") BytePointer custom_name(); public native TfLiteRegistration custom_name(BytePointer setter);

  // The version of the op.
  // Note: It is the responsibility of the registration binder to set this
  // properly.
  public native int version(); public native TfLiteRegistration version(int setter);

  // The external version of `TfLiteRegistration`. Since we can't use internal
  // types (such as `TfLiteContext`) for C API to maintain ABI stability.
  // C API user will provide `TfLiteRegistrationExternal` to implement custom
  // ops. We keep it inside of `TfLiteRegistration` and use it to route
  // callbacks properly.
  public native TfLiteRegistrationExternal registration_external(); public native TfLiteRegistration registration_external(TfLiteRegistrationExternal setter);
}
