// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// TfLiteInterpreterOptions allows customized interpreter configuration.
@Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteInterpreterOptions extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TfLiteInterpreterOptions() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteInterpreterOptions(Pointer p) { super(p); }
}
