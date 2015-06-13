// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LineHeightSpan.java

package android.text.style;

import android.graphics.Paint;

// Referenced classes of package android.text.style:
//			ParagraphStyle, WrapTogetherSpan

public interface LineHeightSpan
	extends ParagraphStyle, WrapTogetherSpan
{

	public abstract void chooseHeight(CharSequence charsequence, int i, int j, int k, int l, android.graphics.Paint.FontMetricsInt fontmetricsint);
}
