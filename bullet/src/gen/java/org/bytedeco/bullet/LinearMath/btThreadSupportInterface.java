// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btThreadSupportInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btThreadSupportInterface(Pointer p) { super(p); }


	public native int getNumWorkerThreads();            // number of worker threads (total number of logical processors - 1)
	public native int getCacheFriendlyNumThreads();     // the number of logical processors sharing a single L3 cache
	public native int getLogicalToPhysicalCoreRatio();  // the number of logical processors per physical processor (usually 1 or 2)
	public native void runTask(int threadIndex, Pointer userData);
	public native void waitForAllTasks();

	public native btCriticalSection createCriticalSection();
	public native void deleteCriticalSection(btCriticalSection criticalSection);

	public static class ThreadFunc extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    ThreadFunc(Pointer p) { super(p); }
	    protected ThreadFunc() { allocate(); }
	    private native void allocate();
	    public native void call(Pointer userPtr);
	}

	@NoOffset public static class ConstructionInfo extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public ConstructionInfo(Pointer p) { super(p); }
	
		public ConstructionInfo(@Cast("const char*") BytePointer uniqueName,
								 ThreadFunc userThreadFunc,
								 int threadStackSize/*=65535*/) { super((Pointer)null); allocate(uniqueName, userThreadFunc, threadStackSize); }
		private native void allocate(@Cast("const char*") BytePointer uniqueName,
								 ThreadFunc userThreadFunc,
								 int threadStackSize/*=65535*/);
		public ConstructionInfo(@Cast("const char*") BytePointer uniqueName,
								 ThreadFunc userThreadFunc) { super((Pointer)null); allocate(uniqueName, userThreadFunc); }
		private native void allocate(@Cast("const char*") BytePointer uniqueName,
								 ThreadFunc userThreadFunc);
		public ConstructionInfo(String uniqueName,
								 ThreadFunc userThreadFunc,
								 int threadStackSize/*=65535*/) { super((Pointer)null); allocate(uniqueName, userThreadFunc, threadStackSize); }
		private native void allocate(String uniqueName,
								 ThreadFunc userThreadFunc,
								 int threadStackSize/*=65535*/);
		public ConstructionInfo(String uniqueName,
								 ThreadFunc userThreadFunc) { super((Pointer)null); allocate(uniqueName, userThreadFunc); }
		private native void allocate(String uniqueName,
								 ThreadFunc userThreadFunc);

		public native @Cast("const char*") BytePointer m_uniqueName(); public native ConstructionInfo m_uniqueName(BytePointer setter);
		public native ThreadFunc m_userThreadFunc(); public native ConstructionInfo m_userThreadFunc(ThreadFunc setter);
		public native int m_threadStackSize(); public native ConstructionInfo m_threadStackSize(int setter);
	}

	
}
