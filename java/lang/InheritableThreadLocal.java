// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InheritableThreadLocal.java

package java.lang;

// Referenced classes of package java.lang:
//			ThreadLocal, RuntimeException, Object

public class InheritableThreadLocal extends ThreadLocal
{

	public InheritableThreadLocal()
	{
		throw new RuntimeException("Stub!");
	}

	protected Object childValue(Object parentValue)
	{
		throw new RuntimeException("Stub!");
	}
}
