// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Object.java

package java.lang;

// Referenced classes of package java.lang:
//			RuntimeException, CloneNotSupportedException, Throwable, InterruptedException, 
//			Class, String

public class Object
{

	public Object()
	{
		throw new RuntimeException("Stub!");
	}

	protected Object clone()
		throws CloneNotSupportedException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object o)
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

	public final native Class getClass();

	public native int hashCode();

	public final native void notify();

	public final native void notifyAll();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public final void wait()
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public final void wait(long time)
		throws InterruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public final native void wait(long l, int i)
		throws InterruptedException;
}
