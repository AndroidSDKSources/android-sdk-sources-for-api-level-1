// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MessageDigestSpi.java

package java.security;

import java.nio.ByteBuffer;

// Referenced classes of package java.security:
//			DigestException

public abstract class MessageDigestSpi
{

	public MessageDigestSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected int engineGetDigestLength()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineUpdate(byte byte0);

	protected abstract void engineUpdate(byte abyte0[], int i, int j);

	protected void engineUpdate(ByteBuffer input)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineDigest();

	protected int engineDigest(byte buf[], int offset, int len)
		throws DigestException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineReset();

	public Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}
}
