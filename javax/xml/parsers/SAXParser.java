// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SAXParser.java

package javax.xml.parsers;

import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public abstract class SAXParser
{

	protected SAXParser()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Parser getParser()
		throws SAXException;

	public abstract Object getProperty(String s)
		throws SAXNotRecognizedException, SAXNotSupportedException;

	public abstract XMLReader getXMLReader()
		throws SAXException;

	public abstract boolean isNamespaceAware();

	public abstract boolean isValidating();

	public boolean isXIncludeAware()
		throws UnsupportedOperationException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(File file, HandlerBase handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(File file, DefaultHandler handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(InputStream stream, HandlerBase handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(InputStream stream, HandlerBase handler, String systemId)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(InputStream stream, DefaultHandler handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(InputStream stream, DefaultHandler handler, String systemId)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(String uri, HandlerBase handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(String uri, DefaultHandler handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(InputSource source, HandlerBase handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void parse(InputSource source, DefaultHandler handler)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setProperty(String s, Object obj)
		throws SAXNotRecognizedException, SAXNotSupportedException;
}
