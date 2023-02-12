// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


/**b3SortedOverlappingPairCache maintains the objects with overlapping AABB
 * Typically managed by the Broadphase, Axis3Sweep or b3SimpleBroadphase */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3SortedOverlappingPairCache extends b3OverlappingPairCache {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3SortedOverlappingPairCache(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3SortedOverlappingPairCache(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3SortedOverlappingPairCache position(long position) {
        return (b3SortedOverlappingPairCache)super.position(position);
    }
    @Override public b3SortedOverlappingPairCache getPointer(long i) {
        return new b3SortedOverlappingPairCache((Pointer)this).offsetAddress(i);
    }

	public b3SortedOverlappingPairCache() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void processAllOverlappingPairs(b3OverlapCallback arg0, b3Dispatcher dispatcher);

	public native Pointer removeOverlappingPair(int proxy0, int proxy1, b3Dispatcher dispatcher);

	public native void cleanOverlappingPair(@ByRef b3Int4 pair, b3Dispatcher dispatcher);

	public native b3Int4 addOverlappingPair(int proxy0, int proxy1);

	public native b3Int4 findPair(int proxy0, int proxy1);

	public native void cleanProxyFromPairs(int proxy, b3Dispatcher dispatcher);

	public native void removeOverlappingPairsContainingProxy(int proxy, b3Dispatcher dispatcher);

	public native @Cast("bool") boolean needsBroadphaseCollision(int proxy0, int proxy1);

	public native @Cast("b3BroadphasePairArray*") @ByRef b3Int4Array getOverlappingPairArray();

	public native b3Int4 getOverlappingPairArrayPtr();

	public native int getNumOverlappingPairs();

	public native b3OverlapFilterCallback getOverlapFilterCallback();

	public native void setOverlapFilterCallback(b3OverlapFilterCallback callback);

	public native @Cast("bool") boolean hasDeferredRemoval();

	/*		virtual	void	setInternalGhostPairCallback(b3OverlappingPairCallback* ghostPairCallback)
		{
			m_ghostPairCallback = ghostPairCallback;
		}
		*/
	public native void sortOverlappingPairs(b3Dispatcher dispatcher);
}
