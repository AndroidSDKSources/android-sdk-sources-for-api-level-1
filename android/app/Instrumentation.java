// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Instrumentation.java

package android.app;

import android.content.*;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MotionEvent;

// Referenced classes of package android.app:
//			Activity, Application

public class Instrumentation
{
	public static final class ActivityResult
	{

		public int getResultCode()
		{
			throw new RuntimeException("Stub!");
		}

		public Intent getResultData()
		{
			throw new RuntimeException("Stub!");
		}

		public ActivityResult(int resultCode, Intent resultData)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class ActivityMonitor
	{

		public final IntentFilter getFilter()
		{
			throw new RuntimeException("Stub!");
		}

		public final ActivityResult getResult()
		{
			throw new RuntimeException("Stub!");
		}

		public final boolean isBlocking()
		{
			throw new RuntimeException("Stub!");
		}

		public final int getHits()
		{
			throw new RuntimeException("Stub!");
		}

		public final Activity getLastActivity()
		{
			throw new RuntimeException("Stub!");
		}

		public final Activity waitForActivity()
		{
			throw new RuntimeException("Stub!");
		}

		public final Activity waitForActivityWithTimeout(long timeOut)
		{
			throw new RuntimeException("Stub!");
		}

		public ActivityMonitor(IntentFilter which, ActivityResult result, boolean block)
		{
			throw new RuntimeException("Stub!");
		}

		public ActivityMonitor(String cls, ActivityResult result, boolean block)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final String REPORT_KEY_IDENTIFIER = "id";
	public static final String REPORT_KEY_STREAMRESULT = "stream";

	public Instrumentation()
	{
		throw new RuntimeException("Stub!");
	}

	public void onCreate(Bundle arguments)
	{
		throw new RuntimeException("Stub!");
	}

	public void start()
	{
		throw new RuntimeException("Stub!");
	}

	public void onStart()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onException(Object obj, Throwable e)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendStatus(int resultCode, Bundle results)
	{
		throw new RuntimeException("Stub!");
	}

	public void finish(int resultCode, Bundle results)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAutomaticPerformanceSnapshots()
	{
		throw new RuntimeException("Stub!");
	}

	public void startPerformanceSnapshot()
	{
		throw new RuntimeException("Stub!");
	}

	public void endPerformanceSnapshot()
	{
		throw new RuntimeException("Stub!");
	}

	public void onDestroy()
	{
		throw new RuntimeException("Stub!");
	}

	public Context getContext()
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentName getComponentName()
	{
		throw new RuntimeException("Stub!");
	}

	public Context getTargetContext()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isProfiling()
	{
		throw new RuntimeException("Stub!");
	}

	public void startProfiling()
	{
		throw new RuntimeException("Stub!");
	}

	public void stopProfiling()
	{
		throw new RuntimeException("Stub!");
	}

	public void setInTouchMode(boolean inTouch)
	{
		throw new RuntimeException("Stub!");
	}

	public void waitForIdle(Runnable recipient)
	{
		throw new RuntimeException("Stub!");
	}

	public void waitForIdleSync()
	{
		throw new RuntimeException("Stub!");
	}

	public void runOnMainSync(Runnable runner)
	{
		throw new RuntimeException("Stub!");
	}

	public Activity startActivitySync(Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void addMonitor(ActivityMonitor monitor)
	{
		throw new RuntimeException("Stub!");
	}

	public ActivityMonitor addMonitor(IntentFilter filter, ActivityResult result, boolean block)
	{
		throw new RuntimeException("Stub!");
	}

	public ActivityMonitor addMonitor(String cls, ActivityResult result, boolean block)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean checkMonitorHit(ActivityMonitor monitor, int minHits)
	{
		throw new RuntimeException("Stub!");
	}

	public Activity waitForMonitor(ActivityMonitor monitor)
	{
		throw new RuntimeException("Stub!");
	}

	public Activity waitForMonitorWithTimeout(ActivityMonitor monitor, long timeOut)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeMonitor(ActivityMonitor monitor)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean invokeMenuActionSync(Activity targetActivity, int id, int flag)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean invokeContextMenuAction(Activity targetActivity, int id, int flag)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendStringSync(String text)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendKeySync(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendKeyDownUpSync(int key)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendCharacterSync(int keyCode)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendPointerSync(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void sendTrackballEventSync(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public Application newApplication(ClassLoader cl, String className, Context context)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public static Application newApplication(Class clazz, Context context)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void callApplicationOnCreate(Application app)
	{
		throw new RuntimeException("Stub!");
	}

	public Activity newActivity(Class clazz, Context context, IBinder token, Application application, Intent intent, ActivityInfo info, CharSequence title, 
			Activity parent, String id, Object lastNonConfigurationInstance)
		throws InstantiationException, IllegalAccessException
	{
		throw new RuntimeException("Stub!");
	}

	public Activity newActivity(ClassLoader cl, String className, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnCreate(Activity activity, Bundle icicle)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnDestroy(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnRestoreInstanceState(Activity activity, Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnPostCreate(Activity activity, Bundle icicle)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnNewIntent(Activity activity, Intent intent)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnStart(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnRestart(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnResume(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnStop(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnSaveInstanceState(Activity activity, Bundle outState)
	{
		throw new RuntimeException("Stub!");
	}

	public void callActivityOnPause(Activity activity)
	{
		throw new RuntimeException("Stub!");
	}

	public void startAllocCounting()
	{
		throw new RuntimeException("Stub!");
	}

	public void stopAllocCounting()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getAllocCounts()
	{
		throw new RuntimeException("Stub!");
	}

	public Bundle getBinderCounts()
	{
		throw new RuntimeException("Stub!");
	}
}
