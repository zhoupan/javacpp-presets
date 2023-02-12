// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSubSimplexClosestResult extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btSubSimplexClosestResult() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSubSimplexClosestResult(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSubSimplexClosestResult(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btSubSimplexClosestResult position(long position) {
        return (btSubSimplexClosestResult)super.position(position);
    }
    @Override public btSubSimplexClosestResult getPointer(long i) {
        return new btSubSimplexClosestResult((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_closestPointOnSimplex(); public native btSubSimplexClosestResult m_closestPointOnSimplex(btVector3 setter);
	//MASK for m_usedVertices
	//stores the simplex vertex-usage, using the MASK,
	// if m_usedVertices & MASK then the related vertex is used
	public native @ByRef btUsageBitfield m_usedVertices(); public native btSubSimplexClosestResult m_usedVertices(btUsageBitfield setter);
	public native @Cast("btScalar") double m_barycentricCoords(int i); public native btSubSimplexClosestResult m_barycentricCoords(int i, double setter);
	@MemberGetter public native @Cast("btScalar*") DoublePointer m_barycentricCoords();
	public native @Cast("bool") boolean m_degenerate(); public native btSubSimplexClosestResult m_degenerate(boolean setter);

	public native void reset();
	public native @Cast("bool") boolean isValid();
	public native void setBarycentricCoordinates(@Cast("btScalar") double a/*=btScalar(0.)*/, @Cast("btScalar") double b/*=btScalar(0.)*/, @Cast("btScalar") double c/*=btScalar(0.)*/, @Cast("btScalar") double d/*=btScalar(0.)*/);
	public native void setBarycentricCoordinates();
}
