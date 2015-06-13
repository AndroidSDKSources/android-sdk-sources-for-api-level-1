// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ObjectOutputStream.java

package java.io;


// Referenced classes of package java.io:
//			OutputStream, ObjectOutput, ObjectStreamConstants, IOException, 
//			ObjectStreamClass

public class ObjectOutputStream extends OutputStream
	implements ObjectOutput, ObjectStreamConstants
{
	public static abstract class PutField
	{

		public abstract void put(String s, boolean flag);

		public abstract void put(String s, char c);

		public abstract void put(String s, byte byte0);

		public abstract void put(String s, short word0);

		public abstract void put(String s, int i);

		public abstract void put(String s, long l);

		public abstract void put(String s, float f);

		public abstract void put(String s, double d);

		public abstract void put(String s, Object obj);

		public abstract void write(ObjectOutput objectoutput)
			throws IOException;

		public PutField()
		{
			throw new RuntimeException("Stub!");
		}
	}


	protected ObjectOutputStream()
		throws IOException, SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public ObjectOutputStream(OutputStream output)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void annotateClass(Class aClass)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void annotateProxyClass(Class aClass)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void defaultWriteObject()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void drain()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean enableReplaceObject(boolean enable)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public PutField putFields()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected Object replaceObject(Object object)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void useProtocolVersion(int version)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(byte buffer[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void write(int value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeBoolean(boolean value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeByte(int value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeBytes(String value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeChar(int value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeChars(String value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeDouble(double value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeFields()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeFloat(float value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeInt(int value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeLong(long value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void writeClassDescriptor(ObjectStreamClass classDesc)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final void writeObject(Object object)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeUnshared(Object object)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void writeObjectOverride(Object object)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeShort(int value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void writeStreamHeader()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeUTF(String value)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
