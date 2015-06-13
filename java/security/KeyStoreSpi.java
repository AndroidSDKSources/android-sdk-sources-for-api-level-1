// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyStoreSpi.java

package java.security;

import java.io.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Enumeration;

// Referenced classes of package java.security:
//			NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, UnrecoverableEntryException, 
//			KeyStore, Key

public abstract class KeyStoreSpi
{

	public KeyStoreSpi()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Key engineGetKey(String s, char ac[])
		throws NoSuchAlgorithmException, UnrecoverableKeyException;

	public abstract Certificate[] engineGetCertificateChain(String s);

	public abstract Certificate engineGetCertificate(String s);

	public abstract Date engineGetCreationDate(String s);

	public abstract void engineSetKeyEntry(String s, Key key, char ac[], Certificate acertificate[])
		throws KeyStoreException;

	public abstract void engineSetKeyEntry(String s, byte abyte0[], Certificate acertificate[])
		throws KeyStoreException;

	public abstract void engineSetCertificateEntry(String s, Certificate certificate)
		throws KeyStoreException;

	public abstract void engineDeleteEntry(String s)
		throws KeyStoreException;

	public abstract Enumeration engineAliases();

	public abstract boolean engineContainsAlias(String s);

	public abstract int engineSize();

	public abstract boolean engineIsKeyEntry(String s);

	public abstract boolean engineIsCertificateEntry(String s);

	public abstract String engineGetCertificateAlias(Certificate certificate);

	public abstract void engineStore(OutputStream outputstream, char ac[])
		throws IOException, NoSuchAlgorithmException, CertificateException;

	public void engineStore(KeyStore.LoadStoreParameter param)
		throws IOException, NoSuchAlgorithmException, CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void engineLoad(InputStream inputstream, char ac[])
		throws IOException, NoSuchAlgorithmException, CertificateException;

	public void engineLoad(KeyStore.LoadStoreParameter param)
		throws IOException, NoSuchAlgorithmException, CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public KeyStore.Entry engineGetEntry(String alias, KeyStore.ProtectionParameter protParam)
		throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException
	{
		throw new RuntimeException("Stub!");
	}

	public void engineSetEntry(String alias, KeyStore.Entry entry, KeyStore.ProtectionParameter protParam)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean engineEntryInstanceOf(String alias, Class entryClass)
	{
		throw new RuntimeException("Stub!");
	}
}
