// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestTarget.java

package dalvik.annotation;

import java.lang.annotation.Annotation;

public interface TestTarget
	extends Annotation
{

	public abstract String methodName();

	public abstract Class[] methodArgs();
}
