// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Parameters used to encode a sparse tensor. For detailed explanation of each
// field please refer to lite/schema/schema.fbs.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteSparsity extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteSparsity() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteSparsity(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteSparsity(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteSparsity position(long position) {
        return (TfLiteSparsity)super.position(position);
    }
    @Override public TfLiteSparsity getPointer(long i) {
        return new TfLiteSparsity((Pointer)this).offsetAddress(i);
    }

  public native TfLiteIntArray traversal_order(); public native TfLiteSparsity traversal_order(TfLiteIntArray setter);
  public native TfLiteIntArray block_map(); public native TfLiteSparsity block_map(TfLiteIntArray setter);
  public native TfLiteDimensionMetadata dim_metadata(); public native TfLiteSparsity dim_metadata(TfLiteDimensionMetadata setter);
  public native int dim_metadata_size(); public native TfLiteSparsity dim_metadata_size(int setter);
}
