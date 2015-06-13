// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MockResources.java

package android.test.mock;

import android.content.res.*;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.util.*;
import java.io.InputStream;

public class MockResources extends Resources
{

	public MockResources()
	{
		super((AssetManager)null, (DisplayMetrics)null, (Configuration)null);
		throw new RuntimeException("Stub!");
	}

	public void updateConfiguration(Configuration config, DisplayMetrics metrics)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getQuantityText(int id, int quantity)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getString(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public transient String getString(int id, Object formatArgs[])
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public transient String getQuantityString(int id, int quantity, Object formatArgs[])
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getQuantityString(int id, int quantity)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText(int id, CharSequence def)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence[] getTextArray(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getStringArray(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int[] getIntArray(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public TypedArray obtainTypedArray(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public float getDimension(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getDimensionPixelOffset(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getDimensionPixelSize(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable getDrawable(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Movie getMovie(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getColor(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public ColorStateList getColorStateList(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public int getInteger(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getLayout(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getAnimation(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getXml(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream openRawResource(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public AssetFileDescriptor openRawResourceFd(int id)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void getValue(int id, TypedValue outValue, boolean resolveRefs)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public void getValue(String name, TypedValue outValue, boolean resolveRefs)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public TypedArray obtainAttributes(AttributeSet set, int attrs[])
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
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourcePackageName(int resid)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourceTypeName(int resid)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public String getResourceEntryName(int resid)
		throws android.content.res.Resources.NotFoundException
	{
		throw new RuntimeException("Stub!");
	}
}
