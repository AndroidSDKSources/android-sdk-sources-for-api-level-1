// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LocalSocket.java

package android.net;

import java.io.*;

// Referenced classes of package android.net:
//			LocalSocketAddress, Credentials

public class LocalSocket
{

	public LocalSocket()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void connect(LocalSocketAddress endpoint)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void bind(LocalSocketAddress bindpoint)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public LocalSocketAddress getLocalSocketAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getInputStream()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public OutputStream getOutputStream()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdownInput()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void shutdownOutput()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setReceiveBufferSize(int size)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int getReceiveBufferSize()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setSoTimeout(int n)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int getSoTimeout()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setSendBufferSize(int n)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int getSendBufferSize()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public LocalSocketAddress getRemoteSocketAddress()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean isConnected()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isClosed()
	{
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean isBound()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOutputShutdown()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isInputShutdown()
	{
		throw new RuntimeException("Stub!");
	}

	public void connect(LocalSocketAddress endpoint, int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setFileDescriptorsForSend(FileDescriptor fds[])
	{
		throw new RuntimeException("Stub!");
	}

	public FileDescriptor[] getAncillaryFileDescriptors()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Credentials getPeerCredentials()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public FileDescriptor getFileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}
}
