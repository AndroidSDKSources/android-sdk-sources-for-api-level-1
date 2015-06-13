// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DHPrivateKey.java

package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

// Referenced classes of package javax.crypto.interfaces:
//			DHKey

public interface DHPrivateKey
	extends DHKey, PrivateKey
{

	public static final long serialVersionUID = 0x1eb1dc4c8e677e09L;

	public abstract BigInteger getX();
}
