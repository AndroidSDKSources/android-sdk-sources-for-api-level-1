// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SocketFactory.java

package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.*;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpParams;

public interface SocketFactory
{

	public abstract Socket createSocket()
		throws IOException;

	public abstract Socket connectSocket(Socket socket, String s, int i, InetAddress inetaddress, int j, HttpParams httpparams)
		throws IOException, UnknownHostException, ConnectTimeoutException;

	public abstract boolean isSecure(Socket socket)
		throws IllegalArgumentException;
}
