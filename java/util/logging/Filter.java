// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Filter.java

package java.util.logging;


// Referenced classes of package java.util.logging:
//			LogRecord

public interface Filter
{

	public abstract boolean isLoggable(LogRecord logrecord);
}
