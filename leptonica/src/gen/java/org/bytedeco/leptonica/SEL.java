// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/** Selection */
@Name("Sel") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class SEL extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SEL() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SEL(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SEL(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SEL position(long position) {
        return (SEL)super.position(position);
    }
    @Override public SEL getPointer(long i) {
        return new SEL((Pointer)this).offsetAddress(i);
    }

    /** sel height                               */
    public native @Cast("l_int32") int sy(); public native SEL sy(int setter);
    /** sel width                                */
    public native @Cast("l_int32") int sx(); public native SEL sx(int setter);
    /** y location of sel origin                 */
    public native @Cast("l_int32") int cy(); public native SEL cy(int setter);
    /** x location of sel origin                 */
    public native @Cast("l_int32") int cx(); public native SEL cx(int setter);
    /** {0,1,2}; data[i][j] in [row][col] order  */
    public native @Cast("l_int32*") IntPointer data(int i); public native SEL data(int i, IntPointer setter);
    public native @Cast("l_int32**") PointerPointer data(); public native SEL data(PointerPointer setter);
    /** used to find sel by name                 */
    public native @Cast("char*") BytePointer name(); public native SEL name(BytePointer setter);
}
