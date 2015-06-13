// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ByteBuffer.java

package java.nio;


// Referenced classes of package java.nio:
//			Buffer, CharBuffer, DoubleBuffer, FloatBuffer, 
//			IntBuffer, LongBuffer, ShortBuffer, ByteOrder

public abstract class ByteBuffer extends Buffer
	implements Comparable
{

	ByteBuffer()
	{
		throw new RuntimeException("Stub!");
	}

	public static ByteBuffer allocate(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static ByteBuffer allocateDirect(int capacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static ByteBuffer wrap(byte array[])
	{
		throw new RuntimeException("Stub!");
	}

	public static ByteBuffer wrap(byte array[], int start, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] array()
	{
		throw new RuntimeException("Stub!");
	}

	public final int arrayOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract CharBuffer asCharBuffer();

	public abstract DoubleBuffer asDoubleBuffer();

	public abstract FloatBuffer asFloatBuffer();

	public abstract IntBuffer asIntBuffer();

	public abstract LongBuffer asLongBuffer();

	public abstract ByteBuffer asReadOnlyBuffer();

	public abstract ShortBuffer asShortBuffer();

	public abstract ByteBuffer compact();

	public int compareTo(ByteBuffer otherBuffer)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ByteBuffer duplicate();

	public boolean equals(Object other)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract byte get();

	public ByteBuffer get(byte dest[])
	{
		throw new RuntimeException("Stub!");
	}

	public ByteBuffer get(byte dest[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract byte get(int i);

	public abstract char getChar();

	public abstract char getChar(int i);

	public abstract double getDouble();

	public abstract double getDouble(int i);

	public abstract float getFloat();

	public abstract float getFloat(int i);

	public abstract int getInt();

	public abstract int getInt(int i);

	public abstract long getLong();

	public abstract long getLong(int i);

	public abstract short getShort();

	public abstract short getShort(int i);

	public final boolean hasArray()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isDirect();

	public final ByteOrder order()
	{
		throw new RuntimeException("Stub!");
	}

	public final ByteBuffer order(ByteOrder byteOrder)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ByteBuffer put(byte byte0);

	public final ByteBuffer put(byte src[])
	{
		throw new RuntimeException("Stub!");
	}

	public ByteBuffer put(byte src[], int off, int len)
	{
		throw new RuntimeException("Stub!");
	}

	public ByteBuffer put(ByteBuffer src)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract ByteBuffer put(int i, byte byte0);

	public abstract ByteBuffer putChar(char c);

	public abstract ByteBuffer putChar(int i, char c);

	public abstract ByteBuffer putDouble(double d);

	public abstract ByteBuffer putDouble(int i, double d);

	public abstract ByteBuffer putFloat(float f);

	public abstract ByteBuffer putFloat(int i, float f);

	public abstract ByteBuffer putInt(int i);

	public abstract ByteBuffer putInt(int i, int j);

	public abstract ByteBuffer putLong(long l);

	public abstract ByteBuffer putLong(int i, long l);

	public abstract ByteBuffer putShort(short word0);

	public abstract ByteBuffer putShort(int i, short word0);

	public abstract ByteBuffer slice();

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile int compareTo(Object x0)
	{
		return compareTo((ByteBuffer)x0);
	}
}
