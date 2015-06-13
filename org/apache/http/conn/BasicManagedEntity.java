// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BasicManagedEntity.java

package org.apache.http.conn;

import java.io.*;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

// Referenced classes of package org.apache.http.conn:
//			ConnectionReleaseTrigger, EofSensorWatcher, ManagedClientConnection

public class BasicManagedEntity extends HttpEntityWrapper
	implements ConnectionReleaseTrigger, EofSensorWatcher
{

	protected ManagedClientConnection managedConn;
	protected final boolean attemptReuse;

	public BasicManagedEntity(HttpEntity entity, ManagedClientConnection conn, boolean reuse)
	{
		super((HttpEntity)null);
		throw new RuntimeException("Stub!");
	}

	public boolean isRepeatable()
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getContent()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void consumeContent()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void writeTo(OutputStream outstream)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void releaseConnection()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void abortConnection()
		throws IOException
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

	protected void releaseManagedConnection()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
