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


/**
 *  \class IPluginCreator
 * 
 *  \brief Plugin creator class for user implemented layers.
 * 
 *  @see IPlugin and IPluginFactory
 *  */

@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginCreator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginCreator(Pointer p) { super(p); }

    /**
     *  \brief Return the version of the API the plugin creator was compiled with.
     *  */
    
    
    //!
    //!
    public native @NoException(true) int getTensorRTVersion();

    /**
     *  \brief Return the plugin name.
     *  */
    
    
    //!
    //!
    public native @NoException(true) String getPluginName();

    /**
     *  \brief Return the plugin version.
     *  */
    
    
    //!
    //!
    public native @NoException(true) String getPluginVersion();

    /**
     *  \brief Return a list of fields that needs to be passed to createPlugin.
     *  @see PluginFieldCollection
     *  */
    
    
    //!
    //!
    public native @Const @NoException(true) PluginFieldCollection getFieldNames();

    /**
     *  \brief Return a plugin object. Return nullptr in case of error.
     *  */
    
    
    //!
    //!
    public native @NoException(true) IPluginV2 createPlugin(String name, @Const PluginFieldCollection fc);
    public native @NoException(true) IPluginV2 createPlugin(@Cast("const char*") BytePointer name, @Const PluginFieldCollection fc);

    /**
     *  \brief Called during deserialization of plugin layer. Return a plugin object.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) IPluginV2 deserializePlugin(String name, @Const Pointer serialData, @Cast("size_t") long serialLength);
    public native @NoException(true) IPluginV2 deserializePlugin(@Cast("const char*") BytePointer name, @Const Pointer serialData, @Cast("size_t") long serialLength);

    /**
     *  \brief Set the namespace of the plugin creator based on the plugin
     *  library it belongs to. This can be set while registering the plugin creator.
     * 
     *  @see IPluginRegistry::registerCreator()
     *  */
    
    
    //!
    //!
    public native @NoException(true) void setPluginNamespace(String pluginNamespace);
    public native @NoException(true) void setPluginNamespace(@Cast("const char*") BytePointer pluginNamespace);

    /**
     *  \brief Return the namespace of the plugin creator object.
     *  */
    public native @NoException(true) String getPluginNamespace();
}
