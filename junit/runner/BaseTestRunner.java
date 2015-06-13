// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BaseTestRunner.java

package junit.runner;

import java.io.IOException;
import java.util.Properties;
import junit.framework.*;

// Referenced classes of package junit.runner:
//			TestSuiteLoader

public abstract class BaseTestRunner
	implements TestListener
{

	public static final String SUITE_METHODNAME = "suite";

	public BaseTestRunner()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void startTest(Test test)
	{
		throw new RuntimeException("Stub!");
	}

	protected static void setPreferences(Properties preferences)
	{
		throw new RuntimeException("Stub!");
	}

	protected static Properties getPreferences()
	{
		throw new RuntimeException("Stub!");
	}

	public static void savePreferences()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setPreference(String key, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void endTest(Test test)
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

	public abstract void testStarted(String s);

	public abstract void testEnded(String s);

	public abstract void testFailed(int i, Test test, Throwable throwable);

	public Test getTest(String suiteClassName)
	{
		throw new RuntimeException("Stub!");
	}

	public String elapsedTimeAsString(long runTime)
	{
		throw new RuntimeException("Stub!");
	}

	protected String processArguments(String args[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setLoading(boolean enable)
	{
		throw new RuntimeException("Stub!");
	}

	public String extractClassName(String className)
	{
		throw new RuntimeException("Stub!");
	}

	public static String truncate(String s)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void runFailed(String s);

	protected Class loadSuiteClass(String suiteClassName)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected void clearStatus()
	{
		throw new RuntimeException("Stub!");
	}

	public TestSuiteLoader getLoader()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean useReloadingTestSuiteLoader()
	{
		throw new RuntimeException("Stub!");
	}

	public static String getPreference(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getPreference(String key, int dflt)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean inVAJava()
	{
		throw new RuntimeException("Stub!");
	}

	public static String getFilteredTrace(Throwable t)
	{
		throw new RuntimeException("Stub!");
	}

	public static String getFilteredTrace(String stack)
	{
		throw new RuntimeException("Stub!");
	}

	protected static boolean showStackRaw()
	{
		throw new RuntimeException("Stub!");
	}
}
