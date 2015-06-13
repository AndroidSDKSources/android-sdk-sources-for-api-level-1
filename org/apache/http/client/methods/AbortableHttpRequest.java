// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbortableHttpRequest.java

package org.apache.http.client.methods;

import java.io.IOException;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;

public interface AbortableHttpRequest
{

	public abstract void setConnectionRequest(ClientConnectionRequest clientconnectionrequest)
		throws IOException;

	public abstract void setReleaseTrigger(ConnectionReleaseTrigger connectionreleasetrigger)
		throws IOException;

	public abstract void abort();
}
