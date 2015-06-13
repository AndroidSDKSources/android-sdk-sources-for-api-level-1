// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IconMarginSpan.java

package android.text.style;

import android.graphics.*;
import android.text.Layout;

// Referenced classes of package android.text.style:
//			LeadingMarginSpan, LineHeightSpan

public class IconMarginSpan
	implements LeadingMarginSpan, LineHeightSpan
{

	public IconMarginSpan(Bitmap b)
	{
		throw new RuntimeException("Stub!");
	}

	public IconMarginSpan(Bitmap b, int pad)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLeadingMargin(boolean first)
	{
		throw new RuntimeException("Stub!");
	}

	public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, 
			CharSequence text, int start, int end, boolean first, Layout layout)
	{
		throw new RuntimeException("Stub!");
	}

	public void chooseHeight(CharSequence text, int start, int end, int istartv, int v, android.graphics.Paint.FontMetricsInt fm)
	{
		throw new RuntimeException("Stub!");
	}
}
