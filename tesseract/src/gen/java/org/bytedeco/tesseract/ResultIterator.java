// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;
 // for std::vector

@Namespace("tesseract") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class ResultIterator extends LTRResultIterator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResultIterator(Pointer p) { super(p); }

  public static native ResultIterator StartOfParagraph(@Const @ByRef LTRResultIterator resit);

  /**
   * ResultIterator is copy constructible!
   * The default copy constructor works just fine for us.
   */

  // ============= Moving around within the page ============.
  /**
   * Moves the iterator to point to the start of the page to begin
   * an iteration.
   */
  public native void Begin();

  /**
   * Moves to the start of the next object at the given level in the
   * page hierarchy in the appropriate reading order and returns false if
   * the end of the page was reached.
   * NOTE that RIL_SYMBOL will skip non-text blocks, but all other
   * PageIteratorLevel level values will visit each non-text block once.
   * Think of non text blocks as containing a single para, with a single line,
   * with a single imaginary word.
   * Calls to Next with different levels may be freely intermixed.
   * This function iterates words in right-to-left scripts correctly, if
   * the appropriate language has been loaded into Tesseract.
   */
  public native @Cast("bool") boolean Next(@Cast("tesseract::PageIteratorLevel") int level);

  /**
   * IsAtBeginningOf() returns whether we're at the logical beginning of the
   * given level.  (as opposed to ResultIterator's left-to-right top-to-bottom
   * order).  Otherwise, this acts the same as PageIterator::IsAtBeginningOf().
   * For a full description, see pageiterator.h
   */
  public native @Cast("bool") boolean IsAtBeginningOf(@Cast("tesseract::PageIteratorLevel") int level);

  /**
   * Implement PageIterator's IsAtFinalElement correctly in a BiDi context.
   * For instance, IsAtFinalElement(RIL_PARA, RIL_WORD) returns whether we
   * point at the last word in a paragraph.  See PageIterator for full comment.
   */
  public native @Cast("bool") boolean IsAtFinalElement(@Cast("tesseract::PageIteratorLevel") int level,
                          @Cast("tesseract::PageIteratorLevel") int element);

  // ============= Functions that refer to words only ============.
  // Returns the number of blanks before the current word.
  public native int BlanksBeforeWord();

  // ============= Accessing data ==============.

  /**
   * Returns the null terminated UTF-8 encoded text string for the current
   * object at the given level. Use delete [] to free after use.
   */
  public native @Cast("char*") BytePointer GetUTF8Text(@Cast("tesseract::PageIteratorLevel") int level);

  /**
   * Returns the LSTM choices for every LSTM timestep for the current word.
   */
  public native @StdVector StringFloatPairVectorVector GetRawLSTMTimesteps();
  public native StringFloatPairVectorVector GetBestLSTMSymbolChoices();

  /**
   * Return whether the current paragraph's dominant reading direction
   * is left-to-right (as opposed to right-to-left).
   */
  public native @Cast("bool") boolean ParagraphIsLtr();

  // ============= Exposed only for testing =============.

  /**
   * Yields the reading order as a sequence of indices and (optional)
   * meta-marks for a set of words (given left-to-right).
   * The meta marks are passed as negative values:
   *   kMinorRunStart  Start of minor direction text.
   *   kMinorRunEnd    End of minor direction text.
   *   kComplexWord    The next indexed word contains both left-to-right and
   *                    right-to-left characters and was treated as neutral.
   *
   * For example, suppose we have five words in a text line,
   * indexed [0,1,2,3,4] from the leftmost side of the text line.
   * The following are all believable reading_orders:
   *
   * Left-to-Right (in ltr paragraph):
   *     { 0, 1, 2, 3, 4 }
   * Left-to-Right (in rtl paragraph):
   *     { kMinorRunStart, 0, 1, 2, 3, 4, kMinorRunEnd }
   * Right-to-Left (in rtl paragraph):
   *     { 4, 3, 2, 1, 0 }
   * Left-to-Right except for an RTL phrase in words 2, 3 in an ltr paragraph:
   *     { 0, 1, kMinorRunStart, 3, 2, kMinorRunEnd, 4 }
   */
  public static native void CalculateTextlineOrder(
        @Cast("bool") boolean paragraph_is_ltr,
        @Cast("tesseract::StrongScriptDirection*") @StdVector IntPointer word_dirs,
        @StdVector IntPointer reading_order);
  public static native void CalculateTextlineOrder(
        @Cast("bool") boolean paragraph_is_ltr,
        @Cast("tesseract::StrongScriptDirection*") @StdVector IntBuffer word_dirs,
        @StdVector IntBuffer reading_order);
  public static native void CalculateTextlineOrder(
        @Cast("bool") boolean paragraph_is_ltr,
        @Cast("tesseract::StrongScriptDirection*") @StdVector int[] word_dirs,
        @StdVector int[] reading_order);

  
  
  
}
