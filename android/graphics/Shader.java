// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Shader.java

package android.graphics;


// Referenced classes of package android.graphics:
//			Matrix

public class Shader
{
	public static final class TileMode extends Enum
	{

		public static final TileMode CLAMP;
		public static final TileMode MIRROR;
		public static final TileMode REPEAT;
		private static final TileMode $VALUES[];

		public static final TileMode[] values()
		{
			return (TileMode[])$VALUES.clone();
		}

		public static TileMode valueOf(String name)
		{
			return (TileMode)Enum.valueOf(android/graphics/Shader$TileMode, name);
		}

		static 
		{
			CLAMP = new TileMode("CLAMP", 0);
			MIRROR = new TileMode("MIRROR", 1);
			REPEAT = new TileMode("REPEAT", 2);
			$VALUES = (new TileMode[] {
				CLAMP, MIRROR, REPEAT
			});
		}

		private TileMode(String s, int i)
		{
			super(s, i);
		}
	}


	public Shader()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getLocalMatrix(Matrix localM)
	{
		throw new RuntimeException("Stub!");
	}

	public void setLocalMatrix(Matrix localM)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}
}
