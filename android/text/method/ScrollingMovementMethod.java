// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ScrollingMovementMethod.java

package android.text.method;

import android.text.Spannable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

// Referenced classes of package android.text.method:
//			MovementMethod

public class ScrollingMovementMethod
	implements MovementMethod
{

	public ScrollingMovementMethod()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean left(TextView widget, Spannable buffer)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean right(TextView widget, Spannable buffer)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean up(TextView widget, Spannable buffer)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean down(TextView widget, Spannable buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(TextView widget, Spannable buffer, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(TextView widget, Spannable buffer, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(TextView widget, Spannable buffer, MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void initialize(TextView widget, Spannable text)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canSelectArbitrarily()
	{
		throw new RuntimeException("Stub!");
	}

	public void onTakeFocus(TextView widget, Spannable text, int dir)
	{
		throw new RuntimeException("Stub!");
	}

	public static MovementMethod getInstance()
	{
		throw new RuntimeException("Stub!");
	}
}
