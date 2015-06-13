// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PathDashPathEffect.java

package android.graphics;


// Referenced classes of package android.graphics:
//			PathEffect, Path

public class PathDashPathEffect extends PathEffect
{
	public static final class Style extends Enum
	{

		public static final Style MORPH;
		public static final Style ROTATE;
		public static final Style TRANSLATE;
		private static final Style $VALUES[];

		public static final Style[] values()
		{
			return (Style[])$VALUES.clone();
		}

		public static Style valueOf(String name)
		{
			return (Style)Enum.valueOf(android/graphics/PathDashPathEffect$Style, name);
		}

		static 
		{
			MORPH = new Style("MORPH", 0);
			ROTATE = new Style("ROTATE", 1);
			TRANSLATE = new Style("TRANSLATE", 2);
			$VALUES = (new Style[] {
				MORPH, ROTATE, TRANSLATE
			});
		}

		private Style(String s, int i)
		{
			super(s, i);
		}
	}


	public PathDashPathEffect(Path shape, float advance, float phase, Style style)
	{
		throw new RuntimeException("Stub!");
	}
}
