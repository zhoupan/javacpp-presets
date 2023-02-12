// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


/**b3BvhSubtreeInfo provides info to gather a subtree of limited size */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3BvhSubtreeInfo extends b3BvhSubtreeInfoData {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3BvhSubtreeInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3BvhSubtreeInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3BvhSubtreeInfo position(long position) {
        return (b3BvhSubtreeInfo)super.position(position);
    }
    @Override public b3BvhSubtreeInfo getPointer(long i) {
        return new b3BvhSubtreeInfo((Pointer)this).offsetAddress(i);
    }


	public b3BvhSubtreeInfo() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void setAabbFromQuantizeNode(@Const @ByRef b3QuantizedBvhNode quantizedNode);
}
