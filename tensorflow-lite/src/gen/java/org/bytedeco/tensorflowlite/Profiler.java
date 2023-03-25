// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// A simple utility for enabling profiled event tracing in TensorFlow Lite.
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Profiler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Profiler(Pointer p) { super(p); }

  // As certain Profiler instance might be only interested in certain event
  // types, we define each event type value to allow a Profiler to use
  // bitmasking bitwise operations to determine whether an event should be
  // recorded or not.
  /** enum class tflite::Profiler::EventType */
  public static final int
    // Default event type, the metadata field has no special significance.
    DEFAULT = 1,

    // The event is an operator invocation and the event_metadata field is the
    // index of operator node.
    OPERATOR_INVOKE_EVENT = 1 << 1,

    // The event is an invocation for an internal operator of a TFLite delegate.
    // The event_metadata field is the index of operator node that's specific to
    // the delegate.
    DELEGATE_OPERATOR_INVOKE_EVENT = 1 << 2,

    // A delegate op invoke event that profiles a delegate op in the
    // Operator-wise Profiling section and not in the Delegate internal section.
    DELEGATE_PROFILED_OPERATOR_INVOKE_EVENT = 1 << 3,

    // The event is a recording of runtime instrumentation such as the overall
    // TFLite runtime status, the TFLite delegate status (if a delegate
    // is applied), and the overall model inference latency etc.
    // Note, the delegate status and overall status are stored as separate
    // event_metadata fields. In particular, the delegate status is encoded
    // as DelegateStatus::full_status().
    GENERAL_RUNTIME_INSTRUMENTATION_EVENT = 1 << 4,

    // Telemetry events. Users and code instrumentations should invoke Telemetry
    // calls instead of using the following types directly.
    // See experimental/telemetry:profiler for definition of each metadata.
    //
    // A telemetry event that reports model and interpreter level events.
    TELEMETRY_EVENT = 1 << 5,
    // A telemetry event that reports model and interpreter level settings.
    TELEMETRY_REPORT_SETTINGS = 1 << 6,
    // A telemetry event that reports delegate level events.
    TELEMETRY_DELEGATE_EVENT = 1 << 7,
    // A telemetry event that reports delegate settings.
    TELEMETRY_DELEGATE_REPORT_SETTINGS = 1 << 8;

  // Signals the beginning of an event and returns a handle to the profile
  // event. The `event_metadata1` and `event_metadata2` have different
  // interpretations based on the actual Profiler instance and the `event_type`.
  // For example, as for the 'SubgraphAwareProfiler' defined in
  // lite/core/subgraph.h, when the event_type is OPERATOR_INVOKE_EVENT,
  // `event_metadata1` represents the index of a TFLite node, and
  // `event_metadata2` represents the index of the subgraph that this event
  // comes from.
  public native @Cast("uint32_t") int BeginEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type,
                                @Cast("int64_t") long event_metadata1,
                                @Cast("int64_t") long event_metadata2);
  public native @Cast("uint32_t") int BeginEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type,
                                @Cast("int64_t") long event_metadata1,
                                @Cast("int64_t") long event_metadata2);
  // Similar w/ the above, but `event_metadata2` defaults to 0.
  public native @Cast("uint32_t") int BeginEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type,
                        @Cast("int64_t") long event_metadata);
  public native @Cast("uint32_t") int BeginEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type,
                        @Cast("int64_t") long event_metadata);

  // Signals an end to the specified profile event with 'event_metadata's, This
  // is useful when 'event_metadata's are not available when the event begins
  // or when one wants to overwrite the 'event_metadata's set at the beginning.
  public native void EndEvent(@Cast("uint32_t") int event_handle, @Cast("int64_t") long event_metadata1,
                          @Cast("int64_t") long event_metadata2);
  // Signals an end to the specified profile event.
  public native void EndEvent(@Cast("uint32_t") int event_handle);

  // Appends an event of type 'event_type' with 'tag' and 'event_metadata'
  // which ran for elapsed_time.
  // Note:
  // In cases were ProfileSummarizer and tensorflow::StatsCalculator are used
  // they assume the value is in "usec", if in any case subclasses
  // didn't put usec, then the values are not meaningful.
  // TODO(karimnosseir): karimnosseir: Revisit and make the function more clear.
  public native void AddEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long elapsed_time,
                  @Cast("int64_t") long event_metadata);
  public native void AddEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long elapsed_time,
                  @Cast("int64_t") long event_metadata);

  // Adds a profiler event.
  // `metric` field has different intreptation based on `event_type`.
  // e.g. it means elapsed time for [DELEGATE_]OPERATOR_INVOKE_EVENT types,
  // and interprets as source and status code for TELEMETRY_[DELEGATE_]EVENT
  // event types. If the concrete profiler does not provide an implementation,
  // does nothing.
  // TODO(b/241982974): Clean up dependencies and make it pure virtual.
  public native void AddEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long metric,
                          @Cast("int64_t") long event_metadata1, @Cast("int64_t") long event_metadata2);
  public native void AddEvent(String tag, @Cast("tflite::Profiler::EventType") int event_type, @Cast("uint64_t") long metric,
                          @Cast("int64_t") long event_metadata1, @Cast("int64_t") long event_metadata2);

  // Adds a profiler event with data.
  // Data will be a const TelemetrySettings* for TELEMETRY_REPORT_SETTINGS
  // and TELEMETRY_DELEGATE_REPORT_SETTINGS.
  // If the concrete profiler does not provide an implementation, does nothing.
  // TODO(b/241982974): Clean up dependencies and make it pure virtual.
  public native void AddEventWithData(@Cast("const char*") BytePointer tag, @Cast("tflite::Profiler::EventType") int event_type,
                                  @Const Pointer data);
  public native void AddEventWithData(String tag, @Cast("tflite::Profiler::EventType") int event_type,
                                  @Const Pointer data);
}
