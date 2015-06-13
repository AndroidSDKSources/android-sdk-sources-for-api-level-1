// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AnnotatedElement.java

package java.lang.reflect;

import java.lang.annotation.Annotation;

public interface AnnotatedElement
{

	public abstract Annotation getAnnotation(Class class1);

	public abstract Annotation[] getAnnotations();

	public abstract Annotation[] getDeclaredAnnotations();

	public abstract boolean isAnnotationPresent(Class class1);
}
