// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Observable.java

package android.database;

import java.util.ArrayList;

public abstract class Observable
{

	protected final ArrayList mObservers;

	public Observable()
	{
		throw new RuntimeException("Stub!");
	}

	public void registerObserver(Object observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterObserver(Object observer)
	{
		throw new RuntimeException("Stub!");
	}

	public void unregisterAll()
	{
		throw new RuntimeException("Stub!");
	}
}
