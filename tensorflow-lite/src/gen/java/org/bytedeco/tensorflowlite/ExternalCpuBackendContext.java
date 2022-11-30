// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// This TfLiteExternalContext-derived class is the default
// 'kTfLiteCpuBackendContext'-typed context that's used internally in TF Lite
// framework. The primary purpose of having this class is to allow the same cpu
// backend context to be sharable among a set of TF Lite interpreters so that
// certain system costs are saved, like saving the cost of having multiple
// thread pools in each separate cpu backend context etc..
//
// Note: as of 2019/07/19, such context sharing among a set of interpreters will
// break the execution if these interpreters are invoked simultaneously. It
// works only when these context-sharing interpreters are invoked in a
// serialized way. Here's an example to illustrate the context sharing among 2
// TF Lite interpreters:
//
//  TfLiteExternalContext* global_ctxt = new ExternalCpuBackendContext();
//  interpreter1 = /*...*/;
//  interpreter1->SetExternalContext(kTfLiteCpuBackendContext, global_ctxt);
//  interpreter2 = /*...*/;
//  interpreter2->SetExternalContext(kTfLiteCpuBackendContext, global_ctxt);
//
//  interpreter1->SetNumThreads(2);
//  interpreter1->Invoke();
//
//  interpreter2->SetNumThreads(4);
//  interpreter2->Invoke();
//
// After sharing the context, calling 'SetNumThreads' on any of the
// context-sharing interpreters will have the global impact as it also refreshes
// the #thread info in the global cpu backend context (i.e. 'global_ctxt' above)
// that affects how much parallelism an interpreter invocation will use.
// Therefore, if different number of threads are used among different
// interpreters, don't call 'SetNumThreads' consecutively but call it
// separately between each interpreter's invocation as illustrated above.
//
// Note: it is the responsibility of the user of this context (i.e. a
// TFLiteInterpreter) to clear any state from the internal backend
// context if/when the interpreter no longer needs the shared context.
// See, e.g., TFLiteInterpreter destructor clears caches in the case of a
// shared ExternalCpuBackendContext.
@Namespace("tflite") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class ExternalCpuBackendContext extends TfLiteExternalContext {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExternalCpuBackendContext(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExternalCpuBackendContext(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExternalCpuBackendContext position(long position) {
        return (ExternalCpuBackendContext)super.position(position);
    }
    @Override public ExternalCpuBackendContext getPointer(long i) {
        return new ExternalCpuBackendContext((Pointer)this).offsetAddress(i);
    }

  public ExternalCpuBackendContext() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native void set_internal_backend_context(
        @UniquePtr TfLiteInternalBackendContext internal_backend_context);

  public native TfLiteInternalBackendContext internal_backend_context();
}
