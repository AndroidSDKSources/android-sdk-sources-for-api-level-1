// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StaticLayout.java

package android.text;


// Referenced classes of package android.text:
//			Layout, TextPaint, TextUtils

public class StaticLayout extends Layout
{

	public StaticLayout(CharSequence source, TextPaint paint, int width, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad)
	{
		super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public StaticLayout(CharSequence source, int bufstart, int bufend, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, 
			float spacingadd, boolean includepad)
	{
		super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public StaticLayout(CharSequence source, int bufstart, int bufend, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, 
			float spacingadd, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth)
	{
		super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);
		throw new RuntimeException("Stub!");
	}

	public int getLineForVertical(int vertical)
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
}
