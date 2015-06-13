// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AccessibleObject.java

package java.lang.reflect;

import java.lang.annotation.Annotation;

// Referenced classes of package java.lang.reflect:
//			AnnotatedElement

public class AccessibleObject
	implements AnnotatedElement
{

	protected AccessibleObject()
	{
		throw new RuntimeException("Stub!");
	}

	public static void setAccessible(AccessibleObject objects[], boolean flag)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAccessible()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAccessible(boolean flag)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isAnnotationPresent(Class annotationType)
	{
		throw new RuntimeException("Stub!");
	}

	public Annotation[] getDeclaredAnnotations()
	{
		throw new RuntimeException("Stub!");
	}

	public Annotation[] getAnnotations()
	{
		throw new RuntimeException("Stub!");
	}

	public Annotation getAnnotation(Class annotationType)
	{
		throw new RuntimeException("Stub!");
	}
}
