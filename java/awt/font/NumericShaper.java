// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NumericShaper.java

package java.awt.font;

import java.io.Serializable;

public final class NumericShaper
	implements Serializable
{

	public static final int EUROPEAN = 1;
	public static final int ARABIC = 2;
	public static final int EASTERN_ARABIC = 4;
	public static final int DEVANAGARI = 8;
	public static final int BENGALI = 16;
	public static final int GURMUKHI = 32;
	public static final int GUJARATI = 64;
	public static final int ORIYA = 128;
	public static final int TAMIL = 256;
	public static final int TELUGU = 512;
	public static final int KANNADA = 1024;
	public static final int MALAYALAM = 2048;
	public static final int THAI = 4096;
	public static final int LAO = 8192;
	public static final int TIBETAN = 16384;
	public static final int MYANMAR = 32768;
	public static final int ETHIOPIC = 0x10000;
	public static final int KHMER = 0x20000;
	public static final int MONGOLIAN = 0x40000;
	public static final int ALL_RANGES = 0x7ffff;

	NumericShaper()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getContextualShaper(int ranges, int defaultContext)
	{
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getContextualShaper(int ranges)
	{
		throw new RuntimeException("Stub!");
	}

	public int getRanges()
	{
		throw new RuntimeException("Stub!");
	}

	public static NumericShaper getShaper(int singleRange)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isContextual()
	{
		throw new RuntimeException("Stub!");
	}

	public void shape(char text[], int start, int count, int context)
	{
		throw new RuntimeException("Stub!");
	}

	public void shape(char text[], int start, int count)
	{
		throw new RuntimeException("Stub!");
	}
}
