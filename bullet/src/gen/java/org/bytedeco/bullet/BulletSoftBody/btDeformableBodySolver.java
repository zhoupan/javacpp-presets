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

// class btDeformableBackwardEulerObjective;
// class btDeformableMultiBodyDynamicsWorld;

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableBodySolver extends btSoftBodySolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableBodySolver(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableBodySolver(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableBodySolver position(long position) {
        return (btDeformableBodySolver)super.position(position);
    }
    @Override public btDeformableBodySolver getPointer(long i) {
        return new btDeformableBodySolver((Pointer)this).offsetAddress(i);
    }

	// handles data related to objective function
	public native btDeformableBackwardEulerObjective m_objective(); public native btDeformableBodySolver m_objective(btDeformableBackwardEulerObjective setter);
	public native @Cast("bool") boolean m_useProjection(); public native btDeformableBodySolver m_useProjection(boolean setter);

	public btDeformableBodySolver() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @ByVal SolverTypes getSolverType();

	// update soft body normals
	public native void updateSoftBodies();

	public native @Cast("btScalar") double solveContactConstraints(@Cast("btCollisionObject**") PointerPointer deformableBodies, int numDeformableBodies, @Const @ByRef btContactSolverInfo infoGlobal);
	public native @Cast("btScalar") double solveContactConstraints(@ByPtrPtr btCollisionObject deformableBodies, int numDeformableBodies, @Const @ByRef btContactSolverInfo infoGlobal);

	// solve the momentum equation
	public native void solveDeformableConstraints(@Cast("btScalar") double solverdt);

	// set gravity (get from deformable world)
	public native void setGravity(@Const @ByRef btVector3 gravity);

	// resize/clear data structures
	public native void reinitialize(@Const @ByRef btSoftBodyArray softBodies, @Cast("btScalar") double dt);

	// set up contact constraints
	public native void setConstraints(@Const @ByRef btContactSolverInfo infoGlobal);

	// add in elastic forces and gravity to obtain v_{n+1}^* and calls predictDeformableMotion
	public native void predictMotion(@Cast("btScalar") double solverdt);

	// move to temporary position x_{n+1}^* = x_n + dt * v_{n+1}^*
	// x_{n+1}^* is stored in m_q
	public native void predictDeformableMotion(btSoftBody psb, @Cast("btScalar") double dt);

	// save the current velocity to m_backupVelocity
	public native void backupVelocity();

	// set m_dv and m_backupVelocity to desired value to prepare for momentum solve
	public native void setupDeformableSolve(@Cast("bool") boolean implicit);

	// set the current velocity to that backed up in m_backupVelocity
	public native void revertVelocity();

	// set velocity to m_dv + m_backupVelocity
	public native void updateVelocity();

	// update the node count
	public native @Cast("bool") boolean updateNodes();

	// calculate the change in dv resulting from the momentum solve
	public native void computeStep(@ByRef btVector3Array ddv, @Const @ByRef btVector3Array residual);

	// calculate the change in dv resulting from the momentum solve when line search is turned on
	public native @Cast("btScalar") double computeDescentStep(@ByRef btVector3Array ddv, @Const @ByRef btVector3Array residual, @Cast("bool") boolean verbose/*=false*/);
	public native @Cast("btScalar") double computeDescentStep(@ByRef btVector3Array ddv, @Const @ByRef btVector3Array residual);

	public native void copySoftBodyToVertexBuffer(@Const btSoftBody softBody, btVertexBufferDescriptor vertexBuffer);

	// process collision between deformable and rigid
	public native void processCollision(btSoftBody softBody, @Const btCollisionObjectWrapper collisionObjectWrap);

	// process collision between deformable and deformable
	public native void processCollision(btSoftBody softBody, btSoftBody otherSoftBody);

	// If true, implicit time stepping scheme is used.
	// Otherwise, explicit time stepping scheme is used
	public native void setImplicit(@Cast("bool") boolean implicit);

	// If true, newton's method with line search is used when implicit time stepping scheme is turned on
	public native void setLineSearch(@Cast("bool") boolean lineSearch);

	// set temporary position x^* = x_n + dt * v
	// update the deformation gradient at position x^*
	public native void updateState();

	// set dv = dv + scale * ddv
	public native void updateDv(@Cast("btScalar") double scale/*=1*/);
	public native void updateDv();

	// set temporary position x^* = x_n + dt * v^*
	public native void updateTempPosition();

	// save the current dv to m_backup_dv;
	public native void backupDv();

	// set dv to the backed-up value
	public native void revertDv();

	// set dv = dv + scale * ddv
	// set v^* = v_n + dv
	// set temporary position x^* = x_n + dt * v^*
	// update the deformation gradient at position x^*
	public native void updateEnergy(@Cast("btScalar") double scale);

	// calculates the appropriately scaled kinetic energy in the system, which is
	// 1/2 * dv^T * M * dv
	// used in line search
	public native @Cast("btScalar") double kineticEnergy();

	// add explicit force to the velocity in the objective class
	public native void applyExplicitForce();

	// execute position/velocity update and apply anchor constraints in the integrateTransforms from the Dynamics world
	public native void applyTransforms(@Cast("btScalar") double timeStep);

	public native void setStrainLimiting(@Cast("bool") boolean opt);

	public native void setPreconditioner(int opt);

	public native btDeformableLagrangianForceArray getLagrangianForceArray();

	public native @Const btSoftBodyNodePointerArray getIndices();

	public native void setProjection();

	public native void setLagrangeMultiplier();

	public native @Cast("bool") boolean isReducedSolver();
	
	public native void deformableBodyInternalWriteBack();

	// unused functions
	public native void optimize(@ByRef btSoftBodyArray softBodies, @Cast("bool") boolean forceUpdate/*=false*/);
	public native void optimize(@ByRef btSoftBodyArray softBodies);
	public native void solveConstraints(@Cast("btScalar") double dt);
	public native @Cast("bool") boolean checkInitialized();
	public native void copyBackToSoftBodies(@Cast("bool") boolean bMove/*=true*/);
	public native void copyBackToSoftBodies();
}
