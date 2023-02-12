// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


/**for serialization */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3TransformFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3TransformFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3TransformFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3TransformFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3TransformFloatData position(long position) {
        return (b3TransformFloatData)super.position(position);
    }
    @Override public b3TransformFloatData getPointer(long i) {
        return new b3TransformFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Matrix3x3FloatData m_basis(); public native b3TransformFloatData m_basis(b3Matrix3x3FloatData setter);
	public native @ByRef b3Vector3FloatData m_origin(); public native b3TransformFloatData m_origin(b3Vector3FloatData setter);
}
