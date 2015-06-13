// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PipedInputStream.java

package java.io;


// Referenced classes of package java.io:
//			InputStream, IOException, PipedOutputStream

public class PipedInputStream extends InputStream
{

	protected byte buffer[];
	protected int in;
	protected int out;
	protected static final int PIPE_SIZE = 1024;

	public PipedInputStream()
	{
		buffer = null;
		throw new RuntimeException("Stub!");
	}

	public PipedInputStream(PipedOutputStream out)
		throws IOException
	{
		buffer = null;
		throw new RuntimeException("Stub!");
	}

	public synchronized int available()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void connect(PipedOutputStream src)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized int read(byte bytes[], int offset, int count)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected synchronized void receive(int oneByte)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
