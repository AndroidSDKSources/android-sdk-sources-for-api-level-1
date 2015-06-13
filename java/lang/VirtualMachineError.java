// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   VirtualMachineError.java

package java.lang;

// Referenced classes of package java.lang:
//			Error, RuntimeException, String

public abstract class VirtualMachineError extends Error
{

	public VirtualMachineError()
	{
		throw new RuntimeException("Stub!");
	}

	public VirtualMachineError(String detailMessage)
	{
		throw new RuntimeException("Stub!");
	}
}
