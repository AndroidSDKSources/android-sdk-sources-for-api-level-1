// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClipDrawable.java

package android.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.graphics.drawable:
//			Drawable

public class ClipDrawable extends Drawable
	implements Drawable.Callback
{

	public static final int HORIZONTAL = 1;
	public static final int VERTICAL = 2;

	public ClipDrawable(Drawable drawable, int gravity, int orientation)
	{
		throw new RuntimeException("Stub!");
	}

	public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs)
		throws XmlPullParserException, IOException
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

	public void draw(Canvas canvas)
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
