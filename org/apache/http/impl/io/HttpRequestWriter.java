// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRequestWriter.java

package org.apache.http.impl.io;

import java.io.IOException;
import org.apache.http.HttpMessage;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.impl.io:
//			AbstractMessageWriter

public class HttpRequestWriter extends AbstractMessageWriter
{

	public HttpRequestWriter(SessionOutputBuffer buffer, LineFormatter formatter, HttpParams params)
	{
		super((SessionOutputBuffer)null, (LineFormatter)null, (HttpParams)null);
		throw new RuntimeException("Stub!");
	}

	protected void writeHeadLine(HttpMessage message)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
