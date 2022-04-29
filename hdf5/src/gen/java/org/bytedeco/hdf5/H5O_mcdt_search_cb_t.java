// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5O_mcdt_search_ret_t_snip] -->
 <p>
 *  <!-- [H5O_mcdt_search_cb_t_snip] -->
/**
 * Callback to invoke when completing the search for a matching committed
 * datatype from the committed dtype list
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5O_mcdt_search_cb_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5O_mcdt_search_cb_t(Pointer p) { super(p); }
    protected H5O_mcdt_search_cb_t() { allocate(); }
    private native void allocate();
    public native @Cast("H5O_mcdt_search_ret_t") int call(Pointer op_data);
}
