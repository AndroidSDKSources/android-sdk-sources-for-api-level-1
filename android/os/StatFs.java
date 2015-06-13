// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StatFs.java

package android.os;


public class StatFs
{

	public StatFs(String path)
	{
		throw new RuntimeException("Stub!");
	}

	public void restat(String path)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	public native int getBlockSize();

	public native int getBlockCount();

	public native int getFreeBlocks();

	public native int getAvailableBlocks();
}
