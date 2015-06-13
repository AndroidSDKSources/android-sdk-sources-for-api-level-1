// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BatchUpdateException.java

package java.sql;

import java.io.Serializable;

// Referenced classes of package java.sql:
//			SQLException

public class BatchUpdateException extends SQLException
	implements Serializable
{

	public BatchUpdateException()
	{
		throw new RuntimeException("Stub!");
	}

	public BatchUpdateException(int updateCounts[])
	{
		throw new RuntimeException("Stub!");
	}

	public BatchUpdateException(String reason, int updateCounts[])
	{
		throw new RuntimeException("Stub!");
	}

	public BatchUpdateException(String reason, String SQLState, int updateCounts[])
	{
		throw new RuntimeException("Stub!");
	}

	public BatchUpdateException(String reason, String SQLState, int vendorCode, int updateCounts[])
	{
		throw new RuntimeException("Stub!");
	}

	public int[] getUpdateCounts()
	{
		throw new RuntimeException("Stub!");
	}
}
