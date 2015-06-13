// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResourceBundle.java

package java.util;


// Referenced classes of package java.util:
//			MissingResourceException, Locale, Enumeration

public abstract class ResourceBundle
{

	protected ResourceBundle parent;

	public ResourceBundle()
	{
		throw new RuntimeException("Stub!");
	}

	public static final ResourceBundle getBundle(String bundleName)
		throws MissingResourceException
	{
		throw new RuntimeException("Stub!");
	}

	public static final ResourceBundle getBundle(String bundleName, Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public static ResourceBundle getBundle(String bundleName, Locale locale, ClassLoader loader)
		throws MissingResourceException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Enumeration getKeys();

	public Locale getLocale()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getObject(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getString(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public final String[] getStringArray(String key)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract Object handleGetObject(String s);

	protected void setParent(ResourceBundle bundle)
	{
		throw new RuntimeException("Stub!");
	}
}
