// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Driver.java

package org.xmlpull.v1.sax2;

import java.io.IOException;
import org.xml.sax.*;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class Driver
	implements Locator, XMLReader, Attributes
{

	protected static final String DECLARATION_HANDLER_PROPERTY = "http://xml.org/sax/properties/declaration-handler";
	protected static final String LEXICAL_HANDLER_PROPERTY = "http://xml.org/sax/properties/lexical-handler";
	protected static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
	protected static final String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
	protected static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
	protected static final String APACHE_SCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
	protected static final String APACHE_DYNAMIC_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/dynamic";
	protected ContentHandler contentHandler;
	protected ErrorHandler errorHandler;
	protected String systemId;
	protected XmlPullParser pp;

	public Driver()
		throws XmlPullParserException
	{
		throw new RuntimeException("Stub!");
	}

	public Driver(XmlPullParser pp)
		throws XmlPullParserException
	{
		throw new RuntimeException("Stub!");
	}

	public int getLength()
	{
		throw new RuntimeException("Stub!");
	}

	public String getURI(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public String getLocalName(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public String getQName(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public String getType(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public String getValue(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public int getIndex(String uri, String localName)
	{
		throw new RuntimeException("Stub!");
	}

	public int getIndex(String qName)
	{
		throw new RuntimeException("Stub!");
	}

	public String getType(String uri, String localName)
	{
		throw new RuntimeException("Stub!");
	}

	public String getType(String qName)
	{
		throw new RuntimeException("Stub!");
	}

	public String getValue(String uri, String localName)
	{
		throw new RuntimeException("Stub!");
	}

	public String getValue(String qName)
	{
		throw new RuntimeException("Stub!");
	}

	public String getPublicId()
	{
		throw new RuntimeException("Stub!");
	}

	public String getSystemId()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineNumber()
	{
		throw new RuntimeException("Stub!");
	}

	public int getColumnNumber()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getFeature(String name)
		throws SAXNotRecognizedException, SAXNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public void setFeature(String name, boolean value)
		throws SAXNotRecognizedException, SAXNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public Object getProperty(String name)
		throws SAXNotRecognizedException, SAXNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public void setProperty(String name, Object value)
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

	public void parse(InputSource source)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(String systemId)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parseSubTree(XmlPullParser pp)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void startElement(String namespace, String localName, String qName)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}
}
