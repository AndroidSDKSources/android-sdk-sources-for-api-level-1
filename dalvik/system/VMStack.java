// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   VMStack.java

package dalvik.system;


public final class VMStack
{

	public VMStack()
	{
		throw new RuntimeException("Stub!");
	}

	public static native ClassLoader getCallingClassLoader();

	public static native ClassLoader getCallingClassLoader2();

	public static native Class[] getClasses(int i, boolean flag);

	public static native StackTraceElement[] getThreadStackTrace(Thread thread);
}
