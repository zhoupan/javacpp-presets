// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_structured_light;

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
import org.bytedeco.opencv.opencv_phase_unwrapping.*;
import static org.bytedeco.opencv.global.opencv_phase_unwrapping.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_structured_light.*;

/** \addtogroup structured_light
 *  \{
<p>
/** \brief Class implementing the Gray-code pattern, based on \cite UNDERWORLD.
 *
 *  The generation of the pattern images is performed with Gray encoding using the traditional white and black colors.
 *
 *  The information about the two image axes x, y is encoded separately into two different pattern sequences.
 *  A projector P with resolution (P_res_x, P_res_y) will result in Ncols = log 2 (P_res_x) encoded pattern images representing the columns, and
 *  in Nrows = log 2 (P_res_y) encoded pattern images representing the rows.
 *  For example a projector with resolution 1024x768 will result in Ncols = 10 and Nrows = 10.
 <p>
 *  However, the generated pattern sequence consists of both regular color and color-inverted images: inverted pattern images are images
 *  with the same structure as the original but with inverted colors.
 *  This provides an effective method for easily determining the intensity value of each pixel when it is lit (highest value) and
 *  when it is not lit (lowest value). So for a a projector with resolution 1024x768, the number of pattern images will be Ncols * 2 + Nrows * 2 = 40.
 *
 */
@Namespace("cv::structured_light") @Properties(inherit = org.bytedeco.opencv.presets.opencv_structured_light.class)
public class GrayCodePattern extends StructuredLightPattern {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GrayCodePattern(Pointer p) { super(p); }
    /** Downcast constructor. */
    public GrayCodePattern(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::structured_light::GrayCodePattern*>") void allocate(Algorithm pointer);


  /** \brief Parameters of StructuredLightPattern constructor.
   *  @param width Projector's width. Default value is 1024.
   *  @param height Projector's height. Default value is 768.
   */
  @NoOffset public static class Params extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
      @Override public Params getPointer(long i) {
          return new Params((Pointer)this).offsetAddress(i);
      }
  
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native int width(); public native Params width(int setter);
    public native int height(); public native Params height(int setter);
  }

  /** \brief Constructor
   @param parameters GrayCodePattern parameters GrayCodePattern::Params: the width and the height of the projector.
   */
  public static native @Ptr GrayCodePattern create( @Const @ByRef(nullValue = "cv::structured_light::GrayCodePattern::Params()") Params parameters );
  public static native @Ptr GrayCodePattern create( );

  // alias for scripting
  public static native @Ptr GrayCodePattern create( int width, int height );

  /** \brief Get the number of pattern images needed for the graycode pattern.
   *
   * @return The number of pattern images needed for the graycode pattern.
   *
   */
   public native @Cast("size_t") long getNumberOfPatternImages();

  /** \brief Sets the value for white threshold, needed for decoding.
   *
   *  White threshold is a number between 0-255 that represents the minimum brightness difference required for valid pixels, between the graycode pattern and its inverse images; used in getProjPixel method.
   *
   *  @param value The desired white threshold value.
   *
   */
  public native void setWhiteThreshold( @Cast("size_t") long value );

  /** \brief Sets the value for black threshold, needed for decoding (shadowsmasks computation).
   *
   *  Black threshold is a number between 0-255 that represents the minimum brightness difference required for valid pixels, between the fully illuminated (white) and the not illuminated images (black); used in computeShadowMasks method.
   *
   *  @param value The desired black threshold value.
   *
   */
  public native void setBlackThreshold( @Cast("size_t") long value );

  /** \brief Generates the all-black and all-white images needed for shadowMasks computation.
   *
   *  To identify shadow regions, the regions of two images where the pixels are not lit by projector's light and thus where there is not coded information,
   *  the 3DUNDERWORLD algorithm computes a shadow mask for the two cameras views, starting from a white and a black images captured by each camera.
   *  This method generates these two additional images to project.
   *
   *  @param blackImage The generated all-black CV_8U image, at projector's resolution.
   *  @param whiteImage The generated all-white CV_8U image, at projector's resolution.
   */
  public native void getImagesForShadowMasks( @ByVal Mat blackImage, @ByVal Mat whiteImage );
  public native void getImagesForShadowMasks( @ByVal UMat blackImage, @ByVal UMat whiteImage );
  public native void getImagesForShadowMasks( @ByVal GpuMat blackImage, @ByVal GpuMat whiteImage );

  /** \brief For a (x,y) pixel of a camera returns the corresponding projector pixel.
   *
   *  The function decodes each pixel in the pattern images acquired by a camera into their corresponding decimal numbers representing the projector's column and row,
   *  providing a mapping between camera's and projector's pixel.
   *
   *  @param patternImages The pattern images acquired by the camera, stored in a grayscale vector < Mat >.
   *  @param x x coordinate of the image pixel.
   *  @param y y coordinate of the image pixel.
   *  @param projPix Projector's pixel corresponding to the camera's pixel: projPix.x and projPix.y are the image coordinates of the projector's pixel corresponding to the pixel being decoded in a camera.
   */
  public native @Cast("bool") boolean getProjPixel( @ByVal MatVector patternImages, int x, int y, @ByRef Point projPix );
  public native @Cast("bool") boolean getProjPixel( @ByVal UMatVector patternImages, int x, int y, @ByRef Point projPix );
  public native @Cast("bool") boolean getProjPixel( @ByVal GpuMatVector patternImages, int x, int y, @ByRef Point projPix );
}
