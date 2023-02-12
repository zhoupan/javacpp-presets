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


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btDynamicsWorldFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btDynamicsWorldFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDynamicsWorldFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDynamicsWorldFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btDynamicsWorldFloatData position(long position) {
        return (btDynamicsWorldFloatData)super.position(position);
    }
    @Override public btDynamicsWorldFloatData getPointer(long i) {
        return new btDynamicsWorldFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btContactSolverInfoFloatData m_solverInfo(); public native btDynamicsWorldFloatData m_solverInfo(btContactSolverInfoFloatData setter);
	public native @ByRef btVector3FloatData m_gravity(); public native btDynamicsWorldFloatData m_gravity(btVector3FloatData setter);
}
