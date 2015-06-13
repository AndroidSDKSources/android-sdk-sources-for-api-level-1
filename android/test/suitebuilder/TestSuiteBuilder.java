// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestSuiteBuilder.java

package android.test.suitebuilder;

import com.android.internal.util.Predicate;
import java.util.List;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteBuilder
{
	public static class FailedToCreateTests extends TestCase
	{

		public void testSuiteConstructionFailed()
		{
			throw new RuntimeException("Stub!");
		}

		public FailedToCreateTests(Exception exception)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public TestSuiteBuilder(Class clazz)
	{
		throw new RuntimeException("Stub!");
	}

	public TestSuiteBuilder(String name, ClassLoader classLoader)
	{
		throw new RuntimeException("Stub!");
	}

	public transient TestSuiteBuilder includePackages(String packageNames[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient TestSuiteBuilder excludePackages(String packageNames[])
	{
		throw new RuntimeException("Stub!");
	}

	public TestSuiteBuilder addRequirements(List predicates)
	{
		throw new RuntimeException("Stub!");
	}

	public final TestSuiteBuilder includeAllPackagesUnderHere()
	{
		throw new RuntimeException("Stub!");
	}

	public TestSuiteBuilder named(String newSuiteName)
	{
		throw new RuntimeException("Stub!");
	}

	public final TestSuite build()
	{
		throw new RuntimeException("Stub!");
	}

	protected String getSuiteName()
	{
		throw new RuntimeException("Stub!");
	}

	public final transient TestSuiteBuilder addRequirements(Predicate predicates[])
	{
		throw new RuntimeException("Stub!");
	}
}
