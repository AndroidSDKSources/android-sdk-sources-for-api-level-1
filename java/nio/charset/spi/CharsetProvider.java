// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharsetProvider.java

package java.nio.charset.spi;

import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class CharsetProvider
{

	protected CharsetProvider()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Iterator charsets();

	public abstract Charset charsetForName(String s);
}
