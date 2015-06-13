// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   XmlSerializer.java

package org.xmlpull.v1;

import java.io.*;

public interface XmlSerializer
{

	public abstract void setFeature(String s, boolean flag)
		throws IllegalArgumentException, IllegalStateException;

	public abstract boolean getFeature(String s);

	public abstract void setProperty(String s, Object obj)
		throws IllegalArgumentException, IllegalStateException;

	public abstract Object getProperty(String s);

	public abstract void setOutput(OutputStream outputstream, String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void setOutput(Writer writer)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void startDocument(String s, Boolean boolean1)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void endDocument()
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void setPrefix(String s, String s1)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract String getPrefix(String s, boolean flag)
		throws IllegalArgumentException;

	public abstract int getDepth();

	public abstract String getNamespace();

	public abstract String getName();

	public abstract XmlSerializer startTag(String s, String s1)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract XmlSerializer attribute(String s, String s1, String s2)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract XmlSerializer endTag(String s, String s1)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract XmlSerializer text(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract XmlSerializer text(char ac[], int i, int j)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void cdsect(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void entityRef(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void processingInstruction(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void comment(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void docdecl(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void ignorableWhitespace(String s)
		throws IOException, IllegalArgumentException, IllegalStateException;

	public abstract void flush()
		throws IOException;
}
