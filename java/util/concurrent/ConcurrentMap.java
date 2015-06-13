// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConcurrentMap.java

package java.util.concurrent;

import java.util.Map;

public interface ConcurrentMap
	extends Map
{

	public abstract Object putIfAbsent(Object obj, Object obj1);

	public abstract boolean remove(Object obj, Object obj1);

	public abstract boolean replace(Object obj, Object obj1, Object obj2);

	public abstract Object replace(Object obj, Object obj1);
}
