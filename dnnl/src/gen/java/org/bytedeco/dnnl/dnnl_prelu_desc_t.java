// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_pooling_v2
 <p>
 *  \addtogroup dnnl_api_prelu
 *  \{ */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_prelu_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_prelu_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_prelu_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_prelu_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_prelu_desc_t position(long position) {
        return (dnnl_prelu_desc_t)super.position(position);
    }
    @Override public dnnl_prelu_desc_t getPointer(long i) {
        return new dnnl_prelu_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_prelu. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_prelu_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, #dnnl_backward */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_prelu_desc_t prop_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t data_desc(); public native dnnl_prelu_desc_t data_desc(dnnl_memory_desc_t setter);
    /** Learnable parameter alpha memory descriptor.
     *  Alpha describes negative slope. */
    public native @ByRef dnnl_memory_desc_t weights_desc(); public native dnnl_prelu_desc_t weights_desc(dnnl_memory_desc_t setter);
    /** Source and destination gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_data_desc(); public native dnnl_prelu_desc_t diff_data_desc(dnnl_memory_desc_t setter);
    /** Learnable parameter alpha gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_weights_desc(); public native dnnl_prelu_desc_t diff_weights_desc(dnnl_memory_desc_t setter);
}
