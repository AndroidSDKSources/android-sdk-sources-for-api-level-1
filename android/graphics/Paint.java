// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Paint.java

package android.graphics;


// Referenced classes of package android.graphics:
//			Path, Shader, ColorFilter, Xfermode, 
//			PathEffect, MaskFilter, Typeface, Rasterizer, 
//			Rect

public class Paint
{
	public static class FontMetricsInt
	{

		public int top;
		public int ascent;
		public int descent;
		public int bottom;
		public int leading;

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public FontMetricsInt()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class FontMetrics
	{

		public float top;
		public float ascent;
		public float descent;
		public float bottom;
		public float leading;

		public FontMetrics()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static final class Align extends Enum
	{

		public static final Align CENTER;
		public static final Align LEFT;
		public static final Align RIGHT;
		private static final Align $VALUES[];

		public static final Align[] values()
		{
			return (Align[])$VALUES.clone();
		}

		public static Align valueOf(String name)
		{
			return (Align)Enum.valueOf(android/graphics/Paint$Align, name);
		}

		static 
		{
			CENTER = new Align("CENTER", 0);
			LEFT = new Align("LEFT", 1);
			RIGHT = new Align("RIGHT", 2);
			$VALUES = (new Align[] {
				CENTER, LEFT, RIGHT
			});
		}

		private Align(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class Join extends Enum
	{

		public static final Join BEVEL;
		public static final Join MITER;
		public static final Join ROUND;
		private static final Join $VALUES[];

		public static final Join[] values()
		{
			return (Join[])$VALUES.clone();
		}

		public static Join valueOf(String name)
		{
			return (Join)Enum.valueOf(android/graphics/Paint$Join, name);
		}

		static 
		{
			BEVEL = new Join("BEVEL", 0);
			MITER = new Join("MITER", 1);
			ROUND = new Join("ROUND", 2);
			$VALUES = (new Join[] {
				BEVEL, MITER, ROUND
			});
		}

		private Join(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class Cap extends Enum
	{

		public static final Cap BUTT;
		public static final Cap ROUND;
		public static final Cap SQUARE;
		private static final Cap $VALUES[];

		public static final Cap[] values()
		{
			return (Cap[])$VALUES.clone();
		}

		public static Cap valueOf(String name)
		{
			return (Cap)Enum.valueOf(android/graphics/Paint$Cap, name);
		}

		static 
		{
			BUTT = new Cap("BUTT", 0);
			ROUND = new Cap("ROUND", 1);
			SQUARE = new Cap("SQUARE", 2);
			$VALUES = (new Cap[] {
				BUTT, ROUND, SQUARE
			});
		}

		private Cap(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class Style extends Enum
	{

		public static final Style FILL;
		public static final Style FILL_AND_STROKE;
		public static final Style STROKE;
		private static final Style $VALUES[];

		public static final Style[] values()
		{
			return (Style[])$VALUES.clone();
		}

		public static Style valueOf(String name)
		{
			return (Style)Enum.valueOf(android/graphics/Paint$Style, name);
		}

		static 
		{
			FILL = new Style("FILL", 0);
			FILL_AND_STROKE = new Style("FILL_AND_STROKE", 1);
			STROKE = new Style("STROKE", 2);
			$VALUES = (new Style[] {
				FILL, FILL_AND_STROKE, STROKE
			});
		}

		private Style(String s, int i)
		{
			super(s, i);
		}
	}


	public static final int ANTI_ALIAS_FLAG = 1;
	public static final int FILTER_BITMAP_FLAG = 2;
	public static final int DITHER_FLAG = 4;
	public static final int UNDERLINE_TEXT_FLAG = 8;
	public static final int STRIKE_THRU_TEXT_FLAG = 16;
	public static final int FAKE_BOLD_TEXT_FLAG = 32;
	public static final int LINEAR_TEXT_FLAG = 64;
	public static final int SUBPIXEL_TEXT_FLAG = 128;
	public static final int DEV_KERN_TEXT_FLAG = 256;

	public Paint()
	{
		throw new RuntimeException("Stub!");
	}

	public Paint(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public Paint(Paint paint)
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public void set(Paint src)
	{
		throw new RuntimeException("Stub!");
	}

	public native int getFlags();

	public native void setFlags(int i);

	public final boolean isAntiAlias()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setAntiAlias(boolean flag);

	public final boolean isDither()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setDither(boolean flag);

	public final boolean isLinearText()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setLinearText(boolean flag);

	public final boolean isSubpixelText()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setSubpixelText(boolean flag);

	public final boolean isUnderlineText()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setUnderlineText(boolean flag);

	public final boolean isStrikeThruText()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setStrikeThruText(boolean flag);

	public final boolean isFakeBoldText()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setFakeBoldText(boolean flag);

	public final boolean isFilterBitmap()
	{
		throw new RuntimeException("Stub!");
	}

	public native void setFilterBitmap(boolean flag);

	public Style getStyle()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStyle(Style style)
	{
		throw new RuntimeException("Stub!");
	}

	public native int getColor();

	public native void setColor(int i);

	public native int getAlpha();

	public native void setAlpha(int i);

	public void setARGB(int a, int r, int g, int b)
	{
		throw new RuntimeException("Stub!");
	}

	public native float getStrokeWidth();

	public native void setStrokeWidth(float f);

	public native float getStrokeMiter();

	public native void setStrokeMiter(float f);

	public Cap getStrokeCap()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStrokeCap(Cap cap)
	{
		throw new RuntimeException("Stub!");
	}

	public Join getStrokeJoin()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStrokeJoin(Join join)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getFillPath(Path src, Path dst)
	{
		throw new RuntimeException("Stub!");
	}

	public Shader getShader()
	{
		throw new RuntimeException("Stub!");
	}

	public Shader setShader(Shader shader)
	{
		throw new RuntimeException("Stub!");
	}

	public ColorFilter getColorFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public ColorFilter setColorFilter(ColorFilter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public Xfermode getXfermode()
	{
		throw new RuntimeException("Stub!");
	}

	public Xfermode setXfermode(Xfermode xfermode)
	{
		throw new RuntimeException("Stub!");
	}

	public PathEffect getPathEffect()
	{
		throw new RuntimeException("Stub!");
	}

	public PathEffect setPathEffect(PathEffect effect)
	{
		throw new RuntimeException("Stub!");
	}

	public MaskFilter getMaskFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public MaskFilter setMaskFilter(MaskFilter maskfilter)
	{
		throw new RuntimeException("Stub!");
	}

	public Typeface getTypeface()
	{
		throw new RuntimeException("Stub!");
	}

	public Typeface setTypeface(Typeface typeface)
	{
		throw new RuntimeException("Stub!");
	}

	public Rasterizer getRasterizer()
	{
		throw new RuntimeException("Stub!");
	}

	public Rasterizer setRasterizer(Rasterizer rasterizer)
	{
		throw new RuntimeException("Stub!");
	}

	public native void setShadowLayer(float f, float f1, float f2, int i);

	public void clearShadowLayer()
	{
		throw new RuntimeException("Stub!");
	}

	public Align getTextAlign()
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextAlign(Align align)
	{
		throw new RuntimeException("Stub!");
	}

	public native float getTextSize();

	public native void setTextSize(float f);

	public native float getTextScaleX();

	public native void setTextScaleX(float f);

	public native float getTextSkewX();

	public native void setTextSkewX(float f);

	public native float ascent();

	public native float descent();

	public native float getFontMetrics(FontMetrics fontmetrics);

	public FontMetrics getFontMetrics()
	{
		throw new RuntimeException("Stub!");
	}

	public native int getFontMetricsInt(FontMetricsInt fontmetricsint);

	public FontMetricsInt getFontMetricsInt()
	{
		throw new RuntimeException("Stub!");
	}

	public float getFontSpacing()
	{
		throw new RuntimeException("Stub!");
	}

	public native float measureText(char ac[], int i, int j);

	public native float measureText(String s, int i, int j);

	public native float measureText(String s);

	public float measureText(CharSequence text, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public native int breakText(char ac[], int i, int j, float f, float af[]);

	public int breakText(CharSequence text, int start, int end, boolean measureForwards, float maxWidth, float measuredWidth[])
	{
		throw new RuntimeException("Stub!");
	}

	public native int breakText(String s, boolean flag, float f, float af[]);

	public int getTextWidths(char text[], int index, int count, float widths[])
	{
		throw new RuntimeException("Stub!");
	}

	public int getTextWidths(CharSequence text, int start, int end, float widths[])
	{
		throw new RuntimeException("Stub!");
	}

	public int getTextWidths(String text, int start, int end, float widths[])
	{
		throw new RuntimeException("Stub!");
	}

	public int getTextWidths(String text, float widths[])
	{
		throw new RuntimeException("Stub!");
	}

	public void getTextPath(char text[], int index, int count, float x, float y, Path path)
	{
		throw new RuntimeException("Stub!");
	}

	public void getTextPath(String text, int start, int end, float x, float y, Path path)
	{
		throw new RuntimeException("Stub!");
	}

	public void getTextBounds(String text, int start, int end, Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	public void getTextBounds(char text[], int index, int count, Rect bounds)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
