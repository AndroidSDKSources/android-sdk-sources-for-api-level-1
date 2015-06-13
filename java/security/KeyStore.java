// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyStore.java

package java.security;

import java.io.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Enumeration;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import javax.security.auth.callback.CallbackHandler;

// Referenced classes of package java.security:
//			KeyStoreException, NoSuchProviderException, NoSuchAlgorithmException, UnrecoverableKeyException, 
//			UnrecoverableEntryException, KeyStoreSpi, Provider, Key, 
//			PrivateKey

public class KeyStore
{
	public static final class TrustedCertificateEntry
		implements Entry
	{

		public Certificate getTrustedCertificate()
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public TrustedCertificateEntry(Certificate trustCertificate)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static final class SecretKeyEntry
		implements Entry
	{

		public SecretKey getSecretKey()
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public SecretKeyEntry(SecretKey secretKey)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static final class PrivateKeyEntry
		implements Entry
	{

		public PrivateKey getPrivateKey()
		{
			throw new RuntimeException("Stub!");
		}

		public Certificate[] getCertificateChain()
		{
			throw new RuntimeException("Stub!");
		}

		public Certificate getCertificate()
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public PrivateKeyEntry(PrivateKey privateKey, Certificate chain[])
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface ProtectionParameter
	{
	}

	public static class PasswordProtection
		implements ProtectionParameter, Destroyable
	{

		public synchronized char[] getPassword()
		{
			throw new RuntimeException("Stub!");
		}

		public synchronized void destroy()
			throws DestroyFailedException
		{
			throw new RuntimeException("Stub!");
		}

		public synchronized boolean isDestroyed()
		{
			throw new RuntimeException("Stub!");
		}

		public PasswordProtection(char password[])
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface LoadStoreParameter
	{

		public abstract ProtectionParameter getProtectionParameter();
	}

	public static interface Entry
	{
	}

	public static class CallbackHandlerProtection
		implements ProtectionParameter
	{

		public CallbackHandler getCallbackHandler()
		{
			throw new RuntimeException("Stub!");
		}

		public CallbackHandlerProtection(CallbackHandler handler)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static abstract class Builder
	{

		public abstract KeyStore getKeyStore()
			throws KeyStoreException;

		public abstract ProtectionParameter getProtectionParameter(String s)
			throws KeyStoreException;

		public static Builder newInstance(KeyStore keyStore, ProtectionParameter protectionParameter)
		{
			throw new RuntimeException("Stub!");
		}

		public static Builder newInstance(String type, Provider provider, File file, ProtectionParameter protectionParameter)
		{
			throw new RuntimeException("Stub!");
		}

		public static Builder newInstance(String type, Provider provider, ProtectionParameter protectionParameter)
		{
			throw new RuntimeException("Stub!");
		}

		protected Builder()
		{
			throw new RuntimeException("Stub!");
		}
	}


	protected KeyStore(KeyStoreSpi keyStoreSpi, Provider provider, String type)
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyStore getInstance(String type)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyStore getInstance(String type, String provider)
		throws KeyStoreException, NoSuchProviderException
	{
		throw new RuntimeException("Stub!");
	}

	public static KeyStore getInstance(String type, Provider provider)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public static final String getDefaultType()
	{
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public final String getType()
	{
		throw new RuntimeException("Stub!");
	}

	public final Key getKey(String alias, char password[])
		throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final Certificate[] getCertificateChain(String alias)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final Certificate getCertificate(String alias)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final Date getCreationDate(String alias)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final void setKeyEntry(String alias, Key key, char password[], Certificate chain[])
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final void setKeyEntry(String alias, byte key[], Certificate chain[])
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final void setCertificateEntry(String alias, Certificate cert)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final void deleteEntry(String alias)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final Enumeration aliases()
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean containsAlias(String alias)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final int size()
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isKeyEntry(String alias)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isCertificateEntry(String alias)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final String getCertificateAlias(Certificate cert)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final void store(OutputStream stream, char password[])
		throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final void store(LoadStoreParameter param)
		throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final void load(InputStream stream, char password[])
		throws IOException, NoSuchAlgorithmException, CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final void load(LoadStoreParameter param)
		throws IOException, NoSuchAlgorithmException, CertificateException
	{
		throw new RuntimeException("Stub!");
	}

	public final Entry getEntry(String alias, ProtectionParameter param)
		throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final void setEntry(String alias, Entry entry, ProtectionParameter param)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean entryInstanceOf(String alias, Class entryClass)
		throws KeyStoreException
	{
		throw new RuntimeException("Stub!");
	}
}
