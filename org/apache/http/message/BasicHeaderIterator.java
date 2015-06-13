// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicHeaderIterator.java

package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;

public class BasicHeaderIterator
	implements HeaderIterator
{

	protected final Header allHeaders[] = null;
	protected int currentIndex;
	protected String headerName;

	public BasicHeaderIterator(Header headers[], String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected int findNext(int from)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean filterHeader(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext()
	{
		throw new RuntimeException("Stub!");
	}

	public Header nextHeader()
		throws NoSuchElementException
	{
		throw new RuntimeException("Stub!");
	}

	public final Object next()
		throws NoSuchElementException
	{
		throw new RuntimeException("Stub!");
	}

	public void remove()
		throws UnsupportedOperationException
	{
		throw new RuntimeException("Stub!");
	}
}
