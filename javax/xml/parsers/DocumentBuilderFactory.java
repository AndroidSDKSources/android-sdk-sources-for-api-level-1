// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DocumentBuilderFactory.java

package javax.xml.parsers;


// Referenced classes of package javax.xml.parsers:
//			ParserConfigurationException, FactoryConfigurationError, DocumentBuilder

public abstract class DocumentBuilderFactory
{

	protected DocumentBuilderFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Object getAttribute(String s)
		throws IllegalArgumentException;

	public abstract boolean getFeature(String s)
		throws ParserConfigurationException;

	public boolean isCoalescing()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isExpandEntityReferences()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isIgnoringComments()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isIgnoringElementContentWhitespace()
	{
		throw new RuntimeException("Stub!");
	}

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

	public abstract DocumentBuilder newDocumentBuilder()
		throws ParserConfigurationException;

	public static DocumentBuilderFactory newInstance()
		throws FactoryConfigurationError
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setAttribute(String s, Object obj)
		throws IllegalArgumentException;

	public void setCoalescing(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setExpandEntityReferences(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setFeature(String s, boolean flag)
		throws ParserConfigurationException;

	public void setIgnoringComments(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIgnoringElementContentWhitespace(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

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
