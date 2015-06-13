// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ShortBuffer.java

package java.nio;


// Referenced classes of package java.nio:
//			Buffer, ByteOrder

public abstract class ShortBuffer extends Buffer
	implements Comparable
{

	ShortBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public static ShortBuffer allocate(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static ShortBuffer wrap(short array[])
	{
		throw new RuntimeException("Stub!");
	}

	public static ShortBuffer wrap(short array[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final short[] array()
	{
		throw new RuntimeException("Stub!");
	}

	public final int arrayOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ShortBuffer asReadOnlyBuffer();

	public abstract ShortBuffer compact();

	public int compareTo(ShortBuffer otherBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ShortBuffer duplicate();

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract short get();

	public ShortBuffer get(short dest[])
	{
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer get(short dest[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract short get(int i);

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

	public abstract ShortBuffer put(short word0);

	public final ShortBuffer put(short src[])
	{
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer put(short src[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public ShortBuffer put(ShortBuffer src)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ShortBuffer put(int i, short word0);

	public abstract ShortBuffer slice();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((ShortBuffer)x0);
	}
}
