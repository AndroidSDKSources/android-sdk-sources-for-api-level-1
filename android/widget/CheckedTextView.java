// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CheckedTextView.java

package android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package android.widget:
//			TextView, Checkable

public abstract class CheckedTextView extends TextView
	implements Checkable
{

	public CheckedTextView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public CheckedTextView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public CheckedTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void toggle()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isChecked()
	{
		throw new RuntimeException("Stub!");
	}

	public void setChecked(boolean checked)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCheckMarkDrawable(int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCheckMarkDrawable(Drawable d)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPadding(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	protected int[] onCreateDrawableState(int extraSpace)
	{
		throw new RuntimeException("Stub!");
	}

	protected void drawableStateChanged()
	{
		throw new RuntimeException("Stub!");
	}
}
