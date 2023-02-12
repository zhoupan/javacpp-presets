// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Basic Box tree structure */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btQuantizedBvhTree extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuantizedBvhTree(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuantizedBvhTree(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btQuantizedBvhTree position(long position) {
        return (btQuantizedBvhTree)super.position(position);
    }
    @Override public btQuantizedBvhTree getPointer(long i) {
        return new btQuantizedBvhTree((Pointer)this).offsetAddress(i);
    }

	public btQuantizedBvhTree() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** prototype functions for box tree management
	 * \{ */
	public native void build_tree(@ByRef GIM_BVH_DATA_ARRAY primitive_boxes);

	public native void quantizePoint(
			@Cast("unsigned short*") ShortPointer quantizedpoint, @Const @ByRef btVector3 point);
	public native void quantizePoint(
			@Cast("unsigned short*") ShortBuffer quantizedpoint, @Const @ByRef btVector3 point);
	public native void quantizePoint(
			@Cast("unsigned short*") short[] quantizedpoint, @Const @ByRef btVector3 point);

	public native @Cast("bool") boolean testQuantizedBoxOverlapp(
			int node_index,
			@Cast("unsigned short*") ShortPointer quantizedMin, @Cast("unsigned short*") ShortPointer quantizedMax);
	public native @Cast("bool") boolean testQuantizedBoxOverlapp(
			int node_index,
			@Cast("unsigned short*") ShortBuffer quantizedMin, @Cast("unsigned short*") ShortBuffer quantizedMax);
	public native @Cast("bool") boolean testQuantizedBoxOverlapp(
			int node_index,
			@Cast("unsigned short*") short[] quantizedMin, @Cast("unsigned short*") short[] quantizedMax);

	public native void clearNodes();

	/** node count */
	public native int getNodeCount();

	/** tells if the node is a leaf */
	public native @Cast("bool") boolean isLeafNode(int nodeindex);

	public native int getNodeData(int nodeindex);

	public native int getLeftNode(int nodeindex);

	public native int getRightNode(int nodeindex);

	public native int getEscapeNodeIndex(int nodeindex);

	public native @Const BT_QUANTIZED_BVH_NODE get_node_pointer(int index/*=0*/);
	public native @Const BT_QUANTIZED_BVH_NODE get_node_pointer();

	/**\} */
}
