// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btTriangleIndexVertexArray allows to access multiple triangle meshes, by indexing into existing triangle/index arrays.
 * Additional meshes can be added using addIndexedMesh
 * No duplicate is made of the vertex/index data, it only indexes into external vertex/index arrays.
 * So keep those arrays around during the lifetime of this btTriangleIndexVertexArray. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btTriangleIndexVertexArray extends btStridingMeshInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btTriangleIndexVertexArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btTriangleIndexVertexArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btTriangleIndexVertexArray position(long position) {
        return (btTriangleIndexVertexArray)super.position(position);
    }
    @Override public btTriangleIndexVertexArray getPointer(long i) {
        return new btTriangleIndexVertexArray((Pointer)this).offsetAddress(i);
    }


	public btTriangleIndexVertexArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	//just to be backwards compatible
	public btTriangleIndexVertexArray(int numTriangles, IntPointer triangleIndexBase, int triangleIndexStride, int numVertices, @Cast("btScalar*") DoublePointer vertexBase, int vertexStride) { super((Pointer)null); allocate(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride); }
	private native void allocate(int numTriangles, IntPointer triangleIndexBase, int triangleIndexStride, int numVertices, @Cast("btScalar*") DoublePointer vertexBase, int vertexStride);
	public btTriangleIndexVertexArray(int numTriangles, IntBuffer triangleIndexBase, int triangleIndexStride, int numVertices, @Cast("btScalar*") DoubleBuffer vertexBase, int vertexStride) { super((Pointer)null); allocate(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride); }
	private native void allocate(int numTriangles, IntBuffer triangleIndexBase, int triangleIndexStride, int numVertices, @Cast("btScalar*") DoubleBuffer vertexBase, int vertexStride);
	public btTriangleIndexVertexArray(int numTriangles, int[] triangleIndexBase, int triangleIndexStride, int numVertices, @Cast("btScalar*") double[] vertexBase, int vertexStride) { super((Pointer)null); allocate(numTriangles, triangleIndexBase, triangleIndexStride, numVertices, vertexBase, vertexStride); }
	private native void allocate(int numTriangles, int[] triangleIndexBase, int triangleIndexStride, int numVertices, @Cast("btScalar*") double[] vertexBase, int vertexStride);

	public native void addIndexedMesh(@Const @ByRef btIndexedMesh mesh, @Cast("PHY_ScalarType") int indexType/*=PHY_INTEGER*/);
	public native void addIndexedMesh(@Const @ByRef btIndexedMesh mesh);

	public native void getLockedVertexIndexBase(@Cast("unsigned char**") PointerPointer vertexbase, @ByRef IntPointer numverts, @Cast("PHY_ScalarType*") @ByRef IntPointer type, @ByRef IntPointer vertexStride, @Cast("unsigned char**") PointerPointer indexbase, @ByRef IntPointer indexstride, @ByRef IntPointer numfaces, @Cast("PHY_ScalarType*") @ByRef IntPointer indicestype, int subpart/*=0*/);
	public native void getLockedVertexIndexBase(@Cast("unsigned char**") @ByPtrPtr BytePointer vertexbase, @ByRef IntPointer numverts, @Cast("PHY_ScalarType*") @ByRef IntPointer type, @ByRef IntPointer vertexStride, @Cast("unsigned char**") @ByPtrPtr BytePointer indexbase, @ByRef IntPointer indexstride, @ByRef IntPointer numfaces, @Cast("PHY_ScalarType*") @ByRef IntPointer indicestype);
	public native void getLockedVertexIndexBase(@Cast("unsigned char**") @ByPtrPtr BytePointer vertexbase, @ByRef IntPointer numverts, @Cast("PHY_ScalarType*") @ByRef IntPointer type, @ByRef IntPointer vertexStride, @Cast("unsigned char**") @ByPtrPtr BytePointer indexbase, @ByRef IntPointer indexstride, @ByRef IntPointer numfaces, @Cast("PHY_ScalarType*") @ByRef IntPointer indicestype, int subpart/*=0*/);
	public native void getLockedVertexIndexBase(@Cast("unsigned char**") @ByPtrPtr ByteBuffer vertexbase, @ByRef IntBuffer numverts, @Cast("PHY_ScalarType*") @ByRef IntBuffer type, @ByRef IntBuffer vertexStride, @Cast("unsigned char**") @ByPtrPtr ByteBuffer indexbase, @ByRef IntBuffer indexstride, @ByRef IntBuffer numfaces, @Cast("PHY_ScalarType*") @ByRef IntBuffer indicestype, int subpart/*=0*/);
	public native void getLockedVertexIndexBase(@Cast("unsigned char**") @ByPtrPtr ByteBuffer vertexbase, @ByRef IntBuffer numverts, @Cast("PHY_ScalarType*") @ByRef IntBuffer type, @ByRef IntBuffer vertexStride, @Cast("unsigned char**") @ByPtrPtr ByteBuffer indexbase, @ByRef IntBuffer indexstride, @ByRef IntBuffer numfaces, @Cast("PHY_ScalarType*") @ByRef IntBuffer indicestype);
	public native void getLockedVertexIndexBase(@Cast("unsigned char**") @ByPtrPtr byte[] vertexbase, @ByRef int[] numverts, @Cast("PHY_ScalarType*") @ByRef int[] type, @ByRef int[] vertexStride, @Cast("unsigned char**") @ByPtrPtr byte[] indexbase, @ByRef int[] indexstride, @ByRef int[] numfaces, @Cast("PHY_ScalarType*") @ByRef int[] indicestype, int subpart/*=0*/);
	public native void getLockedVertexIndexBase(@Cast("unsigned char**") @ByPtrPtr byte[] vertexbase, @ByRef int[] numverts, @Cast("PHY_ScalarType*") @ByRef int[] type, @ByRef int[] vertexStride, @Cast("unsigned char**") @ByPtrPtr byte[] indexbase, @ByRef int[] indexstride, @ByRef int[] numfaces, @Cast("PHY_ScalarType*") @ByRef int[] indicestype);

	public native void getLockedReadOnlyVertexIndexBase(@Cast("const unsigned char**") PointerPointer vertexbase, @ByRef IntPointer numverts, @Cast("PHY_ScalarType*") @ByRef IntPointer type, @ByRef IntPointer vertexStride, @Cast("const unsigned char**") PointerPointer indexbase, @ByRef IntPointer indexstride, @ByRef IntPointer numfaces, @Cast("PHY_ScalarType*") @ByRef IntPointer indicestype, int subpart/*=0*/);
	public native void getLockedReadOnlyVertexIndexBase(@Cast("const unsigned char**") @ByPtrPtr BytePointer vertexbase, @ByRef IntPointer numverts, @Cast("PHY_ScalarType*") @ByRef IntPointer type, @ByRef IntPointer vertexStride, @Cast("const unsigned char**") @ByPtrPtr BytePointer indexbase, @ByRef IntPointer indexstride, @ByRef IntPointer numfaces, @Cast("PHY_ScalarType*") @ByRef IntPointer indicestype);
	public native void getLockedReadOnlyVertexIndexBase(@Cast("const unsigned char**") @ByPtrPtr BytePointer vertexbase, @ByRef IntPointer numverts, @Cast("PHY_ScalarType*") @ByRef IntPointer type, @ByRef IntPointer vertexStride, @Cast("const unsigned char**") @ByPtrPtr BytePointer indexbase, @ByRef IntPointer indexstride, @ByRef IntPointer numfaces, @Cast("PHY_ScalarType*") @ByRef IntPointer indicestype, int subpart/*=0*/);
	public native void getLockedReadOnlyVertexIndexBase(@Cast("const unsigned char**") @ByPtrPtr ByteBuffer vertexbase, @ByRef IntBuffer numverts, @Cast("PHY_ScalarType*") @ByRef IntBuffer type, @ByRef IntBuffer vertexStride, @Cast("const unsigned char**") @ByPtrPtr ByteBuffer indexbase, @ByRef IntBuffer indexstride, @ByRef IntBuffer numfaces, @Cast("PHY_ScalarType*") @ByRef IntBuffer indicestype, int subpart/*=0*/);
	public native void getLockedReadOnlyVertexIndexBase(@Cast("const unsigned char**") @ByPtrPtr ByteBuffer vertexbase, @ByRef IntBuffer numverts, @Cast("PHY_ScalarType*") @ByRef IntBuffer type, @ByRef IntBuffer vertexStride, @Cast("const unsigned char**") @ByPtrPtr ByteBuffer indexbase, @ByRef IntBuffer indexstride, @ByRef IntBuffer numfaces, @Cast("PHY_ScalarType*") @ByRef IntBuffer indicestype);
	public native void getLockedReadOnlyVertexIndexBase(@Cast("const unsigned char**") @ByPtrPtr byte[] vertexbase, @ByRef int[] numverts, @Cast("PHY_ScalarType*") @ByRef int[] type, @ByRef int[] vertexStride, @Cast("const unsigned char**") @ByPtrPtr byte[] indexbase, @ByRef int[] indexstride, @ByRef int[] numfaces, @Cast("PHY_ScalarType*") @ByRef int[] indicestype, int subpart/*=0*/);
	public native void getLockedReadOnlyVertexIndexBase(@Cast("const unsigned char**") @ByPtrPtr byte[] vertexbase, @ByRef int[] numverts, @Cast("PHY_ScalarType*") @ByRef int[] type, @ByRef int[] vertexStride, @Cast("const unsigned char**") @ByPtrPtr byte[] indexbase, @ByRef int[] indexstride, @ByRef int[] numfaces, @Cast("PHY_ScalarType*") @ByRef int[] indicestype);

	/** unLockVertexBase finishes the access to a subpart of the triangle mesh
	 *  make a call to unLockVertexBase when the read and write access (using getLockedVertexIndexBase) is finished */
	public native void unLockVertexBase(int subpart);

	public native void unLockReadOnlyVertexBase(int subpart);

	/** getNumSubParts returns the number of separate subparts
	 *  each subpart has a continuous array of vertices and indices */
	public native int getNumSubParts();

	public native @Cast("IndexedMeshArray*") @ByRef btIndexedMeshArray getIndexedMeshArray();

	public native void preallocateVertices(int numverts);
	public native void preallocateIndices(int numindices);

	public native @Cast("bool") boolean hasPremadeAabb();
	public native void setPremadeAabb(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);
	public native void getPremadeAabb(btVector3 aabbMin, btVector3 aabbMax);
}
