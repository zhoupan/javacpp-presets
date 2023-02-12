// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;
  // bits per axis

/** btGeneric6DofConstraint between two rigidbodies each with a pivotpoint that descibes the axis location in local space
/**
btGeneric6DofConstraint can leave any of the 6 degree of freedom 'free' or 'locked'.
currently this limit supports rotational motors<br>
<ul>
<li> For Linear limits, use btGeneric6DofConstraint.setLinearUpperLimit, btGeneric6DofConstraint.setLinearLowerLimit. You can set the parameters with the btTranslationalLimitMotor structure accsesible through the btGeneric6DofConstraint.getTranslationalLimitMotor method.
At this moment translational motors are not supported. May be in the future. </li>
<p>
<li> For Angular limits, use the btRotationalLimitMotor structure for configuring the limit.
This is accessible through btGeneric6DofConstraint.getLimitMotor method,
This brings support for limit parameters and motors. </li>
<p>
<li> Angulars limits have these possible ranges:
<table border=1 >
<tr>
	<td><b>AXIS</b></td>
	<td><b>MIN ANGLE</b></td>
	<td><b>MAX ANGLE</b></td>
</tr><tr>
	<td>X</td>
	<td>-PI</td>
	<td>PI</td>
</tr><tr>
	<td>Y</td>
	<td>-PI/2</td>
	<td>PI/2</td>
</tr><tr>
	<td>Z</td>
	<td>-PI</td>
	<td>PI</td>
</tr>
</table>
</li>
</ul>
<p>
*/
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btGeneric6DofConstraint extends btTypedConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofConstraint(Pointer p) { super(p); }


	/**for backwards compatibility during the transition to 'getInfo/getInfo2' */
	public native @Cast("bool") boolean m_useSolveConstraintObsolete(); public native btGeneric6DofConstraint m_useSolveConstraintObsolete(boolean setter);

	public btGeneric6DofConstraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA) { super((Pointer)null); allocate(rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @Const @ByRef btTransform frameInA, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameA);
	public btGeneric6DofConstraint(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameB) { super((Pointer)null); allocate(rbB, frameInB, useLinearReferenceFrameB); }
	private native void allocate(@ByRef btRigidBody rbB, @Const @ByRef btTransform frameInB, @Cast("bool") boolean useLinearReferenceFrameB);

	/** Calcs global transform of the offsets
	/**
	Calcs the global transform for the joint offset for body A an B, and also calcs the agle differences between the bodies.
	@see btGeneric6DofConstraint.getCalculatedTransformA , btGeneric6DofConstraint.getCalculatedTransformB, btGeneric6DofConstraint.calculateAngleInfo
	*/
	public native void calculateTransforms(@Const @ByRef btTransform transA, @Const @ByRef btTransform transB);

	public native void calculateTransforms();

	/** Gets the global transform of the offset for body A
	/**
    @see btGeneric6DofConstraint.getFrameOffsetA, btGeneric6DofConstraint.getFrameOffsetB, btGeneric6DofConstraint.calculateAngleInfo.
    */
	public native @Const @ByRef btTransform getCalculatedTransformA();

	/** Gets the global transform of the offset for body B
	/**
    @see btGeneric6DofConstraint.getFrameOffsetA, btGeneric6DofConstraint.getFrameOffsetB, btGeneric6DofConstraint.calculateAngleInfo.
    */
	public native @Const @ByRef btTransform getCalculatedTransformB();

	public native @ByRef btTransform getFrameOffsetA();

	public native @ByRef btTransform getFrameOffsetB();

	/** performs Jacobian calculation, and also calculates angle differences and axis */
	public native void buildJacobian();

	public native void getInfo1(btConstraintInfo1 info);

	public native void getInfo1NonVirtual(btConstraintInfo1 info);

	public native void getInfo2(btConstraintInfo2 info);

	public native void getInfo2NonVirtual(btConstraintInfo2 info, @Const @ByRef btTransform transA, @Const @ByRef btTransform transB, @Const @ByRef btVector3 linVelA, @Const @ByRef btVector3 linVelB, @Const @ByRef btVector3 angVelA, @Const @ByRef btVector3 angVelB);

	public native void updateRHS(@Cast("btScalar") double timeStep);

	/** Get the rotation axis in global coordinates
	/**
	\pre btGeneric6DofConstraint.buildJacobian must be called previously.
	*/
	public native @ByVal btVector3 getAxis(int axis_index);

	/** Get the relative Euler angle
	/**
	\pre btGeneric6DofConstraint::calculateTransforms() must be called previously.
	*/
	public native @Cast("btScalar") double getAngle(int axis_index);

	/** Get the relative position of the constraint pivot
	/**
	\pre btGeneric6DofConstraint::calculateTransforms() must be called previously.
	*/
	public native @Cast("btScalar") double getRelativePivotPosition(int axis_index);

	public native void setFrames(@Const @ByRef btTransform frameA, @Const @ByRef btTransform frameB);

	/** Test angular limit.
	/**
	Calculates angular correction and returns true if limit needs to be corrected.
	\pre btGeneric6DofConstraint::calculateTransforms() must be called previously.
	*/
	public native @Cast("bool") boolean testAngularLimitMotor(int axis_index);

	public native void setLinearLowerLimit(@Const @ByRef btVector3 linearLower);

	public native void getLinearLowerLimit(@ByRef btVector3 linearLower);

	public native void setLinearUpperLimit(@Const @ByRef btVector3 linearUpper);

	public native void getLinearUpperLimit(@ByRef btVector3 linearUpper);

	public native void setAngularLowerLimit(@Const @ByRef btVector3 angularLower);

	public native void getAngularLowerLimit(@ByRef btVector3 angularLower);

	public native void setAngularUpperLimit(@Const @ByRef btVector3 angularUpper);

	public native void getAngularUpperLimit(@ByRef btVector3 angularUpper);

	/** Retrieves the angular limit informacion */
	public native btRotationalLimitMotor getRotationalLimitMotor(int index);

	/** Retrieves the  limit informacion */
	public native btTranslationalLimitMotor getTranslationalLimitMotor();

	//first 3 are linear, next 3 are angular
	public native void setLimit(int axis, @Cast("btScalar") double lo, @Cast("btScalar") double hi);

	/** Test limit
	/**
    - free means upper < lower,
    - locked means upper == lower
    - limited means upper > lower
    - limitIndex: first 3 are linear, next 3 are angular
    */
	public native @Cast("bool") boolean isLimited(int limitIndex);

	public native void calcAnchorPos();  // overridable

	public native int get_limit_motor_info2(btRotationalLimitMotor limot,
								  @Const @ByRef btTransform transA, @Const @ByRef btTransform transB, @Const @ByRef btVector3 linVelA, @Const @ByRef btVector3 linVelB, @Const @ByRef btVector3 angVelA, @Const @ByRef btVector3 angVelB,
								  btConstraintInfo2 info, int row, @ByRef btVector3 ax1, int rotational, int rotAllowed/*=false*/);
	public native int get_limit_motor_info2(btRotationalLimitMotor limot,
								  @Const @ByRef btTransform transA, @Const @ByRef btTransform transB, @Const @ByRef btVector3 linVelA, @Const @ByRef btVector3 linVelB, @Const @ByRef btVector3 angVelA, @Const @ByRef btVector3 angVelB,
								  btConstraintInfo2 info, int row, @ByRef btVector3 ax1, int rotational);

	// access for UseFrameOffset
	public native @Cast("bool") boolean getUseFrameOffset();
	public native void setUseFrameOffset(@Cast("bool") boolean frameOffsetOnOff);

	public native @Cast("bool") boolean getUseLinearReferenceFrameA();
	public native void setUseLinearReferenceFrameA(@Cast("bool") boolean linearReferenceFrameA);

	/**override the default global value of a parameter (such as ERP or CFM), optionally provide the axis (0..5).
	 * If no axis is provided, it uses the default axis for this constraint. */
	public native void setParam(int num, @Cast("btScalar") double value, int axis/*=-1*/);
	public native void setParam(int num, @Cast("btScalar") double value);
	/**return the local value of parameter */
	public native @Cast("btScalar") double getParam(int num, int axis/*=-1*/);
	public native @Cast("btScalar") double getParam(int num);

	public native void setAxis(@Const @ByRef btVector3 axis1, @Const @ByRef btVector3 axis2);

	public native int getFlags();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
