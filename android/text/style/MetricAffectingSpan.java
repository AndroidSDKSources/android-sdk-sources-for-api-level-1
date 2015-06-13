// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MetricAffectingSpan.java

package android.text.style;

import android.text.TextPaint;

// Referenced classes of package android.text.style:
//			CharacterStyle, UpdateLayout

public abstract class MetricAffectingSpan extends CharacterStyle
	implements UpdateLayout
{

	public MetricAffectingSpan()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void updateMeasureState(TextPaint textpaint);

	public MetricAffectingSpan getUnderlying()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile CharacterStyle getUnderlying()
	{
		return getUnderlying();
	}
}
