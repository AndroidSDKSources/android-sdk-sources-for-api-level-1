// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HostNameResolver.java

package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;

public interface HostNameResolver
{

	public abstract InetAddress resolve(String s)
		throws IOException;
}
