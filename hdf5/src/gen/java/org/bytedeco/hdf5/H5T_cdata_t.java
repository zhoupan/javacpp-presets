// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/**
 * Type conversion client data
 */
/** <!-- [H5T_cdata_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5T_cdata_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5T_cdata_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5T_cdata_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5T_cdata_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5T_cdata_t position(long position) {
        return (H5T_cdata_t)super.position(position);
    }
    @Override public H5T_cdata_t getPointer(long i) {
        return new H5T_cdata_t((Pointer)this).offsetAddress(i);
    }

    /** what should the conversion function do?    */
    public native @Cast("H5T_cmd_t") int command(); public native H5T_cdata_t command(int setter);
    /** is the background buffer needed?	     */
    public native @Cast("H5T_bkg_t") int need_bkg(); public native H5T_cdata_t need_bkg(int setter);
    /** recalculate private data		     */
    public native @Cast("hbool_t") boolean recalc(); public native H5T_cdata_t recalc(boolean setter);
    /** private data				     */
    public native Pointer priv(); public native H5T_cdata_t priv(Pointer setter);
}
