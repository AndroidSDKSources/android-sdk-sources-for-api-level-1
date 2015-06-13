// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MockContentResolver.java

package android.test.mock;

import android.content.*;
import android.database.ContentObserver;
import android.net.Uri;

public class MockContentResolver extends ContentResolver
{

	public MockContentResolver()
	{
		super((Context)null);
		throw new RuntimeException("Stub!");
	}

	public void addProvider(String name, ContentProvider provider)
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyChange(Uri uri, ContentObserver observer, boolean syncToNetwork)
	{
		throw new RuntimeException("Stub!");
	}
}
