// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;
  // Class for friend declarations.
@Namespace("tflite::delegates") @Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class InterpreterUtils extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public InterpreterUtils() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterpreterUtils(Pointer p) { super(p); }
}
