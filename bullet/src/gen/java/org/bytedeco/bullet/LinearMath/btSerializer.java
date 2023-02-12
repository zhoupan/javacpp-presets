// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btSerializer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSerializer(Pointer p) { super(p); }


	public native @Cast("const unsigned char*") BytePointer getBufferPointer();

	public native int getCurrentBufferSize();

	public native @Name("allocate") btChunk _allocate(@Cast("size_t") long size, int numElements);

	public native void finalizeChunk(btChunk chunk, @Cast("const char*") BytePointer structType, int chunkCode, Pointer oldPtr);
	public native void finalizeChunk(btChunk chunk, String structType, int chunkCode, Pointer oldPtr);

	public native Pointer findPointer(Pointer oldPtr);

	public native Pointer getUniquePointer(Pointer oldPtr);

	public native void startSerialization();

	public native void finishSerialization();

	public native @Cast("const char*") BytePointer findNameForPointer(@Const Pointer ptr);

	public native void registerNameForPointer(@Const Pointer ptr, @Cast("const char*") BytePointer name);
	public native void registerNameForPointer(@Const Pointer ptr, String name);

	public native void serializeName(@Cast("const char*") BytePointer ptr);
	public native void serializeName(String ptr);

	public native int getSerializationFlags();

	public native void setSerializationFlags(int flags);

	public native int getNumChunks();

	public native @Const btChunk getChunk(int chunkIndex);
}
