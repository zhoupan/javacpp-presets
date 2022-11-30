// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// A MemoryPlanner is responsible for planning and executing a number of
// memory-related operations that are necessary in TF Lite.
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class MemoryPlanner extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryPlanner(Pointer p) { super(p); }


  // Plans the necessary memory allocations. This is the MemoryPlanner's
  // pre-processing step and is called when the graph structure is known but
  // actual size of the tensors is not.
  public native @Cast("TfLiteStatus") int PlanAllocations();

  // Allocates the necessary memory to execute all nodes in the interval
  // [first_node, last_node].
  public native @Cast("TfLiteStatus") int ExecuteAllocations(int first_node, int last_node);

  // Invalidates allocations made earlier. This is called when tensors sizes
  // have changed. All planned allocations remain, but can't be used until
  // ExecuteAllocations() is called.
  public native @Cast("TfLiteStatus") int ResetAllocations();

  // Invalidates allocations after the given node execution.
  public native @Cast("TfLiteStatus") int ResetAllocationsAfter(int node);

  // NOTE: The following two methods modify the data pointers for all tensors on
  // the non-persistent arena (inputs, outputs, intermediates). If the user has
  // manually set the pointers for any of these, they would need to be set
  // again.

  // This releases memory allocated for non-persistent tensors.
  // It does NOT clear the allocation plan, but the memory can't be used
  // until AcquireNonPersistentMemory() is called.
  // It is safe to call Reset/PlanAllocations after this method, without calling
  // ReleaseTemporaryAllocations in case tensor sizes change.
  public native @Cast("TfLiteStatus") int ReleaseNonPersistentMemory();

  // Allocates the necessary memory to contain non-persistent tensors.
  public native @Cast("TfLiteStatus") int AcquireNonPersistentMemory();

  // Returns true if the non-persistent memory is available.
  public native @Cast("bool") boolean HasNonPersistentMemory();

  // Dumps the memory planning information against the specified op node
  // execution plan (i.e. `execution_plan`) for the purpose of debugging.
  public native void DumpDebugInfo(@StdVector IntPointer execution_plan);
  public native void DumpDebugInfo(@StdVector IntBuffer execution_plan);
  public native void DumpDebugInfo(@StdVector int[] execution_plan);

  // Returns a map of allocation information. It's only used for debugging.
  public native void GetAllocInfo(@Cast("size_t*") SizeTPointer arena_size,
                              @Cast("size_t*") SizeTPointer arena_persist_size);
}
