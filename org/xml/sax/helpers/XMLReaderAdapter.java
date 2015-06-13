// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   XMLReaderAdapter.java

package org.xml.sax.helpers;

import java.io.IOException;
import java.util.Locale;
import org.xml.sax.*;

public class XMLReaderAdapter
	implements Parser, ContentHandler
{

	public XMLReaderAdapter()
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public XMLReaderAdapter(XMLReader xmlReader)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLocale(Locale locale)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntityResolver(EntityResolver resolver)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDTDHandler(DTDHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDocumentHandler(DocumentHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public void setErrorHandler(ErrorHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(String systemId)
		throws IOException, SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(InputSource input)
		throws IOException, SAXException
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
	{
		throw new RuntimeException("Stub!");
	}

	public void endPrefixMapping(String prefix)
	{
		throw new RuntimeException("Stub!");
	}

	public void startElement(String uri, String localName, String qName, Attributes atts)
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
}
