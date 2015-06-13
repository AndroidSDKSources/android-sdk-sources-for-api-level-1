// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ParserAdapter.java

package org.xml.sax.helpers;

import java.io.IOException;
import org.xml.sax.*;

public class ParserAdapter
	implements XMLReader, DocumentHandler
{

	public ParserAdapter()
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public ParserAdapter(Parser parser)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFeature(String name, boolean value)
		throws SAXNotRecognizedException, SAXNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getFeature(String name)
		throws SAXNotRecognizedException, SAXNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public void setProperty(String name, Object value)
		throws SAXNotRecognizedException, SAXNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public Object getProperty(String name)
		throws SAXNotRecognizedException, SAXNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public void setEntityResolver(EntityResolver resolver)
	{
		throw new RuntimeException("Stub!");
	}

	public EntityResolver getEntityResolver()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDTDHandler(DTDHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public DTDHandler getDTDHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public void setContentHandler(ContentHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public ContentHandler getContentHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public void setErrorHandler(ErrorHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public ErrorHandler getErrorHandler()
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

	public void startElement(String qName, AttributeList qAtts)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endElement(String qName)
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
}
