// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileDescriptor.java

package java.io;


// Referenced classes of package java.io:
//			SyncFailedException

public final class FileDescriptor
{

	public static final FileDescriptor in = null;
	public static final FileDescriptor out = null;
	public static final FileDescriptor err = null;

	public FileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	public void sync()
		throws SyncFailedException
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean valid();

}
