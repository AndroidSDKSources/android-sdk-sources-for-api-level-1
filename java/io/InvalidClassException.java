// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InvalidClassException.java

package java.io;


// Referenced classes of package java.io:
//			ObjectStreamException

public class InvalidClassException extends ObjectStreamException
{

	public String classname;

	public InvalidClassException(String detailMessage)
	{
		throw new RuntimeException("Stub!");
	}

	public InvalidClassException(String className, String detailMessage)
	{
		throw new RuntimeException("Stub!");
	}

	public String getMessage()
	{
		throw new RuntimeException("Stub!");
	}
}
