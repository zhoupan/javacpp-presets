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
public class b3Contact4 extends b3Contact4Data {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3Contact4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Contact4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Contact4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3Contact4 position(long position) {
        return (b3Contact4)super.position(position);
    }
    @Override public b3Contact4 getPointer(long i) {
        return new b3Contact4((Pointer)this).offsetAddress(i);
    }


	public native int getBodyA();
	public native int getBodyB();
	public native @Cast("bool") boolean isBodyAFixed();
	public native @Cast("bool") boolean isBodyBFixed();
	//	todo. make it safer
	public native @ByRef IntPointer getBatchIdx();
	public native float getRestituitionCoeff();
	public native void setRestituitionCoeff(float c);
	public native float getFrictionCoeff();
	public native void setFrictionCoeff(float c);

	//float& getNPoints() { return m_worldNormal[3]; }
	public native int getNPoints();

	public native float getPenetration(int idx);

	public native @Cast("bool") boolean isInvalid();
}
