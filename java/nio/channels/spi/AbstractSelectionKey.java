// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractSelectionKey.java

package java.nio.channels.spi;

import java.nio.channels.SelectionKey;

public abstract class AbstractSelectionKey extends SelectionKey
{

	protected AbstractSelectionKey()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isValid()
	{
		throw new RuntimeException("Stub!");
	}

	public final void cancel()
	{
		throw new RuntimeException("Stub!");
	}
}
