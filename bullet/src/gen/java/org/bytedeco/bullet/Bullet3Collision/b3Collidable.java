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
public class b3Collidable extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3Collidable() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Collidable(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Collidable(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3Collidable position(long position) {
        return (b3Collidable)super.position(position);
    }
    @Override public b3Collidable getPointer(long i) {
        return new b3Collidable((Pointer)this).offsetAddress(i);
    }

		public native int m_numChildShapes(); public native b3Collidable m_numChildShapes(int setter);
		public native int m_bvhIndex(); public native b3Collidable m_bvhIndex(int setter);
		public native float m_radius(); public native b3Collidable m_radius(float setter);
		public native int m_compoundBvhIndex(); public native b3Collidable m_compoundBvhIndex(int setter);

	public native int m_shapeType(); public native b3Collidable m_shapeType(int setter);
		public native int m_shapeIndex(); public native b3Collidable m_shapeIndex(int setter);
		public native float m_height(); public native b3Collidable m_height(float setter);
}
