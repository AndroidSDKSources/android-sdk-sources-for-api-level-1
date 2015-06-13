// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DocumentHandler.java

package org.xml.sax;


// Referenced classes of package org.xml.sax:
//			SAXException, Locator, AttributeList

public interface DocumentHandler
{

	public abstract void setDocumentLocator(Locator locator);

	public abstract void startDocument()
		throws SAXException;

	public abstract void endDocument()
		throws SAXException;

	public abstract void startElement(String s, AttributeList attributelist)
		throws SAXException;

	public abstract void endElement(String s)
		throws SAXException;

	public abstract void characters(char ac[], int i, int j)
		throws SAXException;

	public abstract void ignorableWhitespace(char ac[], int i, int j)
		throws SAXException;

	public abstract void processingInstruction(String s, String s1)
		throws SAXException;
}
