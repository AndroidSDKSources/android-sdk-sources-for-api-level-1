// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Collection.java

package java.util;


// Referenced classes of package java.util:
//			Iterator

public interface Collection
	extends Iterable
{

	public abstract boolean add(Object obj);

	public abstract boolean addAll(Collection collection);

	public abstract void clear();

	public abstract boolean contains(Object obj);

	public abstract boolean containsAll(Collection collection);

	public abstract boolean equals(Object obj);

	public abstract int hashCode();

	public abstract boolean isEmpty();

	public abstract Iterator iterator();

	public abstract boolean remove(Object obj);

	public abstract boolean removeAll(Collection collection);

	public abstract boolean retainAll(Collection collection);

	public abstract int size();

	public abstract Object[] toArray();

	public abstract Object[] toArray(Object aobj[]);
}
