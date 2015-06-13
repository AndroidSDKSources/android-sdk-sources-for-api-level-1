// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResourceCursorTreeAdapter.java

package android.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			CursorTreeAdapter

public abstract class ResourceCursorTreeAdapter extends CursorTreeAdapter
{

	public ResourceCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, int childLayout, int lastChildLayout)
	{
		super((Cursor)null, (Context)null, false);
		throw new RuntimeException("Stub!");
	}

	public ResourceCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, int childLayout)
	{
		super((Cursor)null, (Context)null, false);
		throw new RuntimeException("Stub!");
	}

	public ResourceCursorTreeAdapter(Context context, Cursor cursor, int groupLayout, int childLayout)
	{
		super((Cursor)null, (Context)null, false);
		throw new RuntimeException("Stub!");
	}

	public View newChildView(Context context, Cursor cursor, boolean isLastChild, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public View newGroupView(Context context, Cursor cursor, boolean isExpanded, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}
}
