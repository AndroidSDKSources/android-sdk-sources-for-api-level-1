// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Principal.java

package java.security;


public interface Principal
{

	public abstract boolean equals(Object obj);

	public abstract String getName();

	public abstract int hashCode();

	public abstract String toString();
}
