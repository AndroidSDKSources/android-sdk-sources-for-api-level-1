// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LexicalHandler.java

package org.xml.sax.ext;

import org.xml.sax.SAXException;

public interface LexicalHandler
{

	public abstract void startDTD(String s, String s1, String s2)
		throws SAXException;

	public abstract void endDTD()
		throws SAXException;

	public abstract void startEntity(String s)
		throws SAXException;

	public abstract void endEntity(String s)
		throws SAXException;

	public abstract void startCDATA()
		throws SAXException;

	public abstract void endCDATA()
		throws SAXException;

	public abstract void comment(char ac[], int i, int j)
		throws SAXException;
}
