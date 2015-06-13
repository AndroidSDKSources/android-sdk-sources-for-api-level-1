// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DeclHandler.java

package org.xml.sax.ext;

import org.xml.sax.SAXException;

public interface DeclHandler
{

	public abstract void elementDecl(String s, String s1)
		throws SAXException;

	public abstract void attributeDecl(String s, String s1, String s2, String s3, String s4)
		throws SAXException;

	public abstract void internalEntityDecl(String s, String s1)
		throws SAXException;

	public abstract void externalEntityDecl(String s, String s1, String s2)
		throws SAXException;
}
