// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DSAPrivateKey.java

package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

// Referenced classes of package java.security.interfaces:
//			DSAKey

public interface DSAPrivateKey
	extends DSAKey, PrivateKey
{

	public static final long serialVersionUID = 0x6bebab423b256247L;

	public abstract BigInteger getX();
}
