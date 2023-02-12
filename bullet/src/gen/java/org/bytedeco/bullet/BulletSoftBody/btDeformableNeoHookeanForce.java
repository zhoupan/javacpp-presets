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

// This energy is as described in https://graphics.pixar.com/library/StableElasticity/paper.pdf
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableNeoHookeanForce extends btDeformableLagrangianForce {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableNeoHookeanForce(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableNeoHookeanForce(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableNeoHookeanForce position(long position) {
        return (btDeformableNeoHookeanForce)super.position(position);
    }
    @Override public btDeformableNeoHookeanForce getPointer(long i) {
        return new btDeformableNeoHookeanForce((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") double m_mu(); public native btDeformableNeoHookeanForce m_mu(double setter);
	public native @Cast("btScalar") double m_lambda(); public native btDeformableNeoHookeanForce m_lambda(double setter);  // Lame Parameters
	public native @Cast("btScalar") double m_E(); public native btDeformableNeoHookeanForce m_E(double setter);
	public native @Cast("btScalar") double m_nu(); public native btDeformableNeoHookeanForce m_nu(double setter);       // Young's modulus and Poisson ratio
	public native @Cast("btScalar") double m_mu_damp(); public native btDeformableNeoHookeanForce m_mu_damp(double setter);
	public native @Cast("btScalar") double m_lambda_damp(); public native btDeformableNeoHookeanForce m_lambda_damp(double setter);
	public btDeformableNeoHookeanForce() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btDeformableNeoHookeanForce(@Cast("btScalar") double mu, @Cast("btScalar") double lambda, @Cast("btScalar") double damping/*=0.05*/) { super((Pointer)null); allocate(mu, lambda, damping); }
	private native void allocate(@Cast("btScalar") double mu, @Cast("btScalar") double lambda, @Cast("btScalar") double damping/*=0.05*/);
	public btDeformableNeoHookeanForce(@Cast("btScalar") double mu, @Cast("btScalar") double lambda) { super((Pointer)null); allocate(mu, lambda); }
	private native void allocate(@Cast("btScalar") double mu, @Cast("btScalar") double lambda);

	public native void updateYoungsModulusAndPoissonRatio();

	public native void updateLameParameters();

	public native void setYoungsModulus(@Cast("btScalar") double E);

	public native void setPoissonRatio(@Cast("btScalar") double nu);

	public native void setDamping(@Cast("btScalar") double damping);

	public native void setLameParameters(@Cast("btScalar") double mu, @Cast("btScalar") double lambda);

	public native void addScaledForces(@Cast("btScalar") double scale, @Cast("btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledExplicitForce(@Cast("btScalar") double scale, @Cast("btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array force);

	// The damping matrix is calculated using the time n state as described in https://www.math.ucla.edu/~jteran/papers/GSSJT15.pdf to allow line search
	public native void addScaledDampingForce(@Cast("btScalar") double scale, @Cast("btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array force);

	public native double totalElasticEnergy(@Cast("btScalar") double dt);

	// The damping energy is formulated as in https://www.math.ucla.edu/~jteran/papers/GSSJT15.pdf to allow line search
	public native double totalDampingEnergy(@Cast("btScalar") double dt);

	public native double elasticEnergyDensity(@Const @ByRef btSoftBody.TetraScratch s);

	public native void addScaledElasticForce(@Cast("btScalar") double scale, @Cast("btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array force);

	// The damping matrix is calculated using the time n state as described in https://www.math.ucla.edu/~jteran/papers/GSSJT15.pdf to allow line search
	public native void addScaledDampingForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array dv, @Cast("btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array df);

	public native void buildDampingForceDifferentialDiagonal(@Cast("btScalar") double scale, @Cast("btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array diagA);

	public native void addScaledElasticForceDifferential(@Cast("btScalar") double scale, @Cast("const btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array dx, @Cast("btDeformableNeoHookeanForce::TVStack*") @ByRef btVector3Array df);

	public native void firstPiola(@Const @ByRef btSoftBody.TetraScratch s, @ByRef btMatrix3x3 P);

	// Let P be the first piola stress.
	// This function calculates the dP = dP/dF * dF
	public native void firstPiolaDifferential(@Const @ByRef btSoftBody.TetraScratch s, @Const @ByRef btMatrix3x3 dF, @ByRef btMatrix3x3 dP);

	// Let Q be the damping stress.
	// This function calculates the dP = dQ/dF * dF
	public native void firstPiolaDampingDifferential(@Const @ByRef btSoftBody.TetraScratch s, @Const @ByRef btMatrix3x3 dF, @ByRef btMatrix3x3 dP);

	public native @Cast("btScalar") double DotProduct(@Const @ByRef btMatrix3x3 A, @Const @ByRef btMatrix3x3 B);

	// Let C(A) be the cofactor of the matrix A
	// Let H = the derivative of C(A) with respect to A evaluated at F = A
	// This function calculates H*dF
	public native void addScaledCofactorMatrixDifferential(@Const @ByRef btMatrix3x3 F, @Const @ByRef btMatrix3x3 dF, @Cast("btScalar") double scale, @ByRef btMatrix3x3 M);

	public native @Cast("btDeformableLagrangianForceType") int getForceType();
}
