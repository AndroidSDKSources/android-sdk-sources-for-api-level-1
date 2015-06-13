// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DTDHandler.java

package org.xml.sax;


// Referenced classes of package org.xml.sax:
//			SAXException

public interface DTDHandler
{

	public abstract void notationDecl(String s, String s1, String s2)
		throws SAXException;

	public abstract void unparsedEntityDecl(String s, String s1, String s2, String s3)
		throws SAXException;
}
