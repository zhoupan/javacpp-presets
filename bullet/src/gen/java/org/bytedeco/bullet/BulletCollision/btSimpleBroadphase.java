// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The SimpleBroadphase is just a unit-test for btAxisSweep3, bt32BitAxisSweep3, or btDbvtBroadphase, so use those classes instead.
 * It is a brute force aabb culling broadphase based on O(n^2) aabb checks */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSimpleBroadphase extends btBroadphaseInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSimpleBroadphase(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSimpleBroadphase(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSimpleBroadphase position(long position) {
        return (btSimpleBroadphase)super.position(position);
    }
    @Override public btSimpleBroadphase getPointer(long i) {
        return new btSimpleBroadphase((Pointer)this).offsetAddress(i);
    }

	public btSimpleBroadphase(int maxProxies/*=16384*/, btOverlappingPairCache overlappingPairCache/*=0*/) { super((Pointer)null); allocate(maxProxies, overlappingPairCache); }
	private native void allocate(int maxProxies/*=16384*/, btOverlappingPairCache overlappingPairCache/*=0*/);
	public btSimpleBroadphase() { super((Pointer)null); allocate(); }
	private native void allocate();

	public static native @Cast("bool") boolean aabbOverlap(btSimpleBroadphaseProxy proxy0, btSimpleBroadphaseProxy proxy1);

	public native btBroadphaseProxy createProxy(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax, int shapeType, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask, btDispatcher dispatcher);

	public native void calculateOverlappingPairs(btDispatcher dispatcher);

	public native void destroyProxy(btBroadphaseProxy proxy, btDispatcher dispatcher);
	public native void setAabb(btBroadphaseProxy proxy, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax, btDispatcher dispatcher);
	public native void getAabb(btBroadphaseProxy proxy, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void rayTest(@Const @ByRef btVector3 rayFrom, @Const @ByRef btVector3 rayTo, @ByRef btBroadphaseRayCallback rayCallback, @Const @ByRef(nullValue = "btVector3(0, 0, 0)") btVector3 aabbMin, @Const @ByRef(nullValue = "btVector3(0, 0, 0)") btVector3 aabbMax);
	public native void rayTest(@Const @ByRef btVector3 rayFrom, @Const @ByRef btVector3 rayTo, @ByRef btBroadphaseRayCallback rayCallback);
	public native void aabbTest(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax, @ByRef btBroadphaseAabbCallback callback);

	public native btOverlappingPairCache getOverlappingPairCache();

	public native @Cast("bool") boolean testAabbOverlap(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	/**getAabb returns the axis aligned bounding box in the 'global' coordinate frame
	 * will add some transform later */
	public native void getBroadphaseAabb(@ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void printStats();
}
