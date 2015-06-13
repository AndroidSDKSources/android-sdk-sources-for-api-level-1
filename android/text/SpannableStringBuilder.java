// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SpannableStringBuilder.java

package android.text;

import java.io.IOException;

// Referenced classes of package android.text:
//			GetChars, Spannable, Editable, InputFilter

public class SpannableStringBuilder
	implements CharSequence, GetChars, Spannable, Editable, Appendable
{

	public SpannableStringBuilder()
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder(CharSequence text, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public static SpannableStringBuilder valueOf(CharSequence source)
	{
		throw new RuntimeException("Stub!");
	}

	public char charAt(int where)
	{
		throw new RuntimeException("Stub!");
	}

	public int length()
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder insert(int where, CharSequence tb, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder insert(int where, CharSequence tb)
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder delete(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearSpans()
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder append(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder append(CharSequence text, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder append(char text)
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder replace(int start, int end, CharSequence tb)
	{
		throw new RuntimeException("Stub!");
	}

	public SpannableStringBuilder replace(int start, int end, CharSequence tb, int tbstart, int tbend)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSpan(Object what, int start, int end, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeSpan(Object what)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSpanStart(Object what)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSpanEnd(Object what)
	{
		throw new RuntimeException("Stub!");
	}

	public int getSpanFlags(Object what)
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] getSpans(int queryStart, int queryEnd, Class kind)
	{
		throw new RuntimeException("Stub!");
	}

	public int nextSpanTransition(int start, int limit, Class kind)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence subSequence(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public void getChars(int start, int end, char dest[], int destoff)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilters(InputFilter filters[])
	{
		throw new RuntimeException("Stub!");
	}

	public InputFilter[] getFilters()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Editable append(char x0)
	{
		return append(x0);
	}

	public volatile Editable append(CharSequence x0, int x1, int x2)
	{
		return append(x0, x1, x2);
	}

	public volatile Editable append(CharSequence x0)
	{
		return append(x0);
	}

	public volatile Editable delete(int x0, int x1)
	{
		return delete(x0, x1);
	}

	public volatile Editable insert(int x0, CharSequence x1)
	{
		return insert(x0, x1);
	}

	public volatile Editable insert(int x0, CharSequence x1, int x2, int x3)
	{
		return insert(x0, x1, x2, x3);
	}

	public volatile Editable replace(int x0, int x1, CharSequence x2)
	{
		return replace(x0, x1, x2);
	}

	public volatile Editable replace(int x0, int x1, CharSequence x2, int x3, int x4)
	{
		return replace(x0, x1, x2, x3, x4);
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
