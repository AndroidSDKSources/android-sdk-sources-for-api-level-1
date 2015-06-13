// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestFailure.java

package junit.framework;


// Referenced classes of package junit.framework:
//			Test

public class TestFailure
{

	protected Test fFailedTest;
	protected Throwable fThrownException;

	public TestFailure(Test failedTest, Throwable thrownException)
	{
		throw new RuntimeException("Stub!");
	}

	public Test failedTest()
	{
		throw new RuntimeException("Stub!");
	}

	public Throwable thrownException()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String trace()
	{
		throw new RuntimeException("Stub!");
	}

	public String exceptionMessage()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFailure()
	{
		throw new RuntimeException("Stub!");
	}
}
