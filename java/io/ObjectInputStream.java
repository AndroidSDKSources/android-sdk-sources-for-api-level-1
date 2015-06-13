// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ObjectInputStream.java

package java.io;


// Referenced classes of package java.io:
//			InputStream, ObjectInput, ObjectStreamConstants, IOException, 
//			StreamCorruptedException, NotActiveException, OptionalDataException, InvalidObjectException, 
//			ObjectStreamClass, ObjectInputValidation

public class ObjectInputStream extends InputStream
	implements ObjectInput, ObjectStreamConstants
{
	public static abstract class GetField
	{

		public abstract ObjectStreamClass getObjectStreamClass();

		public abstract boolean defaulted(String s)
			throws IOException, IllegalArgumentException;

		public abstract boolean get(String s, boolean flag)
			throws IOException, IllegalArgumentException;

		public abstract char get(String s, char c)
			throws IOException, IllegalArgumentException;

		public abstract byte get(String s, byte byte0)
			throws IOException, IllegalArgumentException;

		public abstract short get(String s, short word0)
			throws IOException, IllegalArgumentException;

		public abstract int get(String s, int i)
			throws IOException, IllegalArgumentException;

		public abstract long get(String s, long l)
			throws IOException, IllegalArgumentException;

		public abstract float get(String s, float f)
			throws IOException, IllegalArgumentException;

		public abstract double get(String s, double d)
			throws IOException, IllegalArgumentException;

		public abstract Object get(String s, Object obj)
			throws IOException, IllegalArgumentException;

		public GetField()
		{
			throw new RuntimeException("Stub!");
		}
	}


	protected ObjectInputStream()
		throws IOException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public ObjectInputStream(InputStream input)
		throws StreamCorruptedException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int available()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void defaultReadObject()
		throws IOException, ClassNotFoundException, NotActiveException
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean enableResolveObject(boolean enable)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean readBoolean()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public byte readByte()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public char readChar()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public double readDouble()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public GetField readFields()
		throws IOException, ClassNotFoundException, NotActiveException
	{
		throw new RuntimeException("Stub!");
	}

	public float readFloat()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void readFully(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void readFully(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int readInt()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String readLine()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long readLong()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected ObjectStreamClass readClassDescriptor()
		throws IOException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected Class resolveProxyClass(String interfaceNames[])
		throws IOException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public final Object readObject()
		throws OptionalDataException, ClassNotFoundException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Object readUnshared()
		throws IOException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected Object readObjectOverride()
		throws OptionalDataException, ClassNotFoundException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public short readShort()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void readStreamHeader()
		throws IOException, StreamCorruptedException
	{
		throw new RuntimeException("Stub!");
	}

	public int readUnsignedByte()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int readUnsignedShort()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String readUTF()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized void registerValidation(ObjectInputValidation object, int priority)
		throws NotActiveException, InvalidObjectException
	{
		throw new RuntimeException("Stub!");
	}

	protected Class resolveClass(ObjectStreamClass osClass)
		throws IOException, ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	protected Object resolveObject(Object object)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int skipBytes(int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
