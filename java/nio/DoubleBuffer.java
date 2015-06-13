// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DoubleBuffer.java

package java.nio;


// Referenced classes of package java.nio:
//			Buffer, ByteOrder

public abstract class DoubleBuffer extends Buffer
	implements Comparable
{

	DoubleBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public static DoubleBuffer allocate(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static DoubleBuffer wrap(double array[])
	{
		throw new RuntimeException("Stub!");
	}

	public static DoubleBuffer wrap(double array[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final double[] array()
	{
		throw new RuntimeException("Stub!");
	}

	public final int arrayOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract DoubleBuffer asReadOnlyBuffer();

	public abstract DoubleBuffer compact();

	public int compareTo(DoubleBuffer otherBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract DoubleBuffer duplicate();

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract double get();

	public DoubleBuffer get(double dest[])
	{
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer get(double dest[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract double get(int i);

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

	public abstract DoubleBuffer put(double d);

	public final DoubleBuffer put(double src[])
	{
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer put(double src[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public DoubleBuffer put(DoubleBuffer src)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract DoubleBuffer put(int i, double d);

	public abstract DoubleBuffer slice();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((DoubleBuffer)x0);
	}
}
