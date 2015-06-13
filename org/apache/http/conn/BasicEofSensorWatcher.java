// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicEofSensorWatcher.java

package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.http.conn:
//			EofSensorWatcher, ManagedClientConnection

public class BasicEofSensorWatcher
	implements EofSensorWatcher
{

	protected ManagedClientConnection managedConn;
	protected boolean attemptReuse;

	public BasicEofSensorWatcher(ManagedClientConnection conn, boolean reuse)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean eofDetected(InputStream wrapped)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean streamClosed(InputStream wrapped)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean streamAbort(InputStream wrapped)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
