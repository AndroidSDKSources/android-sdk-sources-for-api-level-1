// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ActivityTestCase.java

package android.test;

import android.app.Activity;

// Referenced classes of package android.test:
//			InstrumentationTestCase

public abstract class ActivityTestCase extends InstrumentationTestCase
{

	public ActivityTestCase()
	{
		throw new RuntimeException("Stub!");
	}

	protected Activity getActivity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setActivity(Activity testActivity)
	{
		throw new RuntimeException("Stub!");
	}

	protected void scrubClass(Class testCaseClass)
		throws IllegalAccessException
	{
		throw new RuntimeException("Stub!");
	}
}
