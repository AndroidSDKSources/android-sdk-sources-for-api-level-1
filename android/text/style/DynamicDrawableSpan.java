// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DynamicDrawableSpan.java

package android.text.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.text.style:
//			ReplacementSpan

public abstract class DynamicDrawableSpan extends ReplacementSpan
{

	public DynamicDrawableSpan()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Drawable getDrawable();

	public int getSize(Paint paint, CharSequence text, int start, int end, android.graphics.Paint.FontMetricsInt fm)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, 
			int bottom, Paint paint)
	{
		throw new RuntimeException("Stub!");
	}
}
