// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


//
// btITaskScheduler -- subclass this to implement a task scheduler that can dispatch work to
//                     worker threads
//
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btITaskScheduler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btITaskScheduler(Pointer p) { super(p); }

	public native @Cast("const char*") BytePointer getName();

	public native int getMaxNumThreads();
	public native int getNumThreads();
	public native void setNumThreads(int numThreads);
	public native void parallelFor(int iBegin, int iEnd, int grainSize, @Const @ByRef btIParallelForBody body);
	public native @Cast("btScalar") double parallelSum(int iBegin, int iEnd, int grainSize, @Const @ByRef btIParallelSumBody body);
	public native void sleepWorkerThreadsHint();  // hint the task scheduler that we may not be using these threads for a little while

	// internal use only
	public native void activate();
	public native void deactivate();
}
