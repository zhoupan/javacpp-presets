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


@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class BoardConfig extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BoardConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BoardConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoardConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BoardConfig position(long position) {
        return (BoardConfig)super.position(position);
    }
    @Override public BoardConfig getPointer(long i) {
        return new BoardConfig((Pointer)this).offsetAddress(i);
    }

    // USB related config
    public static class USB extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public USB() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public USB(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public USB(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public USB position(long position) {
            return (USB)super.position(position);
        }
        @Override public USB getPointer(long i) {
            return new USB((Pointer)this).offsetAddress(i);
        }
    
        public native @Cast("uint16_t") short vid(); public native USB vid(short setter);
        public native @Cast("uint16_t") short pid(); public native USB pid(short setter);
        public native @Cast("uint16_t") short flashBootedVid(); public native USB flashBootedVid(short setter);
        public native @Cast("uint16_t") short flashBootedPid(); public native USB flashBootedPid(short setter);
        public native UsbSpeed maxSpeed(); public native USB maxSpeed(UsbSpeed setter);
    }

    public native @ByRef USB usb(); public native BoardConfig usb(USB setter);

    /** Network configuration */
    public static class Network extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public Network() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Network(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Network(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public Network position(long position) {
            return (Network)super.position(position);
        }
        @Override public Network getPointer(long i) {
            return new Network((Pointer)this).offsetAddress(i);
        }
    
        /** Network MTU, 0 is auto (usually 1500 for Ethernet) or forwarded
         *  from bootloader (not yet implemented there).
         *  Note: not advised to increase past 1500 for now */
        public native @Cast("uint16_t") short mtu(); public native Network mtu(short setter);
        /** Sets the {@code TCP_NODELAY} option for XLink TCP sockets (disable Nagle's algorithm),
         *  reducing latency at the expense of a small hit for max throughput. Default is {@code true} */
        public native @Cast("bool") boolean xlinkTcpNoDelay(); public native Network xlinkTcpNoDelay(boolean setter);
    }

    public native @ByRef Network network(); public native BoardConfig network(Network setter);

    /** Optional list of FreeBSD sysctl parameters to be set (system, network, etc.).
     *  For example: "net.inet.tcp.delayed_ack=0" (this one is also set by default) */
    public native @ByRef StringVector sysctl(); public native BoardConfig sysctl(StringVector setter);

    // Watchdog config
    public native @ByRef @Cast("tl::optional<uint32_t>*") IntOptional watchdogTimeoutMs(); public native BoardConfig watchdogTimeoutMs(IntOptional setter);
    public native @ByRef @Cast("tl::optional<uint32_t>*") IntOptional watchdogInitialDelayMs(); public native BoardConfig watchdogInitialDelayMs(IntOptional setter);

    // GPIO config
    @NoOffset public static class GPIO extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GPIO(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public GPIO(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public GPIO position(long position) {
            return (GPIO)super.position(position);
        }
        @Override public GPIO getPointer(long i) {
            return new GPIO((Pointer)this).offsetAddress(i);
        }
    
        public enum Mode { ALT_MODE_0((byte)(0)), ALT_MODE_1((byte)(1)), ALT_MODE_2((byte)(2)), ALT_MODE_3((byte)(3)), ALT_MODE_4((byte)(4)), ALT_MODE_5((byte)(5)), ALT_MODE_6((byte)(6)), DIRECT((byte)(7));

            public final byte value;
            private Mode(byte v) { this.value = v; }
            private Mode(Mode e) { this.value = e.value; }
            public Mode intern() { for (Mode e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }
        public native Mode mode(); public native GPIO mode(Mode setter);
        public enum Direction { INPUT((byte)(0)), OUTPUT((byte)(1));

            public final byte value;
            private Direction(byte v) { this.value = v; }
            private Direction(Direction e) { this.value = e.value; }
            public Direction intern() { for (Direction e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }
        public native Direction direction(); public native GPIO direction(Direction setter);
        public enum Level { LOW((byte)(0)), HIGH((byte)(1));

            public final byte value;
            private Level(byte v) { this.value = v; }
            private Level(Level e) { this.value = e.value; }
            public Level intern() { for (Level e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }
        public native Level level(); public native GPIO level(Level setter);
        public enum Pull { NO_PULL((byte)(0)), PULL_UP((byte)(1)), PULL_DOWN((byte)(2)), BUS_KEEPER((byte)(3));

            public final byte value;
            private Pull(byte v) { this.value = v; }
            private Pull(Pull e) { this.value = e.value; }
            public Pull intern() { for (Pull e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }
        public native Pull pull(); public native GPIO pull(Pull setter);
        /** Drive strength in mA (2, 4, 8 and 12mA) */
        public enum Drive { MA_2((byte)(2)), MA_4((byte)(4)), MA_8((byte)(8)), MA_12((byte)(12));

            public final byte value;
            private Drive(byte v) { this.value = v; }
            private Drive(Drive e) { this.value = e.value; }
            public Drive intern() { for (Drive e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }
        public native Drive drive(); public native GPIO drive(Drive setter);
        public native @Cast("bool") boolean schmitt(); public native GPIO schmitt(boolean setter);
        public native @Cast("bool") boolean slewFast(); public native GPIO slewFast(boolean setter);
        public GPIO() { super((Pointer)null); allocate(); }
        private native void allocate();
        public GPIO(Direction direction) { super((Pointer)null); allocate(direction); }
        private native void allocate(Direction direction);
        public GPIO(@Cast("dai::BoardConfig::GPIO::Direction") byte direction) { super((Pointer)null); allocate(direction); }
        private native void allocate(@Cast("dai::BoardConfig::GPIO::Direction") byte direction);
        public GPIO(Direction direction, Level level) { super((Pointer)null); allocate(direction, level); }
        private native void allocate(Direction direction, Level level);
        public GPIO(@Cast("dai::BoardConfig::GPIO::Direction") byte direction, @Cast("dai::BoardConfig::GPIO::Level") byte level) { super((Pointer)null); allocate(direction, level); }
        private native void allocate(@Cast("dai::BoardConfig::GPIO::Direction") byte direction, @Cast("dai::BoardConfig::GPIO::Level") byte level);
        public GPIO(Direction direction, Level level, Pull pull) { super((Pointer)null); allocate(direction, level, pull); }
        private native void allocate(Direction direction, Level level, Pull pull);
        public GPIO(@Cast("dai::BoardConfig::GPIO::Direction") byte direction, @Cast("dai::BoardConfig::GPIO::Level") byte level, @Cast("dai::BoardConfig::GPIO::Pull") byte pull) { super((Pointer)null); allocate(direction, level, pull); }
        private native void allocate(@Cast("dai::BoardConfig::GPIO::Direction") byte direction, @Cast("dai::BoardConfig::GPIO::Level") byte level, @Cast("dai::BoardConfig::GPIO::Pull") byte pull);
        public GPIO(Direction direction, Mode mode) { super((Pointer)null); allocate(direction, mode); }
        private native void allocate(Direction direction, Mode mode);
        public GPIO(Direction direction, Mode mode, Pull pull) { super((Pointer)null); allocate(direction, mode, pull); }
        private native void allocate(Direction direction, Mode mode, Pull pull);
    }
    public native @ByRef ByteGPIOMap gpio(); public native BoardConfig gpio(ByteGPIOMap setter);

    // Uart config

    /** UART instance config */
    public static class UART extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public UART() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public UART(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public UART(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public UART position(long position) {
            return (UART)super.position(position);
        }
        @Override public UART getPointer(long i) {
            return new UART((Pointer)this).offsetAddress(i);
        }
    
        // TBD
        // std::int8_t tx, rx;
        public native byte tmp(); public native UART tmp(byte setter);
    }
    /** UART instance map */
    public native @ByRef ByteUARTMap uart(); public native BoardConfig uart(ByteUARTMap setter);

    // PCIe config
    public native @ByRef BoolOptional pcieInternalClock(); public native BoardConfig pcieInternalClock(BoolOptional setter);

    // USB3 phy config
    public native @ByRef BoolOptional usb3PhyInternalClock(); public native BoardConfig usb3PhyInternalClock(BoolOptional setter);

    // MIPI 4Lane RGB config
    public native @ByRef BoolOptional mipi4LaneRgb(); public native BoardConfig mipi4LaneRgb(BoolOptional setter);

    // eMMC config
    public native @ByRef BoolOptional emmc(); public native BoardConfig emmc(BoolOptional setter);

    // log path
    public native @ByRef StringOptional logPath(); public native BoardConfig logPath(StringOptional setter);

    // Max log size
    public native @ByRef SizeTOptional logSizeMax(); public native BoardConfig logSizeMax(SizeTOptional setter);

    // log verbosity
    public native @ByRef LogLevelOptional logVerbosity(); public native BoardConfig logVerbosity(LogLevelOptional setter);

    // log device prints
    public native @ByRef BoolOptional logDevicePrints(); public native BoardConfig logDevicePrints(BoolOptional setter);
}
