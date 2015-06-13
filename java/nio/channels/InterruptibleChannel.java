// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InterruptibleChannel.java

package java.nio.channels;

import java.io.IOException;

// Referenced classes of package java.nio.channels:
//			Channel

public interface InterruptibleChannel
	extends Channel
{

	public abstract void close()
		throws IOException;
}
