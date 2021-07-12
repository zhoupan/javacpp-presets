// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \class Ort::BFloat16_t
  * \brief is a structure that represents bfloat16 data.
  * \details It is necessary for type dispatching to make use of C++ API
  * The type is implicitly convertible to/from uint16_t.
  * The size of the structure should align with uint16_t and one can freely cast
  * uint16_t buffers to/from Ort::BFloat16_t to feed and retrieve data.
  * 
  * See also code examples for Float16_t above.
  */
@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BFloat16_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BFloat16_t(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BFloat16_t(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BFloat16_t position(long position) {
        return (BFloat16_t)super.position(position);
    }
    @Override public BFloat16_t getPointer(long i) {
        return new BFloat16_t((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint16_t") short value(); public native BFloat16_t value(short setter);
  public BFloat16_t() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();
  public BFloat16_t(@Cast("uint16_t") short v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@Cast("uint16_t") short v);
  public native @Cast("uint16_t") @Name("operator uint16_t") @NoException(true) short asShort();
  public native @Cast("const bool") @Name("operator ==") @NoException(true) boolean equals(@Const @ByRef BFloat16_t rhs);
  public native @Cast("const bool") @Name("operator !=") @NoException(true) boolean notEquals(@Const @ByRef BFloat16_t rhs);
}
