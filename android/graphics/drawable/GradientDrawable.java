// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GradientDrawable.java

package android.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.graphics.drawable:
//			Drawable

public class GradientDrawable extends Drawable
{
	public static final class Orientation extends Enum
	{

		public static final Orientation BL_TR;
		public static final Orientation BOTTOM_TOP;
		public static final Orientation BR_TL;
		public static final Orientation LEFT_RIGHT;
		public static final Orientation RIGHT_LEFT;
		public static final Orientation TL_BR;
		public static final Orientation TOP_BOTTOM;
		public static final Orientation TR_BL;
		private static final Orientation $VALUES[];

		public static final Orientation[] values()
		{
			return (Orientation[])$VALUES.clone();
		}

		public static Orientation valueOf(String name)
		{
			return (Orientation)Enum.valueOf(android/graphics/drawable/GradientDrawable$Orientation, name);
		}

		static 
		{
			BL_TR = new Orientation("BL_TR", 0);
			BOTTOM_TOP = new Orientation("BOTTOM_TOP", 1);
			BR_TL = new Orientation("BR_TL", 2);
			LEFT_RIGHT = new Orientation("LEFT_RIGHT", 3);
			RIGHT_LEFT = new Orientation("RIGHT_LEFT", 4);
			TL_BR = new Orientation("TL_BR", 5);
			TOP_BOTTOM = new Orientation("TOP_BOTTOM", 6);
			TR_BL = new Orientation("TR_BL", 7);
			$VALUES = (new Orientation[] {
				BL_TR, BOTTOM_TOP, BR_TL, LEFT_RIGHT, RIGHT_LEFT, TL_BR, TOP_BOTTOM, TR_BL
			});
		}

		private Orientation(String s, int i)
		{
			super(s, i);
		}
	}


	public static final int RECTANGLE = 0;
	public static final int OVAL = 1;
	public static final int LINE = 2;
	public static final int RING = 3;
	public static final int LINEAR_GRADIENT = 0;
	public static final int RADIAL_GRADIENT = 1;
	public static final int SWEEP_GRADIENT = 2;

	public GradientDrawable()
	{
		throw new RuntimeException("Stub!");
	}

	public GradientDrawable(Orientation orientation, int colors[])
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getPadding(Rect padding)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCornerRadii(float radii[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setCornerRadius(float radius)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStroke(int width, int color)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStroke(int width, int color, float dashWidth, float dashGap)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSize(int width, int height)
	{
		throw new RuntimeException("Stub!");
	}

	public void setShape(int shape)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGradientType(int gradient)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGradientCenter(float x, float y)
	{
		throw new RuntimeException("Stub!");
	}

	public void setGradientRadius(float gradientRadius)
	{
		throw new RuntimeException("Stub!");
	}

	public void setUseLevel(boolean useLevel)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas)
	{
		throw new RuntimeException("Stub!");
	}

	public void setColor(int argb)
	{
		throw new RuntimeException("Stub!");
	}

	public int getChangingConfigurations()
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

	public int getOpacity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onBoundsChange(Rect r)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean onLevelChange(int level)
	{
		throw new RuntimeException("Stub!");
	}

	public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs)
		throws XmlPullParserException, IOException
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
