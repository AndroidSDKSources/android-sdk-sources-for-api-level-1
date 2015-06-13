// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DSAKeyPairGenerator.java

package java.security.interfaces;

import java.security.InvalidParameterException;
import java.security.SecureRandom;

// Referenced classes of package java.security.interfaces:
//			DSAParams

public interface DSAKeyPairGenerator
{

	public abstract void initialize(DSAParams dsaparams, SecureRandom securerandom)
		throws InvalidParameterException;

	public abstract void initialize(int i, boolean flag, SecureRandom securerandom)
		throws InvalidParameterException;
}
