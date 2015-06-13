// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ListView.java

package android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.*;

// Referenced classes of package android.widget:
//			AbsListView, ListAdapter, Adapter

public class ListView extends AbsListView
{
	class FixedViewInfo
	{

		public View view;
		public Object data;
		public boolean isSelectable;
		final ListView this$0;

		FixedViewInfo()
		{
			this$0 = ListView.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public static final int CHOICE_MODE_NONE = 0;
	public static final int CHOICE_MODE_SINGLE = 1;
	public static final int CHOICE_MODE_MULTIPLE = 2;

	public ListView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ListView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ListView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public int getMaxScrollAmount()
	{
		throw new RuntimeException("Stub!");
	}

	public void addHeaderView(View v, Object data, boolean isSelectable)
	{
		throw new RuntimeException("Stub!");
	}

	public void addHeaderView(View v)
	{
		throw new RuntimeException("Stub!");
	}

	public int getHeaderViewsCount()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean removeHeaderView(View v)
	{
		throw new RuntimeException("Stub!");
	}

	public void addFooterView(View v, Object data, boolean isSelectable)
	{
		throw new RuntimeException("Stub!");
	}

	public void addFooterView(View v)
	{
		throw new RuntimeException("Stub!");
	}

	public int getFooterViewsCount()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean removeFooterView(View v)
	{
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

	public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected void layoutChildren()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean canAnimate()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelection(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelectionFromTop(int position, int y)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelectionAfterHeaderView()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchKeyEvent(KeyEvent event)
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

	public void setItemsCanFocus(boolean itemsCanFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getItemsCanFocus()
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getDivider()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDivider(Drawable divider)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDividerHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDividerHeight(int height)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFinishInflate()
	{
		throw new RuntimeException("Stub!");
	}

	protected View findViewTraversal(int id)
	{
		throw new RuntimeException("Stub!");
	}

	protected View findViewWithTagTraversal(Object tag)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public int getChoiceMode()
	{
		throw new RuntimeException("Stub!");
	}

	public void setChoiceMode(int choiceMode)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performItemClick(View view, int position, long id)
	{
		throw new RuntimeException("Stub!");
	}

	public void setItemChecked(int position, boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isItemChecked(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCheckedItemPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public SparseBooleanArray getCheckedItemPositions()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearChoices()
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
