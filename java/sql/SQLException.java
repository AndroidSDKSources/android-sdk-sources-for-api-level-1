// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLException.java

package java.sql;

import java.io.Serializable;

public class SQLException extends Exception
	implements Serializable
{

	public SQLException()
	{
		throw new RuntimeException("Stub!");
	}

	public SQLException(String theReason)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLException(String theReason, String theSQLState)
	{
		throw new RuntimeException("Stub!");
	}

	public SQLException(String theReason, String theSQLState, int theErrorCode)
	{
		throw new RuntimeException("Stub!");
	}

	public int getErrorCode()
	{
		throw new RuntimeException("Stub!");
	}

	public SQLException getNextException()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSQLState()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNextException(SQLException ex)
	{
		throw new RuntimeException("Stub!");
	}
}
