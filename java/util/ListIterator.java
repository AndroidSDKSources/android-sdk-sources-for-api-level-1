// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ListIterator.java

package java.util;


// Referenced classes of package java.util:
//			Iterator

public interface ListIterator
	extends Iterator
{

	public abstract void add(Object obj);

	public abstract boolean hasNext();

	public abstract boolean hasPrevious();

	public abstract Object next();

	public abstract int nextIndex();

	public abstract Object previous();

	public abstract int previousIndex();

	public abstract void remove();

	public abstract void set(Object obj);
}
