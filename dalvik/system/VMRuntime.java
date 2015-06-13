// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   VMRuntime.java

package dalvik.system;


public final class VMRuntime
{

	VMRuntime()
	{
		throw new RuntimeException("Stub!");
	}

	public static VMRuntime getRuntime()
	{
		throw new RuntimeException("Stub!");
	}

	public native float getTargetHeapUtilization();

	public float setTargetHeapUtilization(float newTarget)
	{
		throw new RuntimeException("Stub!");
	}

	public long getMinimumHeapSize()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized long setMinimumHeapSize(long size)
	{
		throw new RuntimeException("Stub!");
	}

	public native void gcSoftReferences();

	public native void runFinalizationSync();

	public native long getExternalBytesAllocated();
}
