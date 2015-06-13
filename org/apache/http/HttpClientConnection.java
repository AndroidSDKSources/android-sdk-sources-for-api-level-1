// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpClientConnection.java

package org.apache.http;

import java.io.IOException;

// Referenced classes of package org.apache.http:
//			HttpConnection, HttpException, HttpRequest, HttpEntityEnclosingRequest, 
//			HttpResponse

public interface HttpClientConnection
	extends HttpConnection
{

	public abstract boolean isResponseAvailable(int i)
		throws IOException;

	public abstract void sendRequestHeader(HttpRequest httprequest)
		throws HttpException, IOException;

	public abstract void sendRequestEntity(HttpEntityEnclosingRequest httpentityenclosingrequest)
		throws HttpException, IOException;

	public abstract HttpResponse receiveResponseHeader()
		throws HttpException, IOException;

	public abstract void receiveResponseEntity(HttpResponse httpresponse)
		throws HttpException, IOException;

	public abstract void flush()
		throws IOException;
}
