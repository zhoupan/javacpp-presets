// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Structure specifying the quantization used by the tensor, if-any.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteQuantization extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteQuantization() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteQuantization(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteQuantization(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteQuantization position(long position) {
        return (TfLiteQuantization)super.position(position);
    }
    @Override public TfLiteQuantization getPointer(long i) {
        return new TfLiteQuantization((Pointer)this).offsetAddress(i);
    }

  // The type of quantization held by params.
  public native @Cast("TfLiteQuantizationType") int type(); public native TfLiteQuantization type(int setter);
  // Holds an optional reference to a quantization param structure. The actual
  // type depends on the value of the `type` field (see the comment there for
  // the values and corresponding types).
  public native Pointer params(); public native TfLiteQuantization params(Pointer setter);
}
