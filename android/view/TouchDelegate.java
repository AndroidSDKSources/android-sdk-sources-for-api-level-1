// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TouchDelegate.java

package android.view;

import android.graphics.Rect;

// Referenced classes of package android.view:
//			View, MotionEvent

public class TouchDelegate
{

	public static final int ABOVE = 1;
	public static final int BELOW = 2;
	public static final int TO_LEFT = 4;
	public static final int TO_RIGHT = 8;

	public TouchDelegate(Rect bounds, View delegateView)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent event)
	{
		throw new RuntimeException("Stub!");
	}
}
