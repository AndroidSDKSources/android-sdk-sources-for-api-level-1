// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpVersion.java

package org.apache.http;

import java.io.Serializable;

// Referenced classes of package org.apache.http:
//			ProtocolVersion

public final class HttpVersion extends ProtocolVersion
	implements Serializable
{

	public static final String HTTP = "HTTP";
	public static final HttpVersion HTTP_0_9 = null;
	public static final HttpVersion HTTP_1_0 = null;
	public static final HttpVersion HTTP_1_1 = null;

	public HttpVersion(int major, int minor)
	{
		super((String)null, 0, 0);
		throw new RuntimeException("Stub!");
	}

	public ProtocolVersion forVersion(int major, int minor)
	{
		throw new RuntimeException("Stub!");
	}

}
