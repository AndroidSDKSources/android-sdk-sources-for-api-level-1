// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExpandableListAdapter.java

package android.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public interface ExpandableListAdapter
{

	public abstract void registerDataSetObserver(DataSetObserver datasetobserver);

	public abstract void unregisterDataSetObserver(DataSetObserver datasetobserver);

	public abstract int getGroupCount();

	public abstract int getChildrenCount(int i);

	public abstract Object getGroup(int i);

	public abstract Object getChild(int i, int j);

	public abstract long getGroupId(int i);

	public abstract long getChildId(int i, int j);

	public abstract boolean hasStableIds();

	public abstract View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup);

	public abstract View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup);

	public abstract boolean isChildSelectable(int i, int j);

	public abstract boolean areAllItemsEnabled();

	public abstract boolean isEmpty();

	public abstract void onGroupExpanded(int i);

	public abstract void onGroupCollapsed(int i);

	public abstract long getCombinedChildId(long l, long l1);

	public abstract long getCombinedGroupId(long l);
}
