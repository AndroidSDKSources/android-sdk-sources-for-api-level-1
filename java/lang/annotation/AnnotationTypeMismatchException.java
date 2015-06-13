// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AnnotationTypeMismatchException.java

package java.lang.annotation;

import java.lang.reflect.Method;

public class AnnotationTypeMismatchException extends RuntimeException
{

	public AnnotationTypeMismatchException(Method element, String foundType)
	{
		throw new RuntimeException("Stub!");
	}

	public Method element()
	{
		throw new RuntimeException("Stub!");
	}

	public String foundType()
	{
		throw new RuntimeException("Stub!");
	}
}
