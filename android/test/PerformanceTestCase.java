// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PerformanceTestCase.java

package android.test;


public interface PerformanceTestCase
{
	public static interface Intermediates
	{

		public abstract void setInternalIterations(int i);

		public abstract void startTiming(boolean flag);

		public abstract void addIntermediate(String s);

		public abstract void addIntermediate(String s, long l);

		public abstract void finishTiming(boolean flag);
	}


	public abstract int startPerformance(Intermediates intermediates);

	public abstract boolean isPerformanceOnly();
}
