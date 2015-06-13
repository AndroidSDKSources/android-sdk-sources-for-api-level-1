// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Attributes.java

package org.xml.sax;


public interface Attributes
{

	public abstract int getLength();

	public abstract String getURI(int i);

	public abstract String getLocalName(int i);

	public abstract String getQName(int i);

	public abstract String getType(int i);

	public abstract String getValue(int i);

	public abstract int getIndex(String s, String s1);

	public abstract int getIndex(String s);

	public abstract String getType(String s, String s1);

	public abstract String getType(String s);

	public abstract String getValue(String s, String s1);

	public abstract String getValue(String s);
}
