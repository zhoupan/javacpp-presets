// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


/**The b3TriangleCallback provides a callback for each overlapping triangle when calling processAllTriangles.
 * This callback is called by processAllTriangles for all b3ConcaveShape derived class, such as  b3BvhTriangleMeshShape, b3StaticPlaneShape and b3HeightfieldTerrainShape. */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3TriangleCallback extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3TriangleCallback(Pointer p) { super(p); }

	public native void processTriangle(b3Vector3 triangle, int partId, int triangleIndex);
}
