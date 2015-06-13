// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResourceCursorAdapter.java

package android.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			CursorAdapter

public abstract class ResourceCursorAdapter extends CursorAdapter
{

	public ResourceCursorAdapter(Context context, int layout, Cursor c)
	{
		super((Context)null, (Cursor)null, false);
		throw new RuntimeException("Stub!");
	}

	public View newView(Context context, Cursor cursor, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public View newDropDownView(Context context, Cursor cursor, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDropDownViewResource(int dropDownLayout)
	{
		throw new RuntimeException("Stub!");
	}
}
