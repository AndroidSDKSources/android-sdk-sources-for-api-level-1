// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ColorStateList.java

package android.content.res;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.content.res:
//			Resources

public class ColorStateList
	implements Parcelable
{

	public static final android.os.Parcelable.Creator CREATOR = null;

	public ColorStateList(int states[][], int colors[])
	{
		throw new RuntimeException("Stub!");
	}

	public static ColorStateList valueOf(int color)
	{
		throw new RuntimeException("Stub!");
	}

	public static ColorStateList createFromXml(Resources r, XmlPullParser parser)
		throws XmlPullParserException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public ColorStateList withAlpha(int alpha)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isStateful()
	{
		throw new RuntimeException("Stub!");
	}

	public int getColorForState(int stateSet[], int defaultColor)
	{
		throw new RuntimeException("Stub!");
	}

	public int getDefaultColor()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel dest, int flags)
	{
		throw new RuntimeException("Stub!");
	}

}
