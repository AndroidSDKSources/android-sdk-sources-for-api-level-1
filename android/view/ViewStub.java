// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ViewStub.java

package android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

// Referenced classes of package android.view:
//			View

public final class ViewStub extends View
{
	public static interface OnInflateListener
	{

		public abstract void onInflate(ViewStub viewstub, View view);
	}


	public ViewStub(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ViewStub(Context context, int layoutResource)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ViewStub(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public ViewStub(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public int getInflatedId()
	{
		throw new RuntimeException("Stub!");
	}

	public void setInflatedId(int inflatedId)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLayoutResource()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLayoutResource(int layoutResource)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dispatchDraw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public void setVisibility(int visibility)
	{
		throw new RuntimeException("Stub!");
	}

	public View inflate()
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnInflateListener(OnInflateListener inflateListener)
	{
		throw new RuntimeException("Stub!");
	}
}
