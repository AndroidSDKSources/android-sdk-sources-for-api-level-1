// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharBuffer.java

package java.nio;

import java.io.IOException;

// Referenced classes of package java.nio:
//			Buffer, ByteOrder

public abstract class CharBuffer extends Buffer
	implements Comparable, CharSequence, Appendable, Readable
{

	CharBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer allocate(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(char array[])
	{
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(char array[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(CharSequence chseq)
	{
		throw new RuntimeException("Stub!");
	}

	public static CharBuffer wrap(CharSequence chseq, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public final char[] array()
	{
		throw new RuntimeException("Stub!");
	}

	public final int arrayOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CharBuffer asReadOnlyBuffer();

	public final char charAt(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CharBuffer compact();

	public int compareTo(CharBuffer otherBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CharBuffer duplicate();

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract char get();

	public CharBuffer get(char dest[])
	{
		throw new RuntimeException("Stub!");
	}

	public CharBuffer get(char dest[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract char get(int i);

	public final boolean hasArray()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isDirect();

	public final int length()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ByteOrder order();

	public abstract CharBuffer put(char c);

	public final CharBuffer put(char src[])
	{
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(char src[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(CharBuffer src)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CharBuffer put(int i, char c);

	public final CharBuffer put(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public CharBuffer put(String str, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CharBuffer slice();

	public abstract CharSequence subSequence(int i, int j);

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public CharBuffer append(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public CharBuffer append(CharSequence csq)
	{
		throw new RuntimeException("Stub!");
	}

	public CharBuffer append(CharSequence csq, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public int read(CharBuffer target)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((CharBuffer)x0);
	}

	public volatile Appendable append(CharSequence x0, int x1, int x2)
		throws IOException
	{
		return append(x0, x1, x2);
	}

	public volatile Appendable append(CharSequence x0)
		throws IOException
	{
		return append(x0);
	}

	public volatile Appendable append(char x0)
		throws IOException
	{
		return append(x0);
	}
}
