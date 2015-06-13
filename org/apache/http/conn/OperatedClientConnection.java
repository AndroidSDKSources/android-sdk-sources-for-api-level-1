// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   OperatedClientConnection.java

package org.apache.http.conn;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.*;
import org.apache.http.params.HttpParams;

public interface OperatedClientConnection
	extends HttpClientConnection, HttpInetConnection
{

	public abstract HttpHost getTargetHost();

	public abstract boolean isSecure();

	public abstract Socket getSocket();

	public abstract void opening(Socket socket, HttpHost httphost)
		throws IOException;

	public abstract void openCompleted(boolean flag, HttpParams httpparams)
		throws IOException;

	public abstract void update(Socket socket, HttpHost httphost, boolean flag, HttpParams httpparams)
		throws IOException;
}
