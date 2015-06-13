// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Locator.java

package org.xml.sax;


public interface Locator
{

	public abstract String getPublicId();

	public abstract String getSystemId();

	public abstract int getLineNumber();

	public abstract int getColumnNumber();
}
