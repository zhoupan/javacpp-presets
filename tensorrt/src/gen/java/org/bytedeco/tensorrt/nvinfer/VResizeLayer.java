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


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VResizeLayer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VResizeLayer(Pointer p) { super(p); }

    public native @NoException(true) void setOutputDimensions(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getOutputDimensions();
    public native @NoException(true) void setScales(@Const FloatPointer scales, int nbScales);
    public native @NoException(true) void setScales(@Const FloatBuffer scales, int nbScales);
    public native @NoException(true) void setScales(@Const float[] scales, int nbScales);
    public native @NoException(true) int getScales(int size, FloatPointer scales);
    public native @NoException(true) int getScales(int size, FloatBuffer scales);
    public native @NoException(true) int getScales(int size, float[] scales);
    public native @NoException(true) void setResizeMode(ResizeMode resizeMode);
    public native @NoException(true) void setResizeMode(@Cast("nvinfer1::ResizeMode") int resizeMode);
    public native @NoException(true) ResizeMode getResizeMode();
    public native @NoException(true) void setAlignCorners(@Cast("bool") boolean alignCorners);
    public native @Cast("bool") @NoException(true) boolean getAlignCorners();
    public native @NoException(true) void setCoordinateTransformation(ResizeCoordinateTransformation coordTransform);
    public native @NoException(true) void setCoordinateTransformation(@Cast("nvinfer1::ResizeCoordinateTransformation") int coordTransform);
    public native @NoException(true) ResizeCoordinateTransformation getCoordinateTransformation();
    public native @NoException(true) void setSelectorForSinglePixel(ResizeSelector selector);
    public native @NoException(true) void setSelectorForSinglePixel(@Cast("nvinfer1::ResizeSelector") int selector);
    public native @NoException(true) ResizeSelector getSelectorForSinglePixel();
    public native @NoException(true) void setNearestRounding(ResizeRoundMode value);
    public native @NoException(true) void setNearestRounding(@Cast("nvinfer1::ResizeRoundMode") int value);
    public native @NoException(true) ResizeRoundMode getNearestRounding();
}
