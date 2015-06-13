// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ComparisonFailure.java

package junit.framework;


// Referenced classes of package junit.framework:
//			AssertionFailedError

public class ComparisonFailure extends AssertionFailedError
{

	public ComparisonFailure(String message, String expected, String actual)
	{
		throw new RuntimeException("Stub!");
	}

	public String getMessage()
	{
		throw new RuntimeException("Stub!");
	}
}
