// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Helper class for tetrahedrons */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTetrahedronShapeEx extends btBU_Simplex1to4 {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTetrahedronShapeEx(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTetrahedronShapeEx(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTetrahedronShapeEx position(long position) {
        return (btTetrahedronShapeEx)super.position(position);
    }
    @Override public btTetrahedronShapeEx getPointer(long i) {
        return new btTetrahedronShapeEx((Pointer)this).offsetAddress(i);
    }

	public btTetrahedronShapeEx() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void setVertices(
			@Const @ByRef btVector3 v0, @Const @ByRef btVector3 v1,
			@Const @ByRef btVector3 v2, @Const @ByRef btVector3 v3);
}
