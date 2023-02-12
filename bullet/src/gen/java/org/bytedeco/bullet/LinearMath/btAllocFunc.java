// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btAllocFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    btAllocFunc(Pointer p) { super(p); }
    protected btAllocFunc() { allocate(); }
    private native void allocate();
    public native Pointer call(@Cast("size_t") long size);
}
