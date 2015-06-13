// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ErrorHandler.java

package org.xml.sax;


// Referenced classes of package org.xml.sax:
//			SAXException, SAXParseException

public interface ErrorHandler
{

	public abstract void warning(SAXParseException saxparseexception)
		throws SAXException;

	public abstract void error(SAXParseException saxparseexception)
		throws SAXException;

	public abstract void fatalError(SAXParseException saxparseexception)
		throws SAXException;
}
