// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VRuntime extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VRuntime(Pointer p) { super(p); }

    public native @NoException(true) ICudaEngine deserializeCudaEngine(
            @Const Pointer blob, @Cast("std::size_t") long size, IPluginFactory pluginFactory);
    public native @NoException(true) void setDLACore(int dlaCore);
    public native @NoException(true) int getDLACore();
    public native @NoException(true) int getNbDLACores();
    public native @NoException(true) void setGpuAllocator(IGpuAllocator allocator);
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);
    public native @NoException(true) IErrorRecorder getErrorRecorder();
    public native @NoException(true) ILogger getLogger();
    public native @Cast("bool") @NoException(true) boolean setMaxThreads(int maxThreads);
    public native @NoException(true) int getMaxThreads();
}
