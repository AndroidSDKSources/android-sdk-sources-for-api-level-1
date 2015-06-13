// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AttributeList.java

package org.xml.sax;


public interface AttributeList
{

	public abstract int getLength();

	public abstract String getName(int i);

	public abstract String getType(int i);

	public abstract String getValue(int i);

	public abstract String getType(String s);

	public abstract String getValue(String s);
}
