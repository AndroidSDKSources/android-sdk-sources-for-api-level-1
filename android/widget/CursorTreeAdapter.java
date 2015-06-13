// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CursorTreeAdapter.java

package android.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			BaseExpandableListAdapter, Filterable, Filter, FilterQueryProvider

public abstract class CursorTreeAdapter extends BaseExpandableListAdapter
	implements Filterable
{

	public CursorTreeAdapter(Cursor cursor, Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public CursorTreeAdapter(Cursor cursor, Context context, boolean autoRequery)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract Cursor getChildrenCursor(Cursor cursor);

	public void setGroupCursor(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public void setChildrenCursor(int groupPosition, Cursor childrenCursor)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor getChild(int groupPosition, int childPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public long getChildId(int groupPosition, int childPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public int getChildrenCount(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor getGroup(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public int getGroupCount()
	{
		throw new RuntimeException("Stub!");
	}

	public long getGroupId(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract View newGroupView(Context context, Cursor cursor, boolean flag, ViewGroup viewgroup);

	protected abstract void bindGroupView(View view, Context context, Cursor cursor, boolean flag);

	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract View newChildView(Context context, Cursor cursor, boolean flag, ViewGroup viewgroup);

	protected abstract void bindChildView(View view, Context context, Cursor cursor, boolean flag);

	public boolean isChildSelectable(int groupPosition, int childPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasStableIds()
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyDataSetChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyDataSetChanged(boolean releaseCursors)
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyDataSetInvalidated()
	{
		throw new RuntimeException("Stub!");
	}

	public void onGroupCollapsed(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public String convertToString(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor runQueryOnBackgroundThread(CharSequence constraint)
	{
		throw new RuntimeException("Stub!");
	}

	public Filter getFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public FilterQueryProvider getFilterQueryProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider)
	{
		throw new RuntimeException("Stub!");
	}

	public void changeCursor(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor getCursor()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Object getChild(int x0, int x1)
	{
		return getChild(x0, x1);
	}

	public volatile Object getGroup(int x0)
	{
		return getGroup(x0);
	}
}
