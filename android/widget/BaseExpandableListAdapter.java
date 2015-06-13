// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BaseExpandableListAdapter.java

package android.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.widget:
//			ExpandableListAdapter

public abstract class BaseExpandableListAdapter
	implements ExpandableListAdapter
{

	public BaseExpandableListAdapter()
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

	public void notifyDataSetInvalidated()
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyDataSetChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean areAllItemsEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void onGroupCollapsed(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public void onGroupExpanded(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public long getCombinedChildId(long groupId, long childId)
	{
		throw new RuntimeException("Stub!");
	}

	public long getCombinedGroupId(long groupId)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty()
	{
		throw new RuntimeException("Stub!");
	}
}
