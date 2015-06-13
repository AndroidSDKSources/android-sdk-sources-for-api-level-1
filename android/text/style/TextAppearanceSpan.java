// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TextAppearanceSpan.java

package android.text.style;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;

// Referenced classes of package android.text.style:
//			MetricAffectingSpan

public class TextAppearanceSpan extends MetricAffectingSpan
{

	public TextAppearanceSpan(Context context, int appearance)
	{
		throw new RuntimeException("Stub!");
	}

	public TextAppearanceSpan(Context context, int appearance, int colorList)
	{
		throw new RuntimeException("Stub!");
	}

	public TextAppearanceSpan(String family, int style, int size, ColorStateList color, ColorStateList linkColor)
	{
		throw new RuntimeException("Stub!");
	}

	public String getFamily()
	{
		throw new RuntimeException("Stub!");
	}

	public ColorStateList getTextColor()
	{
		throw new RuntimeException("Stub!");
	}

	public ColorStateList getLinkTextColor()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTextSize()
	{
		throw new RuntimeException("Stub!");
	}

	public int getTextStyle()
	{
		throw new RuntimeException("Stub!");
	}

	public void updateDrawState(TextPaint ds)
	{
		throw new RuntimeException("Stub!");
	}

	public void updateMeasureState(TextPaint ds)
	{
		throw new RuntimeException("Stub!");
	}
}
