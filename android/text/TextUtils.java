// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TextUtils.java

package android.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.regex.Pattern;

// Referenced classes of package android.text:
//			Spanned, Spannable, TextPaint

public class TextUtils
{
	public static interface EllipsizeCallback
	{

		public abstract void ellipsized(int i, int j);
	}

	public static final class TruncateAt extends Enum
	{

		public static final TruncateAt END;
		public static final TruncateAt MIDDLE;
		public static final TruncateAt START;
		private static final TruncateAt $VALUES[];

		public static final TruncateAt[] values()
		{
			return (TruncateAt[])$VALUES.clone();
		}

		public static TruncateAt valueOf(String name)
		{
			return (TruncateAt)Enum.valueOf(android/text/TextUtils$TruncateAt, name);
		}

		static 
		{
			END = new TruncateAt("END", 0);
			MIDDLE = new TruncateAt("MIDDLE", 1);
			START = new TruncateAt("START", 2);
			$VALUES = (new TruncateAt[] {
				END, MIDDLE, START
			});
		}

		private TruncateAt(String s, int i)
		{
			super(s, i);
		}
	}

	public static class SimpleStringSplitter
		implements StringSplitter, Iterator
	{

		public void setString(String string)
		{
			throw new RuntimeException("Stub!");
		}

		public Iterator iterator()
		{
			throw new RuntimeException("Stub!");
		}

		public boolean hasNext()
		{
			throw new RuntimeException("Stub!");
		}

		public String next()
		{
			throw new RuntimeException("Stub!");
		}

		public void remove()
		{
			throw new RuntimeException("Stub!");
		}

		public volatile Object next()
		{
			return next();
		}

		public SimpleStringSplitter(char delimiter)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface StringSplitter
		extends Iterable
	{

		public abstract void setString(String s);
	}


	public static final android.os.Parcelable.Creator CHAR_SEQUENCE_CREATOR = null;

	TextUtils()
	{
		throw new RuntimeException("Stub!");
	}

	public static void getChars(CharSequence s, int start, int end, char dest[], int destoff)
	{
		throw new RuntimeException("Stub!");
	}

	public static int indexOf(CharSequence s, char ch)
	{
		throw new RuntimeException("Stub!");
	}

	public static int indexOf(CharSequence s, char ch, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public static int indexOf(CharSequence s, char ch, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public static int lastIndexOf(CharSequence s, char ch)
	{
		throw new RuntimeException("Stub!");
	}

	public static int lastIndexOf(CharSequence s, char ch, int last)
	{
		throw new RuntimeException("Stub!");
	}

	public static int lastIndexOf(CharSequence s, char ch, int start, int last)
	{
		throw new RuntimeException("Stub!");
	}

	public static int indexOf(CharSequence s, CharSequence needle)
	{
		throw new RuntimeException("Stub!");
	}

	public static int indexOf(CharSequence s, CharSequence needle, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public static int indexOf(CharSequence s, CharSequence needle, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean regionMatches(CharSequence one, int toffset, CharSequence two, int ooffset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public static String substring(CharSequence source, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public static String join(CharSequence delimiter, Object tokens[])
	{
		throw new RuntimeException("Stub!");
	}

	public static String join(CharSequence delimiter, Iterable tokens)
	{
		throw new RuntimeException("Stub!");
	}

	public static String[] split(String text, String expression)
	{
		throw new RuntimeException("Stub!");
	}

	public static String[] split(String text, Pattern pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharSequence stringOrSpannedString(CharSequence source)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isEmpty(CharSequence str)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getTrimmedLength(CharSequence s)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(CharSequence a, CharSequence b)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharSequence getReverse(CharSequence source, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public static void writeToParcel(CharSequence cs, Parcel p, int parcelableFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharSequence replace(CharSequence template, String sources[], CharSequence destinations[])
	{
		throw new RuntimeException("Stub!");
	}

	public static transient CharSequence expandTemplate(CharSequence template, CharSequence values[])
	{
		throw new RuntimeException("Stub!");
	}

	public static int getOffsetBefore(CharSequence text, int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public static int getOffsetAfter(CharSequence text, int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public static void copySpansFrom(Spanned source, int start, int end, Class kind, Spannable dest, int destoff)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharSequence ellipsize(CharSequence text, TextPaint p, float avail, TruncateAt where)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharSequence ellipsize(CharSequence text, TextPaint p, float avail, TruncateAt where, boolean preserveLength, EllipsizeCallback callback)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharSequence commaEllipsize(CharSequence text, TextPaint p, float avail, String oneMore, String more)
	{
		throw new RuntimeException("Stub!");
	}

	public static String htmlEncode(String s)
	{
		throw new RuntimeException("Stub!");
	}

	public static transient CharSequence concat(CharSequence text[])
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isGraphic(CharSequence str)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isGraphic(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isDigitsOnly(CharSequence str)
	{
		throw new RuntimeException("Stub!");
	}

}
