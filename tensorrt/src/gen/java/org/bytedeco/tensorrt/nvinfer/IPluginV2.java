// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \class IPluginV2
 * 
 *  \brief Plugin class for user-implemented layers.
 * 
 *  Plugins are a mechanism for applications to implement custom layers. When
 *  combined with IPluginCreator it provides a mechanism to register plugins and
 *  look up the Plugin Registry during de-serialization.
 * 
 *  @see IPluginCreator
 *  @see IPluginRegistry
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginV2(Pointer p) { super(p); }

    /**
     *  \brief Return the API version with which this plugin was built.
     * 
     *  Do not override this method as it is used by the TensorRT library to maintain backwards-compatibility with plugins.
     *  */
    
    
    //!
    //!
    public native @NoException(true) int getTensorRTVersion();

    /**
     *  \brief Return the plugin type. Should match the plugin name returned by the corresponding plugin creator
     *  @see IPluginCreator::getPluginName()
     *  */
    
    
    //!
    //!
    public native @NoException(true) String getPluginType();

    /**
     *  \brief Return the plugin version. Should match the plugin version returned by the corresponding plugin creator
     *  @see IPluginCreator::getPluginVersion()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) String getPluginVersion();

    /**
     *  \brief Get the number of outputs from the layer.
     * 
     *  @return The number of outputs.
     * 
     *  This function is called by the implementations of INetworkDefinition and IBuilder. In particular, it is called
     *  prior to any call to initialize().
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbOutputs();

    /**
     *  \brief Get the dimension of an output tensor.
     * 
     *  @param index The index of the output tensor.
     *  @param inputs The input tensors.
     *  @param nbInputDims The number of input tensors.
     * 
     *  This function is called by the implementations of INetworkDefinition and IBuilder. In particular, it is called
     *  prior to any call to initialize().
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getOutputDimensions(int index, @Cast("const nvinfer1::Dims*") Dims32 inputs, int nbInputDims);

    /**
     *  \brief Check format support.
     * 
     *  @param type DataType requested.
     *  @param format PluginFormat requested.
     *  @return true if the plugin supports the type-format combination.
     * 
     *  This function is called by the implementations of INetworkDefinition, IBuilder, and
     *  safe::ICudaEngine/ICudaEngine. In particular, it is called when creating an engine and when deserializing an
     *  engine.
     * 
     *  \warning for the format field, the values PluginFormat::kCHW4, PluginFormat::kCHW16, and PluginFormat::kCHW32
     *  will not be passed in, this is to keep backward compatibility with TensorRT 5.x series.  Use PluginV2IOExt
     *  or PluginV2DynamicExt for other PluginFormats.
     * 
     *  \warning DataType:kBOOL not supported.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean supportsFormat(DataType type, @Cast("nvinfer1::PluginFormat") TensorFormat format);
    public native @Cast("bool") @NoException(true) boolean supportsFormat(@Cast("nvinfer1::DataType") int type, @Cast("nvinfer1::PluginFormat") int format);

    /**
     *  \brief Configure the layer.
     * 
     *  This function is called by the builder prior to initialize(). It provides an opportunity for the layer to make
     *  algorithm choices on the basis of its weights, dimensions, and maximum batch size.
     * 
     *  @param inputDims The input tensor dimensions.
     *  @param nbInputs The number of inputs.
     *  @param outputDims The output tensor dimensions.
     *  @param nbOutputs The number of outputs.
     *  @param type The data type selected for the engine.
     *  @param format The format selected for the engine.
     *  @param maxBatchSize The maximum batch size.
     * 
     *  The dimensions passed here do not include the outermost batch size (i.e. for 2-D image networks, they will be
     *  3-dimensional CHW dimensions).
     * 
     *  \warning for the format field, the values PluginFormat::kCHW4, PluginFormat::kCHW16, and PluginFormat::kCHW32
     *  will not be passed in, this is to keep backward compatibility with TensorRT 5.x series.  Use PluginV2IOExt
     *  or PluginV2DynamicExt for other PluginFormats.
     * 
     *  \warning DataType:kBOOL not supported.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void configureWithFormat(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            DataType type, @Cast("nvinfer1::PluginFormat") TensorFormat format, int maxBatchSize);
    public native @NoException(true) void configureWithFormat(@Cast("const nvinfer1::Dims*") Dims32 inputDims, int nbInputs, @Cast("const nvinfer1::Dims*") Dims32 outputDims, int nbOutputs,
            @Cast("nvinfer1::DataType") int type, @Cast("nvinfer1::PluginFormat") int format, int maxBatchSize);

    /**
     *  \brief Initialize the layer for execution. This is called when the engine is created.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination).
     *  */
    
    
    //!
    //!
    public native @NoException(true) int initialize();

    /**
     *  \brief Release resources acquired during plugin layer initialization. This is called when the engine is
     *  destroyed.
     *  @see initialize()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void terminate();

    /**
     *  \brief Find the workspace size required by the layer.
     * 
     *  This function is called during engine startup, after initialize(). The workspace size returned should be
     *  sufficient for any batch size up to the maximum.
     * 
     *  @return The workspace size.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("size_t") @NoException(true) long getWorkspaceSize(int maxBatchSize);

    /**
     *  \brief Execute the layer.
     * 
     *  @param batchSize The number of inputs in the batch.
     *  @param inputs The memory for the input tensors.
     *  @param outputs The memory for the output tensors.
     *  @param workspace Workspace for execution.
     *  @param stream The stream in which to execute the kernels.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination).
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int enqueue(int batchSize, @Cast("const void*const*") PointerPointer inputs, @Cast("void*const*") PointerPointer outputs, Pointer workspace,
            CUstream_st stream);
    public native @NoException(true) int enqueue(int batchSize, @Cast("const void*const*") @ByPtrPtr Pointer inputs, @Cast("void*const*") @ByPtrPtr Pointer outputs, Pointer workspace,
            CUstream_st stream);

    /**
     *  \brief Find the size of the serialization buffer required.
     * 
     *  @return The size of the serialization buffer.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("size_t") @NoException(true) long getSerializationSize();

    /**
     *  \brief Serialize the layer.
     * 
     *  @param buffer A pointer to a buffer to serialize data. Size of buffer must be equal to value returned by
     *  getSerializationSize.
     * 
     *  @see getSerializationSize()
     *  */
    
    
    //!
    //!
    public native @NoException(true) void serialize(Pointer buffer);

    /**
     *  \brief Destroy the plugin object. This will be called when the network, builder or engine is destroyed.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void destroy();

    /**
     *  \brief Clone the plugin object. This copies over internal plugin parameters and returns a new plugin object with
     *  these parameters.
     * 
     *  The TensorRT runtime calls clone() to clone the plugin when an execution context is created for an engine,
     *  after the engine has been created.  The runtime does not call initialize() on the cloned plugin,
     *  so the cloned plugin should be created in an initialized state.
     *  */
    
    
    //!
    //!
    public native @NoException(true) IPluginV2 clone();

    /**
     *  \brief Set the namespace that this plugin object belongs to. Ideally, all plugin
     *  objects from the same plugin library should have the same namespace.
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setPluginNamespace(String pluginNamespace);
    public native @NoException(true) void setPluginNamespace(@Cast("const char*") BytePointer pluginNamespace);

    /**
     *  \brief Return the namespace of the plugin object.
     *  */
    public native @NoException(true) String getPluginNamespace();
}
