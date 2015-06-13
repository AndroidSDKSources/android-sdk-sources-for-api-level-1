// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PowerManager.java

package android.os;


public class PowerManager
{
	public class WakeLock
	{

		final PowerManager this$0;

		public void setReferenceCounted(boolean value)
		{
			throw new RuntimeException("Stub!");
		}

		public void acquire()
		{
			throw new RuntimeException("Stub!");
		}

		public void acquire(long timeout)
		{
			throw new RuntimeException("Stub!");
		}

		public void release()
		{
			throw new RuntimeException("Stub!");
		}

		public boolean isHeld()
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		protected void finalize()
			throws Throwable
		{
			throw new RuntimeException("Stub!");
		}

		WakeLock()
		{
			this$0 = PowerManager.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public static final int PARTIAL_WAKE_LOCK = 1;
	public static final int FULL_WAKE_LOCK = 26;
	public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
	public static final int SCREEN_DIM_WAKE_LOCK = 6;
	public static final int ACQUIRE_CAUSES_WAKEUP = 0x10000000;
	public static final int ON_AFTER_RELEASE = 0x20000000;

	PowerManager()
	{
		throw new RuntimeException("Stub!");
	}

	public WakeLock newWakeLock(int flags, String tag)
	{
		throw new RuntimeException("Stub!");
	}

	public void userActivity(long when, boolean noChangeLights)
	{
		throw new RuntimeException("Stub!");
	}

	public void goToSleep(long time)
	{
		throw new RuntimeException("Stub!");
	}
}
