// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cusolver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;

import static org.bytedeco.cuda.global.cusolver.*;


  @Properties(inherit = org.bytedeco.cuda.presets.cusolver.class)
public class cusolverDnLoggerCallback_t extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    cusolverDnLoggerCallback_t(Pointer p) { super(p); }
      protected cusolverDnLoggerCallback_t() { allocate(); }
      private native void allocate();
      public native void call(
      int logLevel,
      @Cast("const char*") BytePointer functionName,
      @Cast("const char*") BytePointer message);
  }
