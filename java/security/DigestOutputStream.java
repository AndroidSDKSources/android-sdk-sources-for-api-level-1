// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DigestOutputStream.java

package java.security;

import java.io.*;

// Referenced classes of package java.security:
//			MessageDigest

public class DigestOutputStream extends FilterOutputStream
{

	protected MessageDigest digest;

	public DigestOutputStream(OutputStream stream, MessageDigest digest)
	{
		super((OutputStream)null);
		throw new RuntimeException("Stub!");
	}

	public MessageDigest getMessageDigest()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMessageDigest(MessageDigest digest)
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int b)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte b[], int off, int len)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void on(boolean on)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
