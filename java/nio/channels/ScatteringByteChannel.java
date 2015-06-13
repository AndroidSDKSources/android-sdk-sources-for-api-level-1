// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ScatteringByteChannel.java

package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package java.nio.channels:
//			ReadableByteChannel

public interface ScatteringByteChannel
	extends ReadableByteChannel
{

	public abstract long read(ByteBuffer abytebuffer[])
		throws IOException;

	public abstract long read(ByteBuffer abytebuffer[], int i, int j)
		throws IOException;
}
