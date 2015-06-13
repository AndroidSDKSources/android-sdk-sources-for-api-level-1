// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Attributes2.java

package org.xml.sax.ext;

import org.xml.sax.Attributes;

public interface Attributes2
	extends Attributes
{

	public abstract boolean isDeclared(int i);

	public abstract boolean isDeclared(String s);

	public abstract boolean isDeclared(String s, String s1);

	public abstract boolean isSpecified(int i);

	public abstract boolean isSpecified(String s, String s1);

	public abstract boolean isSpecified(String s);
}
