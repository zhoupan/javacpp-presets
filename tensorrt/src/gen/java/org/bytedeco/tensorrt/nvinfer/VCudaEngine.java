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
public class VCudaEngine extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VCudaEngine(Pointer p) { super(p); }

    public native @NoException(true) int getNbBindings();
    public native @NoException(true) int getBindingIndex(String name);
    public native @NoException(true) int getBindingIndex(@Cast("const char*") BytePointer name);
    public native @NoException(true) String getBindingName(int bindingIndex);
    public native @Cast("bool") @NoException(true) boolean bindingIsInput(int bindingIndex);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getBindingDimensions(int bindingIndex);
    public native @NoException(true) DataType getBindingDataType(int bindingIndex);
    public native @NoException(true) int getMaxBatchSize();
    public native @NoException(true) int getNbLayers();
    public native @NoException(true) IHostMemory serialize();
    public native @NoException(true) IExecutionContext createExecutionContext();
    public native @NoException(true) TensorLocation getLocation(int bindingIndex);
    public native @NoException(true) IExecutionContext createExecutionContextWithoutDeviceMemory();
    public native @Cast("size_t") @NoException(true) long getDeviceMemorySize();
    public native @Cast("bool") @NoException(true) boolean isRefittable();
    public native @NoException(true) int getBindingBytesPerComponent(int bindingIndex);
    public native @NoException(true) int getBindingComponentsPerElement(int bindingIndex);
    public native @NoException(true) TensorFormat getBindingFormat(int bindingIndex);
    public native @NoException(true) String getBindingFormatDesc(int bindingIndex);
    public native @NoException(true) int getBindingVectorizedDim(int bindingIndex);
    public native @NoException(true) String getName();
    public native @NoException(true) int getNbOptimizationProfiles();
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getProfileDimensions(
            int bindingIndex, int profileIndex, OptProfileSelector select);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getProfileDimensions(
            int bindingIndex, int profileIndex, @Cast("nvinfer1::OptProfileSelector") int select);
    public native @Const @NoException(true) IntPointer getProfileShapeValues(
            int profileIndex, int inputIndex, OptProfileSelector select);
    public native @Const @NoException(true) IntBuffer getProfileShapeValues(
            int profileIndex, int inputIndex, @Cast("nvinfer1::OptProfileSelector") int select);
    public native @Cast("bool") @NoException(true) boolean isShapeBinding(int bindingIndex);
    public native @Cast("bool") @NoException(true) boolean isExecutionBinding(int bindingIndex);
    public native @NoException(true) EngineCapability getEngineCapability();
    public native @NoException(true) void setErrorRecorder(IErrorRecorder recorder);
    public native @NoException(true) IErrorRecorder getErrorRecorder();
    public native @Cast("bool") @NoException(true) boolean hasImplicitBatchDimension();
    public native @Cast("nvinfer1::TacticSources") @NoException(true) int getTacticSources();
    public native @NoException(true) ProfilingVerbosity getProfilingVerbosity();
    public native @NoException(true) IEngineInspector createEngineInspector();
}
