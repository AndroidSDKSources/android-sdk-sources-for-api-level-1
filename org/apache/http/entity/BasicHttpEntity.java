// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicHttpEntity.java

package org.apache.http.entity;

import java.io.*;

// Referenced classes of package org.apache.http.entity:
//			AbstractHttpEntity

public class BasicHttpEntity extends AbstractHttpEntity
{

	public BasicHttpEntity()
	{
		throw new RuntimeException("Stub!");
	}

	public long getContentLength()
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getContent()
		throws IllegalStateException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isRepeatable()
	{
		throw new RuntimeException("Stub!");
	}

	public void setContentLength(long len)
	{
		throw new RuntimeException("Stub!");
	}

	public void setContent(InputStream instream)
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

	public void consumeContent()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
