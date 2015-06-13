// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CoreConnectionPNames.java

package org.apache.http.params;


public interface CoreConnectionPNames
{

	public static final String SO_TIMEOUT = "http.socket.timeout";
	public static final String TCP_NODELAY = "http.tcp.nodelay";
	public static final String SOCKET_BUFFER_SIZE = "http.socket.buffer-size";
	public static final String SO_LINGER = "http.socket.linger";
	public static final String CONNECTION_TIMEOUT = "http.connection.timeout";
	public static final String STALE_CONNECTION_CHECK = "http.connection.stalecheck";
	public static final String MAX_LINE_LENGTH = "http.connection.max-line-length";
	public static final String MAX_HEADER_COUNT = "http.connection.max-header-count";
}
