// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ActivityUnitTestCase.java

package android.test;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.test:
//			ActivityTestCase

public abstract class ActivityUnitTestCase extends ActivityTestCase
{

	public ActivityUnitTestCase(Class activityClass)
	{
		throw new RuntimeException("Stub!");
	}

	public Activity getActivity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setUp()
		throws Exception
	{
		throw new RuntimeException("Stub!");
	}

	protected Activity startActivity(Intent intent, Bundle savedInstanceState, Object lastNonConfigurationInstance)
	{
		throw new RuntimeException("Stub!");
	}

	protected void tearDown()
		throws Exception
	{
		throw new RuntimeException("Stub!");
	}

	public void setApplication(Application application)
	{
		throw new RuntimeException("Stub!");
	}

	public void setActivityContext(Context activityContext)
	{
		throw new RuntimeException("Stub!");
	}

	public int getRequestedOrientation()
	{
		throw new RuntimeException("Stub!");
	}

	public Intent getStartedActivityIntent()
	{
		throw new RuntimeException("Stub!");
	}

	public int getStartedActivityRequest()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFinishCalled()
	{
		throw new RuntimeException("Stub!");
	}

	public int getFinishedActivityRequest()
	{
		throw new RuntimeException("Stub!");
	}
}
