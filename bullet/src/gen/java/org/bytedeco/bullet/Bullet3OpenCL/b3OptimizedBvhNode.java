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


/** b3OptimizedBvhNode contains both internal and leaf node information.
 *  Total node size is 44 bytes / node. You can use the compressed version of 16 bytes. */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3OptimizedBvhNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3OptimizedBvhNode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3OptimizedBvhNode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3OptimizedBvhNode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3OptimizedBvhNode position(long position) {
        return (b3OptimizedBvhNode)super.position(position);
    }
    @Override public b3OptimizedBvhNode getPointer(long i) {
        return new b3OptimizedBvhNode((Pointer)this).offsetAddress(i);
    }


	//32 bytes
	public native @ByRef b3Vector3 m_aabbMinOrg(); public native b3OptimizedBvhNode m_aabbMinOrg(b3Vector3 setter);
	public native @ByRef b3Vector3 m_aabbMaxOrg(); public native b3OptimizedBvhNode m_aabbMaxOrg(b3Vector3 setter);

	//4
	public native int m_escapeIndex(); public native b3OptimizedBvhNode m_escapeIndex(int setter);

	//8
	//for child nodes
	public native int m_subPart(); public native b3OptimizedBvhNode m_subPart(int setter);
	public native int m_triangleIndex(); public native b3OptimizedBvhNode m_triangleIndex(int setter);

	//pad the size to 64 bytes
	public native @Cast("char") byte m_padding(int i); public native b3OptimizedBvhNode m_padding(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding();
}
