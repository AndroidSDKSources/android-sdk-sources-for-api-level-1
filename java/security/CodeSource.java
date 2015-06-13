// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CodeSource.java

package java.security;

import java.io.Serializable;
import java.net.URL;
import java.security.cert.Certificate;

// Referenced classes of package java.security:
//			CodeSigner

public class CodeSource
	implements Serializable
{

	public CodeSource(URL location, Certificate certs[])
	{
		throw new RuntimeException("Stub!");
	}

	public CodeSource(URL location, CodeSigner signers[])
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public final Certificate[] getCertificates()
	{
		throw new RuntimeException("Stub!");
	}

	public final CodeSigner[] getCodeSigners()
	{
		throw new RuntimeException("Stub!");
	}

	public final URL getLocation()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean implies(CodeSource cs)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
