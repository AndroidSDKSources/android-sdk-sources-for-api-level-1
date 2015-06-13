// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringBuffer.java

package java.lang;

import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package java.lang:
//			AbstractStringBuilder, RuntimeException, Appendable, CharSequence, 
//			String, Object

public final class StringBuffer extends AbstractStringBuilder
	implements Appendable, Serializable, CharSequence
{

	public StringBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer(CharSequence cs)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer append(boolean b)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(char ch)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer append(double d)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer append(float f)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer append(int i)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer append(long l)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(String string)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(StringBuffer sb)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(char chars[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(char chars[], int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(CharSequence s)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer append(CharSequence s, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer appendCodePoint(int codePoint)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized char charAt(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int codePointAt(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int codePointBefore(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int codePointCount(int beginIndex, int endIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer delete(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer deleteCharAt(int location)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void ensureCapacity(int min)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void getChars(int start, int end, char buffer[], int idx)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int indexOf(String subString, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer insert(int index, char ch)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer insert(int index, boolean b)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer insert(int index, int i)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer insert(int index, long l)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer insert(int index, double d)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer insert(int index, float f)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuffer insert(int index, Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer insert(int index, String string)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer insert(int index, char chars[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer insert(int index, char chars[], int start, int length)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer insert(int index, CharSequence s)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer insert(int index, CharSequence s, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int lastIndexOf(String subString, int start)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int offsetByCodePoints(int index, int codePointOffset)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer replace(int start, int end, String string)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized StringBuffer reverse()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setCharAt(int index, char ch)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setLength(int length)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized CharSequence subSequence(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String substring(int start)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String substring(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void trimToSize()
	{
		throw new RuntimeException("Stub!");
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
