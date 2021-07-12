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
 *  \class IAlgorithmIOInfo
 * 
 *  \brief Carries information about input or output of the algorithm.
 *         IAlgorithmIOInfo for all the input and output along with IAlgorithmVariant denotes the variation of algorithm
 *         and can be used to select or reproduce an algorithm using IAlgorithmSelector::selectAlgorithms().
 *  @see IAlgorithmVariant, IAlgorithm, IAlgorithmSelector::selectAlgorithms()
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IAlgorithmIOInfo extends INoCopy {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IAlgorithmIOInfo(Pointer p) { super(p); }

    /**
     *  \brief Return TensorFormat of the input/output of algorithm.
     *  */
    
    
    //!
    //!
    public native @NoException(true) TensorFormat getTensorFormat();

    /**
     *  \brief Return DataType of the input/output of algorithm.
     *  */
    
    
    //!
    //!
    public native @NoException(true) DataType getDataType();

    /**
     *  \brief Return strides of the input/output tensor of algorithm.
     *  */
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStrides();
}
