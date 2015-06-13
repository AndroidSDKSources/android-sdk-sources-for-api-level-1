// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Map.java

package java.util;


// Referenced classes of package java.util:
//			Set, Collection

public interface Map
{
	public static interface Entry
	{

		public abstract boolean equals(Object obj);

		public abstract Object getKey();

		public abstract Object getValue();

		public abstract int hashCode();

		public abstract Object setValue(Object obj);
	}


	public abstract void clear();

	public abstract boolean containsKey(Object obj);

	public abstract boolean containsValue(Object obj);

	public abstract Set entrySet();

	public abstract boolean equals(Object obj);

	public abstract Object get(Object obj);

	public abstract int hashCode();

	public abstract boolean isEmpty();

	public abstract Set keySet();

	public abstract Object put(Object obj, Object obj1);

	public abstract void putAll(Map map);

	public abstract Object remove(Object obj);

	public abstract int size();

	public abstract Collection values();
}
