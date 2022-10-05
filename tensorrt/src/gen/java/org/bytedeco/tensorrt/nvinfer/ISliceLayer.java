// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \brief Slices an input tensor into an output tensor based on the offset and strides.
 * 
 *  The slice layer has two variants, static and dynamic. Static slice specifies the start, size, and stride
 *  dimensions at layer creation time via Dims and can use the get/set accessor functions of the ISliceLayer.
 *  Dynamic slice specifies one or more of start, size or stride as ITensors, by using ILayer::setInput to add
 *  a second, third, or fourth input respectively. The corresponding Dims are used if an input
 *  is missing or null.
 * 
 *  An application can determine if the ISliceLayer has a dynamic output shape based on whether
 *  the size input (third input) is present and non-null.
 * 
 *  The slice layer selects for each dimension a start location from within the input tensor, and
 *  copies elements to the output tensor using the specified stride across the input tensor.
 *  Start, size, and stride tensors must be 1D Int32 shape tensors if not specified via Dims.
 * 
 *  An example of using slice on a tensor:
 *  input = {{0, 2, 4}, {1, 3, 5}}
 *  start = {1, 0}
 *  size = {1, 2}
 *  stride = {1, 2}
 *  output = {{1, 5}}
 * 
 *  When the sliceMode is kCLAMP or kREFLECT, for each input dimension, if its size is 0 then the corresponding output
 *  dimension must be 0 too.
 * 
 *  A slice layer can produce a shape tensor if the following conditions are met:
 * 
 *  * start, size, and stride are build time constants, either as static Dims or as constant input tensors.
 *  * The number of elements in the output tensor does not exceed 2*Dims::MAX_DIMS.
 * 
 *  The input tensor is a shape tensor if the output is a shape tensor.
 * 
 *  The following constraints must be satisfied to execute this layer on DLA:
 *  * start, size, and stride are build time constants, either as static Dims or as constant input tensors.
 *  * sliceMode is kDEFAULT.
 *  * Strides are 1 for all dimensions.
 *  * Slicing is not performed on the first dimension
 *  * The input tensor has four dimensions
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ISliceLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ISliceLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the start offset that the slice layer uses to create the output slice.
     * 
     *  @param start The start offset to read data from the input tensor.
     * 
     *  If a second input had been used to create this layer, that input is reset to null by this method.
     * 
     *  @see getStart
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setStart(@ByVal @Cast("nvinfer1::Dims*") Dims32 start);

    /**
     *  \brief Get the start offset for the slice layer.
     * 
     *  @return The start offset, or an invalid Dims structure.
     * 
     *  If the second input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setStart
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStart();

    /**
     *  \brief Set the dimensions of the output slice.
     * 
     *  @param size The dimensions of the output slice.
     * 
     *  If a third input had been used to create this layer, that input is reset to null by this method.
     * 
     *  @see getSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setSize(@ByVal @Cast("nvinfer1::Dims*") Dims32 size);

    /**
     *  \brief Get dimensions of the output slice.
     * 
     *  @return The output dimension, or an invalid Dims structure.
     * 
     *  If the third input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getSize();

    /**
     *  \brief Set the stride for computing the output slice data.
     * 
     *  @param stride The dimensions of the stride to compute the values to store in the output slice.
     * 
     *  If a fourth input had been used to create this layer, that input is reset to null by this method.
     * 
     *  @see getStride
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void setStride(@ByVal @Cast("nvinfer1::Dims*") Dims32 stride);

    /**
     *  \brief Get the stride for the output slice.
     * 
     *  @return The slicing stride, or an invalid Dims structure.
     * 
     *  If the fourth input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setStride
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getStride();

    /**
     *  \brief Set the slice mode.
     * 
     *  @see getMode()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setMode(SliceMode mode);
    public native @NoException(true) void setMode(@Cast("nvinfer1::SliceMode") int mode);

    /**
     *  \brief Get the slice mode.
     * 
     *  @see setMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) SliceMode getMode();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor
     * 
     *  For a slice layer, the values 0-4 are valid.
     *  The indices are as follows:
     * 
     *  - 0: Tensor to be sliced.
     *  - 1: The start tensor to begin slicing, as a 1D Int32 shape tensor.
     *  - 2: The size tensor of the resulting slice, as a 1D Int32 shape tensor.
     *  - 3: The stride of the slicing operation, as a 1D Int32 shape tensor.
     *  - 4: Value for the kFILL slice mode. The fill value data type should have the same
     *       data phylum as input data type. And this input is disallowed for other modes.
     * 
     *  Using the corresponding setter resets the input to null.
     * 
     *  If this function is called with a value greater than 0, then the function getNbInputs() changes
     *  from returning 1 to index + 1.
     *  */
}
