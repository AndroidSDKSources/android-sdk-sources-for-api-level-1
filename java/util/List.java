// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   List.java

package java.util;


// Referenced classes of package java.util:
//			Collection, Iterator, ListIterator

public interface List
	extends Collection
{

	public abstract void add(int i, Object obj);

	public abstract boolean add(Object obj);

	public abstract boolean addAll(int i, Collection collection);

	public abstract boolean addAll(Collection collection);

	public abstract void clear();

	public abstract boolean contains(Object obj);

	public abstract boolean containsAll(Collection collection);

	public abstract boolean equals(Object obj);

	public abstract Object get(int i);

	public abstract int hashCode();

	public abstract int indexOf(Object obj);

	public abstract boolean isEmpty();

	public abstract Iterator iterator();

	public abstract int lastIndexOf(Object obj);

	public abstract ListIterator listIterator();

	public abstract ListIterator listIterator(int i);

	public abstract Object remove(int i);

	public abstract boolean remove(Object obj);

	public abstract boolean removeAll(Collection collection);

	public abstract boolean retainAll(Collection collection);

	public abstract Object set(int i, Object obj);

	public abstract int size();

	public abstract List subList(int i, int j);

	public abstract Object[] toArray();

	public abstract Object[] toArray(Object aobj[]);
}
