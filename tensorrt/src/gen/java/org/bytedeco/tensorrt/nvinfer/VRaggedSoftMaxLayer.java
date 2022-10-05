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
public class VRaggedSoftMaxLayer extends VRoot {
    static { Loader.load(); }
    /** Default native constructor. */
    public VRaggedSoftMaxLayer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VRaggedSoftMaxLayer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VRaggedSoftMaxLayer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public VRaggedSoftMaxLayer position(long position) {
        return (VRaggedSoftMaxLayer)super.position(position);
    }
    @Override public VRaggedSoftMaxLayer getPointer(long i) {
        return new VRaggedSoftMaxLayer((Pointer)this).offsetAddress(i);
    }

}
