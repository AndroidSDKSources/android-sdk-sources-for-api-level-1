// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ResponseHandler.java

package org.apache.http.client;

import java.io.IOException;
import org.apache.http.HttpResponse;

// Referenced classes of package org.apache.http.client:
//			ClientProtocolException

public interface ResponseHandler
{

	public abstract Object handleResponse(HttpResponse httpresponse)
		throws ClientProtocolException, IOException;
}
