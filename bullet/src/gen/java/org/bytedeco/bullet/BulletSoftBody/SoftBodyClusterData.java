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


@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class SoftBodyClusterData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SoftBodyClusterData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftBodyClusterData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftBodyClusterData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SoftBodyClusterData position(long position) {
        return (SoftBodyClusterData)super.position(position);
    }
    @Override public SoftBodyClusterData getPointer(long i) {
        return new SoftBodyClusterData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTransformFloatData m_framexform(); public native SoftBodyClusterData m_framexform(btTransformFloatData setter);
	public native @ByRef btMatrix3x3FloatData m_locii(); public native SoftBodyClusterData m_locii(btMatrix3x3FloatData setter);
	public native @ByRef btMatrix3x3FloatData m_invwi(); public native SoftBodyClusterData m_invwi(btMatrix3x3FloatData setter);
	public native @ByRef btVector3FloatData m_com(); public native SoftBodyClusterData m_com(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_vimpulses(int i); public native SoftBodyClusterData m_vimpulses(int i, btVector3FloatData setter);
	@MemberGetter public native btVector3FloatData m_vimpulses();
	public native @ByRef btVector3FloatData m_dimpulses(int i); public native SoftBodyClusterData m_dimpulses(int i, btVector3FloatData setter);
	@MemberGetter public native btVector3FloatData m_dimpulses();
	public native @ByRef btVector3FloatData m_lv(); public native SoftBodyClusterData m_lv(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_av(); public native SoftBodyClusterData m_av(btVector3FloatData setter);

	public native btVector3FloatData m_framerefs(); public native SoftBodyClusterData m_framerefs(btVector3FloatData setter);
	public native IntPointer m_nodeIndices(); public native SoftBodyClusterData m_nodeIndices(IntPointer setter);
	public native FloatPointer m_masses(); public native SoftBodyClusterData m_masses(FloatPointer setter);

	public native int m_numFrameRefs(); public native SoftBodyClusterData m_numFrameRefs(int setter);
	public native int m_numNodes(); public native SoftBodyClusterData m_numNodes(int setter);
	public native int m_numMasses(); public native SoftBodyClusterData m_numMasses(int setter);

	public native float m_idmass(); public native SoftBodyClusterData m_idmass(float setter);
	public native float m_imass(); public native SoftBodyClusterData m_imass(float setter);
	public native int m_nvimpulses(); public native SoftBodyClusterData m_nvimpulses(int setter);
	public native int m_ndimpulses(); public native SoftBodyClusterData m_ndimpulses(int setter);
	public native float m_ndamping(); public native SoftBodyClusterData m_ndamping(float setter);
	public native float m_ldamping(); public native SoftBodyClusterData m_ldamping(float setter);
	public native float m_adamping(); public native SoftBodyClusterData m_adamping(float setter);
	public native float m_matching(); public native SoftBodyClusterData m_matching(float setter);
	public native float m_maxSelfCollisionImpulse(); public native SoftBodyClusterData m_maxSelfCollisionImpulse(float setter);
	public native float m_selfCollisionImpulseFactor(); public native SoftBodyClusterData m_selfCollisionImpulseFactor(float setter);
	public native int m_containsAnchor(); public native SoftBodyClusterData m_containsAnchor(int setter);
	public native int m_collide(); public native SoftBodyClusterData m_collide(int setter);
	public native int m_clusterIndex(); public native SoftBodyClusterData m_clusterIndex(int setter);
}
