// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DSAPublicKey.java

package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

// Referenced classes of package java.security.interfaces:
//			DSAKey

public interface DSAPublicKey
	extends DSAKey, PublicKey
{

	public static final long serialVersionUID = 0x1121eb28ab28c7fcL;

	public abstract BigInteger getY();
}
