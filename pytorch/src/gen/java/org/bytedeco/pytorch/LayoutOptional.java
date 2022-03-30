// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::optional<c10::Layout>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LayoutOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayoutOptional(Pointer p) { super(p); }
    public LayoutOptional(Layout value) { this(); put(value); }
    public LayoutOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef LayoutOptional put(@ByRef LayoutOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef Layout get();
    @ValueSetter public native LayoutOptional put(@ByRef Layout value);
}

