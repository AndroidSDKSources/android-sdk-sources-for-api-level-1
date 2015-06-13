// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HandshakeCompletedListener.java

package javax.net.ssl;

import java.util.EventListener;

// Referenced classes of package javax.net.ssl:
//			HandshakeCompletedEvent

public interface HandshakeCompletedListener
	extends EventListener
{

	public abstract void handshakeCompleted(HandshakeCompletedEvent handshakecompletedevent);
}
