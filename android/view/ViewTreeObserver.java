// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ViewTreeObserver.java

package android.view;


// Referenced classes of package android.view:
//			View

public final class ViewTreeObserver
{
	public static interface OnTouchModeChangeListener
	{

		public abstract void onTouchModeChanged(boolean flag);
	}

	public static interface OnPreDrawListener
	{

		public abstract boolean onPreDraw();
	}

	public static interface OnGlobalLayoutListener
	{

		public abstract void onGlobalLayout();
	}

	public static interface OnGlobalFocusChangeListener
	{

		public abstract void onGlobalFocusChanged(View view, View view1);
	}


	ViewTreeObserver()
	{
		throw new RuntimeException("Stub!");
	}

	public void addOnGlobalFocusChangeListener(OnGlobalFocusChangeListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeOnGlobalFocusChangeListener(OnGlobalFocusChangeListener victim)
	{
		throw new RuntimeException("Stub!");
	}

	public void addOnGlobalLayoutListener(OnGlobalLayoutListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeGlobalOnLayoutListener(OnGlobalLayoutListener victim)
	{
		throw new RuntimeException("Stub!");
	}

	public void addOnPreDrawListener(OnPreDrawListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeOnPreDrawListener(OnPreDrawListener victim)
	{
		throw new RuntimeException("Stub!");
	}

	public void addOnTouchModeChangeListener(OnTouchModeChangeListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeOnTouchModeChangeListener(OnTouchModeChangeListener victim)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAlive()
	{
		throw new RuntimeException("Stub!");
	}

	public final void dispatchOnGlobalLayout()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean dispatchOnPreDraw()
	{
		throw new RuntimeException("Stub!");
	}
}
