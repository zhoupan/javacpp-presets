// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3RigidBodyData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3RigidBodyData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3RigidBodyData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3RigidBodyData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3RigidBodyData position(long position) {
        return (b3RigidBodyData)super.position(position);
    }
    @Override public b3RigidBodyData getPointer(long i) {
        return new b3RigidBodyData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3 m_pos(); public native b3RigidBodyData m_pos(b3Vector3 setter);
	public native @ByRef b3Quaternion m_quat(); public native b3RigidBodyData m_quat(b3Quaternion setter);
	public native @ByRef b3Vector3 m_linVel(); public native b3RigidBodyData m_linVel(b3Vector3 setter);
	public native @ByRef b3Vector3 m_angVel(); public native b3RigidBodyData m_angVel(b3Vector3 setter);

	public native int m_collidableIdx(); public native b3RigidBodyData m_collidableIdx(int setter);
	public native float m_invMass(); public native b3RigidBodyData m_invMass(float setter);
	public native float m_restituitionCoeff(); public native b3RigidBodyData m_restituitionCoeff(float setter);
	public native float m_frictionCoeff(); public native b3RigidBodyData m_frictionCoeff(float setter);
}
