// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BaseAdapter.java

package android.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			ListAdapter, SpinnerAdapter

public abstract class BaseAdapter
	implements ListAdapter, SpinnerAdapter
{

	public BaseAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasStableIds()
	{
		throw new RuntimeException("Stub!");
	}

	public void registerDataSetObserver(DataSetObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterDataSetObserver(DataSetObserver observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyDataSetChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyDataSetInvalidated()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean areAllItemsEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isEnabled(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public View getDropDownView(int position, View convertView, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public int getItemViewType(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public int getViewTypeCount()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty()
	{
		throw new RuntimeException("Stub!");
	}
}
