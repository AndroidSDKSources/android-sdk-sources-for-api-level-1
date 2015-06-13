// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PBEKey.java

package javax.crypto.interfaces;

import javax.crypto.SecretKey;

public interface PBEKey
	extends SecretKey
{

	public static final long serialVersionUID = 0xec279007d7f7c19fL;

	public abstract int getIterationCount();

	public abstract byte[] getSalt();

	public abstract char[] getPassword();
}
