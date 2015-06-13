// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Plugin.java

package android.webkit;

import android.content.Context;

public class Plugin
{
	public static interface PreferencesClickHandler
	{

		public abstract void handleClickEvent(Context context);
	}


	public Plugin(String name, String path, String fileName, String description)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getPath()
	{
		throw new RuntimeException("Stub!");
	}

	public String getFileName()
	{
		throw new RuntimeException("Stub!");
	}

	public String getDescription()
	{
		throw new RuntimeException("Stub!");
	}

	public void setName(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPath(String path)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFileName(String fileName)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDescription(String description)
	{
		throw new RuntimeException("Stub!");
	}

	public void setClickHandler(PreferencesClickHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public void dispatchClickEvent(Context context)
	{
		throw new RuntimeException("Stub!");
	}
}
