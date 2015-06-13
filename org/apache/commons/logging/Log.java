// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Log.java

package org.apache.commons.logging;


public interface Log
{

	public abstract boolean isDebugEnabled();

	public abstract boolean isErrorEnabled();

	public abstract boolean isFatalEnabled();

	public abstract boolean isInfoEnabled();

	public abstract boolean isTraceEnabled();

	public abstract boolean isWarnEnabled();

	public abstract void trace(Object obj);

	public abstract void trace(Object obj, Throwable throwable);

	public abstract void debug(Object obj);

	public abstract void debug(Object obj, Throwable throwable);

	public abstract void info(Object obj);

	public abstract void info(Object obj, Throwable throwable);

	public abstract void warn(Object obj);

	public abstract void warn(Object obj, Throwable throwable);

	public abstract void error(Object obj);

	public abstract void error(Object obj, Throwable throwable);

	public abstract void fatal(Object obj);

	public abstract void fatal(Object obj, Throwable throwable);
}
