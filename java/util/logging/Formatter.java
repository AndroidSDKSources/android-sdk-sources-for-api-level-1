// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Formatter.java

package java.util.logging;


// Referenced classes of package java.util.logging:
//			LogRecord, Handler

public abstract class Formatter
{

	protected Formatter()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String format(LogRecord logrecord);

	public String formatMessage(LogRecord r)
	{
		throw new RuntimeException("Stub!");
	}

	public String getHead(Handler h)
	{
		throw new RuntimeException("Stub!");
	}

	public String getTail(Handler h)
	{
		throw new RuntimeException("Stub!");
	}
}
