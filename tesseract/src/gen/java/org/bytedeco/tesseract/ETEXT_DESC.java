// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;


@Namespace("tesseract") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class ETEXT_DESC extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ETEXT_DESC(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ETEXT_DESC(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ETEXT_DESC position(long position) {
        return (ETEXT_DESC)super.position(position);
    }
    @Override public ETEXT_DESC getPointer(long i) {
        return new ETEXT_DESC((Pointer)this).offsetAddress(i);
    }

  public native short count(); public native ETEXT_DESC count(short setter);    /** chars in this buffer(0) */
  public native short progress(); public native ETEXT_DESC progress(short setter); /** percent complete increasing (0-100)
  /** Progress monitor covers word recognition and it does not cover layout
   * analysis.
   * See Ray comment in https://github.com/tesseract-ocr/tesseract/pull/27 */
  public native byte more_to_come(); public native ETEXT_DESC more_to_come(byte setter);       /** true if not last */
  public native byte ocr_alive(); public native ETEXT_DESC ocr_alive(byte setter); /** ocr sets to 1, HP 0 */
  public native byte err_code(); public native ETEXT_DESC err_code(byte setter);           /** for errcode use */
  public native CANCEL_FUNC cancel(); public native ETEXT_DESC cancel(CANCEL_FUNC setter);  /** returns true to cancel */
  public native PROGRESS_FUNC progress_callback(); public native ETEXT_DESC progress_callback(PROGRESS_FUNC setter);                      /** called whenever progress increases */
  public native PROGRESS_FUNC2 progress_callback2(); public native ETEXT_DESC progress_callback2(PROGRESS_FUNC2 setter); /** monitor-aware progress callback */
  public native Pointer cancel_this(); public native ETEXT_DESC cancel_this(Pointer setter);        /** this or other data for cancel */
  public native @ByRef @Cast("std::chrono::steady_clock::time_point*") Pointer end_time(); public native ETEXT_DESC end_time(Pointer setter);
  /** Time to stop. Expected to be set only
   *  by call to set_deadline_msecs(). */
  public native @ByRef EANYCODE_CHAR text(int i); public native ETEXT_DESC text(int i, EANYCODE_CHAR setter);
  @MemberGetter public native EANYCODE_CHAR text(); /** character data */

  public ETEXT_DESC() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Sets the end time to be deadline_msecs milliseconds from now.
  public native void set_deadline_msecs(int deadline_msecs);

  // Returns false if we've not passed the end_time, or have not set a deadline.
  public native @Cast("bool") boolean deadline_exceeded();
}
