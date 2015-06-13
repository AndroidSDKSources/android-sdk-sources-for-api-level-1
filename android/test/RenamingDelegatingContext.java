// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RenamingDelegatingContext.java

package android.test;

import android.content.*;
import android.database.sqlite.SQLiteDatabase;
import java.io.*;

public class RenamingDelegatingContext extends ContextWrapper
{

	public RenamingDelegatingContext(Context context, String filePrefix)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public RenamingDelegatingContext(Context context, Context fileContext, String filePrefix)
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public static ContentProvider providerWithRenamedContext(Class contentProvider, Context c, String filePrefix)
		throws IllegalAccessException, InstantiationException
	{
		throw new RuntimeException("Stub!");
	}

	public static ContentProvider providerWithRenamedContext(Class contentProvider, Context c, String filePrefix, boolean allowAccessToExistingFilesAndDbs)
		throws IllegalAccessException, InstantiationException
	{
		throw new RuntimeException("Stub!");
	}

	public void makeExistingFilesAndDbsAccessible()
	{
		throw new RuntimeException("Stub!");
	}

	public String getDatabasePrefix()
	{
		throw new RuntimeException("Stub!");
	}

	public SQLiteDatabase openOrCreateDatabase(String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean deleteDatabase(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] databaseList()
	{
		throw new RuntimeException("Stub!");
	}

	public FileInputStream openFileInput(String name)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public FileOutputStream openFileOutput(String name, int mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public File getFileStreamPath(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean deleteFile(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] fileList()
	{
		throw new RuntimeException("Stub!");
	}
}
