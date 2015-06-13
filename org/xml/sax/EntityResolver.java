// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EntityResolver.java

package org.xml.sax;

import java.io.IOException;

// Referenced classes of package org.xml.sax:
//			SAXException, InputSource

public interface EntityResolver
{

	public abstract InputSource resolveEntity(String s, String s1)
		throws SAXException, IOException;
}
