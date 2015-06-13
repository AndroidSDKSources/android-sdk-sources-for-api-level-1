// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Iterator.java

package java.util;


public interface Iterator
{

	public abstract boolean hasNext();

	public abstract Object next();

	public abstract void remove();
}
