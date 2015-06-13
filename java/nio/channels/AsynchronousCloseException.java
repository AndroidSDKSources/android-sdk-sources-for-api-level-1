// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AsynchronousCloseException.java

package java.nio.channels;


// Referenced classes of package java.nio.channels:
//			ClosedChannelException

public class AsynchronousCloseException extends ClosedChannelException
{

	public AsynchronousCloseException()
	{
		throw new RuntimeException("Stub!");
	}
}
