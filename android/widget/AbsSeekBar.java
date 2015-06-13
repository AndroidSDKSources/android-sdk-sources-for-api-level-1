// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbsSeekBar.java

package android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;

// Referenced classes of package android.widget:
//			ProgressBar

public abstract class AbsSeekBar extends ProgressBar
{

	public AbsSeekBar(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AbsSeekBar(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AbsSeekBar(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setThumb(Drawable thumb)
	{
		throw new RuntimeException("Stub!");
	}

	public int getThumbOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public void setThumbOffset(int thumbOffset)
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

	protected void onSizeChanged(int w, int h, int oldw, int oldh)
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void onDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}
}
