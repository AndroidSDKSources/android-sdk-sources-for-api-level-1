// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CallbackHandler.java

package javax.security.auth.callback;

import java.io.IOException;

// Referenced classes of package javax.security.auth.callback:
//			UnsupportedCallbackException, Callback

public interface CallbackHandler
{

	public abstract void handle(Callback acallback[])
		throws IOException, UnsupportedCallbackException;
}
