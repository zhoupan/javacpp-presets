// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


/**The b3QuantizedBvh class stores an AABB tree that can be quickly traversed on CPU and Cell SPU.
 * It is used by the b3BvhTriangleMeshShape as midphase
 * It is recommended to use quantization for better performance and lower memory requirements. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3QuantizedBvh extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3QuantizedBvh(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3QuantizedBvh(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3QuantizedBvh position(long position) {
        return (b3QuantizedBvh)super.position(position);
    }
    @Override public b3QuantizedBvh getPointer(long i) {
        return new b3QuantizedBvh((Pointer)this).offsetAddress(i);
    }

	/** enum b3QuantizedBvh::b3TraversalMode */
	public static final int
		TRAVERSAL_STACKLESS = 0,
		TRAVERSAL_STACKLESS_CACHE_FRIENDLY = 1,
		TRAVERSAL_RECURSIVE = 2;

	public native @ByRef b3Vector3 m_bvhAabbMin(); public native b3QuantizedBvh m_bvhAabbMin(b3Vector3 setter);
	public native @ByRef b3Vector3 m_bvhAabbMax(); public native b3QuantizedBvh m_bvhAabbMax(b3Vector3 setter);
	public native @ByRef b3Vector3 m_bvhQuantization(); public native b3QuantizedBvh m_bvhQuantization(b3Vector3 setter);

	public b3QuantizedBvh() { super((Pointer)null); allocate(); }
	private native void allocate();

	///***************************************** expert/internal use only *************************
	public native void setQuantizationValues(@Const @ByRef b3Vector3 bvhAabbMin, @Const @ByRef b3Vector3 bvhAabbMax, @Cast("b3Scalar") float quantizationMargin/*=b3Scalar(1.0)*/);
	public native void setQuantizationValues(@Const @ByRef b3Vector3 bvhAabbMin, @Const @ByRef b3Vector3 bvhAabbMax);
	public native @Cast("QuantizedNodeArray*") @ByRef b3QuantizedBvhNodeArray getLeafNodeArray();
	/**buildInternal is expert use only: assumes that setQuantizationValues and LeafNodeArray are initialized */
	public native void buildInternal();
	///***************************************** expert/internal use only *************************

	public native void reportAabbOverlappingNodex(b3NodeOverlapCallback nodeCallback, @Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax);
	public native void reportRayOverlappingNodex(b3NodeOverlapCallback nodeCallback, @Const @ByRef b3Vector3 raySource, @Const @ByRef b3Vector3 rayTarget);
	public native void reportBoxCastOverlappingNodex(b3NodeOverlapCallback nodeCallback, @Const @ByRef b3Vector3 raySource, @Const @ByRef b3Vector3 rayTarget, @Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax);

	public native void quantize(@Cast("unsigned short*") ShortPointer out, @Const @ByRef b3Vector3 point, int isMax);
	public native void quantize(@Cast("unsigned short*") ShortBuffer out, @Const @ByRef b3Vector3 point, int isMax);
	public native void quantize(@Cast("unsigned short*") short[] out, @Const @ByRef b3Vector3 point, int isMax);

	public native void quantizeWithClamp(@Cast("unsigned short*") ShortPointer out, @Const @ByRef b3Vector3 point2, int isMax);
	public native void quantizeWithClamp(@Cast("unsigned short*") ShortBuffer out, @Const @ByRef b3Vector3 point2, int isMax);
	public native void quantizeWithClamp(@Cast("unsigned short*") short[] out, @Const @ByRef b3Vector3 point2, int isMax);

	public native @ByVal b3Vector3 unQuantize(@Cast("const unsigned short*") ShortPointer vecIn);
	public native @ByVal b3Vector3 unQuantize(@Cast("const unsigned short*") ShortBuffer vecIn);
	public native @ByVal b3Vector3 unQuantize(@Cast("const unsigned short*") short[] vecIn);

	/**setTraversalMode let's you choose between stackless, recursive or stackless cache friendly tree traversal. Note this is only implemented for quantized trees. */
	public native void setTraversalMode(@Cast("b3QuantizedBvh::b3TraversalMode") int traversalMode);

	public native @Cast("QuantizedNodeArray*") @ByRef b3QuantizedBvhNodeArray getQuantizedNodeArray();

	public native @Cast("BvhSubtreeInfoArray*") @ByRef b3BvhSubtreeInfoArray getSubtreeInfoArray();

	////////////////////////////////////////////////////////////////////

	/////Calculate space needed to store BVH for serialization
	public native @Cast("unsigned") int calculateSerializeBufferSize();

	/** Data buffer MUST be 16 byte aligned */
	public native @Cast("bool") boolean serialize(Pointer o_alignedDataBuffer, @Cast("unsigned") int i_dataBufferSize, @Cast("bool") boolean i_swapEndian);

	/**deSerializeInPlace loads and initializes a BVH from a buffer in memory 'in place' */
	public static native b3QuantizedBvh deSerializeInPlace(Pointer i_alignedDataBuffer, @Cast("unsigned int") int i_dataBufferSize, @Cast("bool") boolean i_swapEndian);

	public static native @Cast("unsigned int") int getAlignmentSerializationPadding();
	//////////////////////////////////////////////////////////////////////

	public native int calculateSerializeBufferSizeNew();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, b3Serializer serializer);

	public native void deSerializeFloat(@ByRef b3QuantizedBvhFloatData quantizedBvhFloatData);

	public native void deSerializeDouble(@ByRef b3QuantizedBvhDoubleData quantizedBvhDoubleData);

	////////////////////////////////////////////////////////////////////

	public native @Cast("bool") boolean isQuantized();
}
