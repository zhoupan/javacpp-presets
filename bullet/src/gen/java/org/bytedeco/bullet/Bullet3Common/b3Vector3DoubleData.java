// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3Vector3DoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3Vector3DoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Vector3DoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Vector3DoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3Vector3DoubleData position(long position) {
        return (b3Vector3DoubleData)super.position(position);
    }
    @Override public b3Vector3DoubleData getPointer(long i) {
        return new b3Vector3DoubleData((Pointer)this).offsetAddress(i);
    }

	public native double m_floats(int i); public native b3Vector3DoubleData m_floats(int i, double setter);
	@MemberGetter public native DoublePointer m_floats();
}
