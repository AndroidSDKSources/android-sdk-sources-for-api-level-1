// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LoggingMXBean.java

package java.util.logging;

import java.util.List;

public interface LoggingMXBean
{

	public abstract String getLoggerLevel(String s);

	public abstract List getLoggerNames();

	public abstract String getParentLoggerName(String s);

	public abstract void setLoggerLevel(String s, String s1);
}
