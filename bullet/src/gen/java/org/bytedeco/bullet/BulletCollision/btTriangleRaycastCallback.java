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
public class btTriangleRaycastCallback extends btTriangleCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleRaycastCallback(Pointer p) { super(p); }

	//input
	public native @ByRef btVector3 m_from(); public native btTriangleRaycastCallback m_from(btVector3 setter);
	public native @ByRef btVector3 m_to(); public native btTriangleRaycastCallback m_to(btVector3 setter);

	//@BP Mod - allow backface filtering and unflipped normals
	/** enum btTriangleRaycastCallback::EFlags */
	public static final int
		kF_None = 0,
		kF_FilterBackfaces = 1 << 0,
		kF_KeepUnflippedNormal = 1 << 1,             // Prevents returned face normal getting flipped when a ray hits a back-facing triangle
													 /**SubSimplexConvexCastRaytest is the default, even if kF_None is set. */
		kF_UseSubSimplexConvexCastRaytest = 1 << 2,  // Uses an approximate but faster ray versus convex intersection algorithm
		kF_UseGjkConvexCastRaytest = 1 << 3,
		kF_DisableHeightfieldAccelerator  = 1 << 4, //don't use the heightfield raycast accelerator. See https://github.com/bulletphysics/bullet3/pull/2062
		kF_Terminator = 0xFFFFFFFF;
	public native @Cast("unsigned int") int m_flags(); public native btTriangleRaycastCallback m_flags(int setter);

	public native @Cast("btScalar") double m_hitFraction(); public native btTriangleRaycastCallback m_hitFraction(double setter);

	public native void processTriangle(btVector3 triangle, int partId, int triangleIndex);

	public native @Cast("btScalar") double reportHit(@Const @ByRef btVector3 hitNormalLocal, @Cast("btScalar") double hitFraction, int partId, int triangleIndex);
}
