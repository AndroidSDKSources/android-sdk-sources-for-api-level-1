// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Layout.java

package android.text;

import android.graphics.*;

// Referenced classes of package android.text:
//			TextPaint

public abstract class Layout
{
	public static final class Alignment extends Enum
	{

		public static final Alignment ALIGN_CENTER;
		public static final Alignment ALIGN_NORMAL;
		public static final Alignment ALIGN_OPPOSITE;
		private static final Alignment $VALUES[];

		public static final Alignment[] values()
		{
			return (Alignment[])$VALUES.clone();
		}

		public static Alignment valueOf(String name)
		{
			return (Alignment)Enum.valueOf(android/text/Layout$Alignment, name);
		}

		static 
		{
			ALIGN_CENTER = new Alignment("ALIGN_CENTER", 0);
			ALIGN_NORMAL = new Alignment("ALIGN_NORMAL", 1);
			ALIGN_OPPOSITE = new Alignment("ALIGN_OPPOSITE", 2);
			$VALUES = (new Alignment[] {
				ALIGN_CENTER, ALIGN_NORMAL, ALIGN_OPPOSITE
			});
		}

		private Alignment(String s, int i)
		{
			super(s, i);
		}
	}

	public static class Directions
	{

		Directions()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final int DIR_LEFT_TO_RIGHT = 1;
	public static final int DIR_RIGHT_TO_LEFT = -1;

	protected Layout(CharSequence text, TextPaint paint, int width, Alignment align, float spacingmult, float spacingadd)
	{
		throw new RuntimeException("Stub!");
	}

	public static float getDesiredWidth(CharSequence source, TextPaint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public static float getDesiredWidth(CharSequence source, int start, int end, TextPaint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas c)
	{
		throw new RuntimeException("Stub!");
	}

	public void draw(Canvas c, Path highlight, Paint highlightpaint, int cursorOffsetVertical)
	{
		throw new RuntimeException("Stub!");
	}

	public final CharSequence getText()
	{
		throw new RuntimeException("Stub!");
	}

	public final TextPaint getPaint()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public int getEllipsizedWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public final void increaseWidthTo(int wid)
	{
		throw new RuntimeException("Stub!");
	}

	public int getHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public final Alignment getAlignment()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getSpacingMultiplier()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getSpacingAdd()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getLineCount();

	public int getLineBounds(int line, Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getLineTop(int i);

	public abstract int getLineDescent(int i);

	public abstract int getLineStart(int i);

	public abstract int getParagraphDirection(int i);

	public abstract boolean getLineContainsTab(int i);

	public abstract Directions getLineDirections(int i);

	public abstract int getTopPadding();

	public abstract int getBottomPadding();

	public float getPrimaryHorizontal(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public float getSecondaryHorizontal(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public float getLineLeft(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public float getLineRight(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public float getLineMax(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public float getLineWidth(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineForVertical(int vertical)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineForOffset(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public int getOffsetForHorizontal(int line, float horiz)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getLineEnd(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getLineVisibleEnd(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getLineBottom(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getLineBaseline(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getLineAscent(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public int getOffsetToLeftOf(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public int getOffsetToRightOf(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public void getCursorPath(int point, Path dest, CharSequence editingBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public void getSelectionPath(int start, int end, Path dest)
	{
		throw new RuntimeException("Stub!");
	}

	public final Alignment getParagraphAlignment(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getParagraphLeft(int line)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getParagraphRight(int line)
	{
		throw new RuntimeException("Stub!");
	}

	protected final boolean isSpanned()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int getEllipsisStart(int i);

	public abstract int getEllipsisCount(int i);
}
