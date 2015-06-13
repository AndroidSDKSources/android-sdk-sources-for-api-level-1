// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PorterDuff.java

package android.graphics;


public class PorterDuff
{
	public static final class Mode extends Enum
	{

		public static final Mode CLEAR;
		public static final Mode DARKEN;
		public static final Mode DST;
		public static final Mode DST_ATOP;
		public static final Mode DST_IN;
		public static final Mode DST_OUT;
		public static final Mode DST_OVER;
		public static final Mode LIGHTEN;
		public static final Mode MULTIPLY;
		public static final Mode SCREEN;
		public static final Mode SRC;
		public static final Mode SRC_ATOP;
		public static final Mode SRC_IN;
		public static final Mode SRC_OUT;
		public static final Mode SRC_OVER;
		public static final Mode XOR;
		private static final Mode $VALUES[];

		public static final Mode[] values()
		{
			return (Mode[])$VALUES.clone();
		}

		public static Mode valueOf(String name)
		{
			return (Mode)Enum.valueOf(android/graphics/PorterDuff$Mode, name);
		}

		static 
		{
			CLEAR = new Mode("CLEAR", 0);
			DARKEN = new Mode("DARKEN", 1);
			DST = new Mode("DST", 2);
			DST_ATOP = new Mode("DST_ATOP", 3);
			DST_IN = new Mode("DST_IN", 4);
			DST_OUT = new Mode("DST_OUT", 5);
			DST_OVER = new Mode("DST_OVER", 6);
			LIGHTEN = new Mode("LIGHTEN", 7);
			MULTIPLY = new Mode("MULTIPLY", 8);
			SCREEN = new Mode("SCREEN", 9);
			SRC = new Mode("SRC", 10);
			SRC_ATOP = new Mode("SRC_ATOP", 11);
			SRC_IN = new Mode("SRC_IN", 12);
			SRC_OUT = new Mode("SRC_OUT", 13);
			SRC_OVER = new Mode("SRC_OVER", 14);
			XOR = new Mode("XOR", 15);
			$VALUES = (new Mode[] {
				CLEAR, DARKEN, DST, DST_ATOP, DST_IN, DST_OUT, DST_OVER, LIGHTEN, MULTIPLY, SCREEN, 
				SRC, SRC_ATOP, SRC_IN, SRC_OUT, SRC_OVER, XOR
			});
		}

		private Mode(String s, int i)
		{
			super(s, i);
		}
	}


	public PorterDuff()
	{
		throw new RuntimeException("Stub!");
	}
}
