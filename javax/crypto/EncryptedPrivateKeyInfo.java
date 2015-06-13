// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EncryptedPrivateKeyInfo.java

package javax.crypto;

import java.io.IOException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

// Referenced classes of package javax.crypto:
//			Cipher

public class EncryptedPrivateKeyInfo
{

	public EncryptedPrivateKeyInfo(byte encoded[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public EncryptedPrivateKeyInfo(String encrAlgName, byte encryptedData[])
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public EncryptedPrivateKeyInfo(AlgorithmParameters algParams, byte encryptedData[])
		throws NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	public String getAlgName()
	{
		throw new RuntimeException("Stub!");
	}

	public AlgorithmParameters getAlgParameters()
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getEncryptedData()
	{
		throw new RuntimeException("Stub!");
	}

	public PKCS8EncodedKeySpec getKeySpec(Cipher cipher)
		throws InvalidKeySpecException
	{
		throw new RuntimeException("Stub!");
	}

	public PKCS8EncodedKeySpec getKeySpec(Key decryptKey)
		throws NoSuchAlgorithmException, InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public PKCS8EncodedKeySpec getKeySpec(Key decryptKey, String providerName)
		throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public PKCS8EncodedKeySpec getKeySpec(Key decryptKey, Provider provider)
		throws NoSuchAlgorithmException, InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getEncoded()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
