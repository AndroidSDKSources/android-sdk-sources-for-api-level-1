// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HandlerBase.java

package org.xml.sax;


// Referenced classes of package org.xml.sax:
//			EntityResolver, DTDHandler, DocumentHandler, ErrorHandler, 
//			SAXException, InputSource, Locator, AttributeList, 
//			SAXParseException

public class HandlerBase
	implements EntityResolver, DTDHandler, DocumentHandler, ErrorHandler
{

	public HandlerBase()
	{
		throw new RuntimeException("Stub!");
	}

	public InputSource resolveEntity(String publicId, String systemId)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void notationDecl(String name, String publicId, String systemId)
	{
		throw new RuntimeException("Stub!");
	}

	public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
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

	public void startElement(String name, AttributeList attributes)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public void endElement(String name)
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
