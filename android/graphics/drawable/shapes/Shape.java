// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Shape.java

package android.graphics.drawable.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape
{

	public Shape()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void draw(Canvas canvas, Paint paint);

	public final void resize(float width, float height)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasAlpha()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onResize(float width, float height)
	{
		throw new RuntimeException("Stub!");
	}
}
