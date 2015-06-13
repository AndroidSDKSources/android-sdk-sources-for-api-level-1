// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SortedMap.java

package java.util;


// Referenced classes of package java.util:
//			Map, Comparator

public interface SortedMap
	extends Map
{

	public abstract Comparator comparator();

	public abstract Object firstKey();

	public abstract SortedMap headMap(Object obj);

	public abstract Object lastKey();

	public abstract SortedMap subMap(Object obj, Object obj1);

	public abstract SortedMap tailMap(Object obj);
}
