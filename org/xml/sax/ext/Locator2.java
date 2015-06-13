// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Locator2.java

package org.xml.sax.ext;

import org.xml.sax.Locator;

public interface Locator2
	extends Locator
{

	public abstract String getXMLVersion();

	public abstract String getEncoding();
}
