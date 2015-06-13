// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Collator.java

package java.text;

import java.util.Comparator;
import java.util.Locale;

// Referenced classes of package java.text:
//			CollationKey

public abstract class Collator
	implements Comparator, Cloneable
{

	public static final int NO_DECOMPOSITION = 0;
	public static final int CANONICAL_DECOMPOSITION = 1;
	public static final int FULL_DECOMPOSITION = 2;
	public static final int PRIMARY = 0;
	public static final int SECONDARY = 1;
	public static final int TERTIARY = 2;
	public static final int IDENTICAL = 3;

	protected Collator()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public int compare(Object object1, Object object2)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int compare(String s, String s1);

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(String string1, String string2)
	{
		throw new RuntimeException("Stub!");
	}

	public static Locale[] getAvailableLocales()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CollationKey getCollationKey(String s);

	public int getDecomposition()
	{
		throw new RuntimeException("Stub!");
	}

	public static Collator getInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static Collator getInstance(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public int getStrength()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int hashCode();

	public void setDecomposition(int value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setStrength(int value)
	{
		throw new RuntimeException("Stub!");
	}
}
