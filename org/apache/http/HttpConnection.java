// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpConnection.java

package org.apache.http;

import java.io.IOException;

// Referenced classes of package org.apache.http:
//			HttpConnectionMetrics

public interface HttpConnection
{

	public abstract void close()
		throws IOException;

	public abstract boolean isOpen();

	public abstract boolean isStale();

	public abstract void setSocketTimeout(int i);

	public abstract int getSocketTimeout();

	public abstract void shutdown()
		throws IOException;

	public abstract HttpConnectionMetrics getMetrics();
}
