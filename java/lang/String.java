// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   String.java

package java.lang;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.Locale;

// Referenced classes of package java.lang:
//			Object, RuntimeException, Comparable, CharSequence, 
//			StringBuffer, StringBuilder

public final class String
	implements Serializable, Comparable, CharSequence
{

	public static final Comparator CASE_INSENSITIVE_ORDER = null;

	public String()
	{
		throw new RuntimeException("Stub!");
	}

	public String(byte data[])
	{
		throw new RuntimeException("Stub!");
	}

	public String(byte data[], int high)
	{
		throw new RuntimeException("Stub!");
	}

	public String(byte data[], int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public String(byte data[], int high, int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public String(byte data[], int start, int length, String encoding)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public String(byte data[], String encoding)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public String(char data[])
	{
		throw new RuntimeException("Stub!");
	}

	public String(char data[], int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public String(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public String(StringBuffer stringbuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public String(int codePoints[], int offset, int count)
	{
		throw new RuntimeException("Stub!");
	}

	public String(StringBuilder sb)
	{
		throw new RuntimeException("Stub!");
	}

	public char charAt(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public int compareTo(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public int compareToIgnoreCase(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public String concat(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public static String copyValueOf(char data[])
	{
		throw new RuntimeException("Stub!");
	}

	public static String copyValueOf(char data[], int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean endsWith(String suffix)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equalsIgnoreCase(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getBytes()
	{
		throw new RuntimeException("Stub!");
	}

	public void getBytes(int start, int end, byte data[], int index)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getBytes(String encoding)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public void getChars(int start, int end, char buffer[], int index)
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public int indexOf(int c)
	{
		throw new RuntimeException("Stub!");
	}

	public int indexOf(int c, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public int indexOf(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public int indexOf(String subString, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public native String intern();

	public int lastIndexOf(int c)
	{
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(int c, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(String subString, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public int length()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean regionMatches(int thisStart, String string, int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean regionMatches(boolean ignoreCase, int thisStart, String string, int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public String replace(char oldChar, char newChar)
	{
		throw new RuntimeException("Stub!");
	}

	public String replace(CharSequence target, CharSequence replacement)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean startsWith(String prefix)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean startsWith(String prefix, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public String substring(int start)
	{
		throw new RuntimeException("Stub!");
	}

	public String substring(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public char[] toCharArray()
	{
		throw new RuntimeException("Stub!");
	}

	public String toLowerCase()
	{
		throw new RuntimeException("Stub!");
	}

	public String toLowerCase(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public String toUpperCase()
	{
		throw new RuntimeException("Stub!");
	}

	public String toUpperCase(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public String trim()
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(char data[])
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(char data[], int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(char value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(double value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(float value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(long value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(Object value)
	{
		throw new RuntimeException("Stub!");
	}

	public static String valueOf(boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean contentEquals(StringBuffer strbuf)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean contentEquals(CharSequence cs)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean matches(String expr)
	{
		throw new RuntimeException("Stub!");
	}

	public String replaceAll(String expr, String substitute)
	{
		throw new RuntimeException("Stub!");
	}

	public String replaceFirst(String expr, String substitute)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] split(String expr)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] split(String expr, int max)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence subSequence(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public int codePointAt(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public int codePointBefore(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public int codePointCount(int beginIndex, int endIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean contains(CharSequence cs)
	{
		throw new RuntimeException("Stub!");
	}

	public int offsetByCodePoints(int index, int codePointOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public static transient String format(String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public static transient String format(Locale loc, String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((String)x0);
	}

}
