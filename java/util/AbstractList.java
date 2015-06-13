// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractList.java

package java.util;


// Referenced classes of package java.util:
//			AbstractCollection, List, Collection, Iterator, 
//			ListIterator

public abstract class AbstractList extends AbstractCollection
	implements List
{

	protected transient int modCount;

	protected AbstractList()
	{
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

	public boolean addAll(int location, Collection collection)
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Object get(int i);

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public int indexOf(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public Iterator iterator()
	{
		throw new RuntimeException("Stub!");
	}

	public int lastIndexOf(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public ListIterator listIterator()
	{
		throw new RuntimeException("Stub!");
	}

	public ListIterator listIterator(int location)
	{
		throw new RuntimeException("Stub!");
	}

	public Object remove(int location)
	{
		throw new RuntimeException("Stub!");
	}

	protected void removeRange(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public Object set(int location, Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public List subList(int start, int end)
	{
		throw new RuntimeException("Stub!");
	}
}
