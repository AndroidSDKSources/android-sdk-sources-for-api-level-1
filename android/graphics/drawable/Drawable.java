// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Drawable.java

package android.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.util.AttributeSet;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class Drawable
{
	public static abstract class ConstantState
	{

		public abstract Drawable newDrawable();

		public abstract int getChangingConfigurations();

		public ConstantState()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface Callback
	{

		public abstract void invalidateDrawable(Drawable drawable);

		public abstract void scheduleDrawable(Drawable drawable, Runnable runnable, long l);

		public abstract void unscheduleDrawable(Drawable drawable, Runnable runnable);
	}


	public Drawable()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void draw(Canvas canvas);

	public void setBounds(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public void setBounds(Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	public final void copyBounds(Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	public final Rect copyBounds()
	{
		throw new RuntimeException("Stub!");
	}

	public final Rect getBounds()
	{
		throw new RuntimeException("Stub!");
	}

	public void setChangingConfigurations(int configs)
	{
		throw new RuntimeException("Stub!");
	}

	public int getChangingConfigurations()
	{
		throw new RuntimeException("Stub!");
	}

	public void setDither(boolean dither)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilterBitmap(boolean filter)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setCallback(Callback cb)
	{
		throw new RuntimeException("Stub!");
	}

	public void invalidateSelf()
	{
		throw new RuntimeException("Stub!");
	}

	public void scheduleSelf(Runnable what, long when)
	{
		throw new RuntimeException("Stub!");
	}

	public void unscheduleSelf(Runnable what)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void setAlpha(int i);

	public abstract void setColorFilter(ColorFilter colorfilter);

	public void setColorFilter(int color, android.graphics.PorterDuff.Mode mode)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearColorFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStateful()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setState(int stateSet[])
	{
		throw new RuntimeException("Stub!");
	}

	public int[] getState()
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getCurrent()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean setLevel(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getLevel()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setVisible(boolean visible, boolean restart)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isVisible()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getOpacity();

	public static int resolveOpacity(int op1, int op2)
	{
		throw new RuntimeException("Stub!");
	}

	public Region getTransparentRegion()
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

	protected void onBoundsChange(Rect bounds)
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

	public boolean getPadding(Rect padding)
	{
		throw new RuntimeException("Stub!");
	}

	public static Drawable createFromStream(InputStream is, String srcName)
	{
		throw new RuntimeException("Stub!");
	}

	public static Drawable createFromXml(Resources r, XmlPullParser parser)
		throws XmlPullParserException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static Drawable createFromXmlInner(Resources r, XmlPullParser parser, AttributeSet attrs)
		throws XmlPullParserException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static Drawable createFromPath(String pathName)
	{
		throw new RuntimeException("Stub!");
	}

	public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs)
		throws XmlPullParserException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ConstantState getConstantState()
	{
		throw new RuntimeException("Stub!");
	}
}
