// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FloatBuffer.java

package java.nio;


// Referenced classes of package java.nio:
//			Buffer, ByteOrder

public abstract class FloatBuffer extends Buffer
	implements Comparable
{

	FloatBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public static FloatBuffer allocate(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static FloatBuffer wrap(float array[])
	{
		throw new RuntimeException("Stub!");
	}

	public static FloatBuffer wrap(float array[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final float[] array()
	{
		throw new RuntimeException("Stub!");
	}

	public final int arrayOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract FloatBuffer asReadOnlyBuffer();

	public abstract FloatBuffer compact();

	public int compareTo(FloatBuffer otherBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract FloatBuffer duplicate();

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract float get();

	public FloatBuffer get(float dest[])
	{
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer get(float dest[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract float get(int i);

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

	public abstract FloatBuffer put(float f);

	public final FloatBuffer put(float src[])
	{
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer put(float src[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public FloatBuffer put(FloatBuffer src)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract FloatBuffer put(int i, float f);

	public abstract FloatBuffer slice();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((FloatBuffer)x0);
	}
}
