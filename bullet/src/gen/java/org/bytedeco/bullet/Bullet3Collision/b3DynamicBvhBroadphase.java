// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


/**The b3DynamicBvhBroadphase implements a broadphase using two dynamic AABB bounding volume hierarchies/trees (see b3DynamicBvh).
 * One tree is used for static/non-moving objects, and another tree is used for dynamic objects. Objects can move from one tree to the other.
 * This is a very fast broadphase, especially for very dynamic worlds where many objects are moving. Its insert/add and remove of objects is generally faster than the sweep and prune broadphases b3AxisSweep3 and b332BitAxisSweep3. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3DynamicBvhBroadphase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3DynamicBvhBroadphase(Pointer p) { super(p); }

	/* Config		*/
	/** enum b3DynamicBvhBroadphase:: */
	public static final int
		DYNAMIC_SET = 0, /* Dynamic set index	*/
		FIXED_SET = 1,   /* Fixed set index		*/
		STAGECOUNT = 2;   /* Number of stages		*/
	/* Fields		*/
	public native @ByRef b3DynamicBvh m_sets(int i); public native b3DynamicBvhBroadphase m_sets(int i, b3DynamicBvh setter);
	@MemberGetter public native b3DynamicBvh m_sets();                     // Dbvt sets
	public native b3DbvtProxy m_stageRoots(int i); public native b3DynamicBvhBroadphase m_stageRoots(int i, b3DbvtProxy setter);
	@MemberGetter public native @Cast("b3DbvtProxy**") PointerPointer m_stageRoots();  // Stages list

	public native @ByRef b3DbvtProxyArray m_proxies(); public native b3DynamicBvhBroadphase m_proxies(b3DbvtProxyArray setter);
	public native b3OverlappingPairCache m_paircache(); public native b3DynamicBvhBroadphase m_paircache(b3OverlappingPairCache setter);  // Pair cache
	public native @Cast("b3Scalar") float m_prediction(); public native b3DynamicBvhBroadphase m_prediction(float setter);                // Velocity prediction
	public native int m_stageCurrent(); public native b3DynamicBvhBroadphase m_stageCurrent(int setter);                   // Current stage
	public native int m_fupdates(); public native b3DynamicBvhBroadphase m_fupdates(int setter);                       // % of fixed updates per frame
	public native int m_dupdates(); public native b3DynamicBvhBroadphase m_dupdates(int setter);                       // % of dynamic updates per frame
	public native int m_cupdates(); public native b3DynamicBvhBroadphase m_cupdates(int setter);                       // % of cleanup updates per frame
	public native int m_newpairs(); public native b3DynamicBvhBroadphase m_newpairs(int setter);                       // Number of pairs created
	public native int m_fixedleft(); public native b3DynamicBvhBroadphase m_fixedleft(int setter);                      // Fixed optimization left
	public native @Cast("unsigned") int m_updates_call(); public native b3DynamicBvhBroadphase m_updates_call(int setter);              // Number of updates call
	public native @Cast("unsigned") int m_updates_done(); public native b3DynamicBvhBroadphase m_updates_done(int setter);              // Number of updates done
	public native @Cast("b3Scalar") float m_updates_ratio(); public native b3DynamicBvhBroadphase m_updates_ratio(float setter);             // m_updates_done/m_updates_call
	public native int m_pid(); public native b3DynamicBvhBroadphase m_pid(int setter);                            // Parse id
	public native int m_cid(); public native b3DynamicBvhBroadphase m_cid(int setter);                            // Cleanup index
	public native @Cast("bool") boolean m_releasepaircache(); public native b3DynamicBvhBroadphase m_releasepaircache(boolean setter);              // Release pair cache on delete
	public native @Cast("bool") boolean m_deferedcollide(); public native b3DynamicBvhBroadphase m_deferedcollide(boolean setter);                // Defere dynamic/static collision to collide call
	public native @Cast("bool") boolean m_needcleanup(); public native b3DynamicBvhBroadphase m_needcleanup(boolean setter);                   // Need to run cleanup?
// #if B3_DBVT_BP_PROFILE
// #endif
	/* Methods		*/
	public b3DynamicBvhBroadphase(int proxyCapacity, b3OverlappingPairCache paircache/*=0*/) { super((Pointer)null); allocate(proxyCapacity, paircache); }
	private native void allocate(int proxyCapacity, b3OverlappingPairCache paircache/*=0*/);
	public b3DynamicBvhBroadphase(int proxyCapacity) { super((Pointer)null); allocate(proxyCapacity); }
	private native void allocate(int proxyCapacity);
	public native void collide(b3Dispatcher dispatcher);
	public native void optimize();

	/* b3BroadphaseInterface Implementation	*/
	public native b3BroadphaseProxy createProxy(@Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, int objectIndex, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask);
	public native void destroyProxy(b3BroadphaseProxy proxy, b3Dispatcher dispatcher);
	public native void setAabb(int objectId, @Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, b3Dispatcher dispatcher);
	public native void rayTest(@Const @ByRef b3Vector3 rayFrom, @Const @ByRef b3Vector3 rayTo, @ByRef b3BroadphaseRayCallback rayCallback, @Const @ByRef(nullValue = "b3Vector3(b3MakeVector3(0, 0, 0))") b3Vector3 aabbMin, @Const @ByRef(nullValue = "b3Vector3(b3MakeVector3(0, 0, 0))") b3Vector3 aabbMax);
	public native void rayTest(@Const @ByRef b3Vector3 rayFrom, @Const @ByRef b3Vector3 rayTo, @ByRef b3BroadphaseRayCallback rayCallback);
	public native void aabbTest(@Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, @ByRef b3BroadphaseAabbCallback callback);

	//virtual void					getAabb(b3BroadphaseProxy* proxy,b3Vector3& aabbMin, b3Vector3& aabbMax ) const;
	public native void getAabb(int objectId, @ByRef b3Vector3 aabbMin, @ByRef b3Vector3 aabbMax);
	public native void calculateOverlappingPairs(b3Dispatcher dispatcher/*=0*/);
	public native void calculateOverlappingPairs();
	public native b3OverlappingPairCache getOverlappingPairCache();
	public native void getBroadphaseAabb(@ByRef b3Vector3 aabbMin, @ByRef b3Vector3 aabbMax);
	public native void printStats();

	/**reset broadphase internal structures, to ensure determinism/reproducability */
	public native void resetPool(b3Dispatcher dispatcher);

	public native void performDeferredRemoval(b3Dispatcher dispatcher);

	public native void setVelocityPrediction(@Cast("b3Scalar") float prediction);
	public native @Cast("b3Scalar") float getVelocityPrediction();

	/**this setAabbForceUpdate is similar to setAabb but always forces the aabb update.
	 * it is not part of the b3BroadphaseInterface but specific to b3DynamicBvhBroadphase.
	 * it bypasses certain optimizations that prevent aabb updates (when the aabb shrinks), see
	 * http://code.google.com/p/bullet/issues/detail?id=223 */
	public native void setAabbForceUpdate(b3BroadphaseProxy absproxy, @Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, b3Dispatcher arg3);

	//static void						benchmark(b3BroadphaseInterface*);
}
