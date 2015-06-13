// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Surface.java

package android.view;

import android.graphics.*;
import android.os.Parcel;
import android.os.Parcelable;

public class Surface
	implements Parcelable
{
	public static class OutOfResourcesException extends Exception
	{

		public OutOfResourcesException()
		{
			throw new RuntimeException("Stub!");
		}

		public OutOfResourcesException(String name)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final int HIDDEN = 4;
	public static final int HARDWARE = 16;
	public static final int GPU = 40;
	public static final int SECURE = 128;
	public static final int NON_PREMULTIPLIED = 256;
	public static final int PUSH_BUFFERS = 512;
	public static final int FX_SURFACE_NORMAL = 0;
	public static final int FX_SURFACE_BLUR = 0x10000;
	public static final int FX_SURFACE_DIM = 0x20000;
	public static final int FX_SURFACE_MASK = 0xf0000;
	public static final int SURFACE_HIDDEN = 1;
	public static final int SURACE_FROZEN = 2;
	public static final int SURFACE_DITHER = 4;
	public static final int SURFACE_BLUR_FREEZE = 16;
	public static final int ROTATION_0 = 0;
	public static final int ROTATION_90 = 1;
	public static final int ROTATION_180 = 2;
	public static final int ROTATION_270 = 3;
	public static final android.os.Parcelable.Creator CREATOR = null;

	Surface()
	{
		throw new RuntimeException("Stub!");
	}

	public native boolean isValid();

	public Canvas lockCanvas(Rect dirty)
		throws OutOfResourcesException
	{
		throw new RuntimeException("Stub!");
	}

	public native void unlockCanvasAndPost(Canvas canvas);

	public native void unlockCanvas(Canvas canvas);

	public static native void setOrientation(int i, int j);

	public native void setLayer(int i);

	public native void setPosition(int i, int j);

	public native void setSize(int i, int j);

	public native void hide();

	public native void show();

	public native void setTransparentRegionHint(Region region);

	public native void setAlpha(float f);

	public native void setMatrix(float f, float f1, float f2, float f3);

	public native void freeze();

	public native void unfreeze();

	public native void setFreezeTint(int i);

	public native void setFlags(int i, int j);

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public native void readFromParcel(Parcel parcel);

	public native void writeToParcel(Parcel parcel, int i);

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

}
