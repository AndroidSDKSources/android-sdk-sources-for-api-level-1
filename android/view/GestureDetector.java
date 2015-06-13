// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GestureDetector.java

package android.view;

import android.os.Handler;

// Referenced classes of package android.view:
//			MotionEvent

public class GestureDetector
{
	public static class SimpleOnGestureListener
		implements OnGestureListener
	{

		public boolean onSingleTapUp(MotionEvent e)
		{
			throw new RuntimeException("Stub!");
		}

		public void onLongPress(MotionEvent e)
		{
			throw new RuntimeException("Stub!");
		}

		public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)
		{
			throw new RuntimeException("Stub!");
		}

		public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
		{
			throw new RuntimeException("Stub!");
		}

		public void onShowPress(MotionEvent e)
		{
			throw new RuntimeException("Stub!");
		}

		public boolean onDown(MotionEvent e)
		{
			throw new RuntimeException("Stub!");
		}

		public SimpleOnGestureListener()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface OnGestureListener
	{

		public abstract boolean onDown(MotionEvent motionevent);

		public abstract void onShowPress(MotionEvent motionevent);

		public abstract boolean onSingleTapUp(MotionEvent motionevent);

		public abstract boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1);

		public abstract void onLongPress(MotionEvent motionevent);

		public abstract boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1);
	}


	public GestureDetector(OnGestureListener listener, Handler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public GestureDetector(OnGestureListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIsLongpressEnabled(boolean isLongpressEnabled)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLongpressEnabled()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(MotionEvent ev)
	{
		throw new RuntimeException("Stub!");
	}
}
