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
public class btPrimitiveTriangle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPrimitiveTriangle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btPrimitiveTriangle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btPrimitiveTriangle position(long position) {
        return (btPrimitiveTriangle)super.position(position);
    }
    @Override public btPrimitiveTriangle getPointer(long i) {
        return new btPrimitiveTriangle((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_vertices(int i); public native btPrimitiveTriangle m_vertices(int i, btVector3 setter);
	@MemberGetter public native btVector3 m_vertices();
	public native @ByRef btVector4 m_plane(); public native btPrimitiveTriangle m_plane(btVector4 setter);
	public native @Cast("btScalar") double m_margin(); public native btPrimitiveTriangle m_margin(double setter);
	public native @Cast("btScalar") double m_dummy(); public native btPrimitiveTriangle m_dummy(double setter);
	public btPrimitiveTriangle() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void buildTriPlane();

	/** Test if triangles could collide */
	public native @Cast("bool") boolean overlap_test_conservative(@Const @ByRef btPrimitiveTriangle other);

	/** Calcs the plane which is paralele to the edge and perpendicular to the triangle plane
	/**
	\pre this triangle must have its plane calculated.
	*/
	public native void get_edge_plane(int edge_index, @ByRef btVector4 plane);

	public native void applyTransform(@Const @ByRef btTransform t);

	/** Clips the triangle against this
	/**
	\pre clipped_points must have MAX_TRI_CLIPPING size, and this triangle must have its plane calculated.
	@return the number of clipped points
	*/
	public native int clip_triangle(@ByRef btPrimitiveTriangle other, btVector3 clipped_points);

	/** Find collision using the clipping method
	/**
	\pre this triangle and other must have their triangles calculated
	*/
	public native @Cast("bool") boolean find_triangle_collision_clip_method(@ByRef btPrimitiveTriangle other, @ByRef GIM_TRIANGLE_CONTACT contacts);
}
