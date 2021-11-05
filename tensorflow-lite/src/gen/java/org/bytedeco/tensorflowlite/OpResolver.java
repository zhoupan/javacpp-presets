// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** Abstract interface that returns TfLiteRegistrations given op codes or custom
 *  op names. This is the mechanism that ops being referenced in the flatbuffer
 *  model are mapped to executable function pointers (TfLiteRegistrations). */
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class OpResolver extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpResolver(Pointer p) { super(p); }

  /** Finds the op registration for a builtin operator by enum code. */
  public native @Const TfLiteRegistration FindOp(@Cast("tflite::BuiltinOperator") int op,
                                             int version);
  /** Finds the op registration of a custom operator by op name. */
  public native @Const TfLiteRegistration FindOp(@Cast("const char*") BytePointer op,
                                             int version);
  public native @Const TfLiteRegistration FindOp(String op,
                                             int version);
  // Returns optional delegates for resolving and handling ops in the flatbuffer
  // model. This may be used in addition to the standard TfLiteRegistration
  // lookup for graph resolution.
  // WARNING: This API is deprecated, GetDelegateCreators is preferred.
  public native @ByVal TfLiteDelegatePtrVector GetDelegates(int num_threads);

  // Represent a function that creates a TfLite delegate instance.
  // Returns a vector of delegate creators to create optional delegates for
  // resolving and handling ops in the flatbuffer model. This may be used in
  // addition to the standard TfLiteRegistration lookup for graph resolution.
  public native @ByVal @Cast("tflite::OpResolver::TfLiteDelegateCreators*") Pointer GetDelegateCreators();
}
