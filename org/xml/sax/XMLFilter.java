// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   XMLFilter.java

package org.xml.sax;


// Referenced classes of package org.xml.sax:
//			XMLReader

public interface XMLFilter
	extends XMLReader
{

	public abstract void setParent(XMLReader xmlreader);

	public abstract XMLReader getParent();
}
