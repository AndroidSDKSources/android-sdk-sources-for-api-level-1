// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SSLSessionBindingEvent.java

package javax.net.ssl;

import java.io.Serializable;
import java.util.EventObject;

// Referenced classes of package javax.net.ssl:
//			SSLSession

public class SSLSessionBindingEvent extends EventObject
	implements Serializable
{

	public SSLSessionBindingEvent(SSLSession session, String name)
	{
		super((Object)null);
		throw new RuntimeException("Stub!");
	}

	public String getName()
	{
		throw new RuntimeException("Stub!");
	}

	public SSLSession getSession()
	{
		throw new RuntimeException("Stub!");
	}
}
