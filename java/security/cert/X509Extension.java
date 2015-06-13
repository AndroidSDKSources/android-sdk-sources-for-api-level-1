// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509Extension.java

package java.security.cert;

import java.util.Set;

public interface X509Extension
{

	public abstract Set getCriticalExtensionOIDs();

	public abstract byte[] getExtensionValue(String s);

	public abstract Set getNonCriticalExtensionOIDs();

	public abstract boolean hasUnsupportedCriticalExtension();
}
