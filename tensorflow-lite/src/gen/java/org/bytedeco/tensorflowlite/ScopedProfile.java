// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Adds a profile event to `profiler` that begins with the construction
// of the object and ends when the object goes out of scope.
// The lifetime of tag should be at least the lifetime of `profiler`.
// `profiler` may be null, in which case nothing is profiled.
@Namespace("tflite") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class ScopedProfile extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScopedProfile(Pointer p) { super(p); }

  public ScopedProfile(Profiler profiler, @Cast("const char*") BytePointer tag,
                  @Cast("tflite::Profiler::EventType") int event_type/*=tflite::Profiler::EventType::DEFAULT*/,
                  @Cast("int64_t") long event_metadata/*=0*/) { super((Pointer)null); allocate(profiler, tag, event_type, event_metadata); }
  private native void allocate(Profiler profiler, @Cast("const char*") BytePointer tag,
                  @Cast("tflite::Profiler::EventType") int event_type/*=tflite::Profiler::EventType::DEFAULT*/,
                  @Cast("int64_t") long event_metadata/*=0*/);
  public ScopedProfile(Profiler profiler, @Cast("const char*") BytePointer tag) { super((Pointer)null); allocate(profiler, tag); }
  private native void allocate(Profiler profiler, @Cast("const char*") BytePointer tag);
  public ScopedProfile(Profiler profiler, String tag,
                  @Cast("tflite::Profiler::EventType") int event_type/*=tflite::Profiler::EventType::DEFAULT*/,
                  @Cast("int64_t") long event_metadata/*=0*/) { super((Pointer)null); allocate(profiler, tag, event_type, event_metadata); }
  private native void allocate(Profiler profiler, String tag,
                  @Cast("tflite::Profiler::EventType") int event_type/*=tflite::Profiler::EventType::DEFAULT*/,
                  @Cast("int64_t") long event_metadata/*=0*/);
  public ScopedProfile(Profiler profiler, String tag) { super((Pointer)null); allocate(profiler, tag); }
  private native void allocate(Profiler profiler, String tag);
}
