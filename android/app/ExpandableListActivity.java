// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ExpandableListActivity.java

package android.app;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

// Referenced classes of package android.app:
//			Activity

public class ExpandableListActivity extends Activity
	implements android.view.View.OnCreateContextMenuListener, android.widget.ExpandableListView.OnChildClickListener, android.widget.ExpandableListView.OnGroupCollapseListener, android.widget.ExpandableListView.OnGroupExpandListener
{

	public ExpandableListActivity()
	{
		throw new RuntimeException("Stub!");
	}

	public void onCreateContextMenu(ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id)
	{
		throw new RuntimeException("Stub!");
	}

	public void onGroupCollapse(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	public void onGroupExpand(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onRestoreInstanceState(Bundle state)
	{
		throw new RuntimeException("Stub!");
	}

	public void onContentChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public void setListAdapter(ExpandableListAdapter adapter)
	{
		throw new RuntimeException("Stub!");
	}

	public ExpandableListView getExpandableListView()
	{
		throw new RuntimeException("Stub!");
	}

	public ExpandableListAdapter getExpandableListAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public long getSelectedId()
	{
		throw new RuntimeException("Stub!");
	}

	public long getSelectedPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelectedGroup(int groupPosition)
	{
		throw new RuntimeException("Stub!");
	}
}
