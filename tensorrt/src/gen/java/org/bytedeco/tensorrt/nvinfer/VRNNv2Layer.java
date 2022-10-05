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
public class VRNNv2Layer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VRNNv2Layer(Pointer p) { super(p); }

    public native @NoException(true) int getLayerCount();
    public native @NoException(true) int getHiddenSize();
    public native @NoException(true) int getMaxSeqLength();
    public native @NoException(true) int getDataLength();
    public native @NoException(true) void setSequenceLengths(@ByRef ITensor seqLengths);
    public native @NoException(true) ITensor getSequenceLengths();
    public native @NoException(true) void setOperation(RNNOperation op);
    public native @NoException(true) void setOperation(@Cast("nvinfer1::RNNOperation") int op);
    public native @NoException(true) RNNOperation getOperation();
    public native @NoException(true) void setInputMode(RNNInputMode op);
    public native @NoException(true) void setInputMode(@Cast("nvinfer1::RNNInputMode") int op);
    public native @NoException(true) RNNInputMode getInputMode();
    public native @NoException(true) void setDirection(RNNDirection op);
    public native @NoException(true) void setDirection(@Cast("nvinfer1::RNNDirection") int op);
    public native @NoException(true) RNNDirection getDirection();
    public native @NoException(true) void setWeightsForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW, @ByVal Weights weights);
    public native @NoException(true) void setWeightsForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW, @ByVal Weights weights);
    public native @ByVal @NoException(true) Weights getWeightsForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW);
    public native @ByVal @NoException(true) Weights getWeightsForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW);
    public native @NoException(true) void setBiasForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW, @ByVal Weights bias);
    public native @NoException(true) void setBiasForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW, @ByVal Weights bias);
    public native @ByVal @NoException(true) Weights getBiasForGate(int layerIndex, RNNGateType gate, @Cast("bool") boolean isW);
    public native @ByVal @NoException(true) Weights getBiasForGate(int layerIndex, @Cast("nvinfer1::RNNGateType") int gate, @Cast("bool") boolean isW);
    public native @NoException(true) void setHiddenState(@ByRef ITensor hidden);
    public native @NoException(true) ITensor getHiddenState();
    public native @NoException(true) void setCellState(@ByRef ITensor cell);
    public native @NoException(true) ITensor getCellState();
}
