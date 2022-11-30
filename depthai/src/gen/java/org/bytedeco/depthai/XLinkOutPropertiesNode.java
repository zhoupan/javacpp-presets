// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Name("dai::NodeCRTP<dai::Node,dai::node::XLinkOut,dai::XLinkOutProperties>") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkOutPropertiesNode extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkOutPropertiesNode(Pointer p) { super(p); }

    /** Underlying properties */
    public native @Cast("dai::NodeCRTP<dai::Node,dai::node::XLinkOut,dai::XLinkOutProperties>::Properties*") @ByRef XLinkOutProperties properties(); public native XLinkOutPropertiesNode properties(XLinkOutProperties setter);
    public native @Override @Cast("const char*") BytePointer getName();
    public native @UniquePtr @Override Node clone();
}
