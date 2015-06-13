// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SAXParserFactory.java

package javax.xml.parsers;

import org.xml.sax.*;

// Referenced classes of package javax.xml.parsers:
//			ParserConfigurationException, FactoryConfigurationError, SAXParser

public abstract class SAXParserFactory
{

	protected SAXParserFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean getFeature(String s)
		throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;

	public boolean isNamespaceAware()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isValidating()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isXIncludeAware()
	{
		throw new RuntimeException("Stub!");
	}

	public static SAXParserFactory newInstance()
		throws FactoryConfigurationError
	{
		throw new RuntimeException("Stub!");
	}

	public abstract SAXParser newSAXParser()
		throws ParserConfigurationException, SAXException;

	public abstract void setFeature(String s, boolean flag)
		throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;

	public void setNamespaceAware(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setValidating(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setXIncludeAware(boolean value)
	{
		throw new RuntimeException("Stub!");
	}
}
