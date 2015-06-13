// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AvoidXfermode.java

package android.graphics;


// Referenced classes of package android.graphics:
//			Xfermode

public class AvoidXfermode extends Xfermode
{
	public static final class Mode extends Enum
	{

		public static final Mode AVOID;
		public static final Mode TARGET;
		private static final Mode $VALUES[];

		public static final Mode[] values()
		{
			return (Mode[])$VALUES.clone();
		}

		public static Mode valueOf(String name)
		{
			return (Mode)Enum.valueOf(android/graphics/AvoidXfermode$Mode, name);
		}

		static 
		{
			AVOID = new Mode("AVOID", 0);
			TARGET = new Mode("TARGET", 1);
			$VALUES = (new Mode[] {
				AVOID, TARGET
			});
		}

		private Mode(String s, int i)
		{
			super(s, i);
		}
	}


	public AvoidXfermode(int opColor, int tolerance, Mode mode)
	{
		throw new RuntimeException("Stub!");
	}
}
