// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CRL.java

package java.security.cert;


// Referenced classes of package java.security.cert:
//			Certificate

public abstract class CRL
{

	protected CRL(String type)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getType()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isRevoked(Certificate certificate);

	public abstract String toString();
}
