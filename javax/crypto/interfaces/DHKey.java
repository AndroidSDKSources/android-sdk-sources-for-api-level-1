// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DHKey.java

package javax.crypto.interfaces;

import javax.crypto.spec.DHParameterSpec;

public interface DHKey
{

	public abstract DHParameterSpec getParams();
}
