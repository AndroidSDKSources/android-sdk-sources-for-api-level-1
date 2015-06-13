// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TextView.java

package android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.*;
import android.text.method.*;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.widget:
//			RemoteViews, Scroller

public class TextView extends View
	implements android.view.ViewTreeObserver.OnPreDrawListener
{
	public static final class BufferType extends Enum
	{

		public static final BufferType EDITABLE;
		public static final BufferType NORMAL;
		public static final BufferType SPANNABLE;
		private static final BufferType $VALUES[];

		public static final BufferType[] values()
		{
			return (BufferType[])$VALUES.clone();
		}

		public static BufferType valueOf(String name)
		{
			return (BufferType)Enum.valueOf(android/widget/TextView$BufferType, name);
		}

		static 
		{
			EDITABLE = new BufferType("EDITABLE", 0);
			NORMAL = new BufferType("NORMAL", 1);
			SPANNABLE = new BufferType("SPANNABLE", 2);
			$VALUES = (new BufferType[] {
				EDITABLE, NORMAL, SPANNABLE
			});
		}

		private BufferType(String s, int i)
		{
			super(s, i);
		}
	}

	public static class SavedState extends android.view.View.BaseSavedState
	{

		public static final android.os.Parcelable.Creator CREATOR = null;

		public void writeToParcel(Parcel out, int flags)
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}


		SavedState()
		{
			super((Parcelable)null);
			throw new RuntimeException("Stub!");
		}
	}


	public TextView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public TextView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public TextView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setTypeface(Typeface tf, int style)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean getDefaultEditable()
	{
		throw new RuntimeException("Stub!");
	}

	protected MovementMethod getDefaultMovementMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText()
	{
		throw new RuntimeException("Stub!");
	}

	public int length()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public final Layout getLayout()
	{
		throw new RuntimeException("Stub!");
	}

	public final KeyListener getKeyListener()
	{
		throw new RuntimeException("Stub!");
	}

	public void setKeyListener(KeyListener input)
	{
		throw new RuntimeException("Stub!");
	}

	public final MovementMethod getMovementMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setMovementMethod(MovementMethod movement)
	{
		throw new RuntimeException("Stub!");
	}

	public final TransformationMethod getTransformationMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setTransformationMethod(TransformationMethod method)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCompoundPaddingTop()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCompoundPaddingBottom()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCompoundPaddingLeft()
	{
		throw new RuntimeException("Stub!");
	}

	public int getCompoundPaddingRight()
	{
		throw new RuntimeException("Stub!");
	}

	public int getExtendedPaddingTop()
	{
		throw new RuntimeException("Stub!");
	}

	public int getExtendedPaddingBottom()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTotalPaddingLeft()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTotalPaddingRight()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTotalPaddingTop()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTotalPaddingBottom()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable[] getCompoundDrawables()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCompoundDrawablePadding(int pad)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCompoundDrawablePadding()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPadding(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getAutoLinkMask()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextAppearance(Context context, int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public float getTextSize()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextSize(float size)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextSize(int unit, float size)
	{
		throw new RuntimeException("Stub!");
	}

	public float getTextScaleX()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextScaleX(float size)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTypeface(Typeface tf)
	{
		throw new RuntimeException("Stub!");
	}

	public Typeface getTypeface()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextColor(ColorStateList colors)
	{
		throw new RuntimeException("Stub!");
	}

	public final ColorStateList getTextColors()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getCurrentTextColor()
	{
		throw new RuntimeException("Stub!");
	}

	public void setHighlightColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public void setShadowLayer(float radius, float dx, float dy, int color)
	{
		throw new RuntimeException("Stub!");
	}

	public TextPaint getPaint()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setAutoLinkMask(int mask)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setLinksClickable(boolean whether)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean getLinksClickable()
	{
		throw new RuntimeException("Stub!");
	}

	public URLSpan[] getUrls()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setHintTextColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setHintTextColor(ColorStateList colors)
	{
		throw new RuntimeException("Stub!");
	}

	public final ColorStateList getHintTextColors()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getCurrentHintTextColor()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setLinkTextColor(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setLinkTextColor(ColorStateList colors)
	{
		throw new RuntimeException("Stub!");
	}

	public final ColorStateList getLinkTextColors()
	{
		throw new RuntimeException("Stub!");
	}

	public void setGravity(int gravity)
	{
		throw new RuntimeException("Stub!");
	}

	public int getGravity()
	{
		throw new RuntimeException("Stub!");
	}

	public int getPaintFlags()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPaintFlags(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHorizontallyScrolling(boolean whether)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinLines(int minlines)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinHeight(int minHeight)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxLines(int maxlines)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxHeight(int maxHeight)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLines(int lines)
	{
		throw new RuntimeException("Stub!");
	}

	public void setHeight(int pixels)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinEms(int minems)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMinWidth(int minpixels)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxEms(int maxems)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMaxWidth(int maxpixels)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEms(int ems)
	{
		throw new RuntimeException("Stub!");
	}

	public void setWidth(int pixels)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLineSpacing(float add, float mult)
	{
		throw new RuntimeException("Stub!");
	}

	public final void append(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public void append(CharSequence text, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawableStateChanged()
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

	public void setFreezesText(boolean freezesText)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getFreezesText()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setEditableFactory(android.text.Editable.Factory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setSpannableFactory(android.text.Spannable.Factory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setText(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setTextKeepState(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public void setText(CharSequence text, BufferType type)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setText(char text[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setTextKeepState(CharSequence text, BufferType type)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setText(int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setText(int resid, BufferType type)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setHint(CharSequence hint)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setHint(int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getHint()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getError()
	{
		throw new RuntimeException("Stub!");
	}

	public void setError(CharSequence error)
	{
		throw new RuntimeException("Stub!");
	}

	public void setError(CharSequence error, Drawable icon)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean setFrame(int l, int t, int r, int b)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilters(InputFilter filters[])
	{
		throw new RuntimeException("Stub!");
	}

	public InputFilter[] getFilters()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onPreDraw()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDetachedFromWindow()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public void getFocusedRect(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineCount()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineBounds(int line, Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	public int getBaseline()
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

	public void setIncludeFontPadding(boolean includepad)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public void computeScroll()
	{
		throw new RuntimeException("Stub!");
	}

	public void debug(int depth)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSelectionStart()
	{
		throw new RuntimeException("Stub!");
	}

	public int getSelectionEnd()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasSelection()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSingleLine()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSingleLine(boolean singleLine)
	{
		throw new RuntimeException("Stub!");
	}

	public void setEllipsize(android.text.TextUtils.TruncateAt where)
	{
		throw new RuntimeException("Stub!");
	}

	public android.text.TextUtils.TruncateAt getEllipsize()
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelectAllOnFocus(boolean selectAllOnFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCursorVisible(boolean visible)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onTextChanged(CharSequence text, int start, int before, int after)
	{
		throw new RuntimeException("Stub!");
	}

	public void addTextChangedListener(TextWatcher watcher)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeTextChangedListener(TextWatcher watcher)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowFocusChanged(boolean hasWindowFocus)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void setScroller(Scroller s)
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeHorizontalScrollRange()
	{
		throw new RuntimeException("Stub!");
	}

	protected int computeVerticalScrollRange()
	{
		throw new RuntimeException("Stub!");
	}

	public static ColorStateList getTextColors(Context context, TypedArray attrs)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getTextColor(Context context, TypedArray attrs, int def)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyShortcut(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onCreateContextMenu(ContextMenu menu)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performLongClick()
	{
		throw new RuntimeException("Stub!");
	}
}
