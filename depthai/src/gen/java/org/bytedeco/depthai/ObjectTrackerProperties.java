// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Specify properties for ObjectTracker
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ObjectTrackerProperties extends ObjectTrackerPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public ObjectTrackerProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ObjectTrackerProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ObjectTrackerProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ObjectTrackerProperties position(long position) {
        return (ObjectTrackerProperties)super.position(position);
    }
    @Override public ObjectTrackerProperties getPointer(long i) {
        return new ObjectTrackerProperties((Pointer)this).offsetAddress(i);
    }

    /**
     * Confidence threshold for tracklets.
     * Above this threshold detections will be tracked.
     * Default 0, all detections are tracked.
     */
    public native float trackerThreshold(); public native ObjectTrackerProperties trackerThreshold(float setter);
    /**
     * Maximum number of objects to track.
     * Maximum 60 for SHORT_TERM_KCF, maximum 1000 for other tracking methods.
     * Default 60.
     */
    public native @Cast("std::int32_t") int maxObjectsToTrack(); public native ObjectTrackerProperties maxObjectsToTrack(int setter);
    /**
     * Which detections labels to track.
     * Default all labels are tracked.
     */
    public native @Cast("std::uint32_t*") @StdVector IntPointer detectionLabelsToTrack(); public native ObjectTrackerProperties detectionLabelsToTrack(IntPointer setter);
    /**
     * Tracking method.
     */
    public native TrackerType trackerType(); public native ObjectTrackerProperties trackerType(TrackerType setter);
    /**
     * New ID assignment policy.
     */
    public native TrackerIdAssignmentPolicy trackerIdAssignmentPolicy(); public native ObjectTrackerProperties trackerIdAssignmentPolicy(TrackerIdAssignmentPolicy setter);
}
