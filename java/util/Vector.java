// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Vector.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			AbstractList, List, RandomAccess, Collection, 
//			Enumeration

public class Vector extends AbstractList
	implements List, RandomAccess, Cloneable, Serializable
{

	protected int elementCount;
	protected Object elementData[];
	protected int capacityIncrement;

	public Vector()
	{
		elementData = null;
		throw new RuntimeException("Stub!");
	}

	public Vector(int capacity)
	{
		elementData = null;
		throw new RuntimeException("Stub!");
	}

	public Vector(int capacity, int capacityIncrement)
	{
		elementData = null;
		throw new RuntimeException("Stub!");
	}

	public Vector(Collection collection)
	{
		elementData = null;
		throw new RuntimeException("Stub!");
	}

	public void add(int location, Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean add(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean addAll(int location, Collection collection)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean addAll(Collection collection)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void addElement(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int capacity()
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean contains(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean containsAll(Collection collection)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void copyInto(Object elements[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object elementAt(int location)
	{
		throw new RuntimeException("Stub!");
	}

	public Enumeration elements()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void ensureCapacity(int minimumCapacity)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object firstElement()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object get(int location)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public int indexOf(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int indexOf(Object object, int location)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void insertElementAt(Object object, int location)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean isEmpty()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object lastElement()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int lastIndexOf(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int lastIndexOf(Object object, int location)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object remove(int location)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean remove(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean removeAll(Collection collection)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void removeAllElements()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean removeElement(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void removeElementAt(int location)
	{
		throw new RuntimeException("Stub!");
	}

	protected void removeRange(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean retainAll(Collection collection)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object set(int location, Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setElementAt(Object object, int location)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void setSize(int length)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int size()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized List subList(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object[] toArray()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized Object[] toArray(Object contents[])
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void trimToSize()
	{
		throw new RuntimeException("Stub!");
	}
}
