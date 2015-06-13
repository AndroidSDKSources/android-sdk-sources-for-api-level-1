// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BlurMaskFilter.java

package android.graphics;


// Referenced classes of package android.graphics:
//			MaskFilter

public class BlurMaskFilter extends MaskFilter
{
	public static final class Blur extends Enum
	{

		public static final Blur INNER;
		public static final Blur NORMAL;
		public static final Blur OUTER;
		public static final Blur SOLID;
		private static final Blur $VALUES[];

		public static final Blur[] values()
		{
			return (Blur[])$VALUES.clone();
		}

		public static Blur valueOf(String name)
		{
			return (Blur)Enum.valueOf(android/graphics/BlurMaskFilter$Blur, name);
		}

		static 
		{
			INNER = new Blur("INNER", 0);
			NORMAL = new Blur("NORMAL", 1);
			OUTER = new Blur("OUTER", 2);
			SOLID = new Blur("SOLID", 3);
			$VALUES = (new Blur[] {
				INNER, NORMAL, OUTER, SOLID
			});
		}

		private Blur(String s, int i)
		{
			super(s, i);
		}
	}


	public BlurMaskFilter(float radius, Blur style)
	{
		throw new RuntimeException("Stub!");
	}
}
