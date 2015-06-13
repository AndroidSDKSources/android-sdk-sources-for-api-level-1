// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DataTruncation.java

package java.sql;

import java.io.Serializable;

// Referenced classes of package java.sql:
//			SQLWarning

public class DataTruncation extends SQLWarning
	implements Serializable
{

	public DataTruncation(int index, boolean parameter, boolean read, int dataSize, int transferSize)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDataSize()
	{
		throw new RuntimeException("Stub!");
	}

	public int getIndex()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getParameter()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getRead()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTransferSize()
	{
		throw new RuntimeException("Stub!");
	}
}
