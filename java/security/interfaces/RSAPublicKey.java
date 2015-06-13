// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RSAPublicKey.java

package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

// Referenced classes of package java.security.interfaces:
//			RSAKey

public interface RSAPublicKey
	extends PublicKey, RSAKey
{

	public static final long serialVersionUID = 0x86e1ecedeceab676L;

	public abstract BigInteger getPublicExponent();
}
