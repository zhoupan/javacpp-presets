// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;
  // namespace delegates
@Namespace("tflite::interpreter_wrapper") @Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class InterpreterWrapper extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public InterpreterWrapper() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InterpreterWrapper(Pointer p) { super(p); }
}
