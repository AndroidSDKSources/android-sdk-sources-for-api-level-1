// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLWarning.java

package java.sql;

import java.io.Serializable;

// Referenced classes of package java.sql:
//			SQLException

public class SQLWarning extends SQLException
	implements Serializable
{

	public SQLWarning()
	{
		throw new RuntimeException("Stub!");
	}

	public SQLWarning(String theReason)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLWarning(String theReason, String theSQLState)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLWarning(String theReason, String theSQLState, int theErrorCode)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLWarning getNextWarning()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNextWarning(SQLWarning w)
	{
		throw new RuntimeException("Stub!");
	}
}
