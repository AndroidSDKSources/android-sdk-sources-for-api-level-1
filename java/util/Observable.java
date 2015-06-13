// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Observable.java

package java.util;


// Referenced classes of package java.util:
//			Observer

public class Observable
{

	public Observable()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addObserver(Observer observer)
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void clearChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int countObservers()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void deleteObserver(Observer observer)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void deleteObservers()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean hasChanged()
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyObservers()
	{
		throw new RuntimeException("Stub!");
	}

	public void notifyObservers(Object data)
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void setChanged()
	{
		throw new RuntimeException("Stub!");
	}
}
