// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DSAParams.java

package java.security.interfaces;

import java.math.BigInteger;

public interface DSAParams
{

	public abstract BigInteger getG();

	public abstract BigInteger getP();

	public abstract BigInteger getQ();
}
