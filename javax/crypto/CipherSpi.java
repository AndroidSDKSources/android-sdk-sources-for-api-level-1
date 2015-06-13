// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CipherSpi.java

package javax.crypto;

import java.nio.ByteBuffer;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

// Referenced classes of package javax.crypto:
//			NoSuchPaddingException, ShortBufferException, IllegalBlockSizeException, BadPaddingException

public abstract class CipherSpi
{

	public CipherSpi()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineSetMode(String s)
		throws NoSuchAlgorithmException;

	protected abstract void engineSetPadding(String s)
		throws NoSuchPaddingException;

	protected abstract int engineGetBlockSize();

	protected abstract int engineGetOutputSize(int i);

	protected abstract byte[] engineGetIV();

	protected abstract AlgorithmParameters engineGetParameters();

	protected abstract void engineInit(int i, Key key, SecureRandom securerandom)
		throws InvalidKeyException;

	protected abstract void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
		throws InvalidKeyException, InvalidAlgorithmParameterException;

	protected abstract void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
		throws InvalidKeyException, InvalidAlgorithmParameterException;

	protected abstract byte[] engineUpdate(byte abyte0[], int i, int j);

	protected abstract int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
		throws ShortBufferException;

	protected int engineUpdate(ByteBuffer input, ByteBuffer output)
		throws ShortBufferException
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineDoFinal(byte abyte0[], int i, int j)
		throws IllegalBlockSizeException, BadPaddingException;

	protected abstract int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
		throws ShortBufferException, IllegalBlockSizeException, BadPaddingException;

	protected int engineDoFinal(ByteBuffer input, ByteBuffer output)
		throws ShortBufferException, IllegalBlockSizeException, BadPaddingException
	{
		throw new RuntimeException("Stub!");
	}

	protected byte[] engineWrap(Key key)
		throws IllegalBlockSizeException, InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}

	protected Key engineUnwrap(byte wrappedKey[], String wrappedKeyAlgorithm, int wrappedKeyType)
		throws InvalidKeyException, NoSuchAlgorithmException
	{
		throw new RuntimeException("Stub!");
	}

	protected int engineGetKeySize(Key key)
		throws InvalidKeyException
	{
		throw new RuntimeException("Stub!");
	}
}
