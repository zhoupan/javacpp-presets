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
public class VBuilder extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VBuilder(Pointer p) { super(p); }

    public native @NoException(true) void setMaxBatchSize(int batchSize);
    public native @NoException(true) int getMaxBatchSize();
    public native @Cast("bool") @NoException(true) boolean platformHasFastFp16();
    public native @Cast("bool") @NoException(true) boolean platformHasFastInt8();
    public native @NoException(true) int getMaxDLABatchSize();
    public native @NoException(true) int getNbDLACores();
    public native @NoException(true) void setGpuAllocator(IGpuAllocator allocator);
    public native @NoException(true) IBuilderConfig createBuilderConfig();
    public native @NoException(true) ICudaEngine buildEngineWithConfig(@ByRef INetworkDefinition network, @ByRef IBuilderConfig config);
    public native @NoException(true) INetworkDefinition createNetworkV2(@Cast("nvinfer1::NetworkDefinitionCreationFlags") int flags);
    public native @NoException(true) IOptimizationProfile createOptimizationProfile();
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);
    public native @NoException(true) IErrorRecorder getErrorRecorder();
    public native @NoException(true) void reset();
    public native @Cast("bool") @NoException(true) boolean platformHasTf32();
    public native @NoException(true) IHostMemory buildSerializedNetwork(@ByRef INetworkDefinition network, @ByRef IBuilderConfig config);
    public native @Cast("bool") @NoException(true) boolean isNetworkSupported(@Const @ByRef INetworkDefinition network, @Const @ByRef IBuilderConfig config);
    public native @NoException(true) ILogger getLogger();
    public native @Cast("bool") @NoException(true) boolean setMaxThreads(int maxThreads);
    public native @NoException(true) int getMaxThreads();
}
