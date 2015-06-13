// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IntBuffer.java

package java.nio;


// Referenced classes of package java.nio:
//			Buffer, ByteOrder

public abstract class IntBuffer extends Buffer
	implements Comparable
{

	IntBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public static IntBuffer allocate(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static IntBuffer wrap(int array[])
	{
		throw new RuntimeException("Stub!");
	}

	public static IntBuffer wrap(int array[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final int[] array()
	{
		throw new RuntimeException("Stub!");
	}

	public final int arrayOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract IntBuffer asReadOnlyBuffer();

	public abstract IntBuffer compact();

	public int compareTo(IntBuffer otherBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract IntBuffer duplicate();

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int get();

	public IntBuffer get(int dest[])
	{
		throw new RuntimeException("Stub!");
	}

	public IntBuffer get(int dest[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int get(int i);

	public final boolean hasArray()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isDirect();

	public abstract ByteOrder order();

	public abstract IntBuffer put(int i);

	public final IntBuffer put(int src[])
	{
		throw new RuntimeException("Stub!");
	}

	public IntBuffer put(int src[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public IntBuffer put(IntBuffer src)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract IntBuffer put(int i, int j);

	public abstract IntBuffer slice();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((IntBuffer)x0);
	}
}
