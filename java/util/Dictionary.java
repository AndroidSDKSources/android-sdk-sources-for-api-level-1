// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Dictionary.java

package java.util;


// Referenced classes of package java.util:
//			Enumeration

public abstract class Dictionary
{

	public Dictionary()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Enumeration elements();

	public abstract Object get(Object obj);

	public abstract boolean isEmpty();

	public abstract Enumeration keys();

	public abstract Object put(Object obj, Object obj1);

	public abstract Object remove(Object obj);

	public abstract int size();
}
