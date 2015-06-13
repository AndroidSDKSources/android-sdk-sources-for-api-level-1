// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SeekBar.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.widget:
//			AbsSeekBar

public class SeekBar extends AbsSeekBar
{
	public static interface OnSeekBarChangeListener
	{

		public abstract void onProgressChanged(SeekBar seekbar, int i, boolean flag);

		public abstract void onStartTrackingTouch(SeekBar seekbar);

		public abstract void onStopTrackingTouch(SeekBar seekbar);
	}


	public SeekBar(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public SeekBar(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public SeekBar(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setOnSeekBarChangeListener(OnSeekBarChangeListener l)
	{
		throw new RuntimeException("Stub!");
	}
}
