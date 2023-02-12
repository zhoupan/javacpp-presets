// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleShape extends btPolyhedralConvexShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTriangleShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTriangleShape position(long position) {
        return (btTriangleShape)super.position(position);
    }
    @Override public btTriangleShape getPointer(long i) {
        return new btTriangleShape((Pointer)this).offsetAddress(i);
    }


	public native @ByRef btVector3 m_vertices1(int i); public native btTriangleShape m_vertices1(int i, btVector3 setter);
	@MemberGetter public native btVector3 m_vertices1();

	public native int getNumVertices();

	public native @ByRef btVector3 getVertexPtr(int index);
	public native void getVertex(int index, @ByRef btVector3 vert);

	public native int getNumEdges();

	public native void getEdge(int i, @ByRef btVector3 pa, @ByRef btVector3 pb);

	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 dir);

	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public btTriangleShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btTriangleShape(@Const @ByRef btVector3 p0, @Const @ByRef btVector3 p1, @Const @ByRef btVector3 p2) { super((Pointer)null); allocate(p0, p1, p2); }
	private native void allocate(@Const @ByRef btVector3 p0, @Const @ByRef btVector3 p1, @Const @ByRef btVector3 p2);

	public native void getPlane(@ByRef btVector3 planeNormal, @ByRef btVector3 planeSupport, int i);

	public native int getNumPlanes();

	public native void calcNormal(@ByRef btVector3 normal);

	public native void getPlaneEquation(int i, @ByRef btVector3 planeNormal, @ByRef btVector3 planeSupport);

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native @Cast("bool") boolean isInside(@Const @ByRef btVector3 pt, @Cast("btScalar") double tolerance);
	//debugging
	public native @Cast("const char*") BytePointer getName();

	public native int getNumPreferredPenetrationDirections();

	public native void getPreferredPenetrationDirection(int index, @ByRef btVector3 penetrationVector);
}
