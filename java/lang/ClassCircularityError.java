// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClassCircularityError.java

package java.lang;

// Referenced classes of package java.lang:
//			LinkageError, RuntimeException, String

public class ClassCircularityError extends LinkageError
{

	public ClassCircularityError()
	{
		throw new RuntimeException("Stub!");
	}

	public ClassCircularityError(String detailMessage)
	{
		throw new RuntimeException("Stub!");
	}
}
