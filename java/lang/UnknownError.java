// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   UnknownError.java

package java.lang;

// Referenced classes of package java.lang:
//			VirtualMachineError, RuntimeException, String

public class UnknownError extends VirtualMachineError
{

	public UnknownError()
	{
		throw new RuntimeException("Stub!");
	}

	public UnknownError(String detailMessage)
	{
		throw new RuntimeException("Stub!");
	}
}
