// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Timestamp.java

package java.sql;

import java.util.Date;

public class Timestamp extends Date
{

	public Timestamp(int theYear, int theMonth, int theDate, int theHour, int theMinute, int theSecond, int theNano)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public Timestamp(long theTime)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean after(Timestamp theTimestamp)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean before(Timestamp theTimestamp)
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Date theObject)
		throws ClassCastException
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Timestamp theTimestamp)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object theObject)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Timestamp theTimestamp)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNanos()
	{
		throw new RuntimeException("Stub!");
	}

	public long getTime()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNanos(int n)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public void setTime(long theTime)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public static Timestamp valueOf(String s)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Date)x0);
	}
}
