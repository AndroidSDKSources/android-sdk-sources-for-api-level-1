// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   VMDebug.java

package dalvik.system;


public final class VMDebug
{

	public static final String DEFAULT_METHOD_TRACE_FILE_NAME = "/sdcard/dmtrace.trace";
	public static final int TRACE_COUNT_ALLOCS = 1;
	public static final int KIND_GLOBAL_ALLOCATED_OBJECTS = 1;
	public static final int KIND_GLOBAL_ALLOCATED_BYTES = 2;
	public static final int KIND_GLOBAL_FREED_OBJECTS = 4;
	public static final int KIND_GLOBAL_FREED_BYTES = 8;
	public static final int KIND_GLOBAL_GC_INVOCATIONS = 16;
	public static final int KIND_GLOBAL_EXT_ALLOCATED_OBJECTS = 4096;
	public static final int KIND_GLOBAL_EXT_ALLOCATED_BYTES = 8192;
	public static final int KIND_GLOBAL_EXT_FREED_OBJECTS = 16384;
	public static final int KIND_GLOBAL_EXT_FREED_BYTES = 32768;
	public static final int KIND_THREAD_ALLOCATED_OBJECTS = 0x10000;
	public static final int KIND_THREAD_ALLOCATED_BYTES = 0x20000;
	public static final int KIND_THREAD_FREED_OBJECTS = 0x40000;
	public static final int KIND_THREAD_FREED_BYTES = 0x80000;
	public static final int KIND_THREAD_GC_INVOCATIONS = 0x100000;
	public static final int KIND_THREAD_EXT_ALLOCATED_OBJECTS = 0x10000000;
	public static final int KIND_THREAD_EXT_ALLOCATED_BYTES = 0x20000000;
	public static final int KIND_THREAD_EXT_FREED_OBJECTS = 0x40000000;
	public static final int KIND_THREAD_EXT_FREED_BYTES = 0x80000000;
	public static final int KIND_ALL_COUNTS = -1;

	VMDebug()
	{
		throw new RuntimeException("Stub!");
	}

	public static native long lastDebuggerActivity();

	public static native boolean isDebuggerConnected();

	public static void startMethodTracing()
	{
		throw new RuntimeException("Stub!");
	}

	public static native void startMethodTracing(String s, int i, int j);

	public static native void stopMethodTracing();

	public static native void startEmulatorTracing();

	public static native void stopEmulatorTracing();

	public static native long threadCpuTimeNanos();

	public static native void startAllocCounting();

	public static native void stopAllocCounting();

	public static native int getAllocCount(int i);

	public static native void resetAllocCount(int i);

	public static native int setAllocationLimit(int i);

	public static native int setGlobalAllocationLimit(int i);

	public static native void startInstructionCounting();

	public static native void stopInstructionCounting();

	public static native void getInstructionCount(int ai[]);

	public static native void resetInstructionCount();

	public static native void printLoadedClasses(int i);

	public static native int getLoadedClassCount();
}
