// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConeShapeData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btConeShapeData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btConeShapeData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConeShapeData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btConeShapeData position(long position) {
        return (btConeShapeData)super.position(position);
    }
    @Override public btConeShapeData getPointer(long i) {
        return new btConeShapeData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btConvexInternalShapeData m_convexInternalShapeData(); public native btConeShapeData m_convexInternalShapeData(btConvexInternalShapeData setter);

	public native int m_upIndex(); public native btConeShapeData m_upIndex(int setter);

	public native @Cast("char") byte m_padding(int i); public native btConeShapeData m_padding(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding();
}
