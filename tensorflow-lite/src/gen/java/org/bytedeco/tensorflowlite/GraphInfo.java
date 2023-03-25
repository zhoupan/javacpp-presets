// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Basic information about an inference graph, where execution nodes
// are connected via tensors.
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class GraphInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphInfo(Pointer p) { super(p); }


  // Total number of tensors in the graph. This should be cached when possible.
  public native @Cast("size_t") long num_tensors();

  // Returns a tensor given its index which is expected to be between 0 and
  // num_tensors(). Use tensors() below for iteration as it is much faster.
  public native TfLiteTensor tensor(@Cast("size_t") long index);

  // Returns all tensors in the graph
  public native TfLiteTensor tensors();

  // Number of nodes in the current execution plan.
  public native @Cast("size_t") long num_execution_nodes();

  // Total number of known nodes, which may include nodes that are no longer in
  // the execution plan. This happens in case of applying multiple delegates.
  // Should be >= num_execution_nodes()
  public native @Cast("size_t") long num_total_nodes();

  // Returns a node given its index in the execution plan, which is expected to
  // be between 0 and num_execution_nodes().
  public native @Const @ByRef TfLiteNode node(@Cast("size_t") long index);

  // Returns a node registration given its index which is expected to be between
  // 0 and num_nodes().
  public native @Const @ByRef TfLiteRegistration registration(@Cast("size_t") long index);

  // Returns an implementation-specific node index which may be different from
  // execution-plan index.
  // Expected to be between 0 and num_total_nodes().
  public native @Cast("size_t") long node_index(@Cast("size_t") long index);

  // Returns the indices of the input tensors.
  public native @StdVector IntPointer inputs();

  // Returns the indices of the output tensors.
  public native @StdVector IntPointer outputs();

  // Returns the indices of the variable tensors.
  public native @StdVector IntPointer variables();
}
