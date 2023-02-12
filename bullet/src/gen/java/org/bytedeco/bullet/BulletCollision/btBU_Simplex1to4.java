// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btBU_Simplex1to4 implements tetrahedron, triangle, line, vertex collision shapes. In most cases it is better to use btConvexHullShape instead. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBU_Simplex1to4 extends btPolyhedralConvexAabbCachingShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBU_Simplex1to4(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btBU_Simplex1to4(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btBU_Simplex1to4 position(long position) {
        return (btBU_Simplex1to4)super.position(position);
    }
    @Override public btBU_Simplex1to4 getPointer(long i) {
        return new btBU_Simplex1to4((Pointer)this).offsetAddress(i);
    }


	public btBU_Simplex1to4() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btBU_Simplex1to4(@Const @ByRef btVector3 pt0) { super((Pointer)null); allocate(pt0); }
	private native void allocate(@Const @ByRef btVector3 pt0);
	public btBU_Simplex1to4(@Const @ByRef btVector3 pt0, @Const @ByRef btVector3 pt1) { super((Pointer)null); allocate(pt0, pt1); }
	private native void allocate(@Const @ByRef btVector3 pt0, @Const @ByRef btVector3 pt1);
	public btBU_Simplex1to4(@Const @ByRef btVector3 pt0, @Const @ByRef btVector3 pt1, @Const @ByRef btVector3 pt2) { super((Pointer)null); allocate(pt0, pt1, pt2); }
	private native void allocate(@Const @ByRef btVector3 pt0, @Const @ByRef btVector3 pt1, @Const @ByRef btVector3 pt2);
	public btBU_Simplex1to4(@Const @ByRef btVector3 pt0, @Const @ByRef btVector3 pt1, @Const @ByRef btVector3 pt2, @Const @ByRef btVector3 pt3) { super((Pointer)null); allocate(pt0, pt1, pt2, pt3); }
	private native void allocate(@Const @ByRef btVector3 pt0, @Const @ByRef btVector3 pt1, @Const @ByRef btVector3 pt2, @Const @ByRef btVector3 pt3);

	public native void reset();

	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void addVertex(@Const @ByRef btVector3 pt);

	//PolyhedralConvexShape interface

	public native int getNumVertices();

	public native int getNumEdges();

	public native void getEdge(int i, @ByRef btVector3 pa, @ByRef btVector3 pb);

	public native void getVertex(int i, @ByRef btVector3 vtx);

	public native int getNumPlanes();

	public native void getPlane(@ByRef btVector3 planeNormal, @ByRef btVector3 planeSupport, int i);

	public native int getIndex(int i);

	public native @Cast("bool") boolean isInside(@Const @ByRef btVector3 pt, @Cast("btScalar") double tolerance);

	/**getName is for debugging */
	public native @Cast("const char*") BytePointer getName();
}
