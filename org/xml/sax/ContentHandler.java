// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentHandler.java

package org.xml.sax;


// Referenced classes of package org.xml.sax:
//			SAXException, Locator, Attributes

public interface ContentHandler
{

	public abstract void setDocumentLocator(Locator locator);

	public abstract void startDocument()
		throws SAXException;

	public abstract void endDocument()
		throws SAXException;

	public abstract void startPrefixMapping(String s, String s1)
		throws SAXException;

	public abstract void endPrefixMapping(String s)
		throws SAXException;

	public abstract void startElement(String s, String s1, String s2, Attributes attributes)
		throws SAXException;

	public abstract void endElement(String s, String s1, String s2)
		throws SAXException;

	public abstract void characters(char ac[], int i, int j)
		throws SAXException;

	public abstract void ignorableWhitespace(char ac[], int i, int j)
		throws SAXException;

	public abstract void processingInstruction(String s, String s1)
		throws SAXException;

	public abstract void skippedEntity(String s)
		throws SAXException;
}
