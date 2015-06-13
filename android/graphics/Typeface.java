// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Typeface.java

package android.graphics;

import android.content.res.AssetManager;

public class Typeface
{

	public static final Typeface DEFAULT = null;
	public static final Typeface DEFAULT_BOLD = null;
	public static final Typeface SANS_SERIF = null;
	public static final Typeface SERIF = null;
	public static final Typeface MONOSPACE = null;
	public static final int NORMAL = 0;
	public static final int BOLD = 1;
	public static final int ITALIC = 2;
	public static final int BOLD_ITALIC = 3;

	Typeface()
	{
		throw new RuntimeException("Stub!");
	}

	public int getStyle()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isBold()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isItalic()
	{
		throw new RuntimeException("Stub!");
	}

	public static Typeface create(String familyName, int style)
	{
		throw new RuntimeException("Stub!");
	}

	public static Typeface create(Typeface family, int style)
	{
		throw new RuntimeException("Stub!");
	}

	public static Typeface defaultFromStyle(int style)
	{
		throw new RuntimeException("Stub!");
	}

	public static Typeface createFromAsset(AssetManager mgr, String path)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

}
