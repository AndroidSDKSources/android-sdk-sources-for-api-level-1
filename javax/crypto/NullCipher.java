// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NullCipher.java

package javax.crypto;

import java.security.Provider;

// Referenced classes of package javax.crypto:
//			Cipher, CipherSpi

public class NullCipher extends Cipher
{

	public NullCipher()
	{
		super((CipherSpi)null, (Provider)null, (String)null);
		throw new RuntimeException("Stub!");
	}
}
