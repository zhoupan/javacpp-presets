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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyFixedConstraint extends btMultiBodyConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyFixedConstraint(Pointer p) { super(p); }

	public btMultiBodyFixedConstraint(btMultiBody body, int link, btRigidBody bodyB, @Const @ByRef btVector3 pivotInA, @Const @ByRef btVector3 pivotInB, @Const @ByRef btMatrix3x3 frameInA, @Const @ByRef btMatrix3x3 frameInB) { super((Pointer)null); allocate(body, link, bodyB, pivotInA, pivotInB, frameInA, frameInB); }
	private native void allocate(btMultiBody body, int link, btRigidBody bodyB, @Const @ByRef btVector3 pivotInA, @Const @ByRef btVector3 pivotInB, @Const @ByRef btMatrix3x3 frameInA, @Const @ByRef btMatrix3x3 frameInB);
	public btMultiBodyFixedConstraint(btMultiBody bodyA, int linkA, btMultiBody bodyB, int linkB, @Const @ByRef btVector3 pivotInA, @Const @ByRef btVector3 pivotInB, @Const @ByRef btMatrix3x3 frameInA, @Const @ByRef btMatrix3x3 frameInB) { super((Pointer)null); allocate(bodyA, linkA, bodyB, linkB, pivotInA, pivotInB, frameInA, frameInB); }
	private native void allocate(btMultiBody bodyA, int linkA, btMultiBody bodyB, int linkB, @Const @ByRef btVector3 pivotInA, @Const @ByRef btVector3 pivotInB, @Const @ByRef btMatrix3x3 frameInA, @Const @ByRef btMatrix3x3 frameInB);

	public native void finalizeMultiDof();

	public native int getIslandIdA();
	public native int getIslandIdB();

	public native void createConstraintRows(@ByRef btMultiBodySolverConstraintArray constraintRows,
										  @ByRef btMultiBodyJacobianData data,
										  @Const @ByRef btContactSolverInfo infoGlobal);

	public native @Const @ByRef btVector3 getPivotInA();

	public native void setPivotInA(@Const @ByRef btVector3 pivotInA);

	public native @Const @ByRef btVector3 getPivotInB();

	public native void setPivotInB(@Const @ByRef btVector3 pivotInB);

	public native @Const @ByRef btMatrix3x3 getFrameInA();

	public native void setFrameInA(@Const @ByRef btMatrix3x3 frameInA);

	public native @Const @ByRef btMatrix3x3 getFrameInB();

	public native void setFrameInB(@Const @ByRef btMatrix3x3 frameInB);

	public native void debugDraw(btIDebugDraw drawer);
}
