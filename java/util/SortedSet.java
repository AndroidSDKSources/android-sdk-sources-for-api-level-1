// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SortedSet.java

package java.util;


// Referenced classes of package java.util:
//			Set, Comparator

public interface SortedSet
	extends Set
{

	public abstract Comparator comparator();

	public abstract Object first();

	public abstract SortedSet headSet(Object obj);

	public abstract Object last();

	public abstract SortedSet subSet(Object obj, Object obj1);

	public abstract SortedSet tailSet(Object obj);
}
