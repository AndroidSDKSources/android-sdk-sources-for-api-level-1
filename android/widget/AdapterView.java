// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AdapterView.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.*;

// Referenced classes of package android.widget:
//			Adapter

public abstract class AdapterView extends ViewGroup
{
	public static class AdapterContextMenuInfo
		implements android.view.ContextMenu.ContextMenuInfo
	{

		public View targetView;
		public int position;
		public long id;

		public AdapterContextMenuInfo(View targetView, int position, long id)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface OnItemSelectedListener
	{

		public abstract void onItemSelected(AdapterView adapterview, View view, int i, long l);

		public abstract void onNothingSelected(AdapterView adapterview);
	}

	public static interface OnItemLongClickListener
	{

		public abstract boolean onItemLongClick(AdapterView adapterview, View view, int i, long l);
	}

	public static interface OnItemClickListener
	{

		public abstract void onItemClick(AdapterView adapterview, View view, int i, long l);
	}


	public static final int ITEM_VIEW_TYPE_IGNORE = -1;
	public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
	public static final int INVALID_POSITION = -1;
	public static final long INVALID_ROW_ID = 0x8000000000000000L;

	public AdapterView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AdapterView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AdapterView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setOnItemClickListener(OnItemClickListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public final OnItemClickListener getOnItemClickListener()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performItemClick(View view, int position, long id)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnItemLongClickListener(OnItemLongClickListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public final OnItemLongClickListener getOnItemLongClickListener()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnItemSelectedListener(OnItemSelectedListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public final OnItemSelectedListener getOnItemSelectedListener()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Adapter getAdapter();

	public abstract void setAdapter(Adapter adapter);

	public void addView(View child)
	{
		throw new RuntimeException("Stub!");
	}

	public void addView(View child, int index)
	{
		throw new RuntimeException("Stub!");
	}

	public void addView(View child, android.view.ViewGroup.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public void addView(View child, int index, android.view.ViewGroup.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeView(View child)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeViewAt(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeAllViews()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onLayout(boolean changed, int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSelectedItemPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public long getSelectedItemId()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract View getSelectedView();

	public Object getSelectedItem()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCount()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPositionForView(View view)
	{
		throw new RuntimeException("Stub!");
	}

	public int getFirstVisiblePosition()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLastVisiblePosition()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setSelection(int i);

	public void setEmptyView(View emptyView)
	{
		throw new RuntimeException("Stub!");
	}

	public View getEmptyView()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFocusable(boolean focusable)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFocusableInTouchMode(boolean focusable)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getItemAtPosition(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public long getItemIdAtPosition(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnClickListener(android.view.View.OnClickListener l)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchSaveInstanceState(SparseArray container)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchRestoreInstanceState(SparseArray container)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean canAnimate()
	{
		throw new RuntimeException("Stub!");
	}
}
