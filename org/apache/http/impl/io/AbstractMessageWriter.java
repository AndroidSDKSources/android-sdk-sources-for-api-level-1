// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractMessageWriter.java

package org.apache.http.impl.io;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractMessageWriter
	implements HttpMessageWriter
{

	protected final SessionOutputBuffer sessionBuffer;
	protected final CharArrayBuffer lineBuf;
	protected final LineFormatter lineFormatter;

	public AbstractMessageWriter(SessionOutputBuffer buffer, LineFormatter formatter, HttpParams params)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void writeHeadLine(HttpMessage httpmessage)
		throws IOException;

	public void write(HttpMessage message)
		throws IOException, HttpException
	{
		throw new RuntimeException("Stub!");
	}
}
