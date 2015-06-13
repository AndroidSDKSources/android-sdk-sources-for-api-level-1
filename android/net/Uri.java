// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Uri.java

package android.net;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.List;

public abstract class Uri
	implements Parcelable, Comparable
{
	public static final class Builder
	{

		public Builder scheme(String scheme)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder opaquePart(String opaquePart)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder encodedOpaquePart(String opaquePart)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder authority(String authority)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder encodedAuthority(String authority)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder path(String path)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder encodedPath(String path)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder appendPath(String newSegment)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder appendEncodedPath(String newSegment)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder query(String query)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder encodedQuery(String query)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder fragment(String fragment)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder encodedFragment(String fragment)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder appendQueryParameter(String key, String value)
		{
			throw new RuntimeException("Stub!");
		}

		public Uri build()
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}

		public Builder()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final Uri EMPTY = null;
	public static final android.os.Parcelable.Creator CREATOR = null;

	Uri()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isHierarchical();

	public boolean isOpaque()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isRelative();

	public boolean isAbsolute()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String getScheme();

	public abstract String getSchemeSpecificPart();

	public abstract String getEncodedSchemeSpecificPart();

	public abstract String getAuthority();

	public abstract String getEncodedAuthority();

	public abstract String getUserInfo();

	public abstract String getEncodedUserInfo();

	public abstract String getHost();

	public abstract int getPort();

	public abstract String getPath();

	public abstract String getEncodedPath();

	public abstract String getQuery();

	public abstract String getEncodedQuery();

	public abstract String getFragment();

	public abstract String getEncodedFragment();

	public abstract List getPathSegments();

	public abstract String getLastPathSegment();

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(Uri other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String toString();

	public abstract Builder buildUpon();

	public static Uri parse(String uriString)
	{
		throw new RuntimeException("Stub!");
	}

	public static Uri fromFile(File file)
	{
		throw new RuntimeException("Stub!");
	}

	public static Uri fromParts(String scheme, String ssp, String fragment)
	{
		throw new RuntimeException("Stub!");
	}

	public List getQueryParameters(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public String getQueryParameter(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public static void writeToParcel(Parcel out, Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public static String encode(String s)
	{
		throw new RuntimeException("Stub!");
	}

	public static String encode(String s, String allow)
	{
		throw new RuntimeException("Stub!");
	}

	public static String decode(String s)
	{
		throw new RuntimeException("Stub!");
	}

	public static Uri withAppendedPath(Uri baseUri, String pathSegment)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Uri)x0);
	}

}
