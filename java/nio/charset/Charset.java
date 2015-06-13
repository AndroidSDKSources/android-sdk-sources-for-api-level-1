// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Charset.java

package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.*;

// Referenced classes of package java.nio.charset:
//			IllegalCharsetNameException, UnsupportedCharsetException, CharsetEncoder, CharsetDecoder

public abstract class Charset
	implements Comparable
{

	protected Charset(String canonicalName, String aliases[])
		throws IllegalCharsetNameException
	{
		throw new RuntimeException("Stub!");
	}

	public static SortedMap availableCharsets()
	{
		throw new RuntimeException("Stub!");
	}

	public static Charset forName(String charsetName)
		throws IllegalCharsetNameException, UnsupportedCharsetException
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isSupported(String charsetName)
		throws IllegalCharsetNameException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean contains(Charset charset);

	public abstract CharsetEncoder newEncoder();

	public abstract CharsetDecoder newDecoder();

	public final String name()
	{
		throw new RuntimeException("Stub!");
	}

	public final Set aliases()
	{
		throw new RuntimeException("Stub!");
	}

	public String displayName()
	{
		throw new RuntimeException("Stub!");
	}

	public String displayName(Locale l)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isRegistered()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canEncode()
	{
		throw new RuntimeException("Stub!");
	}

	public final synchronized ByteBuffer encode(CharBuffer buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public final ByteBuffer encode(String s)
	{
		throw new RuntimeException("Stub!");
	}

	public final CharBuffer decode(ByteBuffer buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public final int compareTo(Charset charset)
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean equals(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public final int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public final String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public static Charset defaultCharset()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((Charset)x0);
	}
}
