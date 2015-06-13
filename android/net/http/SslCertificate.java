// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SslCertificate.java

package android.net.http;

import android.os.Bundle;
import java.security.cert.X509Certificate;

public class SslCertificate
{
	public class DName
	{

		final SslCertificate this$0;

		public String getDName()
		{
			throw new RuntimeException("Stub!");
		}

		public String getCName()
		{
			throw new RuntimeException("Stub!");
		}

		public String getOName()
		{
			throw new RuntimeException("Stub!");
		}

		public String getUName()
		{
			throw new RuntimeException("Stub!");
		}

		public DName(String dName)
		{
			this$0 = SslCertificate.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public SslCertificate(String issuedTo, String issuedBy, String validNotBefore, String validNotAfter)
	{
		throw new RuntimeException("Stub!");
	}

	public SslCertificate(X509Certificate certificate)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bundle saveState(SslCertificate certificate)
	{
		throw new RuntimeException("Stub!");
	}

	public static SslCertificate restoreState(Bundle bundle)
	{
		throw new RuntimeException("Stub!");
	}

	public String getValidNotBefore()
	{
		throw new RuntimeException("Stub!");
	}

	public String getValidNotAfter()
	{
		throw new RuntimeException("Stub!");
	}

	public DName getIssuedTo()
	{
		throw new RuntimeException("Stub!");
	}

	public DName getIssuedBy()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
