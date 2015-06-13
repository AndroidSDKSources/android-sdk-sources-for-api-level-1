// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SelectionKey.java

package java.nio.channels;


// Referenced classes of package java.nio.channels:
//			SelectableChannel, Selector

public abstract class SelectionKey
{

	public static final int OP_ACCEPT = 16;
	public static final int OP_CONNECT = 8;
	public static final int OP_READ = 1;
	public static final int OP_WRITE = 4;

	protected SelectionKey()
	{
		throw new RuntimeException("Stub!");
	}

	public final Object attach(Object anObject)
	{
		throw new RuntimeException("Stub!");
	}

	public final Object attachment()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void cancel();

	public abstract SelectableChannel channel();

	public abstract int interestOps();

	public abstract SelectionKey interestOps(int i);

	public final boolean isAcceptable()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isConnectable()
	{
		throw new RuntimeException("Stub!");
	}

	public final boolean isReadable()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isValid();

	public final boolean isWritable()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract int readyOps();

	public abstract Selector selector();
}
