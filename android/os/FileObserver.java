// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileObserver.java

package android.os;


public abstract class FileObserver
{

	public static final int ACCESS = 1;
	public static final int MODIFY = 2;
	public static final int ATTRIB = 4;
	public static final int CLOSE_WRITE = 8;
	public static final int CLOSE_NOWRITE = 16;
	public static final int OPEN = 32;
	public static final int MOVED_FROM = 64;
	public static final int MOVED_TO = 128;
	public static final int CREATE = 256;
	public static final int DELETE = 512;
	public static final int DELETE_SELF = 1024;
	public static final int MOVE_SELF = 2048;
	public static final int ALL_EVENTS = 4095;

	public FileObserver(String path)
	{
		throw new RuntimeException("Stub!");
	}

	public FileObserver(String path, int mask)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	public void startWatching()
	{
		throw new RuntimeException("Stub!");
	}

	public void stopWatching()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void onEvent(int i, String s);
}
