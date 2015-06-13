// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IdentityOutputStream.java

package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

public class IdentityOutputStream extends OutputStream
{

	public IdentityOutputStream(SessionOutputBuffer out)
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int b)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
