// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ListResourceBundle.java

package java.util;


// Referenced classes of package java.util:
//			ResourceBundle, Enumeration

public abstract class ListResourceBundle extends ResourceBundle
{

	public ListResourceBundle()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract Object[][] getContents();

	public Enumeration getKeys()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object handleGetObject(String key)
	{
		throw new RuntimeException("Stub!");
	}
}
