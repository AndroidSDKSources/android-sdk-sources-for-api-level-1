// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DrawableContainer.java

package android.graphics.drawable;

import android.graphics.*;

// Referenced classes of package android.graphics.drawable:
//			Drawable

public class DrawableContainer extends Drawable
	implements Drawable.Callback
{
	public static abstract class DrawableContainerState extends Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			throw new RuntimeException("Stub!");
		}

		public final int addChild(Drawable dr)
		{
			throw new RuntimeException("Stub!");
		}

		public final int getChildCount()
		{
			throw new RuntimeException("Stub!");
		}

		public final Drawable[] getChildren()
		{
			throw new RuntimeException("Stub!");
		}

		public final void setVariablePadding(boolean variable)
		{
			throw new RuntimeException("Stub!");
		}

		public final Rect getConstantPadding()
		{
			throw new RuntimeException("Stub!");
		}

		public final void setConstantSize(boolean constant)
		{
			throw new RuntimeException("Stub!");
		}

		public final boolean isConstantSize()
		{
			throw new RuntimeException("Stub!");
		}

		public final int getConstantWidth()
		{
			throw new RuntimeException("Stub!");
		}

		public final int getConstantHeight()
		{
			throw new RuntimeException("Stub!");
		}

		public final int getConstantMinimumWidth()
		{
			throw new RuntimeException("Stub!");
		}

		public final int getConstantMinimumHeight()
		{
			throw new RuntimeException("Stub!");
		}

		public final int getOpacity()
		{
			throw new RuntimeException("Stub!");
		}

		public final boolean isStateful()
		{
			throw new RuntimeException("Stub!");
		}

		public void growArray(int oldSize, int newSize)
		{
			throw new RuntimeException("Stub!");
		}

		public synchronized boolean canConstantState()
		{
			throw new RuntimeException("Stub!");
		}

		DrawableContainerState()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public DrawableContainer()
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public int getChangingConfigurations()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getPadding(Rect padding)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAlpha(int alpha)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDither(boolean dither)
	{
		throw new RuntimeException("Stub!");
	}

	public void setColorFilter(ColorFilter cf)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onBoundsChange(Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStateful()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onStateChange(int state[])
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onLevelChange(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public int getIntrinsicWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public int getIntrinsicHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public int getMinimumWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public int getMinimumHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidateDrawable(Drawable who)
	{
		throw new RuntimeException("Stub!");
	}

	public void scheduleDrawable(Drawable who, Runnable what, long when)
	{
		throw new RuntimeException("Stub!");
	}

	public void unscheduleDrawable(Drawable who, Runnable what)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setVisible(boolean visible, boolean restart)
	{
		throw new RuntimeException("Stub!");
	}

	public int getOpacity()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean selectDrawable(int idx)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getCurrent()
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable.ConstantState getConstantState()
	{
		throw new RuntimeException("Stub!");
	}

	protected void setConstantState(DrawableContainerState state)
	{
		throw new RuntimeException("Stub!");
	}
}
