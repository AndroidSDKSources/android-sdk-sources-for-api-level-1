// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AndroidTestRunner.java

package android.test;

import android.app.Instrumentation;
import android.content.Context;
import java.util.List;
import junit.framework.*;
import junit.runner.BaseTestRunner;

public class AndroidTestRunner extends BaseTestRunner
{

	public AndroidTestRunner()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTestClassName(String testClassName, String testMethodName)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTest(Test test)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearTestListeners()
	{
		throw new RuntimeException("Stub!");
	}

	public void addTestListener(TestListener testListener)
	{
		throw new RuntimeException("Stub!");
	}

	protected TestResult createTestResult()
	{
		throw new RuntimeException("Stub!");
	}

	public List getTestCases()
	{
		throw new RuntimeException("Stub!");
	}

	public String getTestClassName()
	{
		throw new RuntimeException("Stub!");
	}

	public TestResult getTestResult()
	{
		throw new RuntimeException("Stub!");
	}

	public void runTest()
	{
		throw new RuntimeException("Stub!");
	}

	public void runTest(TestResult testResult)
	{
		throw new RuntimeException("Stub!");
	}

	public void setContext(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public void setInstrumentaiton(Instrumentation instrumentation)
	{
		throw new RuntimeException("Stub!");
	}

	protected Class loadSuiteClass(String suiteClassName)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void testStarted(String testName)
	{
		throw new RuntimeException("Stub!");
	}

	public void testEnded(String testName)
	{
		throw new RuntimeException("Stub!");
	}

	public void testFailed(int status, Test test, Throwable t)
	{
		throw new RuntimeException("Stub!");
	}

	protected void runFailed(String message)
	{
		throw new RuntimeException("Stub!");
	}
}
