// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringBuilder.java

package java.lang;

import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package java.lang:
//			AbstractStringBuilder, RuntimeException, Appendable, CharSequence, 
//			String, Object, StringBuffer

public final class StringBuilder extends AbstractStringBuilder
	implements Appendable, CharSequence, Serializable
{

	public StringBuilder()
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder(CharSequence seq)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(boolean b)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(int i)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(long lng)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(float f)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(double d)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(String str)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(StringBuffer sb)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(char ch[])
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(char str[], int offset, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(CharSequence csq)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder append(CharSequence csq, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder appendCodePoint(int codePoint)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder delete(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder deleteCharAt(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, boolean b)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, char c)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, int i)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, long l)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, float f)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, double d)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, Object obj)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, String str)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, char ch[])
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, char str[], int strOffset, int strLen)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, CharSequence s)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder insert(int offset, CharSequence s, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder replace(int start, int end, String str)
	{
		throw new RuntimeException("Stub!");
	}

	public StringBuilder reverse()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
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
