// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ECPrivateKey.java

package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

// Referenced classes of package java.security.interfaces:
//			ECKey

public interface ECPrivateKey
	extends PrivateKey, ECKey
{

	public static final long serialVersionUID = 0x926a5e9fa2435b20L;

	public abstract BigInteger getS();
}
