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


//
// Constraint between  deformable objects faces and deformable objects nodes
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableFaceNodeContactConstraint extends btDeformableContactConstraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableFaceNodeContactConstraint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableFaceNodeContactConstraint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableFaceNodeContactConstraint position(long position) {
        return (btDeformableFaceNodeContactConstraint)super.position(position);
    }
    @Override public btDeformableFaceNodeContactConstraint getPointer(long i) {
        return new btDeformableFaceNodeContactConstraint((Pointer)this).offsetAddress(i);
    }

	public native btSoftBody.Node m_node(); public native btDeformableFaceNodeContactConstraint m_node(btSoftBody.Node setter);
	public native btSoftBody.Face m_face(); public native btDeformableFaceNodeContactConstraint m_face(btSoftBody.Face setter);
	public native @Const btSoftBody.DeformableFaceNodeContact m_contact(); public native btDeformableFaceNodeContactConstraint m_contact(btSoftBody.DeformableFaceNodeContact setter);
	public native @ByRef btVector3 m_total_normal_dv(); public native btDeformableFaceNodeContactConstraint m_total_normal_dv(btVector3 setter);
	public native @ByRef btVector3 m_total_tangent_dv(); public native btDeformableFaceNodeContactConstraint m_total_tangent_dv(btVector3 setter);

	public btDeformableFaceNodeContactConstraint(@Const @ByRef btSoftBody.DeformableFaceNodeContact contact, @Const @ByRef btContactSolverInfo infoGlobal) { super((Pointer)null); allocate(contact, infoGlobal); }
	private native void allocate(@Const @ByRef btSoftBody.DeformableFaceNodeContact contact, @Const @ByRef btContactSolverInfo infoGlobal);
	public btDeformableFaceNodeContactConstraint() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native @Cast("btScalar") double solveConstraint(@Const @ByRef btContactSolverInfo infoGlobal);

	// get the velocity of the object A in the contact
	public native @ByVal btVector3 getVa();

	// get the velocity of the object B in the contact
	public native @ByVal btVector3 getVb();

	// get the velocity change of the input soft body node in the constraint
	public native @ByVal btVector3 getDv(@Const btSoftBody.Node arg0);

	// cast the contact to the desired type
	public native @Const btSoftBody.DeformableFaceNodeContact getContact();

	public native void applyImpulse(@Const @ByRef btVector3 impulse);

	public native void setPenetrationScale(@Cast("btScalar") double scale);
}
