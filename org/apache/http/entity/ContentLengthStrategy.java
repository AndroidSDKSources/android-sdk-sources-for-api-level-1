// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentLengthStrategy.java

package org.apache.http.entity;

import org.apache.http.HttpException;
import org.apache.http.HttpMessage;

public interface ContentLengthStrategy
{

	public static final int IDENTITY = -1;
	public static final int CHUNKED = -2;

	public abstract long determineLength(HttpMessage httpmessage)
		throws HttpException;
}
