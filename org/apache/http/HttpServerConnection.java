// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpServerConnection.java

package org.apache.http;

import java.io.IOException;

// Referenced classes of package org.apache.http:
//			HttpConnection, HttpException, HttpRequest, HttpEntityEnclosingRequest, 
//			HttpResponse

public interface HttpServerConnection
	extends HttpConnection
{

	public abstract HttpRequest receiveRequestHeader()
		throws HttpException, IOException;

	public abstract void receiveRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest)
		throws HttpException, IOException;

	public abstract void sendResponseHeader(HttpResponse httpresponse)
		throws HttpException, IOException;

	public abstract void sendResponseEntity(HttpResponse httpresponse)
		throws HttpException, IOException;

	public abstract void flush()
		throws IOException;
}
