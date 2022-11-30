// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** WARNING: Experimental interface, subject to change. */
// An initialization status class. This class will record the completion status
// of the initialization procedure. For example, when the initialization
// subgraph should be invoked  once in a life cycle, this class instance will
// have the initialization status in order to make sure the followup invocations
// to invoke the initalization subgraph can be ignored safely.
@Namespace("tflite::resource") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class InitializationStatus extends ResourceBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InitializationStatus(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InitializationStatus(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public InitializationStatus position(long position) {
        return (InitializationStatus)super.position(position);
    }
    @Override public InitializationStatus getPointer(long i) {
        return new InitializationStatus((Pointer)this).offsetAddress(i);
    }

  public InitializationStatus() { super((Pointer)null); allocate(); }
  private native void allocate();
  public InitializationStatus(@ByRef(true) InitializationStatus other) { super((Pointer)null); allocate(other); }
  private native void allocate(@ByRef(true) InitializationStatus other);

  
  

  // Mark initialization is done.
  public native void MarkInitializationIsDone();

  // Returns true if this initialization is done.
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long GetMemoryUsage();
}
