// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DocumentBuilder.java

package javax.xml.parsers;

import java.io.*;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.*;

public abstract class DocumentBuilder
{

	protected DocumentBuilder()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract DOMImplementation getDOMImplementation();

	public abstract boolean isNamespaceAware();

	public abstract boolean isValidating();

	public boolean isXIncludeAware()
		throws UnsupportedOperationException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Document newDocument();

	public Document parse(File file)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Document parse(InputStream stream)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Document parse(InputStream stream, String systemId)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Document parse(String uri)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Document parse(InputSource inputsource)
		throws SAXException, IOException;

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setEntityResolver(EntityResolver entityresolver);

	public abstract void setErrorHandler(ErrorHandler errorhandler);
}
