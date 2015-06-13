// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InvocationHandler.java

package java.lang.reflect;


// Referenced classes of package java.lang.reflect:
//			Method

public interface InvocationHandler
{

	public abstract Object invoke(Object obj, Method method, Object aobj[])
		throws Throwable;
}
