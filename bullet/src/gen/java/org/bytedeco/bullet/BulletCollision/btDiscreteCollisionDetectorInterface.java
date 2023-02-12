// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** This interface is made to be used by an iterative approach to do TimeOfImpact calculations
 *  This interface allows to query for closest points and penetration depth between two (convex) objects
 *  the closest point is on the second object (B), and the normal points from the surface on B towards A.
 *  distance is between closest points on B and closest point on A. So you can calculate closest point on A
 *  by taking closestPointInA = closestPointInB + m_distance * m_normalOnSurfaceB */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btDiscreteCollisionDetectorInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDiscreteCollisionDetectorInterface(Pointer p) { super(p); }

	public static class Result extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Result(Pointer p) { super(p); }
	

		/**setShapeIdentifiersA/B provides experimental support for per-triangle material / custom material combiner */
		public native void setShapeIdentifiersA(int partId0, int index0);
		public native void setShapeIdentifiersB(int partId1, int index1);
		public native void addContactPoint(@Const @ByRef btVector3 normalOnBInWorld, @Const @ByRef btVector3 pointInWorld, @Cast("btScalar") double depth);
	}

	@NoOffset public static class ClosestPointInput extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ClosestPointInput(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public ClosestPointInput(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public ClosestPointInput position(long position) {
	        return (ClosestPointInput)super.position(position);
	    }
	    @Override public ClosestPointInput getPointer(long i) {
	        return new ClosestPointInput((Pointer)this).offsetAddress(i);
	    }
	
		public ClosestPointInput() { super((Pointer)null); allocate(); }
		private native void allocate();

		public native @ByRef btTransform m_transformA(); public native ClosestPointInput m_transformA(btTransform setter);
		public native @ByRef btTransform m_transformB(); public native ClosestPointInput m_transformB(btTransform setter);
		public native @Cast("btScalar") double m_maximumDistanceSquared(); public native ClosestPointInput m_maximumDistanceSquared(double setter);
	}

	//
	// give either closest points (distance > 0) or penetration (distance)
	// the normal always points from B towards A
	//
	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw, @Cast("bool") boolean swapResults/*=false*/);
	public native void getClosestPoints(@Const @ByRef ClosestPointInput input, @ByRef Result output, btIDebugDraw debugDraw);
}
