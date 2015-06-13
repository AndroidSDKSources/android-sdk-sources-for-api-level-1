// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicTokenIterator.java

package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.*;

public class BasicTokenIterator
	implements TokenIterator
{

	public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
	protected final HeaderIterator headerIt;
	protected String currentHeader;
	protected String currentToken;
	protected int searchPos;

	public BasicTokenIterator(HeaderIterator headerIterator)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext()
	{
		throw new RuntimeException("Stub!");
	}

	public String nextToken()
		throws NoSuchElementException, ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public final Object next()
		throws NoSuchElementException, ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public final void remove()
		throws UnsupportedOperationException
	{
		throw new RuntimeException("Stub!");
	}

	protected int findNext(int from)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	protected String createToken(String value, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	protected int findTokenStart(int from)
	{
		throw new RuntimeException("Stub!");
	}

	protected int findTokenSeparator(int from)
	{
		throw new RuntimeException("Stub!");
	}

	protected int findTokenEnd(int from)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isTokenSeparator(char ch)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isWhitespace(char ch)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isTokenChar(char ch)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isHttpSeparator(char ch)
	{
		throw new RuntimeException("Stub!");
	}
}
