// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RoundingMode.java

package java.math;


public final class RoundingMode extends Enum
{

	public static final RoundingMode CEILING;
	public static final RoundingMode DOWN;
	public static final RoundingMode FLOOR;
	public static final RoundingMode HALF_DOWN;
	public static final RoundingMode HALF_EVEN;
	public static final RoundingMode HALF_UP;
	public static final RoundingMode UNNECESSARY;
	public static final RoundingMode UP;
	private static final RoundingMode $VALUES[];

	public static final RoundingMode[] values()
	{
		return (RoundingMode[])$VALUES.clone();
	}

	public static RoundingMode valueOf(String name)
	{
		return (RoundingMode)Enum.valueOf(java/math/RoundingMode, name);
	}

	private RoundingMode(String s, int i)
	{
		super(s, i);
	}

	public static RoundingMode valueOf(int rM)
	{
		throw new RuntimeException("Stub!");
	}

	static 
	{
		CEILING = new RoundingMode("CEILING", 0);
		DOWN = new RoundingMode("DOWN", 1);
		FLOOR = new RoundingMode("FLOOR", 2);
		HALF_DOWN = new RoundingMode("HALF_DOWN", 3);
		HALF_EVEN = new RoundingMode("HALF_EVEN", 4);
		HALF_UP = new RoundingMode("HALF_UP", 5);
		UNNECESSARY = new RoundingMode("UNNECESSARY", 6);
		UP = new RoundingMode("UP", 7);
		$VALUES = (new RoundingMode[] {
			CEILING, DOWN, FLOOR, HALF_DOWN, HALF_EVEN, HALF_UP, UNNECESSARY, UP
		});
	}
}
