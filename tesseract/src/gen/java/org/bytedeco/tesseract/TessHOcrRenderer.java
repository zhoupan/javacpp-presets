// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;


/**
 * Renders tesseract output into an hocr text string
 */
@Namespace("tesseract") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class TessHOcrRenderer extends TessResultRenderer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TessHOcrRenderer(Pointer p) { super(p); }

  public TessHOcrRenderer(@Cast("const char*") BytePointer outputbase, @Cast("bool") boolean font_info) { super((Pointer)null); allocate(outputbase, font_info); }
  private native void allocate(@Cast("const char*") BytePointer outputbase, @Cast("bool") boolean font_info);
  public TessHOcrRenderer(String outputbase, @Cast("bool") boolean font_info) { super((Pointer)null); allocate(outputbase, font_info); }
  private native void allocate(String outputbase, @Cast("bool") boolean font_info);
  public TessHOcrRenderer(@Cast("const char*") BytePointer outputbase) { super((Pointer)null); allocate(outputbase); }
  private native void allocate(@Cast("const char*") BytePointer outputbase);
  public TessHOcrRenderer(String outputbase) { super((Pointer)null); allocate(outputbase); }
  private native void allocate(String outputbase);
}
