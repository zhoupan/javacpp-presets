// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/** NodeObj information structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class NodeObjInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NodeObjInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeObjInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeObjInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NodeObjInfo position(long position) {
        return (NodeObjInfo)super.position(position);
    }
    @Override public NodeObjInfo getPointer(long i) {
        return new NodeObjInfo((Pointer)this).offsetAddress(i);
    }

    public native @Cast("int64_t") long id(); public native NodeObjInfo id(long setter);
    public native @StdString BytePointer name(); public native NodeObjInfo name(BytePointer setter);

    public native @Cast("std::uint8_t*") @StdVector BytePointer properties(); public native NodeObjInfo properties(BytePointer setter);

    public static class IoInfoKey extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public IoInfoKey() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public IoInfoKey(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IoInfoKey(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public IoInfoKey position(long position) {
            return (IoInfoKey)super.position(position);
        }
        @Override public IoInfoKey getPointer(long i) {
            return new IoInfoKey((Pointer)this).offsetAddress(i);
        }
    
        public native @Cast("std::size_t") @Name("operator ()") long apply(@Const @ByRef StringStringTuple k);
    }
    public native @ByRef @Cast("std::unordered_map<std::tuple<std::string,std::string>,dai::NodeIoInfo,dai::NodeObjInfo::IoInfoKey>*") Pointer ioInfo(); public native NodeObjInfo ioInfo(Pointer setter);
}
