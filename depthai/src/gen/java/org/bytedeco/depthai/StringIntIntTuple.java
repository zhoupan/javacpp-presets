// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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

@NoOffset @Name("std::tuple<std::string,int,int>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StringIntIntTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringIntIntTuple(Pointer p) { super(p); }
    public StringIntIntTuple(@StdString BytePointer value0, int value1, int value2) { allocate(value0, value1, value2); }
    private native void allocate(@StdString BytePointer value0, int value1, int value2);
    public StringIntIntTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringIntIntTuple put(@ByRef StringIntIntTuple x);

    public @StdString BytePointer get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @StdString BytePointer get0(@ByRef StringIntIntTuple container);
    public int get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native int get1(@ByRef StringIntIntTuple container);
    public int get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native int get2(@ByRef StringIntIntTuple container);
}

