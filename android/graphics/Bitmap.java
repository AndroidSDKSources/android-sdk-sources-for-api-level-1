// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Bitmap.java

package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.OutputStream;
import java.nio.Buffer;

// Referenced classes of package android.graphics:
//			Matrix, Paint

public final class Bitmap
	implements Parcelable
{
	public static final class CompressFormat extends Enum
	{

		public static final CompressFormat JPEG;
		public static final CompressFormat PNG;
		private static final CompressFormat $VALUES[];

		public static final CompressFormat[] values()
		{
			return (CompressFormat[])$VALUES.clone();
		}

		public static CompressFormat valueOf(String name)
		{
			return (CompressFormat)Enum.valueOf(android/graphics/Bitmap$CompressFormat, name);
		}

		static 
		{
			JPEG = new CompressFormat("JPEG", 0);
			PNG = new CompressFormat("PNG", 1);
			$VALUES = (new CompressFormat[] {
				JPEG, PNG
			});
		}

		private CompressFormat(String s, int i)
		{
			super(s, i);
		}
	}

	public static final class Config extends Enum
	{

		public static final Config ALPHA_8;
		public static final Config ARGB_4444;
		public static final Config ARGB_8888;
		public static final Config RGB_565;
		private static final Config $VALUES[];

		public static final Config[] values()
		{
			return (Config[])$VALUES.clone();
		}

		public static Config valueOf(String name)
		{
			return (Config)Enum.valueOf(android/graphics/Bitmap$Config, name);
		}

		static 
		{
			ALPHA_8 = new Config("ALPHA_8", 0);
			ARGB_4444 = new Config("ARGB_4444", 1);
			ARGB_8888 = new Config("ARGB_8888", 2);
			RGB_565 = new Config("RGB_565", 3);
			$VALUES = (new Config[] {
				ALPHA_8, ARGB_4444, ARGB_8888, RGB_565
			});
		}

		private Config(String s, int i)
		{
			super(s, i);
		}
	}


	public static final android.os.Parcelable.Creator CREATOR = null;

	Bitmap()
	{
		throw new RuntimeException("Stub!");
	}

	public void recycle()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isRecycled()
	{
		throw new RuntimeException("Stub!");
	}

	public void copyPixelsToBuffer(Buffer dst)
	{
		throw new RuntimeException("Stub!");
	}

	public Bitmap copy(Config config, boolean isMutable)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap createScaledBitmap(Bitmap src, int dstWidth, int dstHeight, boolean filter)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap createBitmap(Bitmap src)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap createBitmap(Bitmap source, int x, int y, int width, int height)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap createBitmap(Bitmap source, int x, int y, int width, int height, Matrix m, boolean filter)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap createBitmap(int width, int height, Config config)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap createBitmap(int colors[], int offset, int stride, int width, int height, Config config)
	{
		throw new RuntimeException("Stub!");
	}

	public static Bitmap createBitmap(int colors[], int width, int height, Config config)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getNinePatchChunk()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean compress(CompressFormat format, int quality, OutputStream stream)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isMutable()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getWidth()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getHeight()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getRowBytes()
	{
		throw new RuntimeException("Stub!");
	}

	public final Config getConfig()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean hasAlpha()
	{
		throw new RuntimeException("Stub!");
	}

	public void eraseColor(int c)
	{
		throw new RuntimeException("Stub!");
	}

	public int getPixel(int x, int y)
	{
		throw new RuntimeException("Stub!");
	}

	public void getPixels(int pixels[], int offset, int stride, int x, int y, int width, int height)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPixel(int x, int y, int color)
	{
		throw new RuntimeException("Stub!");
	}

	public void setPixels(int pixels[], int offset, int stride, int x, int y, int width, int height)
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel p, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public Bitmap extractAlpha()
	{
		throw new RuntimeException("Stub!");
	}

	public Bitmap extractAlpha(Paint paint, int offsetXY[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

}
