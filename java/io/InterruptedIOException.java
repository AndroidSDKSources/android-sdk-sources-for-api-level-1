// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InterruptedIOException.java

package java.io;


// Referenced classes of package java.io:
//			IOException

public class InterruptedIOException extends IOException
{

	public int bytesTransferred;

	public InterruptedIOException()
	{
		throw new RuntimeException("Stub!");
	}

	public InterruptedIOException(String detailMessage)
	{
		throw new RuntimeException("Stub!");
	}
}
