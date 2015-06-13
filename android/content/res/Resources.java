// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Resources.java

package android.content.res;

import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.util.*;
import java.io.InputStream;

// Referenced classes of package android.content.res:
//			AssetManager, Configuration, TypedArray, ColorStateList, 
//			XmlResourceParser, AssetFileDescriptor

public class Resources
{
	public final class Theme
	{

		final Resources this$0;

		public void applyStyle(int resid, boolean force)
		{
			throw new RuntimeException("Stub!");
		}

		public void setTo(Theme other)
		{
			throw new RuntimeException("Stub!");
		}

		public TypedArray obtainStyledAttributes(int attrs[])
		{
			throw new RuntimeException("Stub!");
		}

		public TypedArray obtainStyledAttributes(int resid, int attrs[])
			throws NotFoundException
		{
			throw new RuntimeException("Stub!");
		}

		public TypedArray obtainStyledAttributes(AttributeSet set, int attrs[], int defStyleAttr, int defStyleRes)
		{
			throw new RuntimeException("Stub!");
		}

		public boolean resolveAttribute(int resid, TypedValue outValue, boolean resolveRefs)
		{
			throw new RuntimeException("Stub!");
		}

		public void dump(int priority, String tag, String prefix)
		{
			throw new RuntimeException("Stub!");
		}

		protected void finalize()
			throws Throwable
		{
			throw new RuntimeException("Stub!");
		}

		Theme()
		{
			this$0 = Resources.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}

	public static class NotFoundException extends RuntimeException
	{

		public NotFoundException()
		{
			throw new RuntimeException("Stub!");
		}

		public NotFoundException(String name)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public Resources(AssetManager assets, DisplayMetrics metrics, Configuration config)
	{
		throw new RuntimeException("Stub!");
	}

	public static Resources getSystem()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getQuantityText(int id, int quantity)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getString(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public transient String getString(int id, Object formatArgs[])
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public transient String getQuantityString(int id, int quantity, Object formatArgs[])
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getQuantityString(int id, int quantity)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText(int id, CharSequence def)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence[] getTextArray(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getStringArray(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int[] getIntArray(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public TypedArray obtainTypedArray(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public float getDimension(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getDimensionPixelOffset(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getDimensionPixelSize(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getDrawable(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Movie getMovie(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getColor(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public ColorStateList getColorStateList(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getInteger(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getLayout(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getAnimation(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getXml(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream openRawResource(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public AssetFileDescriptor openRawResourceFd(int id)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void getValue(int id, TypedValue outValue, boolean resolveRefs)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void getValue(String name, TypedValue outValue, boolean resolveRefs)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final Theme newTheme()
	{
		throw new RuntimeException("Stub!");
	}

	public TypedArray obtainAttributes(AttributeSet set, int attrs[])
	{
		throw new RuntimeException("Stub!");
	}

	public void updateConfiguration(Configuration config, DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public DisplayMetrics getDisplayMetrics()
	{
		throw new RuntimeException("Stub!");
	}

	public Configuration getConfiguration()
	{
		throw new RuntimeException("Stub!");
	}

	public int getIdentifier(String name, String defType, String defPackage)
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourceName(int resid)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourcePackageName(int resid)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourceTypeName(int resid)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourceEntryName(int resid)
		throws NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final AssetManager getAssets()
	{
		throw new RuntimeException("Stub!");
	}

	public final void flushLayoutCache()
	{
		throw new RuntimeException("Stub!");
	}

	public final void finishPreloading()
	{
		throw new RuntimeException("Stub!");
	}
}
