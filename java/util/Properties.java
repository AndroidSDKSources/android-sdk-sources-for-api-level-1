// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Properties.java

package java.util;

import java.io.*;

// Referenced classes of package java.util:
//			Hashtable, InvalidPropertiesFormatException, Enumeration

public class Properties extends Hashtable
{

	protected Properties defaults;

	public Properties()
	{
		throw new RuntimeException("Stub!");
	}

	public Properties(Properties properties)
	{
		throw new RuntimeException("Stub!");
	}

	public String getProperty(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String getProperty(String name, String defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public void list(PrintStream out)
	{
		throw new RuntimeException("Stub!");
	}

	public void list(PrintWriter writer)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void load(InputStream in)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Enumeration propertyNames()
	{
		throw new RuntimeException("Stub!");
	}

	public void save(OutputStream out, String comment)
	{
		throw new RuntimeException("Stub!");
	}

	public Object setProperty(String name, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void store(OutputStream out, String comment)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void loadFromXML(InputStream in)
		throws IOException, InvalidPropertiesFormatException
	{
		throw new RuntimeException("Stub!");
	}

	public void storeToXML(OutputStream os, String comment)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void storeToXML(OutputStream os, String comment, String encoding)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
