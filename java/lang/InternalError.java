// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InternalError.java

package java.lang;

// Referenced classes of package java.lang:
//			VirtualMachineError, RuntimeException, String

public class InternalError extends VirtualMachineError
{

	public InternalError()
	{
		throw new RuntimeException("Stub!");
	}

	public InternalError(String detailMessage)
	{
		throw new RuntimeException("Stub!");
	}
}
