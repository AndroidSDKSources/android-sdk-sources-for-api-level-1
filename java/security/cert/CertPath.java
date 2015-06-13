// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertPath.java

package java.security.cert;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package java.security.cert:
//			CertificateEncodingException

public abstract class CertPath
	implements Serializable
{

	protected CertPath(String type)
	{
		throw new RuntimeException("Stub!");
	}

	public String getType()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract List getCertificates();

	public abstract byte[] getEncoded()
		throws CertificateEncodingException;

	public abstract byte[] getEncoded(String s)
		throws CertificateEncodingException;

	public abstract Iterator getEncodings();

	protected Object writeReplace()
		throws ObjectStreamException
	{
		throw new RuntimeException("Stub!");
	}
}
