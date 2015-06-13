// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   XmlPullParserException.java

package org.xmlpull.v1;


// Referenced classes of package org.xmlpull.v1:
//			XmlPullParser

public class XmlPullParserException extends Exception
{

	protected Throwable detail;
	protected int row;
	protected int column;

	public XmlPullParserException(String s)
	{
		throw new RuntimeException("Stub!");
	}

	public XmlPullParserException(String msg, XmlPullParser parser, Throwable chain)
	{
		throw new RuntimeException("Stub!");
	}

	public Throwable getDetail()
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

	public void printStackTrace()
	{
		throw new RuntimeException("Stub!");
	}
}
