// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RSAPrivateKey.java

package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

// Referenced classes of package java.security.interfaces:
//			RSAKey

public interface RSAPrivateKey
	extends PrivateKey, RSAKey
{

	public static final long serialVersionUID = 0x47fc70b7a8c2364eL;

	public abstract BigInteger getPrivateExponent();
}
