// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ShapeDrawable.java

package android.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.graphics.drawable:
//			Drawable

public class ShapeDrawable extends Drawable
{
	public static abstract class ShaderFactory
	{

		public abstract Shader resize(int i, int j);

		public ShaderFactory()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public ShapeDrawable()
	{
		throw new RuntimeException("Stub!");
	}

	public ShapeDrawable(Shape s)
	{
		throw new RuntimeException("Stub!");
	}

	public Shape getShape()
	{
		throw new RuntimeException("Stub!");
	}

	public void setShape(Shape s)
	{
		throw new RuntimeException("Stub!");
	}

	public void setShaderFactory(ShaderFactory fact)
	{
		throw new RuntimeException("Stub!");
	}

	public ShaderFactory getShaderFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public Paint getPaint()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPadding(int left, int top, int right, int bottom)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPadding(Rect padding)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIntrinsicWidth(int width)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIntrinsicHeight(int height)
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

	public boolean getPadding(Rect padding)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onDraw(Shape shape, Canvas canvas, Paint paint)
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

	public void setDither(boolean dither)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onBoundsChange(Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean inflateTag(String name, Resources r, XmlPullParser parser, AttributeSet attrs)
	{
		throw new RuntimeException("Stub!");
	}

	public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs)
		throws XmlPullParserException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable.ConstantState getConstantState()
	{
		throw new RuntimeException("Stub!");
	}
}
