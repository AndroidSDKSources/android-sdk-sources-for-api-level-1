// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CompoundButton.java

package android.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;

// Referenced classes of package android.widget:
//			Button, Checkable

public abstract class CompoundButton extends Button
	implements Checkable
{
	public static interface OnCheckedChangeListener
	{

		public abstract void onCheckedChanged(CompoundButton compoundbutton, boolean flag);
	}


	public CompoundButton(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public CompoundButton(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public CompoundButton(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void toggle()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean performClick()
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

	public void setOnCheckedChangeListener(OnCheckedChangeListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButtonDrawable(int resid)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButtonDrawable(Drawable d)
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

	public Parcelable onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	public void onRestoreInstanceState(Parcelable state)
	{
		throw new RuntimeException("Stub!");
	}
}
