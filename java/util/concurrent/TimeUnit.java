// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TimeUnit.java

package java.util.concurrent;


public final class TimeUnit extends Enum
{

	public static final TimeUnit MICROSECONDS;
	public static final TimeUnit MILLISECONDS;
	public static final TimeUnit NANOSECONDS;
	public static final TimeUnit SECONDS;
	private static final TimeUnit $VALUES[];

	public static final TimeUnit[] values()
	{
		return (TimeUnit[])$VALUES.clone();
	}

	public static TimeUnit valueOf(String name)
	{
		return (TimeUnit)Enum.valueOf(java/util/concurrent/TimeUnit, name);
	}

	private TimeUnit(String s, int i)
	{
		super(s, i);
	}

	public long convert(long duration, TimeUnit unit)
	{
		throw new RuntimeException("Stub!");
	}

	public long toNanos(long duration)
	{
		throw new RuntimeException("Stub!");
	}

	public long toMicros(long duration)
	{
		throw new RuntimeException("Stub!");
	}

	public long toMillis(long duration)
	{
		throw new RuntimeException("Stub!");
	}

	public long toSeconds(long duration)
	{
		throw new RuntimeException("Stub!");
	}

	public void timedWait(Object obj, long timeout)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void timedJoin(Thread thread, long timeout)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public void sleep(long timeout)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	static 
	{
		MICROSECONDS = new TimeUnit("MICROSECONDS", 0);
		MILLISECONDS = new TimeUnit("MILLISECONDS", 1);
		NANOSECONDS = new TimeUnit("NANOSECONDS", 2);
		SECONDS = new TimeUnit("SECONDS", 3);
		$VALUES = (new TimeUnit[] {
			MICROSECONDS, MILLISECONDS, NANOSECONDS, SECONDS
		});
	}
}
