// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvonnxparser;

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

import static org.bytedeco.tensorrt.global.nvonnxparser.*;

@Name("std::vector<SubGraph_t>") @Properties(inherit = org.bytedeco.tensorrt.presets.nvonnxparser.class)
public class SubGraphCollection_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SubGraphCollection_t(Pointer p) { super(p); }
    public SubGraphCollection_t(SubGraph_t value) { this(1); put(0, value); }
    public SubGraphCollection_t(SubGraph_t ... array) { this(array.length); put(array); }
    public SubGraphCollection_t()       { allocate();  }
    public SubGraphCollection_t(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef SubGraphCollection_t put(@ByRef SubGraphCollection_t x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef SubGraph_t get(@Cast("size_t") long i);
    public native SubGraphCollection_t put(@Cast("size_t") long i, SubGraph_t value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef SubGraph_t value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const SubGraph_t get();
    }

    public SubGraph_t[] get() {
        SubGraph_t[] array = new SubGraph_t[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public SubGraph_t pop_back() {
        long size = size();
        SubGraph_t value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public SubGraphCollection_t push_back(SubGraph_t value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public SubGraphCollection_t put(SubGraph_t value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public SubGraphCollection_t put(SubGraph_t ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

