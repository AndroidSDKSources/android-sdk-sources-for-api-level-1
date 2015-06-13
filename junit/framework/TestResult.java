// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestResult.java

package junit.framework;

import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package junit.framework:
//			Test, AssertionFailedError, TestListener, TestCase, 
//			Protectable

public class TestResult
{

	protected Vector fFailures;
	protected Vector fErrors;
	protected Vector fListeners;
	protected int fRunTests;

	public TestResult()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addError(Test test, Throwable t)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addFailure(Test test, AssertionFailedError t)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addListener(TestListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void removeListener(TestListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void endTest(Test test)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int errorCount()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Enumeration errors()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int failureCount()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Enumeration failures()
	{
		throw new RuntimeException("Stub!");
	}

	protected void run(TestCase test)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int runCount()
	{
		throw new RuntimeException("Stub!");
	}

	public void runProtected(Test test, Protectable p)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean shouldStop()
	{
		throw new RuntimeException("Stub!");
	}

	public void startTest(Test test)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void stop()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean wasSuccessful()
	{
		throw new RuntimeException("Stub!");
	}
}
