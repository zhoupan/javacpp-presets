// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

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
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;
import org.bytedeco.tensorrt.nvinfer_plugin.*;
import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;


/**
 *  \class IBinaryProtoBlob
 * 
 *  \brief Object used to store and query data extracted from a binaryproto file using the ICaffeParser.
 * 
 *  @see nvcaffeparser1::ICaffeParser
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvcaffeparser1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class IBinaryProtoBlob extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IBinaryProtoBlob(Pointer p) { super(p); }

    public native @Const @NoException(true) Pointer getData();
    public native @ByVal @NoException(true) Dims4 getDimensions();
    
    //!
    //!
    //!
    public native @NoException(true) DataType getDataType();
    /**
     *  @deprecated Deprecated interface will be removed in TensorRT 10.0.
     * 
     *  \warning Calling destroy on a managed pointer will result in a double-free error.
     *  */
    public native @Deprecated @NoException(true) void destroy();
}
