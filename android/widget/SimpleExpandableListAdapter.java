// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SimpleExpandableListAdapter.java

package android.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package android.widget:
//			BaseExpandableListAdapter

public class SimpleExpandableListAdapter extends BaseExpandableListAdapter
{

	public SimpleExpandableListAdapter(Context context, List groupData, int groupLayout, String groupFrom[], int groupTo[], List childData, int childLayout, 
			String childFrom[], int childTo[])
	{
		throw new RuntimeException("Stub!");
	}

	public SimpleExpandableListAdapter(Context context, List groupData, int expandedGroupLayout, int collapsedGroupLayout, String groupFrom[], int groupTo[], List childData, 
			int childLayout, String childFrom[], int childTo[])
	{
		throw new RuntimeException("Stub!");
	}

	public SimpleExpandableListAdapter(Context context, List groupData, int expandedGroupLayout, int collapsedGroupLayout, String groupFrom[], int groupTo[], List childData, 
			int childLayout, int lastChildLayout, String childFrom[], int childTo[])
	{
		throw new RuntimeException("Stub!");
	}

	public Object getChild(int groupPosition, int childPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public long getChildId(int groupPosition, int childPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public View newChildView(boolean isLastChild, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public int getChildrenCount(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getGroup(int groupPosition)
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

	public View newGroupView(boolean isExpanded, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isChildSelectable(int groupPosition, int childPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasStableIds()
	{
		throw new RuntimeException("Stub!");
	}
}
