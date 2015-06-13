// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Parser.java

package org.xml.sax;

import java.io.IOException;
import java.util.Locale;

// Referenced classes of package org.xml.sax:
//			SAXException, EntityResolver, DTDHandler, DocumentHandler, 
//			ErrorHandler, InputSource

public interface Parser
{

	public abstract void setLocale(Locale locale)
		throws SAXException;

	public abstract void setEntityResolver(EntityResolver entityresolver);

	public abstract void setDTDHandler(DTDHandler dtdhandler);

	public abstract void setDocumentHandler(DocumentHandler documenthandler);

	public abstract void setErrorHandler(ErrorHandler errorhandler);

	public abstract void parse(InputSource inputsource)
		throws SAXException, IOException;

	public abstract void parse(String s)
		throws SAXException, IOException;
}
