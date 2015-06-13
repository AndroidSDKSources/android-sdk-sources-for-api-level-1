// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CursorAdapter.java

package android.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			BaseAdapter, Filterable, Filter, FilterQueryProvider

public abstract class CursorAdapter extends BaseAdapter
	implements Filterable
{

	public CursorAdapter(Context context, Cursor c)
	{
		throw new RuntimeException("Stub!");
	}

	public CursorAdapter(Context context, Cursor c, boolean autoRequery)
	{
		throw new RuntimeException("Stub!");
	}

	protected void init(Context context, Cursor c, boolean autoRequery)
	{
		throw new RuntimeException("Stub!");
	}

	public Cursor getCursor()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getCount()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object getItem(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public final long getItemId(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasStableIds()
	{
		throw new RuntimeException("Stub!");
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public View getDropDownView(int position, View convertView, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract View newView(Context context, Cursor cursor, ViewGroup viewgroup);

	public View newDropDownView(Context context, Cursor cursor, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void bindView(View view, Context context, Cursor cursor);

	public void changeCursor(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence convertToString(Cursor cursor)
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
}
