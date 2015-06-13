// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PixelFormat.java

package android.graphics;


public class PixelFormat
{

	public static final int UNKNOWN = 0;
	public static final int TRANSLUCENT = -3;
	public static final int TRANSPARENT = -2;
	public static final int OPAQUE = -1;
	public static final int RGBA_8888 = 1;
	public static final int RGBX_8888 = 2;
	public static final int RGB_888 = 3;
	public static final int RGB_565 = 4;
	public static final int RGBA_5551 = 6;
	public static final int RGBA_4444 = 7;
	public static final int A_8 = 8;
	public static final int L_8 = 9;
	public static final int LA_88 = 10;
	public static final int RGB_332 = 11;
	public static final int YCbCr_422_SP = 16;
	public static final int YCbCr_420_SP = 17;
	public static final int JPEG = 256;
	public int bytesPerPixel;
	public int bitsPerPixel;

	public PixelFormat()
	{
		throw new RuntimeException("Stub!");
	}

	public static native void getPixelFormatInfo(int i, PixelFormat pixelformat);

	public static boolean formatHasAlpha(int format)
	{
		throw new RuntimeException("Stub!");
	}
}
