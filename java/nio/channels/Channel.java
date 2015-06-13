// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Channel.java

package java.nio.channels;

import java.io.Closeable;
import java.io.IOException;

public interface Channel
	extends Closeable
{

	public abstract boolean isOpen();

	public abstract void close()
		throws IOException;
}
