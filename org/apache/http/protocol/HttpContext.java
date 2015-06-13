// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpContext.java

package org.apache.http.protocol;


public interface HttpContext
{

	public static final String RESERVED_PREFIX = "http.";

	public abstract Object getAttribute(String s);

	public abstract void setAttribute(String s, Object obj);

	public abstract Object removeAttribute(String s);
}
