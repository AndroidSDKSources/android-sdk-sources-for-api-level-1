// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BoringLayout.java

package android.text;

import android.graphics.*;

// Referenced classes of package android.text:
//			Layout, TextPaint, TextUtils

public class BoringLayout extends Layout
	implements TextUtils.EllipsizeCallback
{
	public static class Metrics extends android.graphics.Paint.FontMetricsInt
	{

		public int width;

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public Metrics()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public BoringLayout(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, 
			boolean includepad)
	{
		super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public BoringLayout(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, 
			boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth)
	{
		super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public static BoringLayout make(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad)
	{
		throw new RuntimeException("Stub!");
	}

	public static BoringLayout make(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad, 
			TextUtils.TruncateAt ellipsize, int ellipsizedWidth)
	{
		throw new RuntimeException("Stub!");
	}

	public BoringLayout replaceOrMake(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, 
			boolean includepad)
	{
		throw new RuntimeException("Stub!");
	}

	public BoringLayout replaceOrMake(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, 
			boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth)
	{
		throw new RuntimeException("Stub!");
	}

	public static Metrics isBoring(CharSequence text, TextPaint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public static Metrics isBoring(CharSequence text, TextPaint paint, Metrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public int getHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineCount()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineTop(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineDescent(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineStart(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getParagraphDirection(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getLineContainsTab(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public float getLineMax(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public final Layout.Directions getLineDirections(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getTopPadding()
	{
		throw new RuntimeException("Stub!");
	}

	public int getBottomPadding()
	{
		throw new RuntimeException("Stub!");
	}

	public int getEllipsisCount(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getEllipsisStart(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getEllipsizedWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas c, Path highlight, Paint highlightpaint, int cursorOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public void ellipsized(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}
}
