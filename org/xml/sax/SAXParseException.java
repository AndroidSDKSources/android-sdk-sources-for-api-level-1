// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SAXParseException.java

package org.xml.sax;


// Referenced classes of package org.xml.sax:
//			SAXException, Locator

public class SAXParseException extends SAXException
{

	public SAXParseException(String message, Locator locator)
	{
		throw new RuntimeException("Stub!");
	}

	public SAXParseException(String message, Locator locator, Exception e)
	{
		throw new RuntimeException("Stub!");
	}

	public SAXParseException(String message, String publicId, String systemId, int lineNumber, int columnNumber)
	{
		throw new RuntimeException("Stub!");
	}

	public SAXParseException(String message, String publicId, String systemId, int lineNumber, int columnNumber, Exception e)
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
}
