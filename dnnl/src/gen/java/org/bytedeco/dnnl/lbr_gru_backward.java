// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** LBR GRU backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class lbr_gru_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lbr_gru_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lbr_gru_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public lbr_gru_backward position(long position) {
        return (lbr_gru_backward)super.position(position);
    }
    @Override public lbr_gru_backward getPointer(long i) {
        return new lbr_gru_backward((Pointer)this).offsetAddress(i);
    }

    /** Descriptor for a LBR GRU backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        ///
        public native @ByRef dnnl_rnn_desc_t data(); public native desc data(dnnl_rnn_desc_t setter);

        /** Constructs a descriptor for LBR GRU backward propagation
         *  primitive.
         * 
         *  The following arguments may point to a zero memory descriptor:
         *  - \p src_iter_desc together with \p diff_src_iter_desc,
         *  - \p bias_desc together with \p diff_bias_desc,
         *  - \p dst_iter_desc together with \p diff_dst_iter_desc.
         * 
         *  This would then indicate that the LBR GRU backward propagation
         *  primitive should not use them and should default to zero values
         *  instead.
         * 
         *  \note
         *      All memory descriptors may be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param aprop_kind Propagation kind. Must be
         *      #dnnl::prop_kind::backward.
         *  @param direction RNN direction. See \ref dnnl::rnn_direction for
         *      more info.
         *  @param src_layer_desc Memory descriptor for the input vector.
         *  @param src_iter_desc Memory descriptor for the input recurrent
         *      hidden state vector.
         *  @param weights_layer_desc Memory descriptor for the weights
         *      applied to the layer input.
         *  @param weights_iter_desc Memory descriptor for the weights applied
         *      to the recurrent input.
         *  @param bias_desc Bias memory descriptor.
         *  @param dst_layer_desc Memory descriptor for the output vector.
         *  @param dst_iter_desc Memory descriptor for the output recurrent
         *      hidden state vector.
         *  @param diff_src_layer_desc Memory descriptor for the diff of input
         *      vector.
         *  @param diff_src_iter_desc Memory descriptor for the diff of input
         *      recurrent hidden state vector.
         *  @param diff_weights_layer_desc Memory descriptor for the diff of
         *      weights applied to the layer input.
         *  @param diff_weights_iter_desc Memory descriptor for the diff of
         *      weights applied to the recurrent input.
         *  @param diff_bias_desc Diff bias memory descriptor.
         *  @param diff_dst_layer_desc Memory descriptor for the diff of
         *      output vector.
         *  @param diff_dst_iter_desc Memory descriptor for the diff of output
         *      recurrent hidden state vector.
         *  @param flags Unused. */
        public desc(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        rnn_flags flags/*=dnnl::rnn_flags::undef*/) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, flags); }
        private native void allocate(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        rnn_flags flags/*=dnnl::rnn_flags::undef*/);
        public desc(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc); }
        private native void allocate(prop_kind aprop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        @Cast("dnnl::rnn_flags") int flags/*=dnnl::rnn_flags::undef*/) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, flags); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc,
                        @Cast("dnnl::rnn_flags") int flags/*=dnnl::rnn_flags::undef*/);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc) { super((Pointer)null); allocate(aprop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Const @ByRef memory.desc diff_src_layer_desc,
                        @Const @ByRef memory.desc diff_src_iter_desc,
                        @Const @ByRef memory.desc diff_weights_layer_desc,
                        @Const @ByRef memory.desc diff_weights_iter_desc,
                        @Const @ByRef memory.desc diff_bias_desc,
                        @Const @ByRef memory.desc diff_dst_layer_desc,
                        @Const @ByRef memory.desc diff_dst_iter_desc);
    }

    /** Primitive descriptor for an LBR GRU backward propagation primitive. */
    public static class primitive_desc extends rnn_primitive_desc_base {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an LBR GRU backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for an LBR GRU backward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an LBR GRU
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an LBR GRU backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for an LBR GRU backward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an LBR GRU
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef lbr_gru_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a LBR GRU backward propagation
         *  primitive from a C API primitive descriptor that must have a
         *  matching kind.
         * 
         *  @param pd C API primitive descriptor for a LBR GRU backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::rnn_primitive_desc_base::src_layer_desc()const */
        public native @ByVal memory.desc src_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::src_iter_desc()const */
        public native @ByVal memory.desc src_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_layer_desc()const */
        public native @ByVal memory.desc weights_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_iter_desc()const */
        public native @ByVal memory.desc weights_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::bias_desc()const */
        public native @ByVal memory.desc bias_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_layer_desc()const */
        public native @ByVal memory.desc dst_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_iter_desc()const */
        public native @ByVal memory.desc dst_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::workspace_desc()const */
        public native @ByVal memory.desc workspace_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_src_layer_desc()const */
        public native @ByVal memory.desc diff_src_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_src_iter_desc()const */
        public native @ByVal memory.desc diff_src_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_weights_layer_desc()const */
        public native @ByVal memory.desc diff_weights_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_weights_iter_desc()const */
        public native @ByVal memory.desc diff_weights_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_bias_desc()const */
        public native @ByVal memory.desc diff_bias_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_dst_layer_desc()const */
        public native @ByVal memory.desc diff_dst_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_dst_iter_desc()const */
        public native @ByVal memory.desc diff_dst_iter_desc();
    }

    /** Default constructor. Produces an empty object. */
    public lbr_gru_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an LBR GRU backward propagation primitive.
     *  @param pd Primitive descriptor for an LBR GRU backward propagation
     *      primitive. */
    public lbr_gru_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs an LBR GRU backward propagation primitive from a cache blob.
     *  @param pd Primitive descriptor for an LBR GRU backward propagation
     *      primitive.
     *  @param cache_blob Cache blob. */
    public lbr_gru_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public lbr_gru_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public lbr_gru_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
