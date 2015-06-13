// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketOutputBuffer.java

package org.apache.http.impl.io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//			AbstractSessionOutputBuffer

public class SocketOutputBuffer extends AbstractSessionOutputBuffer
{

	public SocketOutputBuffer(Socket socket, int buffersize, HttpParams params)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
