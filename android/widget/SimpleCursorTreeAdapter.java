// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SimpleCursorTreeAdapter.java

package android.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;

// Referenced classes of package android.widget:
//			ResourceCursorTreeAdapter, ImageView

public abstract class SimpleCursorTreeAdapter extends ResourceCursorTreeAdapter
{

	public SimpleCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, String groupFrom[], int groupTo[], int childLayout, 
			int lastChildLayout, String childFrom[], int childTo[])
	{
		super((Context)null, (Cursor)null, 0, 0);
		throw new RuntimeException("Stub!");
	}

	public SimpleCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, String groupFrom[], int groupTo[], int childLayout, 
			String childFrom[], int childTo[])
	{
		super((Context)null, (Cursor)null, 0, 0);
		throw new RuntimeException("Stub!");
	}

	public SimpleCursorTreeAdapter(Context context, Cursor cursor, int groupLayout, String groupFrom[], int groupTo[], int childLayout, String childFrom[], 
			int childTo[])
	{
		super((Context)null, (Cursor)null, 0, 0);
		throw new RuntimeException("Stub!");
	}

	protected void bindChildView(View view, Context context, Cursor cursor, boolean isLastChild)
	{
		throw new RuntimeException("Stub!");
	}

	protected void bindGroupView(View view, Context context, Cursor cursor, boolean isExpanded)
	{
		throw new RuntimeException("Stub!");
	}

	protected void setViewImage(ImageView v, String value)
	{
		throw new RuntimeException("Stub!");
	}
}
