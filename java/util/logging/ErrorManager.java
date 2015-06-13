// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ErrorManager.java

package java.util.logging;


public class ErrorManager
{

	public static final int GENERIC_FAILURE = 0;
	public static final int WRITE_FAILURE = 1;
	public static final int FLUSH_FAILURE = 2;
	public static final int CLOSE_FAILURE = 3;
	public static final int OPEN_FAILURE = 4;
	public static final int FORMAT_FAILURE = 5;

	public ErrorManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void error(String message, Exception exception, int errorCode)
	{
		throw new RuntimeException("Stub!");
	}
}
