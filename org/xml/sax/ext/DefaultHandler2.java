// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DefaultHandler2.java

package org.xml.sax.ext;

import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package org.xml.sax.ext:
//			LexicalHandler, DeclHandler, EntityResolver2

public class DefaultHandler2 extends DefaultHandler
	implements LexicalHandler, DeclHandler, EntityResolver2
{

	public DefaultHandler2()
	{
		throw new RuntimeException("Stub!");
	}

	public void startCDATA()
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endCDATA()
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void startDTD(String name, String publicId, String systemId)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endDTD()
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void startEntity(String name)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endEntity(String name)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void comment(char ch[], int start, int length)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void attributeDecl(String eName, String aName, String type, String mode, String value)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void elementDecl(String name, String model)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void externalEntityDecl(String name, String publicId, String systemId)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void internalEntityDecl(String name, String value)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public InputSource getExternalSubset(String name, String baseURI)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public InputSource resolveEntity(String name, String publicId, String baseURI, String systemId)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public InputSource resolveEntity(String publicId, String systemId)
		throws SAXException, IOException
	{
		throw new RuntimeException("Stub!");
	}
}
