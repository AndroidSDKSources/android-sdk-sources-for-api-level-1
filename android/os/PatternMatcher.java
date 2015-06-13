// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PatternMatcher.java

package android.os;


// Referenced classes of package android.os:
//			Parcelable, Parcel

public class PatternMatcher
	implements Parcelable
{

	public static final int PATTERN_LITERAL = 0;
	public static final int PATTERN_PREFIX = 1;
	public static final int PATTERN_SIMPLE_GLOB = 2;
	public static final Parcelable.Creator CREATOR = null;

	public PatternMatcher(String pattern, int type)
	{
		throw new RuntimeException("Stub!");
	}

	public PatternMatcher(Parcel src)
	{
		throw new RuntimeException("Stub!");
	}

	public final String getPath()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getType()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean match(String str)
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
