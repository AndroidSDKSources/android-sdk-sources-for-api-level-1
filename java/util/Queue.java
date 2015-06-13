// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Queue.java

package java.util;


// Referenced classes of package java.util:
//			Collection

public interface Queue
	extends Collection
{

	public abstract boolean offer(Object obj);

	public abstract Object poll();

	public abstract Object remove();

	public abstract Object peek();

	public abstract Object element();
}
