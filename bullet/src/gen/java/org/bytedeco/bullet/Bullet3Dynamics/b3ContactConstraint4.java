// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3ContactConstraint4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3ContactConstraint4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3ContactConstraint4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3ContactConstraint4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3ContactConstraint4 position(long position) {
        return (b3ContactConstraint4)super.position(position);
    }
    @Override public b3ContactConstraint4 getPointer(long i) {
        return new b3ContactConstraint4((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3 m_linear(); public native b3ContactConstraint4 m_linear(b3Vector3 setter);  //normal?
	public native @ByRef b3Vector3 m_worldPos(int i); public native b3ContactConstraint4 m_worldPos(int i, b3Vector3 setter);
	@MemberGetter public native b3Vector3 m_worldPos();
	public native @ByRef b3Vector3 m_center(); public native b3ContactConstraint4 m_center(b3Vector3 setter);  //	friction
	public native float m_jacCoeffInv(int i); public native b3ContactConstraint4 m_jacCoeffInv(int i, float setter);
	@MemberGetter public native FloatPointer m_jacCoeffInv();
	public native float m_b(int i); public native b3ContactConstraint4 m_b(int i, float setter);
	@MemberGetter public native FloatPointer m_b();
	public native float m_appliedRambdaDt(int i); public native b3ContactConstraint4 m_appliedRambdaDt(int i, float setter);
	@MemberGetter public native FloatPointer m_appliedRambdaDt();
	public native float m_fJacCoeffInv(int i); public native b3ContactConstraint4 m_fJacCoeffInv(int i, float setter);
	@MemberGetter public native FloatPointer m_fJacCoeffInv();      //	friction
	public native float m_fAppliedRambdaDt(int i); public native b3ContactConstraint4 m_fAppliedRambdaDt(int i, float setter);
	@MemberGetter public native FloatPointer m_fAppliedRambdaDt();  //	friction

	public native @Cast("unsigned int") int m_bodyA(); public native b3ContactConstraint4 m_bodyA(int setter);
	public native @Cast("unsigned int") int m_bodyB(); public native b3ContactConstraint4 m_bodyB(int setter);
	public native int m_batchIdx(); public native b3ContactConstraint4 m_batchIdx(int setter);
	public native @Cast("unsigned int") int m_paddings(); public native b3ContactConstraint4 m_paddings(int setter);
}
