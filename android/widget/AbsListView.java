// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbsListView.java

package android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.widget:
//			AdapterView, Filter

public abstract class AbsListView extends AdapterView
	implements TextWatcher, android.view.ViewTreeObserver.OnGlobalLayoutListener, Filter.FilterListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
{
	public static interface RecyclerListener
	{

		public abstract void onMovedToScrapHeap(View view);
	}

	public static class LayoutParams extends android.view.ViewGroup.LayoutParams
	{

		public LayoutParams(Context c, AttributeSet attrs)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int w, int h)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int w, int h, int viewType)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams source)
		{
			super((android.view.ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}
	}

	public static interface OnScrollListener
	{

		public static final int SCROLL_STATE_IDLE = 0;
		public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
		public static final int SCROLL_STATE_FLING = 2;

		public abstract void onScrollStateChanged(AbsListView abslistview, int i);

		public abstract void onScroll(AbsListView abslistview, int i, int j, int k);
	}


	public static final int TRANSCRIPT_MODE_DISABLED = 0;
	public static final int TRANSCRIPT_MODE_NORMAL = 1;
	public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;

	public AbsListView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AbsListView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AbsListView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setOnScrollListener(OnScrollListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isScrollingCacheEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setScrollingCacheEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextFilterEnabled(boolean textFilterEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isTextFilterEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void getFocusedRect(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStackFromBottom()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStackFromBottom(boolean stackFromBottom)
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

	public void setFilterText(String filterText)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	public void requestLayout()
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

	protected float getTopFadingEdgeStrength()
	{
		throw new RuntimeException("Stub!");
	}

	protected float getBottomFadingEdgeStrength()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onLayout(boolean changed, int l, int t, int r, int b)
	{
		throw new RuntimeException("Stub!");
	}

	protected void layoutChildren()
	{
		throw new RuntimeException("Stub!");
	}

	public View getSelectedView()
	{
		throw new RuntimeException("Stub!");
	}

	public int getListPaddingTop()
	{
		throw new RuntimeException("Stub!");
	}

	public int getListPaddingBottom()
	{
		throw new RuntimeException("Stub!");
	}

	public int getListPaddingLeft()
	{
		throw new RuntimeException("Stub!");
	}

	public int getListPaddingRight()
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSizeChanged(int w, int h, int oldw, int oldh)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDrawSelectorOnTop(boolean onTop)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelector(int resID)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelector(Drawable sel)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getSelector()
	{
		throw new RuntimeException("Stub!");
	}

	public void setScrollIndicators(View up, View down)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawableStateChanged()
	{
		throw new RuntimeException("Stub!");
	}

	protected int[] onCreateDrawableState(int extraSpace)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean verifyDrawable(Drawable dr)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAttachedToWindow()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDetachedFromWindow()
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowFocusChanged(boolean hasWindowFocus)
	{
		throw new RuntimeException("Stub!");
	}

	protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean showContextMenuForChild(View originalView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchSetPressed(boolean pressed)
	{
		throw new RuntimeException("Stub!");
	}

	public int pointToPosition(int x, int y)
	{
		throw new RuntimeException("Stub!");
	}

	public long pointToRowId(int x, int y)
	{
		throw new RuntimeException("Stub!");
	}

	public void onTouchModeChanged(boolean isInTouchMode)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onInterceptTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}

	public void addTouchables(ArrayList views)
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidateViews()
	{
		throw new RuntimeException("Stub!");
	}

	protected void handleDataChanged()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isInFilterMode()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearTextFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasTextFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public void onGlobalLayout()
	{
		throw new RuntimeException("Stub!");
	}

	public void beforeTextChanged(CharSequence s, int start, int count, int after)
	{
		throw new RuntimeException("Stub!");
	}

	public void onTextChanged(CharSequence s, int start, int before, int count)
	{
		throw new RuntimeException("Stub!");
	}

	public void afterTextChanged(Editable s)
	{
		throw new RuntimeException("Stub!");
	}

	public void onFilterComplete(int count)
	{
		throw new RuntimeException("Stub!");
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	public LayoutParams generateLayoutParams(AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTranscriptMode(int mode)
	{
		throw new RuntimeException("Stub!");
	}

	public int getTranscriptMode()
	{
		throw new RuntimeException("Stub!");
	}

	public int getSolidColor()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCacheColorHint(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCacheColorHint()
	{
		throw new RuntimeException("Stub!");
	}

	public void reclaimViews(List views)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRecyclerListener(RecyclerListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet x0)
	{
		return generateLayoutParams(x0);
	}
}
