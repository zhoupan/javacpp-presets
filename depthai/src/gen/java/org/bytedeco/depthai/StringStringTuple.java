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

@NoOffset @Name("std::tuple<std::string,std::string>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StringStringTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringStringTuple(Pointer p) { super(p); }
    public StringStringTuple(@StdString BytePointer value0, @StdString BytePointer value1) { allocate(value0, value1); }
    private native void allocate(@StdString BytePointer value0, @StdString BytePointer value1);
    public StringStringTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringStringTuple put(@ByRef StringStringTuple x);

    public @StdString BytePointer get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @StdString BytePointer get0(@ByRef StringStringTuple container);
    public @StdString BytePointer get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @StdString BytePointer get1(@ByRef StringStringTuple container);
}

