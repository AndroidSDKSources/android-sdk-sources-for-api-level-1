// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LayerDrawable.java

package android.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.graphics.drawable:
//			Drawable

public class LayerDrawable extends Drawable
	implements Drawable.Callback
{

	public LayerDrawable(Drawable array[])
	{
		throw new RuntimeException("Stub!");
	}

	public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs)
		throws XmlPullParserException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable findDrawableByLayerId(int id)
	{
		throw new RuntimeException("Stub!");
	}

	public void setId(int index, int id)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNumberOfLayers()
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getDrawable(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public int getId(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setDrawableByLayerId(int id, Drawable drawable)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLayerInset(int index, int l, int t, int r, int b)
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

	public boolean setVisible(boolean visible, boolean restart)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDither(boolean dither)
	{
		throw new RuntimeException("Stub!");
	}

	public void setAlpha(int alpha)
	{
		throw new RuntimeException("Stub!");
	}

	public void setColorFilter(ColorFilter cf)
	{
		throw new RuntimeException("Stub!");
	}

	public int getOpacity()
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

	public Drawable.ConstantState getConstantState()
	{
		throw new RuntimeException("Stub!");
	}
}
