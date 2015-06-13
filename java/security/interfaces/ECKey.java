// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ECKey.java

package java.security.interfaces;

import java.security.spec.ECParameterSpec;

public interface ECKey
{

	public abstract ECParameterSpec getParams();
}
