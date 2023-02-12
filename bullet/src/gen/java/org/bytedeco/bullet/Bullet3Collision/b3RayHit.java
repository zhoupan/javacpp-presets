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
public class b3RayHit extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3RayHit() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3RayHit(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3RayHit(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3RayHit position(long position) {
        return (b3RayHit)super.position(position);
    }
    @Override public b3RayHit getPointer(long i) {
        return new b3RayHit((Pointer)this).offsetAddress(i);
    }

	public native @Cast("b3Scalar") float m_hitFraction(); public native b3RayHit m_hitFraction(float setter);
	public native int m_hitBody(); public native b3RayHit m_hitBody(int setter);
	public native int m_hitResult1(); public native b3RayHit m_hitResult1(int setter);
	public native int m_hitResult2(); public native b3RayHit m_hitResult2(int setter);
	public native @ByRef b3Vector3 m_hitPoint(); public native b3RayHit m_hitPoint(b3Vector3 setter);
	public native @ByRef b3Vector3 m_hitNormal(); public native b3RayHit m_hitNormal(b3Vector3 setter);
}
