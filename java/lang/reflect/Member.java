// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Member.java

package java.lang.reflect;


public interface Member
{

	public static final int PUBLIC = 0;
	public static final int DECLARED = 1;

	public abstract Class getDeclaringClass();

	public abstract int getModifiers();

	public abstract String getName();

	public abstract boolean isSynthetic();
}
