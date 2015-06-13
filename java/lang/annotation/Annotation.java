// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Annotation.java

package java.lang.annotation;


public interface Annotation
{

	public abstract Class annotationType();

	public abstract boolean equals(Object obj);

	public abstract int hashCode();

	public abstract String toString();
}
