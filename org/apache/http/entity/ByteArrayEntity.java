// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ByteArrayEntity.java

package org.apache.http.entity;

import java.io.*;

// Referenced classes of package org.apache.http.entity:
//			AbstractHttpEntity

public class ByteArrayEntity extends AbstractHttpEntity
	implements Cloneable
{

	protected final byte content[] = null;

	public ByteArrayEntity(byte b[])
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isRepeatable()
	{
		throw new RuntimeException("Stub!");
	}

	public long getContentLength()
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getContent()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeTo(OutputStream outstream)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStreaming()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
