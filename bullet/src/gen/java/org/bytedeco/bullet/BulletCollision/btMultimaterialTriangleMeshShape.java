// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The BvhTriangleMaterialMeshShape extends the btBvhTriangleMeshShape. Its main contribution is the interface into a material array, which allows per-triangle friction and restitution. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btMultimaterialTriangleMeshShape extends btBvhTriangleMeshShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultimaterialTriangleMeshShape(Pointer p) { super(p); }


	public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Cast("bool") boolean buildBvh/*=true*/) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression, buildBvh); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Cast("bool") boolean buildBvh/*=true*/);
	public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression);

	/**optionally pass in a larger bvh aabb, used for quantization. This allows for deformations within this aabb */
	public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax, @Cast("bool") boolean buildBvh/*=true*/) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax, @Cast("bool") boolean buildBvh/*=true*/);
	public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax);
	//debugging
	public native @Cast("const char*") BytePointer getName();

	/**Obtains the material for a specific triangle */
	public native @Const btMaterial getMaterialProperties(int partID, int triIndex);
}
