// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Movie.java

package android.graphics;

import java.io.InputStream;

// Referenced classes of package android.graphics:
//			Canvas, Paint

public class Movie
{

	Movie()
	{
		throw new RuntimeException("Stub!");
	}

	public native int width();

	public native int height();

	public native boolean isOpaque();

	public native int duration();

	public native boolean setTime(int i);

	public native void draw(Canvas canvas, float f, float f1, Paint paint);

	public void draw(Canvas canvas, float x, float y)
	{
		throw new RuntimeException("Stub!");
	}

	public static native Movie decodeStream(InputStream inputstream);

	public static native Movie decodeByteArray(byte abyte0[], int i, int j);

	public static Movie decodeFile(String pathName)
	{
		throw new RuntimeException("Stub!");
	}
}
