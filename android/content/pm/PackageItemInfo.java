// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PackageItemInfo.java

package android.content.pm;

import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Printer;
import java.util.Comparator;

// Referenced classes of package android.content.pm:
//			PackageManager

public class PackageItemInfo
{
	public static class DisplayNameComparator
		implements Comparator
	{

		public final int compare(PackageItemInfo aa, PackageItemInfo ab)
		{
			throw new RuntimeException("Stub!");
		}

		public volatile int compare(Object x0, Object x1)
		{
			return compare((PackageItemInfo)x0, (PackageItemInfo)x1);
		}

		public DisplayNameComparator(PackageManager pm)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public String name;
	public String packageName;
	public int labelRes;
	public CharSequence nonLocalizedLabel;
	public int icon;
	public Bundle metaData;

	public PackageItemInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public PackageItemInfo(PackageItemInfo orig)
	{
		throw new RuntimeException("Stub!");
	}

	protected PackageItemInfo(Parcel source)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence loadLabel(PackageManager pm)
	{
		throw new RuntimeException("Stub!");
	}

	public Drawable loadIcon(PackageManager pm)
	{
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser loadXmlMetaData(PackageManager pm, String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dumpFront(Printer pw, String prefix)
	{
		throw new RuntimeException("Stub!");
	}

	protected void dumpBack(Printer pw, String prefix)
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel dest, int parcelableFlags)
	{
		throw new RuntimeException("Stub!");
	}
}
