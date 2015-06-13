// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WriteAbortedException.java

package java.io;


// Referenced classes of package java.io:
//			ObjectStreamException

public class WriteAbortedException extends ObjectStreamException
{

	public Exception detail;

	public WriteAbortedException(String detailMessage, Exception rootCause)
	{
		throw new RuntimeException("Stub!");
	}

	public String getMessage()
	{
		throw new RuntimeException("Stub!");
	}

	public Throwable getCause()
	{
		throw new RuntimeException("Stub!");
	}
}
