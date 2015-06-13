// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentHandler.java

package java.net;

import java.io.IOException;

// Referenced classes of package java.net:
//			URLConnection

public abstract class ContentHandler
{

	public ContentHandler()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Object getContent(URLConnection urlconnection)
		throws IOException;

	public Object getContent(URLConnection uConn, Class types[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
