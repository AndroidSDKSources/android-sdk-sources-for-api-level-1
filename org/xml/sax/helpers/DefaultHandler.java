// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultHandler.java

package org.xml.sax.helpers;

import java.io.IOException;
import org.xml.sax.*;

public class DefaultHandler
	implements EntityResolver, DTDHandler, ContentHandler, ErrorHandler
{

	public DefaultHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public InputSource resolveEntity(String publicId, String systemId)
		throws IOException, SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void notationDecl(String name, String publicId, String systemId)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void setDocumentLocator(Locator locator)
	{
		throw new RuntimeException("Stub!");
	}

	public void startDocument()
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endDocument()
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void startPrefixMapping(String prefix, String uri)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endPrefixMapping(String prefix)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endElement(String uri, String localName, String qName)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void characters(char ch[], int start, int length)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void ignorableWhitespace(char ch[], int start, int length)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void processingInstruction(String target, String data)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void skippedEntity(String name)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void warning(SAXParseException e)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void error(SAXParseException e)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void fatalError(SAXParseException e)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}
}
