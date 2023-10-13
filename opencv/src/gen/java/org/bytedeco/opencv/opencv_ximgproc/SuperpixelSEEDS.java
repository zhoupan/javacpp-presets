// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \addtogroup ximgproc_superpixel
 *  \{
<p>
/** \brief Class implementing the SEEDS (Superpixels Extracted via Energy-Driven Sampling) superpixels
algorithm described in \cite VBRV14 .
<p>
The algorithm uses an efficient hill-climbing algorithm to optimize the superpixels' energy
function that is based on color histograms and a boundary term, which is optional. The energy
function encourages superpixels to be of the same color, and if the boundary term is activated, the
superpixels have smooth boundaries and are of similar shape. In practice it starts from a regular
grid of superpixels and moves the pixels or blocks of pixels at the boundaries to refine the
solution. The algorithm runs in real-time using a single CPU.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class SuperpixelSEEDS extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SuperpixelSEEDS(Pointer p) { super(p); }
    /** Downcast constructor. */
    public SuperpixelSEEDS(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::ximgproc::SuperpixelSEEDS*>") void allocate(Algorithm pointer);


    /** \brief Calculates the superpixel segmentation on a given image stored in SuperpixelSEEDS object.
    <p>
    The function computes the superpixels segmentation of an image with the parameters initialized
    with the function createSuperpixelSEEDS().
     */
    public native int getNumberOfSuperpixels();

    /** \brief Calculates the superpixel segmentation on a given image with the initialized
    parameters in the SuperpixelSEEDS object.
    <p>
    This function can be called again for other images without the need of initializing the
    algorithm with createSuperpixelSEEDS(). This save the computational cost of allocating memory
    for all the structures of the algorithm.
    <p>
    @param img Input image. Supported formats: CV_8U, CV_16U, CV_32F. Image size & number of
    channels must match with the initialized image size & channels with the function
    createSuperpixelSEEDS(). It should be in HSV or Lab color space. Lab is a bit better, but also
    slower.
    <p>
    @param num_iterations Number of pixel level iterations. Higher number improves the result.
    <p>
    The function computes the superpixels segmentation of an image with the parameters initialized
    with the function createSuperpixelSEEDS(). The algorithms starts from a grid of superpixels and
    then refines the boundaries by proposing updates of blocks of pixels that lie at the boundaries
    from large to smaller size, finalizing with proposing pixel updates. An illustrative example
    can be seen below.
    <p>
    ![image](pics/superpixels_blocks2.png)
     */
    public native void iterate(@ByVal Mat img, int num_iterations/*=4*/);
    public native void iterate(@ByVal Mat img);
    public native void iterate(@ByVal UMat img, int num_iterations/*=4*/);
    public native void iterate(@ByVal UMat img);
    public native void iterate(@ByVal GpuMat img, int num_iterations/*=4*/);
    public native void iterate(@ByVal GpuMat img);

    /** \brief Returns the segmentation labeling of the image.
    <p>
    Each label represents a superpixel, and each pixel is assigned to one superpixel label.
    <p>
    @param labels_out Return: A CV_32UC1 integer array containing the labels of the superpixel
    segmentation. The labels are in the range [0, getNumberOfSuperpixels()].
    <p>
    The function returns an image with ssthe labels of the superpixel segmentation. The labels are in
    the range [0, getNumberOfSuperpixels()].
     */
    public native void getLabels(@ByVal Mat labels_out);
    public native void getLabels(@ByVal UMat labels_out);
    public native void getLabels(@ByVal GpuMat labels_out);

    /** \brief Returns the mask of the superpixel segmentation stored in SuperpixelSEEDS object.
    <p>
    @param image Return: CV_8UC1 image mask where -1 indicates that the pixel is a superpixel border,
    and 0 otherwise.
    <p>
    @param thick_line If false, the border is only one pixel wide, otherwise all pixels at the border
    are masked.
    <p>
    The function return the boundaries of the superpixel segmentation.
    <p>
    \note
       -   (Python) A demo on how to generate superpixels in images from the webcam can be found at
            opencv_source_code/samples/python2/seeds.py
        -   (cpp) A demo on how to generate superpixels in images from the webcam can be found at
            opencv_source_code/modules/ximgproc/samples/seeds.cpp. By adding a file image as a command
            line argument, the static image will be used instead of the webcam.
        -   It will show a window with the video from the webcam with the superpixel boundaries marked
            in red (see below). Use Space to switch between different output modes. At the top of the
            window there are 4 sliders, from which the user can change on-the-fly the number of
            superpixels, the number of block levels, the strength of the boundary prior term to modify
            the shape, and the number of iterations at pixel level. This is useful to play with the
            parameters and set them to the user convenience. In the console the frame-rate of the
            algorithm is indicated.
    <p>
    ![image](pics/superpixels_demo.png)
     */
    public native void getLabelContourMask(@ByVal Mat image, @Cast("bool") boolean thick_line/*=false*/);
    public native void getLabelContourMask(@ByVal Mat image);
    public native void getLabelContourMask(@ByVal UMat image, @Cast("bool") boolean thick_line/*=false*/);
    public native void getLabelContourMask(@ByVal UMat image);
    public native void getLabelContourMask(@ByVal GpuMat image, @Cast("bool") boolean thick_line/*=false*/);
    public native void getLabelContourMask(@ByVal GpuMat image);
}
