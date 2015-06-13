// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExpandableListView.java

package android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;

// Referenced classes of package android.widget:
//			ListView, ListAdapter, AdapterView, ExpandableListAdapter, 
//			Adapter

public class ExpandableListView extends ListView
{
	public static class ExpandableListContextMenuInfo
		implements android.view.ContextMenu.ContextMenuInfo
	{

		public View targetView;
		public long packedPosition;
		public long id;

		public ExpandableListContextMenuInfo(View targetView, long packedPosition, long id)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface OnChildClickListener
	{

		public abstract boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l);
	}

	public static interface OnGroupClickListener
	{

		public abstract boolean onGroupClick(ExpandableListView expandablelistview, View view, int i, long l);
	}

	public static interface OnGroupExpandListener
	{

		public abstract void onGroupExpand(int i);
	}

	public static interface OnGroupCollapseListener
	{

		public abstract void onGroupCollapse(int i);
	}


	public static final int PACKED_POSITION_TYPE_GROUP = 0;
	public static final int PACKED_POSITION_TYPE_CHILD = 1;
	public static final int PACKED_POSITION_TYPE_NULL = 2;
	public static final long PACKED_POSITION_VALUE_NULL = 0xffffffffL;
	public static final int CHILD_INDICATOR_INHERIT = -1;

	public ExpandableListView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ExpandableListView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ExpandableListView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	protected void dispatchDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public void setChildDivider(Drawable childDivider)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAdapter(ListAdapter adapter)
	{
		throw new RuntimeException("Stub!");
	}

	public ListAdapter getAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnItemClickListener(AdapterView.OnItemClickListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAdapter(ExpandableListAdapter adapter)
	{
		throw new RuntimeException("Stub!");
	}

	public ExpandableListAdapter getExpandableListAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performItemClick(View v, int position, long id)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean expandGroup(int groupPos)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean collapseGroup(int groupPos)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnGroupCollapseListener(OnGroupCollapseListener onGroupCollapseListener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnGroupExpandListener(OnGroupExpandListener onGroupExpandListener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnGroupClickListener(OnGroupClickListener onGroupClickListener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnChildClickListener(OnChildClickListener onChildClickListener)
	{
		throw new RuntimeException("Stub!");
	}

	public long getExpandableListPosition(int flatListPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public int getFlatListPosition(long packedPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public long getSelectedPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public long getSelectedId()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelectedGroup(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isGroupExpanded(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getPackedPositionType(long packedPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getPackedPositionGroup(long packedPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getPackedPositionChild(long packedPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public static long getPackedPositionForChild(int groupPosition, int childPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public static long getPackedPositionForGroup(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public void setChildIndicator(Drawable childIndicator)
	{
		throw new RuntimeException("Stub!");
	}

	public void setChildIndicatorBounds(int left, int right)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGroupIndicator(Drawable groupIndicator)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIndicatorBounds(int left, int right)
	{
		throw new RuntimeException("Stub!");
	}

	public Parcelable onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	public void onRestoreInstanceState(Parcelable state)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile void setAdapter(Adapter x0)
	{
		setAdapter((ListAdapter)x0);
	}

	public volatile Adapter getAdapter()
	{
		return getAdapter();
	}
}
