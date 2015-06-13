// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RatingBar.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.widget:
//			AbsSeekBar

public class RatingBar extends AbsSeekBar
{
	public static interface OnRatingBarChangeListener
	{

		public abstract void onRatingChanged(RatingBar ratingbar, float f, boolean flag);
	}


	public RatingBar(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public RatingBar(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public RatingBar(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setOnRatingBarChangeListener(OnRatingBarChangeListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public OnRatingBarChangeListener getOnRatingBarChangeListener()
	{
		throw new RuntimeException("Stub!");
	}

	public void setIsIndicator(boolean isIndicator)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isIndicator()
	{
		throw new RuntimeException("Stub!");
	}

	public void setNumStars(int numStars)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNumStars()
	{
		throw new RuntimeException("Stub!");
	}

	public void setRating(float rating)
	{
		throw new RuntimeException("Stub!");
	}

	public float getRating()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStepSize(float stepSize)
	{
		throw new RuntimeException("Stub!");
	}

	public float getStepSize()
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setMax(int max)
	{
		throw new RuntimeException("Stub!");
	}
}
