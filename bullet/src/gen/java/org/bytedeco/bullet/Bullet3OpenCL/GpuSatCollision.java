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


//#include "../../dynamics/basic_demo/Stubs/ChNarrowPhase.h"

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class GpuSatCollision extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GpuSatCollision(Pointer p) { super(p); }

	public native @Cast("cl_context") Pointer m_context(); public native GpuSatCollision m_context(Pointer setter);
	public native @Cast("cl_device_id") Pointer m_device(); public native GpuSatCollision m_device(Pointer setter);
	public native @Cast("cl_command_queue") Pointer m_queue(); public native GpuSatCollision m_queue(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_findSeparatingAxisKernel(); public native GpuSatCollision m_findSeparatingAxisKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_mprPenetrationKernel(); public native GpuSatCollision m_mprPenetrationKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_findSeparatingAxisUnitSphereKernel(); public native GpuSatCollision m_findSeparatingAxisUnitSphereKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_findSeparatingAxisVertexFaceKernel(); public native GpuSatCollision m_findSeparatingAxisVertexFaceKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_findSeparatingAxisEdgeEdgeKernel(); public native GpuSatCollision m_findSeparatingAxisEdgeEdgeKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_findConcaveSeparatingAxisKernel(); public native GpuSatCollision m_findConcaveSeparatingAxisKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_findConcaveSeparatingAxisVertexFaceKernel(); public native GpuSatCollision m_findConcaveSeparatingAxisVertexFaceKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_findConcaveSeparatingAxisEdgeEdgeKernel(); public native GpuSatCollision m_findConcaveSeparatingAxisEdgeEdgeKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_findCompoundPairsKernel(); public native GpuSatCollision m_findCompoundPairsKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_processCompoundPairsKernel(); public native GpuSatCollision m_processCompoundPairsKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_clipHullHullKernel(); public native GpuSatCollision m_clipHullHullKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_clipCompoundsHullHullKernel(); public native GpuSatCollision m_clipCompoundsHullHullKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_clipFacesAndFindContacts(); public native GpuSatCollision m_clipFacesAndFindContacts(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_findClippingFacesKernel(); public native GpuSatCollision m_findClippingFacesKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_clipHullHullConcaveConvexKernel(); public native GpuSatCollision m_clipHullHullConcaveConvexKernel(Pointer setter);
	//	cl_kernel				m_extractManifoldAndAddContactKernel;
	public native @Cast("cl_kernel") Pointer m_newContactReductionKernel(); public native GpuSatCollision m_newContactReductionKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_bvhTraversalKernel(); public native GpuSatCollision m_bvhTraversalKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_primitiveContactsKernel(); public native GpuSatCollision m_primitiveContactsKernel(Pointer setter);
	public native @Cast("cl_kernel") Pointer m_findConcaveSphereContactsKernel(); public native GpuSatCollision m_findConcaveSphereContactsKernel(Pointer setter);

	public native @Cast("cl_kernel") Pointer m_processCompoundPairsPrimitivesKernel(); public native GpuSatCollision m_processCompoundPairsPrimitivesKernel(Pointer setter);

	

	

	
	

	
	
	
	
	
	
	
	

	public GpuSatCollision(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer q) { super((Pointer)null); allocate(ctx, device, q); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer q);

	public native void computeConvexConvexContactsGPUSAT(b3Int4OCLArray pairs, int nPairs,
											   @Const b3RigidBodyDataOCLArray bodyBuf,
											   b3Contact4OCLArray contactOut, @ByRef IntPointer nContacts,
											   @Const b3Contact4OCLArray oldContacts,
											   int maxContactCapacity,
											   int compoundPairCapacity,
											   @Const @ByRef b3ConvexPolyhedronDataOCLArray hostConvexData,
											   @Const @ByRef b3Vector3OCLArray vertices,
											   @Const @ByRef b3Vector3OCLArray uniqueEdges,
											   @Const @ByRef b3GpuFaceOCLArray faces,
											   @Const @ByRef b3IntOCLArray indices,
											   @Const @ByRef b3CollidableOCLArray gpuCollidables,
											   @Const @ByRef b3GpuChildShapeOCLArray gpuChildShapes,
	
											   @Const @ByRef b3AabbOCLArray clAabbsWorldSpace,
											   @Const @ByRef b3AabbOCLArray clAabbsLocalSpace,
	
											   @ByRef b3Vector3OCLArray worldVertsB1GPU,
											   @ByRef b3Int4OCLArray clippingFacesOutGPU,
											   @ByRef b3Vector3OCLArray worldNormalsAGPU,
											   @ByRef b3Vector3OCLArray worldVertsA1GPU,
											   @ByRef b3Vector3OCLArray worldVertsB2GPU,
											   @ByRef b3OptimizedBvhArray bvhData,
											   b3QuantizedBvhNodeOCLArray treeNodesGPU,
											   b3BvhSubtreeInfoOCLArray subTreesGPU,
											   b3BvhInfoOCLArray bvhInfo,
											   int numObjects,
											   int maxTriConvexPairCapacity,
											   @ByRef b3Int4OCLArray triangleConvexPairs,
											   @ByRef IntPointer numTriConvexPairsOut);
	public native void computeConvexConvexContactsGPUSAT(b3Int4OCLArray pairs, int nPairs,
											   @Const b3RigidBodyDataOCLArray bodyBuf,
											   b3Contact4OCLArray contactOut, @ByRef IntBuffer nContacts,
											   @Const b3Contact4OCLArray oldContacts,
											   int maxContactCapacity,
											   int compoundPairCapacity,
											   @Const @ByRef b3ConvexPolyhedronDataOCLArray hostConvexData,
											   @Const @ByRef b3Vector3OCLArray vertices,
											   @Const @ByRef b3Vector3OCLArray uniqueEdges,
											   @Const @ByRef b3GpuFaceOCLArray faces,
											   @Const @ByRef b3IntOCLArray indices,
											   @Const @ByRef b3CollidableOCLArray gpuCollidables,
											   @Const @ByRef b3GpuChildShapeOCLArray gpuChildShapes,
	
											   @Const @ByRef b3AabbOCLArray clAabbsWorldSpace,
											   @Const @ByRef b3AabbOCLArray clAabbsLocalSpace,
	
											   @ByRef b3Vector3OCLArray worldVertsB1GPU,
											   @ByRef b3Int4OCLArray clippingFacesOutGPU,
											   @ByRef b3Vector3OCLArray worldNormalsAGPU,
											   @ByRef b3Vector3OCLArray worldVertsA1GPU,
											   @ByRef b3Vector3OCLArray worldVertsB2GPU,
											   @ByRef b3OptimizedBvhArray bvhData,
											   b3QuantizedBvhNodeOCLArray treeNodesGPU,
											   b3BvhSubtreeInfoOCLArray subTreesGPU,
											   b3BvhInfoOCLArray bvhInfo,
											   int numObjects,
											   int maxTriConvexPairCapacity,
											   @ByRef b3Int4OCLArray triangleConvexPairs,
											   @ByRef IntBuffer numTriConvexPairsOut);
	public native void computeConvexConvexContactsGPUSAT(b3Int4OCLArray pairs, int nPairs,
											   @Const b3RigidBodyDataOCLArray bodyBuf,
											   b3Contact4OCLArray contactOut, @ByRef int[] nContacts,
											   @Const b3Contact4OCLArray oldContacts,
											   int maxContactCapacity,
											   int compoundPairCapacity,
											   @Const @ByRef b3ConvexPolyhedronDataOCLArray hostConvexData,
											   @Const @ByRef b3Vector3OCLArray vertices,
											   @Const @ByRef b3Vector3OCLArray uniqueEdges,
											   @Const @ByRef b3GpuFaceOCLArray faces,
											   @Const @ByRef b3IntOCLArray indices,
											   @Const @ByRef b3CollidableOCLArray gpuCollidables,
											   @Const @ByRef b3GpuChildShapeOCLArray gpuChildShapes,
	
											   @Const @ByRef b3AabbOCLArray clAabbsWorldSpace,
											   @Const @ByRef b3AabbOCLArray clAabbsLocalSpace,
	
											   @ByRef b3Vector3OCLArray worldVertsB1GPU,
											   @ByRef b3Int4OCLArray clippingFacesOutGPU,
											   @ByRef b3Vector3OCLArray worldNormalsAGPU,
											   @ByRef b3Vector3OCLArray worldVertsA1GPU,
											   @ByRef b3Vector3OCLArray worldVertsB2GPU,
											   @ByRef b3OptimizedBvhArray bvhData,
											   b3QuantizedBvhNodeOCLArray treeNodesGPU,
											   b3BvhSubtreeInfoOCLArray subTreesGPU,
											   b3BvhInfoOCLArray bvhInfo,
											   int numObjects,
											   int maxTriConvexPairCapacity,
											   @ByRef b3Int4OCLArray triangleConvexPairs,
											   @ByRef int[] numTriConvexPairsOut);
}
