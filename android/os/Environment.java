// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Environment.java

package android.os;

import java.io.File;

public class Environment
{

	public static final String MEDIA_REMOVED = "removed";
	public static final String MEDIA_UNMOUNTED = "unmounted";
	public static final String MEDIA_MOUNTED = "mounted";
	public static final String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";
	public static final String MEDIA_SHARED = "shared";
	public static final String MEDIA_BAD_REMOVAL = "bad_removal";
	public static final String MEDIA_UNMOUNTABLE = "unmountable";

	public Environment()
	{
		throw new RuntimeException("Stub!");
	}

	public static File getRootDirectory()
	{
		throw new RuntimeException("Stub!");
	}

	public static File getDataDirectory()
	{
		throw new RuntimeException("Stub!");
	}

	public static File getExternalStorageDirectory()
	{
		throw new RuntimeException("Stub!");
	}

	public static File getDownloadCacheDirectory()
	{
		throw new RuntimeException("Stub!");
	}

	public static String getExternalStorageState()
	{
		throw new RuntimeException("Stub!");
	}
}
