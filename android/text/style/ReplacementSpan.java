// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReplacementSpan.java

package android.text.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

// Referenced classes of package android.text.style:
//			MetricAffectingSpan

public abstract class ReplacementSpan extends MetricAffectingSpan
{

	public ReplacementSpan()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint);

	public abstract void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
			int i1, Paint paint);

	public void updateMeasureState(TextPaint p)
	{
		throw new RuntimeException("Stub!");
	}

	public void updateDrawState(TextPaint ds)
	{
		throw new RuntimeException("Stub!");
	}
}
