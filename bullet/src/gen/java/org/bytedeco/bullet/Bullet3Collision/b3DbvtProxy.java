// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


//
// b3DbvtProxy
//
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3DbvtProxy extends b3BroadphaseProxy {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3DbvtProxy(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3DbvtProxy(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3DbvtProxy position(long position) {
        return (b3DbvtProxy)super.position(position);
    }
    @Override public b3DbvtProxy getPointer(long i) {
        return new b3DbvtProxy((Pointer)this).offsetAddress(i);
    }

	/* Fields		*/
	//b3DbvtAabbMm	aabb;
	public native b3DbvtNode leaf(); public native b3DbvtProxy leaf(b3DbvtNode setter);
	public native b3DbvtProxy links(int i); public native b3DbvtProxy links(int i, b3DbvtProxy setter);
	@MemberGetter public native @Cast("b3DbvtProxy**") PointerPointer links();
	public native int stage(); public native b3DbvtProxy stage(int setter);
	/* ctor			*/

	public b3DbvtProxy() { super((Pointer)null); allocate(); }
	private native void allocate();
	public b3DbvtProxy(@Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask) { super((Pointer)null); allocate(aabbMin, aabbMax, userPtr, collisionFilterGroup, collisionFilterMask); }
	private native void allocate(@Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask);
}
