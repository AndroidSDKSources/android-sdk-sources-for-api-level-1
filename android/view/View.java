// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   View.java

package android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.animation.Animation;
import java.util.ArrayList;

// Referenced classes of package android.view:
//			KeyEvent, ContextMenu, ViewGroup, MotionEvent, 
//			TouchDelegate, ViewParent, ViewTreeObserver, AbsSavedState

public class View
	implements android.graphics.drawable.Drawable.Callback, KeyEvent.Callback
{
	public static class BaseSavedState extends AbsSavedState
	{

		public static final android.os.Parcelable.Creator CREATOR = null;


		public BaseSavedState(Parcel source)
		{
			super((Parcel)null);
			throw new RuntimeException("Stub!");
		}

		public BaseSavedState(Parcelable superState)
		{
			super((Parcel)null);
			throw new RuntimeException("Stub!");
		}
	}

	public static interface OnCreateContextMenuListener
	{

		public abstract void onCreateContextMenu(ContextMenu contextmenu, View view, ContextMenu.ContextMenuInfo contextmenuinfo);
	}

	public static interface OnClickListener
	{

		public abstract void onClick(View view);
	}

	public static interface OnFocusChangeListener
	{

		public abstract void onFocusChange(View view, boolean flag);
	}

	public static interface OnLongClickListener
	{

		public abstract boolean onLongClick(View view);
	}

	public static interface OnTouchListener
	{

		public abstract boolean onTouch(View view, MotionEvent motionevent);
	}

	public static interface OnKeyListener
	{

		public abstract boolean onKey(View view, int i, KeyEvent keyevent);
	}

	public static class MeasureSpec
	{

		public static final int UNSPECIFIED = 0;
		public static final int EXACTLY = 0x40000000;
		public static final int AT_MOST = 0x80000000;

		public static int makeMeasureSpec(int size, int mode)
		{
			throw new RuntimeException("Stub!");
		}

		public static int getMode(int measureSpec)
		{
			throw new RuntimeException("Stub!");
		}

		public static int getSize(int measureSpec)
		{
			throw new RuntimeException("Stub!");
		}

		public static String toString(int measureSpec)
		{
			throw new RuntimeException("Stub!");
		}

		public MeasureSpec()
		{
			throw new RuntimeException("Stub!");
		}
	}


	protected static final String VIEW_LOG_TAG = "View";
	public static final int NO_ID = -1;
	public static final int VISIBLE = 0;
	public static final int INVISIBLE = 4;
	public static final int GONE = 8;
	public static final int DRAWING_CACHE_QUALITY_LOW = 0x80000;
	public static final int DRAWING_CACHE_QUALITY_HIGH = 0x100000;
	public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
	public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
	public static final int SCROLLBARS_INSIDE_INSET = 0x1000000;
	public static final int SCROLLBARS_OUTSIDE_OVERLAY = 0x2000000;
	public static final int SCROLLBARS_OUTSIDE_INSET = 0x3000000;
	public static final int KEEP_SCREEN_ON = 0x4000000;
	public static final int SOUND_EFFECTS_ENABLED = 0x8000000;
	public static final int FOCUS_BACKWARD = 1;
	public static final int FOCUS_FORWARD = 2;
	public static final int FOCUS_LEFT = 17;
	public static final int FOCUS_UP = 33;
	public static final int FOCUS_RIGHT = 66;
	public static final int FOCUS_DOWN = 130;
	protected static final int EMPTY_STATE_SET[] = null;
	protected static final int ENABLED_STATE_SET[] = null;
	protected static final int FOCUSED_STATE_SET[] = null;
	protected static final int SELECTED_STATE_SET[] = null;
	protected static final int WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int ENABLED_FOCUSED_STATE_SET[] = null;
	protected static final int ENABLED_SELECTED_STATE_SET[] = null;
	protected static final int ENABLED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int FOCUSED_SELECTED_STATE_SET[] = null;
	protected static final int FOCUSED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int ENABLED_FOCUSED_SELECTED_STATE_SET[] = null;
	protected static final int ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_SELECTED_STATE_SET[] = null;
	protected static final int PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_FOCUSED_SELECTED_STATE_SET[] = null;
	protected static final int PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_SELECTED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET[] = null;
	protected static final int PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET[] = null;

	public View(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public View(Context context, AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	public View(Context context, AttributeSet attrs, int defStyle)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

	protected void initializeFadingEdge(TypedArray a)
	{
		throw new RuntimeException("Stub!");
	}

	public int getVerticalFadingEdgeLength()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFadingEdgeLength(int length)
	{
		throw new RuntimeException("Stub!");
	}

	public int getHorizontalFadingEdgeLength()
	{
		throw new RuntimeException("Stub!");
	}

	public int getVerticalScrollbarWidth()
	{
		throw new RuntimeException("Stub!");
	}

	protected int getHorizontalScrollbarHeight()
	{
		throw new RuntimeException("Stub!");
	}

	protected void initializeScrollbars(TypedArray a)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnFocusChangeListener(OnFocusChangeListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public OnFocusChangeListener getOnFocusChangeListener()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnClickListener(OnClickListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnLongClickListener(OnLongClickListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnCreateContextMenuListener(OnCreateContextMenuListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performClick()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performLongClick()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean showContextMenu()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnKeyListener(OnKeyListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnTouchListener(OnTouchListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requestRectangleOnScreen(Rect rectangle)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearFocus()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasFocus()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasFocusable()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isFocused()
	{
		throw new RuntimeException("Stub!");
	}

	public View findFocus()
	{
		throw new RuntimeException("Stub!");
	}

	public int getDrawingCacheQuality()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDrawingCacheQuality(int quality)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getKeepScreenOn()
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeepScreenOn(boolean keepScreenOn)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNextFocusLeftId()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNextFocusLeftId(int nextFocusLeftId)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNextFocusRightId()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNextFocusRightId(int nextFocusRightId)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNextFocusUpId()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNextFocusUpId(int nextFocusUpId)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNextFocusDownId()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNextFocusDownId(int nextFocusDownId)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isShown()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean fitSystemWindows(Rect insets)
	{
		throw new RuntimeException("Stub!");
	}

	public int getVisibility()
	{
		throw new RuntimeException("Stub!");
	}

	public void setVisibility(int visibility)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFocusable(boolean focusable)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFocusableInTouchMode(boolean focusableInTouchMode)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSoundEffectsEnabled(boolean soundEffectsEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isSoundEffectsEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWillNotDraw(boolean willNotDraw)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean willNotDraw()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWillNotCacheDrawing(boolean willNotCacheDrawing)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean willNotCacheDrawing()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isClickable()
	{
		throw new RuntimeException("Stub!");
	}

	public void setClickable(boolean clickable)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLongClickable()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLongClickable(boolean longClickable)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPressed(boolean pressed)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchSetPressed(boolean pressed)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isPressed()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isSaveEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSaveEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isFocusable()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isFocusableInTouchMode()
	{
		throw new RuntimeException("Stub!");
	}

	public View focusSearch(int direction)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchUnhandledMove(View focused, int direction)
	{
		throw new RuntimeException("Stub!");
	}

	public ArrayList getFocusables(int direction)
	{
		throw new RuntimeException("Stub!");
	}

	public void addFocusables(ArrayList views, int direction)
	{
		throw new RuntimeException("Stub!");
	}

	public ArrayList getTouchables()
	{
		throw new RuntimeException("Stub!");
	}

	public void addTouchables(ArrayList views)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean requestFocus()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean requestFocus(int direction)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean requestFocus(int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean requestFocusFromTouch()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchKeyEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchKeyShortcutEvent(KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchTouchEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean dispatchTrackballEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void dispatchWindowFocusChanged(boolean hasFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowFocusChanged(boolean hasWindowFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasWindowFocus()
	{
		throw new RuntimeException("Stub!");
	}

	public void dispatchWindowVisibilityChanged(int visibility)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onWindowVisibilityChanged(int visibility)
	{
		throw new RuntimeException("Stub!");
	}

	public int getWindowVisibility()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isInTouchMode()
	{
		throw new RuntimeException("Stub!");
	}

	public final Context getContext()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyShortcut(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void createContextMenu(ContextMenu menu)
	{
		throw new RuntimeException("Stub!");
	}

	protected ContextMenu.ContextMenuInfo getContextMenuInfo()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onCreateContextMenu(ContextMenu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void cancelLongPress()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTouchDelegate(TouchDelegate delegate)
	{
		throw new RuntimeException("Stub!");
	}

	public TouchDelegate getTouchDelegate()
	{
		throw new RuntimeException("Stub!");
	}

	public void bringToFront()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onScrollChanged(int l, int t, int oldl, int oldt)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onSizeChanged(int w, int h, int oldw, int oldh)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public final ViewParent getParent()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getScrollX()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getScrollY()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public void getDrawingRect(Rect outRect)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getMeasuredWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getMeasuredHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getTop()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getBottom()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getLeft()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getRight()
	{
		throw new RuntimeException("Stub!");
	}

	public void getHitRect(Rect outRect)
	{
		throw new RuntimeException("Stub!");
	}

	public void getFocusedRect(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getGlobalVisibleRect(Rect r, Point globalOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean getGlobalVisibleRect(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean getLocalVisibleRect(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public void offsetTopAndBottom(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public void offsetLeftAndRight(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public ViewGroup.LayoutParams getLayoutParams()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLayoutParams(ViewGroup.LayoutParams params)
	{
		throw new RuntimeException("Stub!");
	}

	public void scrollTo(int x, int y)
	{
		throw new RuntimeException("Stub!");
	}

	public void scrollBy(int x, int y)
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidate(Rect dirty)
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidate(int l, int t, int r, int b)
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidate()
	{
		throw new RuntimeException("Stub!");
	}

	protected Handler getHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean post(Runnable action)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean postDelayed(Runnable action, long delayMillis)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean removeCallbacks(Runnable action)
	{
		throw new RuntimeException("Stub!");
	}

	public void postInvalidate()
	{
		throw new RuntimeException("Stub!");
	}

	public void postInvalidate(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public void postInvalidateDelayed(long delayMilliseconds)
	{
		throw new RuntimeException("Stub!");
	}

	public void postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public void computeScroll()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isHorizontalFadingEdgeEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isVerticalFadingEdgeEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled)
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

	protected float getLeftFadingEdgeStrength()
	{
		throw new RuntimeException("Stub!");
	}

	protected float getRightFadingEdgeStrength()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isHorizontalScrollBarEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isVerticalScrollBarEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public void setScrollBarStyle(int style)
	{
		throw new RuntimeException("Stub!");
	}

	public int getScrollBarStyle()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeHorizontalScrollRange()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeHorizontalScrollOffset()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeHorizontalScrollExtent()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollRange()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollOffset()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollExtent()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDraw(Canvas canvas)
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

	protected int getWindowAttachCount()
	{
		throw new RuntimeException("Stub!");
	}

	public IBinder getWindowToken()
	{
		throw new RuntimeException("Stub!");
	}

	public IBinder getApplicationWindowToken()
	{
		throw new RuntimeException("Stub!");
	}

	public void saveHierarchyState(SparseArray container)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchSaveInstanceState(SparseArray container)
	{
		throw new RuntimeException("Stub!");
	}

	protected Parcelable onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	public void restoreHierarchyState(SparseArray container)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchRestoreInstanceState(SparseArray container)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onRestoreInstanceState(Parcelable state)
	{
		throw new RuntimeException("Stub!");
	}

	public long getDrawingTime()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDuplicateParentStateEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDuplicateParentStateEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDrawingCacheEnabled(boolean enabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDrawingCacheEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public Bitmap getDrawingCache()
	{
		throw new RuntimeException("Stub!");
	}

	public void destroyDrawingCache()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDrawingCacheBackgroundColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDrawingCacheBackgroundColor()
	{
		throw new RuntimeException("Stub!");
	}

	public void buildDrawingCache()
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSolidColor()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLayoutRequested()
	{
		throw new RuntimeException("Stub!");
	}

	public final void layout(int l, int t, int r, int b)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onLayout(boolean changed, int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFinishInflate()
	{
		throw new RuntimeException("Stub!");
	}

	public Resources getResources()
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidateDrawable(Drawable drawable)
	{
		throw new RuntimeException("Stub!");
	}

	public void scheduleDrawable(Drawable who, Runnable what, long when)
	{
		throw new RuntimeException("Stub!");
	}

	public void unscheduleDrawable(Drawable who, Runnable what)
	{
		throw new RuntimeException("Stub!");
	}

	public void unscheduleDrawable(Drawable who)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean verifyDrawable(Drawable who)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawableStateChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public void refreshDrawableState()
	{
		throw new RuntimeException("Stub!");
	}

	public final int[] getDrawableState()
	{
		throw new RuntimeException("Stub!");
	}

	protected int[] onCreateDrawableState(int extraSpace)
	{
		throw new RuntimeException("Stub!");
	}

	protected static int[] mergeDrawableStates(int baseState[], int additionalState[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setBackgroundColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public void setBackgroundResource(int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public void setBackgroundDrawable(Drawable d)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getBackground()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPadding(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public int getPaddingTop()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPaddingBottom()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPaddingLeft()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPaddingRight()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelected(boolean selected)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchSetSelected(boolean selected)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isSelected()
	{
		throw new RuntimeException("Stub!");
	}

	public ViewTreeObserver getViewTreeObserver()
	{
		throw new RuntimeException("Stub!");
	}

	public View getRootView()
	{
		throw new RuntimeException("Stub!");
	}

	public void getLocationOnScreen(int location[])
	{
		throw new RuntimeException("Stub!");
	}

	public void getLocationInWindow(int location[])
	{
		throw new RuntimeException("Stub!");
	}

	public final View findViewById(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public final View findViewWithTag(Object tag)
	{
		throw new RuntimeException("Stub!");
	}

	public void setId(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public int getId()
	{
		throw new RuntimeException("Stub!");
	}

	public Object getTag()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTag(Object tag)
	{
		throw new RuntimeException("Stub!");
	}

	public int getBaseline()
	{
		throw new RuntimeException("Stub!");
	}

	public void requestLayout()
	{
		throw new RuntimeException("Stub!");
	}

	public void forceLayout()
	{
		throw new RuntimeException("Stub!");
	}

	public final void measure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected final void setMeasuredDimension(int measuredWidth, int measuredHeight)
	{
		throw new RuntimeException("Stub!");
	}

	public static int resolveSize(int size, int measureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getDefaultSize(int size, int measureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	protected int getSuggestedMinimumHeight()
	{
		throw new RuntimeException("Stub!");
	}

	protected int getSuggestedMinimumWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinimumHeight(int minHeight)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinimumWidth(int minWidth)
	{
		throw new RuntimeException("Stub!");
	}

	public Animation getAnimation()
	{
		throw new RuntimeException("Stub!");
	}

	public void startAnimation(Animation animation)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearAnimation()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAnimation(Animation animation)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAnimationStart()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAnimationEnd()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onSetAlpha(int alpha)
	{
		throw new RuntimeException("Stub!");
	}

	protected void playSoundEffect(int soundConstant)
	{
		throw new RuntimeException("Stub!");
	}

	public static View inflate(Context context, int resource, ViewGroup root)
	{
		throw new RuntimeException("Stub!");
	}

}
