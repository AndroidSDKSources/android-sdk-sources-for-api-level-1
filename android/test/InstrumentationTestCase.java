// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InstrumentationTestCase.java

package android.test;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Bundle;
import junit.framework.TestCase;

public class InstrumentationTestCase extends TestCase
{

	public InstrumentationTestCase()
	{
		throw new RuntimeException("Stub!");
	}

	public void injectInsrumentation(Instrumentation instrumentation)
	{
		throw new RuntimeException("Stub!");
	}

	public Instrumentation getInstrumentation()
	{
		throw new RuntimeException("Stub!");
	}

	public final Activity launchActivity(String pkg, Class activityCls, Bundle extras)
	{
		throw new RuntimeException("Stub!");
	}

	protected void runTest()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

	public void sendKeys(String keysSequence)
	{
		throw new RuntimeException("Stub!");
	}

	public transient void sendKeys(int keys[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient void sendRepeatedKeys(int keys[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void tearDown()
		throws Exception
	{
		throw new RuntimeException("Stub!");
	}
}
