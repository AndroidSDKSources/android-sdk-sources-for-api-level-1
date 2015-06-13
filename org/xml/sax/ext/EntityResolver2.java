// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EntityResolver2.java

package org.xml.sax.ext;

import java.io.IOException;
import org.xml.sax.*;

public interface EntityResolver2
	extends EntityResolver
{

	public abstract InputSource getExternalSubset(String s, String s1)
		throws SAXException, IOException;

	public abstract InputSource resolveEntity(String s, String s1, String s2, String s3)
		throws SAXException, IOException;
}
