// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_concat
 <p>
 *  \addtogroup dnnl_api_sum Sum
 * 
 *  A primitive to sum multiple tensors.
 * 
 *  @see \ref dev_guide_sum in developer guide
 * 
 *  \{
 <p>
 *  Out-of-place summation (sum) primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class sum extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sum(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sum(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public sum position(long position) {
        return (sum)super.position(position);
    }
    @Override public sum getPointer(long i) {
        return new sum((Pointer)this).offsetAddress(i);
    }

    /** Primitive descriptor for a sum primitive. */
    public static class primitive_desc extends primitive_desc_base {
        static { Loader.load(); }
    
            
                
                    public primitive_desc() { super((Pointer)null); allocate(); }
                    private native void allocate();
                    public primitive_desc(@Const @ByRef primitive_desc arg0) { super((Pointer)null); allocate(arg0); }
                    private native void allocate(@Const @ByRef primitive_desc arg0);
                    
                    ///
                    public primitive_desc(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
                    private native void allocate(dnnl_primitive_desc t, @Cast("bool") boolean weak/*=false*/);
                    public primitive_desc(dnnl_primitive_desc t) { super((Pointer)null); allocate(t); }
                    private native void allocate(dnnl_primitive_desc t);
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

        /** Constructs a primitive descriptor for a sum primitive.
         * 
         *  @param aengine Engine to perform the operation on.
         *  @param dst Destination memory descriptor.
         *  @param scales Vector of scales to multiply data in each source
         *      memory by.
         *  @param srcs Vector of source memory descriptors.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        ///
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, dst, scales, srcs, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, dst, scales, srcs); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, dst, scales, srcs, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, dst, scales, srcs); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, dst, scales, srcs, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, dst, scales, srcs); }
        private native void allocate(@Const @ByRef engine aengine, @Const @ByRef org.bytedeco.dnnl.memory.desc dst,
                        @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);

        /** Constructs a primitive descriptor for a sum primitive.
         * 
         *  This version derives the destination memory descriptor
         *  automatically.
         * 
         *  @param aengine Engine on which to perform the operation.
         *  @param scales Vector of scales by which to multiply data in each
         *      source memory object.
         *  @param srcs Vector of source memory descriptors.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, scales, srcs, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, scales, srcs); }
        private native void allocate(@Const @ByRef engine aengine, @StdVector FloatPointer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);
        public primitive_desc(@Const @ByRef engine aengine, @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, scales, srcs, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, scales, srcs); }
        private native void allocate(@Const @ByRef engine aengine, @StdVector FloatBuffer scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);
        public primitive_desc(@Const @ByRef engine aengine, @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, scales, srcs, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs) { super((Pointer)null); allocate(aengine, scales, srcs); }
        private native void allocate(@Const @ByRef engine aengine, @StdVector float[] scales,
                        @Cast("const std::vector<dnnl::memory::desc>*") @ByRef memory_desc_vector srcs);

        /** Constructs a primitive descriptor for sum primitive from a C API
         *  primitive descriptor which must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for sum primitive. */
        

        /** \copydoc dnnl::primitive_desc_base::src_desc(int)const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc(int idx/*=0*/);
        public native @ByVal org.bytedeco.dnnl.memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public sum() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a sum primitive.
     *  @param pd Primitive descriptor for sum primitive. */
    public sum(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a sum primitive from a cache blob.
     *  @param pd Primitive descriptor for sum primitive.
     *  @param cache_blob Cache blob. */
    public sum(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public sum(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public sum(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(@Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
