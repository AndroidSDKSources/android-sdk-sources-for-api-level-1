// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GridView.java

package android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.widget:
//			AbsListView, ListAdapter, Adapter

public class GridView extends AbsListView
{

	public static final int NO_STRETCH = 0;
	public static final int STRETCH_SPACING = 1;
	public static final int STRETCH_COLUMN_WIDTH = 2;
	public static final int AUTO_FIT = -1;

	public GridView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public GridView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public GridView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ListAdapter getAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAdapter(ListAdapter adapter)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected void attachLayoutAnimationParameters(View child, android.view.ViewGroup.LayoutParams params, int index, int count)
	{
		throw new RuntimeException("Stub!");
	}

	protected void layoutChildren()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelection(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGravity(int gravity)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHorizontalSpacing(int horizontalSpacing)
	{
		throw new RuntimeException("Stub!");
	}

	public void setVerticalSpacing(int verticalSpacing)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStretchMode(int stretchMode)
	{
		throw new RuntimeException("Stub!");
	}

	public int getStretchMode()
	{
		throw new RuntimeException("Stub!");
	}

	public void setColumnWidth(int columnWidth)
	{
		throw new RuntimeException("Stub!");
	}

	public void setNumColumns(int numColumns)
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollExtent()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollOffset()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollRange()
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
