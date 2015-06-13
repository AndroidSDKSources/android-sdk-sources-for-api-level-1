// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LongBuffer.java

package java.nio;


// Referenced classes of package java.nio:
//			Buffer, ByteOrder

public abstract class LongBuffer extends Buffer
	implements Comparable
{

	LongBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public static LongBuffer allocate(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static LongBuffer wrap(long array[])
	{
		throw new RuntimeException("Stub!");
	}

	public static LongBuffer wrap(long array[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final long[] array()
	{
		throw new RuntimeException("Stub!");
	}

	public final int arrayOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract LongBuffer asReadOnlyBuffer();

	public abstract LongBuffer compact();

	public int compareTo(LongBuffer otherBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract LongBuffer duplicate();

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract long get();

	public LongBuffer get(long dest[])
	{
		throw new RuntimeException("Stub!");
	}

	public LongBuffer get(long dest[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract long get(int i);

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

	public abstract LongBuffer put(long l);

	public final LongBuffer put(long src[])
	{
		throw new RuntimeException("Stub!");
	}

	public LongBuffer put(long src[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public LongBuffer put(LongBuffer src)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract LongBuffer put(int i, long l);

	public abstract LongBuffer slice();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((LongBuffer)x0);
	}
}
