// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpUriRequest.java

package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.HttpRequest;

public interface HttpUriRequest
	extends HttpRequest
{

	public abstract String getMethod();

	public abstract URI getURI();

	public abstract void abort()
		throws UnsupportedOperationException;

	public abstract boolean isAborted();
}
