// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**The btDefaultSerializer is the main Bullet serialization class.
 * The constructor takes an optional argument for backwards compatibility, it is recommended to leave this empty/zero. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btDefaultSerializer extends btSerializer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDefaultSerializer(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDefaultSerializer(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDefaultSerializer position(long position) {
        return (btDefaultSerializer)super.position(position);
    }
    @Override public btDefaultSerializer getPointer(long i) {
        return new btDefaultSerializer((Pointer)this).offsetAddress(i);
    }

	@MemberGetter public native @ByRef btHashMap_btHashPtr_voidPointer m_skipPointers();

	public btDefaultSerializer(int totalSize/*=0*/, @Cast("unsigned char*") BytePointer buffer/*=0*/) { super((Pointer)null); allocate(totalSize, buffer); }
	private native void allocate(int totalSize/*=0*/, @Cast("unsigned char*") BytePointer buffer/*=0*/);
	public btDefaultSerializer() { super((Pointer)null); allocate(); }
	private native void allocate();
	public btDefaultSerializer(int totalSize/*=0*/, @Cast("unsigned char*") ByteBuffer buffer/*=0*/) { super((Pointer)null); allocate(totalSize, buffer); }
	private native void allocate(int totalSize/*=0*/, @Cast("unsigned char*") ByteBuffer buffer/*=0*/);
	public btDefaultSerializer(int totalSize/*=0*/, @Cast("unsigned char*") byte[] buffer/*=0*/) { super((Pointer)null); allocate(totalSize, buffer); }
	private native void allocate(int totalSize/*=0*/, @Cast("unsigned char*") byte[] buffer/*=0*/);

	public static native int getMemoryDnaSizeInBytes();
	public static native @Cast("const char*") BytePointer getMemoryDna();

	public native void insertHeader();

	public native void writeHeader(@Cast("unsigned char*") BytePointer buffer);
	public native void writeHeader(@Cast("unsigned char*") ByteBuffer buffer);
	public native void writeHeader(@Cast("unsigned char*") byte[] buffer);

	public native void startSerialization();

	public native void finishSerialization();

	public native Pointer getUniquePointer(Pointer oldPtr);

	public native @Cast("const unsigned char*") BytePointer getBufferPointer();

	public native int getCurrentBufferSize();

	public native void finalizeChunk(btChunk chunk, @Cast("const char*") BytePointer structType, int chunkCode, Pointer oldPtr);
	public native void finalizeChunk(btChunk chunk, String structType, int chunkCode, Pointer oldPtr);

	public native @Cast("unsigned char*") BytePointer internalAlloc(@Cast("size_t") long size);

	public native @Name("allocate") btChunk _allocate(@Cast("size_t") long size, int numElements);

	public native @Cast("const char*") BytePointer findNameForPointer(@Const Pointer ptr);

	public native void registerNameForPointer(@Const Pointer ptr, @Cast("const char*") BytePointer name);
	public native void registerNameForPointer(@Const Pointer ptr, String name);

	public native void serializeName(@Cast("const char*") BytePointer name);
	public native void serializeName(String name);

	public native int getSerializationFlags();

	public native void setSerializationFlags(int flags);
	public native int getNumChunks();

	public native @Const btChunk getChunk(int chunkIndex);
}
