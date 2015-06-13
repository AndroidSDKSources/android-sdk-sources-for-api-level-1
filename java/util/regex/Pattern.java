// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Pattern.java

package java.util.regex;

import java.io.Serializable;

// Referenced classes of package java.util.regex:
//			PatternSyntaxException, Matcher

public final class Pattern
	implements Serializable
{

	public static final int UNIX_LINES = 1;
	public static final int CASE_INSENSITIVE = 2;
	public static final int COMMENTS = 4;
	public static final int MULTILINE = 8;
	public static final int LITERAL = 16;
	public static final int DOTALL = 32;
	public static final int UNICODE_CASE = 64;
	public static final int CANON_EQ = 128;

	Pattern()
	{
		throw new RuntimeException("Stub!");
	}

	public static Pattern compile(String pattern)
		throws PatternSyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public static Pattern compile(String pattern, int flags)
		throws PatternSyntaxException
	{
		throw new RuntimeException("Stub!");
	}

	public String pattern()
	{
		throw new RuntimeException("Stub!");
	}

	public int flags()
	{
		throw new RuntimeException("Stub!");
	}

	public Matcher matcher(CharSequence input)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean matches(String regex, CharSequence input)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] split(CharSequence input)
	{
		throw new RuntimeException("Stub!");
	}

	public String[] split(CharSequence inputSeq, int limit)
	{
		throw new RuntimeException("Stub!");
	}

	public static String quote(String s)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}
}
