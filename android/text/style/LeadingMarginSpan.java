// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LeadingMarginSpan.java

package android.text.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;

// Referenced classes of package android.text.style:
//			ParagraphStyle

public interface LeadingMarginSpan
	extends ParagraphStyle
{
	public static class Standard
		implements LeadingMarginSpan
	{

		public int getLeadingMargin(boolean first)
		{
			throw new RuntimeException("Stub!");
		}

		public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, 
				CharSequence text, int start, int end, boolean first, Layout layout)
		{
			throw new RuntimeException("Stub!");
		}

		public Standard(int first, int rest)
		{
			throw new RuntimeException("Stub!");
		}

		public Standard(int every)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract int getLeadingMargin(boolean flag);

	public abstract void drawLeadingMargin(Canvas canvas, Paint paint, int i, int j, int k, int l, int i1, 
			CharSequence charsequence, int j1, int k1, boolean flag, Layout layout);
}
