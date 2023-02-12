// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableCorotatedForce extends btDeformableLagrangianForce {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableCorotatedForce(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableCorotatedForce(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableCorotatedForce position(long position) {
        return (btDeformableCorotatedForce)super.position(position);
    }
    @Override public btDeformableCorotatedForce getPointer(long i) {
        return new btDeformableCorotatedForce((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") double m_mu(); public native btDeformableCorotatedForce m_mu(double setter);
	public native @Cast("btScalar") double m_lambda(); public native btDeformableCorotatedForce m_lambda(double setter);
	public btDeformableCorotatedForce() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btDeformableCorotatedForce(@Cast("btScalar") double mu, @Cast("btScalar") double lambda) { super((Pointer)null); allocate(mu, lambda); }
	private native void allocate(@Cast("btScalar") double mu, @Cast("btScalar") double lambda);

	public native void addScaledForces(@Cast("btScalar") double scale, @Cast("btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledExplicitForce(@Cast("btScalar") double scale, @Cast("btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledDampingForce(@Cast("btScalar") double scale, @Cast("btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledElasticForce(@Cast("btScalar") double scale, @Cast("btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array force);

	public native void firstPiola(@Const @ByRef btMatrix3x3 F, @ByRef btMatrix3x3 P);

	public native void addScaledElasticForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array dx, @Cast("btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array df);

	public native void addScaledDampingForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array dv, @Cast("btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array df);

	public native void buildDampingForceDifferentialDiagonal(@Cast("btScalar") double scale, @Cast("btDeformableCorotatedForce::TVStack*") @ByRef btVector3Array diagA);

	public native @Cast("btDeformableLagrangianForceType") int getForceType();
}
