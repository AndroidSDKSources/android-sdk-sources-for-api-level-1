// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DHPublicKey.java

package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

// Referenced classes of package javax.crypto.interfaces:
//			DHKey

public interface DHPublicKey
	extends DHKey, PublicKey
{

	public static final long serialVersionUID = 0xa4043eed23df4de7L;

	public abstract BigInteger getY();
}
