// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btTriangleInfo structure stores information to adjust collision normals to avoid collisions against internal edges
 * it can be generated using */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTriangleInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTriangleInfo position(long position) {
        return (btTriangleInfo)super.position(position);
    }
    @Override public btTriangleInfo getPointer(long i) {
        return new btTriangleInfo((Pointer)this).offsetAddress(i);
    }

	public btTriangleInfo() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native int m_flags(); public native btTriangleInfo m_flags(int setter);

	public native @Cast("btScalar") double m_edgeV0V1Angle(); public native btTriangleInfo m_edgeV0V1Angle(double setter);
	public native @Cast("btScalar") double m_edgeV1V2Angle(); public native btTriangleInfo m_edgeV1V2Angle(double setter);
	public native @Cast("btScalar") double m_edgeV2V0Angle(); public native btTriangleInfo m_edgeV2V0Angle(double setter);
}
