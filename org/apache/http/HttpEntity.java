// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpEntity.java

package org.apache.http;

import java.io.*;

// Referenced classes of package org.apache.http:
//			Header

public interface HttpEntity
{

	public abstract boolean isRepeatable();

	public abstract boolean isChunked();

	public abstract long getContentLength();

	public abstract Header getContentType();

	public abstract Header getContentEncoding();

	public abstract InputStream getContent()
		throws IOException, IllegalStateException;

	public abstract void writeTo(OutputStream outputstream)
		throws IOException;

	public abstract boolean isStreaming();

	public abstract void consumeContent()
		throws IOException;
}
