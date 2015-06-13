// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ECPublicKey.java

package java.security.interfaces;

import java.security.PublicKey;
import java.security.spec.ECPoint;

// Referenced classes of package java.security.interfaces:
//			ECKey

public interface ECPublicKey
	extends PublicKey, ECKey
{

	public static final long serialVersionUID = 0xd1fecb679990cc46L;

	public abstract ECPoint getW();
}
