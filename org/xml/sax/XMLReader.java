// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   XMLReader.java

package org.xml.sax;

import java.io.IOException;

// Referenced classes of package org.xml.sax:
//			SAXNotRecognizedException, SAXNotSupportedException, SAXException, EntityResolver, 
//			DTDHandler, ContentHandler, ErrorHandler, InputSource

public interface XMLReader
{

	public abstract boolean getFeature(String s)
		throws SAXNotRecognizedException, SAXNotSupportedException;

	public abstract void setFeature(String s, boolean flag)
		throws SAXNotRecognizedException, SAXNotSupportedException;

	public abstract Object getProperty(String s)
		throws SAXNotRecognizedException, SAXNotSupportedException;

	public abstract void setProperty(String s, Object obj)
		throws SAXNotRecognizedException, SAXNotSupportedException;

	public abstract void setEntityResolver(EntityResolver entityresolver);

	public abstract EntityResolver getEntityResolver();

	public abstract void setDTDHandler(DTDHandler dtdhandler);

	public abstract DTDHandler getDTDHandler();

	public abstract void setContentHandler(ContentHandler contenthandler);

	public abstract ContentHandler getContentHandler();

	public abstract void setErrorHandler(ErrorHandler errorhandler);

	public abstract ErrorHandler getErrorHandler();

	public abstract void parse(InputSource inputsource)
		throws IOException, SAXException;

	public abstract void parse(String s)
		throws IOException, SAXException;
}
