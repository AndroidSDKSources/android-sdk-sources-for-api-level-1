// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Channels.java

package java.nio.channels;

import java.io.*;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

// Referenced classes of package java.nio.channels:
//			ReadableByteChannel, WritableByteChannel

public final class Channels
{

	Channels()
	{
		throw new RuntimeException("Stub!");
	}

	public static InputStream newInputStream(ReadableByteChannel channel)
	{
		throw new RuntimeException("Stub!");
	}

	public static OutputStream newOutputStream(WritableByteChannel channel)
	{
		throw new RuntimeException("Stub!");
	}

	public static ReadableByteChannel newChannel(InputStream inputStream)
	{
		throw new RuntimeException("Stub!");
	}

	public static WritableByteChannel newChannel(OutputStream outputStream)
	{
		throw new RuntimeException("Stub!");
	}

	public static Reader newReader(ReadableByteChannel channel, CharsetDecoder decoder, int minBufferCapacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static Reader newReader(ReadableByteChannel channel, String charsetName)
	{
		throw new RuntimeException("Stub!");
	}

	public static Writer newWriter(WritableByteChannel channel, CharsetEncoder encoder, int minBufferCapacity)
	{
		throw new RuntimeException("Stub!");
	}

	public static Writer newWriter(WritableByteChannel channel, String charsetName)
	{
		throw new RuntimeException("Stub!");
	}
}
