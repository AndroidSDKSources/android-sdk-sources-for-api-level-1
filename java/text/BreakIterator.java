// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BreakIterator.java

package java.text;

import java.util.Locale;

// Referenced classes of package java.text:
//			CharacterIterator

public abstract class BreakIterator
	implements Cloneable
{

	public static final int DONE = -1;

	protected BreakIterator()
	{
		throw new RuntimeException("Stub!");
	}

	public static Locale[] getAvailableLocales()
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getCharacterInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getCharacterInstance(Locale where)
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getLineInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getLineInstance(Locale where)
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getSentenceInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getSentenceInstance(Locale where)
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getWordInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static BreakIterator getWordInstance(Locale where)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBoundary(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public int preceding(int offset)
	{
		throw new RuntimeException("Stub!");
	}

	public void setText(String newText)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int current();

	public abstract int first();

	public abstract int following(int i);

	public abstract CharacterIterator getText();

	public abstract int last();

	public abstract int next();

	public abstract int next(int i);

	public abstract int previous();

	public abstract void setText(CharacterIterator characteriterator);

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	protected static long getLong(byte buf[], int offset)
	{
		throw new RuntimeException("Stub!");
	}

	protected static int getInt(byte buf[], int offset)
	{
		throw new RuntimeException("Stub!");
	}

	protected static short getShort(byte buf[], int offset)
	{
		throw new RuntimeException("Stub!");
	}
}
