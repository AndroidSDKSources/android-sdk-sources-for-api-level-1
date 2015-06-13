// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpConnectionMetrics.java

package org.apache.http;


public interface HttpConnectionMetrics
{

	public abstract long getRequestCount();

	public abstract long getResponseCount();

	public abstract long getSentBytesCount();

	public abstract long getReceivedBytesCount();

	public abstract Object getMetric(String s);

	public abstract void reset();
}
