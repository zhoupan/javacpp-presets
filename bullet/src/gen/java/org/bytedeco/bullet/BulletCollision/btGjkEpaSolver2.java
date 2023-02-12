// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btGjkEpaSolver contributed under zlib by Nathanael Presson */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGjkEpaSolver2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGjkEpaSolver2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGjkEpaSolver2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGjkEpaSolver2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGjkEpaSolver2 position(long position) {
        return (btGjkEpaSolver2)super.position(position);
    }
    @Override public btGjkEpaSolver2 getPointer(long i) {
        return new btGjkEpaSolver2((Pointer)this).offsetAddress(i);
    }

	public static class sResults extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public sResults() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public sResults(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public sResults(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public sResults position(long position) {
	        return (sResults)super.position(position);
	    }
	    @Override public sResults getPointer(long i) {
	        return new sResults((Pointer)this).offsetAddress(i);
	    }
	
		/** enum btGjkEpaSolver2::sResults::eStatus */
		public static final int
			Separated = 0,   /* Shapes doesnt penetrate												*/
			Penetrating = 1, /* Shapes are penetrating												*/
			GJK_Failed = 2,  /* GJK phase fail, no big issue, shapes are probably just 'touching'	*/
			EPA_Failed = 3;   /* EPA phase fail, bigger problem, need to save parameters, and debug	*/
		public native @ByRef btVector3 witnesses(int i); public native sResults witnesses(int i, btVector3 setter);
		@MemberGetter public native btVector3 witnesses();
		public native @ByRef btVector3 normal(); public native sResults normal(btVector3 setter);
		public native @Cast("btScalar") double distance(); public native sResults distance(double setter);
	}

	public static native int StackSizeRequirement();

	public static native @Cast("bool") boolean Distance(@Const btConvexShape shape0, @Const @ByRef btTransform wtrs0,
							 @Const btConvexShape shape1, @Const @ByRef btTransform wtrs1,
							 @Const @ByRef btVector3 guess,
							 @ByRef sResults results);

	public static native @Cast("bool") boolean Penetration(@Const btConvexShape shape0, @Const @ByRef btTransform wtrs0,
								@Const btConvexShape shape1, @Const @ByRef btTransform wtrs1,
								@Const @ByRef btVector3 guess,
								@ByRef sResults results,
								@Cast("bool") boolean usemargins/*=true*/);
	public static native @Cast("bool") boolean Penetration(@Const btConvexShape shape0, @Const @ByRef btTransform wtrs0,
								@Const btConvexShape shape1, @Const @ByRef btTransform wtrs1,
								@Const @ByRef btVector3 guess,
								@ByRef sResults results);
// #ifndef __SPU__
	public static native @Cast("btScalar") double SignedDistance(@Const @ByRef btVector3 _position,
									   @Cast("btScalar") double margin,
									   @Const btConvexShape shape,
									   @Const @ByRef btTransform wtrs,
									   @ByRef sResults results);

	public static native @Cast("bool") boolean SignedDistance(@Const btConvexShape shape0, @Const @ByRef btTransform wtrs0,
								   @Const btConvexShape shape1, @Const @ByRef btTransform wtrs1,
								   @Const @ByRef btVector3 guess,
								   @ByRef sResults results);
// #endif  //__SPU__
}
