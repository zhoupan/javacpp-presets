// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;

@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkWriteError extends XLinkError {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkWriteError(Pointer p) { super(p); }

    public XLinkWriteError(@Cast("XLinkError_t") int status, @StdString BytePointer stream) { super((Pointer)null); allocate(status, stream); }
    private native void allocate(@Cast("XLinkError_t") int status, @StdString BytePointer stream);
    public XLinkWriteError(@Cast("XLinkError_t") int status, @StdString ByteBuffer stream) { super((Pointer)null); allocate(status, stream); }
    private native void allocate(@Cast("XLinkError_t") int status, @StdString ByteBuffer stream);
    public XLinkWriteError(@Cast("XLinkError_t") int status, @StdString String stream) { super((Pointer)null); allocate(status, stream); }
    private native void allocate(@Cast("XLinkError_t") int status, @StdString String stream);
}
