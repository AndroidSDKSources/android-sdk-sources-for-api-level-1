// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ComponentInfo.java

package android.content.pm;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.util.Printer;

// Referenced classes of package android.content.pm:
//			PackageItemInfo, ApplicationInfo, PackageManager

public class ComponentInfo extends PackageItemInfo
{

	public ApplicationInfo applicationInfo;
	public String processName;
	public boolean enabled;
	public boolean exported;

	public ComponentInfo()
	{
		throw new RuntimeException("Stub!");
	}

	public ComponentInfo(ComponentInfo orig)
	{
		throw new RuntimeException("Stub!");
	}

	protected ComponentInfo(Parcel source)
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

	public final int getIconResource()
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
