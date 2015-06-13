// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpInetConnection.java

package org.apache.http;

import java.net.InetAddress;

// Referenced classes of package org.apache.http:
//			HttpConnection

public interface HttpInetConnection
	extends HttpConnection
{

	public abstract InetAddress getLocalAddress();

	public abstract int getLocalPort();

	public abstract InetAddress getRemoteAddress();

	public abstract int getRemotePort();
}
