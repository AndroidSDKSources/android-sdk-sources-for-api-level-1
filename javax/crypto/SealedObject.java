// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SealedObject.java

package javax.crypto;

import java.io.IOException;
import java.io.Serializable;
import java.security.*;

// Referenced classes of package javax.crypto:
//			IllegalBlockSizeException, BadPaddingException, Cipher

public class SealedObject
	implements Serializable
{

	protected byte encodedParams[];

	public SealedObject(Serializable object, Cipher c)
		throws IOException, IllegalBlockSizeException
	{
		encodedParams = null;
		throw new RuntimeException("Stub!");
	}

	protected SealedObject(SealedObject so)
	{
		encodedParams = null;
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getObject(Key key)
		throws IOException, ClassNotFoundException, NoSuchAlgorithmException, InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getObject(Cipher c)
		throws IOException, ClassNotFoundException, IllegalBlockSizeException, BadPaddingException
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getObject(Key key, String provider)
		throws IOException, ClassNotFoundException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}
}
