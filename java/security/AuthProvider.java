// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AuthProvider.java

package java.security;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;

// Referenced classes of package java.security:
//			Provider

public abstract class AuthProvider extends Provider
{

	protected AuthProvider(String name, double version, String info)
	{
		super((String)null, 0.0D, (String)null);
		throw new RuntimeException("Stub!");
	}

	public abstract void login(Subject subject, CallbackHandler callbackhandler)
		throws LoginException;

	public abstract void logout()
		throws LoginException;

	public abstract void setCallbackHandler(CallbackHandler callbackhandler);
}
