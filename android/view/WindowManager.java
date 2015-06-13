// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WindowManager.java

package android.view;

import android.os.*;

// Referenced classes of package android.view:
//			ViewManager, Display, View, ViewGroup

public interface WindowManager
	extends ViewManager
{
	public static class LayoutParams extends ViewGroup.LayoutParams
		implements Parcelable
	{

		public int x;
		public int y;
		public float horizontalWeight;
		public float verticalWeight;
		public int type;
		public static final int FIRST_APPLICATION_WINDOW = 1;
		public static final int TYPE_BASE_APPLICATION = 1;
		public static final int TYPE_APPLICATION = 2;
		public static final int TYPE_APPLICATION_STARTING = 3;
		public static final int LAST_APPLICATION_WINDOW = 99;
		public static final int FIRST_SUB_WINDOW = 1000;
		public static final int TYPE_APPLICATION_PANEL = 1000;
		public static final int TYPE_APPLICATION_MEDIA = 1001;
		public static final int TYPE_APPLICATION_SUB_PANEL = 1002;
		public static final int LAST_SUB_WINDOW = 1999;
		public static final int FIRST_SYSTEM_WINDOW = 2000;
		public static final int TYPE_STATUS_BAR = 2000;
		public static final int TYPE_SEARCH_BAR = 2001;
		public static final int TYPE_PHONE = 2002;
		public static final int TYPE_SYSTEM_ALERT = 2003;
		public static final int TYPE_KEYGUARD = 2004;
		public static final int TYPE_TOAST = 2005;
		public static final int TYPE_SYSTEM_OVERLAY = 2006;
		public static final int TYPE_PRIORITY_PHONE = 2007;
		public static final int TYPE_STATUS_BAR_PANEL = 2008;
		public static final int TYPE_SYSTEM_DIALOG = 2008;
		public static final int TYPE_KEYGUARD_DIALOG = 2009;
		public static final int TYPE_SYSTEM_ERROR = 2010;
		public static final int LAST_SYSTEM_WINDOW = 2999;
		public int memoryType;
		public static final int MEMORY_TYPE_NORMAL = 0;
		public static final int MEMORY_TYPE_HARDWARE = 1;
		public static final int MEMORY_TYPE_GPU = 2;
		public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;
		public int flags;
		public static final int FLAG_DIM_BEHIND = 2;
		public static final int FLAG_BLUR_BEHIND = 4;
		public static final int FLAG_NOT_FOCUSABLE = 8;
		public static final int FLAG_NOT_TOUCHABLE = 16;
		public static final int FLAG_NOT_TOUCH_MODAL = 32;
		public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;
		public static final int FLAG_KEEP_SCREEN_ON = 128;
		public static final int FLAG_LAYOUT_IN_SCREEN = 256;
		public static final int FLAG_LAYOUT_NO_LIMITS = 512;
		public static final int FLAG_FULLSCREEN = 1024;
		public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;
		public static final int FLAG_DITHER = 4096;
		public static final int FLAG_SECURE = 8192;
		public static final int FLAG_SCALED = 16384;
		public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;
		public static final int FLAG_LAYOUT_INSET_DECOR = 0x10000;
		public int gravity;
		public float horizontalMargin;
		public float verticalMargin;
		public int format;
		public int windowAnimations;
		public float alpha;
		public float dimAmount;
		public IBinder token;
		public String packageName;
		public static final android.os.Parcelable.Creator CREATOR = null;
		public static final int LAYOUT_CHANGED = 1;
		public static final int TYPE_CHANGED = 2;
		public static final int FLAGS_CHANGED = 4;
		public static final int FORMAT_CHANGED = 8;
		public static final int ANIMATION_CHANGED = 16;
		public static final int DIM_AMOUNT_CHANGED = 32;
		public static final int TITLE_CHANGED = 64;
		public static final int ALPHA_CHANGED = 128;
		public static final int MEMORY_TYPE_CHANGED = 256;

		public final void setTitle(CharSequence title)
		{
			throw new RuntimeException("Stub!");
		}

		public final CharSequence getTitle()
		{
			throw new RuntimeException("Stub!");
		}

		public int describeContents()
		{
			throw new RuntimeException("Stub!");
		}

		public void writeToParcel(Parcel out, int parcelableFlags)
		{
			throw new RuntimeException("Stub!");
		}

		public final int copyFrom(LayoutParams o)
		{
			throw new RuntimeException("Stub!");
		}

		public String debug(String output)
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}


		public LayoutParams()
		{
			super((ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int _type)
		{
			super((ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int _type, int _flags)
		{
			super((ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int _type, int _flags, int _format)
		{
			super((ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int w, int h, int _type, int _flags, int _format)
		{
			super((ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(int w, int h, int xpos, int ypos, int _type, int _flags, int _format)
		{
			super((ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}

		public LayoutParams(Parcel in)
		{
			super((ViewGroup.LayoutParams)null);
			throw new RuntimeException("Stub!");
		}
	}

	public static class BadTokenException extends RuntimeException
	{

		public BadTokenException()
		{
			throw new RuntimeException("Stub!");
		}

		public BadTokenException(String name)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract Display getDefaultDisplay();

	public abstract void removeViewImmediate(View view);
}
