// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;
  // Class for friend declarations.
@Namespace("tflite::delegates::test_utils") @Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TestDelegate extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TestDelegate() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TestDelegate(Pointer p) { super(p); }
}
