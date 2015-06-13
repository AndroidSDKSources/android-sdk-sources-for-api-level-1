// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Gravity.java

package android.view;

import android.graphics.Rect;

public class Gravity
{

	public static final int NO_GRAVITY = 0;
	public static final int AXIS_SPECIFIED = 1;
	public static final int AXIS_PULL_BEFORE = 2;
	public static final int AXIS_PULL_AFTER = 4;
	public static final int AXIS_X_SHIFT = 0;
	public static final int AXIS_Y_SHIFT = 4;
	public static final int TOP = 48;
	public static final int BOTTOM = 80;
	public static final int LEFT = 3;
	public static final int RIGHT = 5;
	public static final int CENTER_VERTICAL = 16;
	public static final int FILL_VERTICAL = 112;
	public static final int CENTER_HORIZONTAL = 1;
	public static final int FILL_HORIZONTAL = 7;
	public static final int CENTER = 17;
	public static final int FILL = 119;
	public static final int HORIZONTAL_GRAVITY_MASK = 7;
	public static final int VERTICAL_GRAVITY_MASK = 112;

	public Gravity()
	{
		throw new RuntimeException("Stub!");
	}

	public static void apply(int gravity, int w, int h, Rect container, Rect outRect)
	{
		throw new RuntimeException("Stub!");
	}

	public static void apply(int gravity, int w, int h, Rect container, int xAdj, int yAdj, Rect outRect)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isVertical(int gravity)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isHorizontal(int gravity)
	{
		throw new RuntimeException("Stub!");
	}
}
