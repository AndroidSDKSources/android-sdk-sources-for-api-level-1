// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BitmapFactory.java

package android.graphics;

import android.content.res.Resources;
import java.io.FileDescriptor;
import java.io.InputStream;

// Referenced classes of package android.graphics:
//			Bitmap, Rect

public class BitmapFactory
{
	public static class Options
	{

		public boolean inJustDecodeBounds;
		public int inSampleSize;
		public Bitmap.Config inPreferredConfig;
		public boolean inDither;
		public int outWidth;
		public int outHeight;
		public String outMimeType;
		public byte inTempStorage[];
		public boolean mCancel;

		public void requestCancelDecode()
		{
			throw new RuntimeException("Stub!");
		}

		public Options()
		{
			inTempStorage = null;
			throw new RuntimeException("Stub!");
		}
	}


	public BitmapFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeFile(String pathName, Options opts)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeFile(String pathName)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeResource(Resources res, int id, Options opts)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeResource(Resources res, int id)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeByteArray(byte data[], int offset, int length, Options opts)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeByteArray(byte data[], int offset, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeStream(InputStream is, Rect outPadding, Options opts)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeStream(InputStream is)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeFileDescriptor(FileDescriptor fd, Rect outPadding, Options opts)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap decodeFileDescriptor(FileDescriptor fd)
	{
		throw new RuntimeException("Stub!");
	}
}
