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
public class VAlgorithmContext extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VAlgorithmContext(Pointer p) { super(p); }

    public native @NoException(true) String getName();
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDimensions(int index, OptProfileSelector select);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getDimensions(int index, @Cast("nvinfer1::OptProfileSelector") int select);
    public native @NoException(true) int getNbInputs();
    public native @NoException(true) int getNbOutputs();
}
