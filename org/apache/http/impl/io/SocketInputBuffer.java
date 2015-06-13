// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketInputBuffer.java

package org.apache.http.impl.io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//			AbstractSessionInputBuffer

public class SocketInputBuffer extends AbstractSessionInputBuffer
{

	public SocketInputBuffer(Socket socket, int buffersize, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isDataAvailable(int timeout)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
