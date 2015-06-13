// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PasswordCallback.java

package javax.security.auth.callback;

import java.io.Serializable;

// Referenced classes of package javax.security.auth.callback:
//			Callback

public class PasswordCallback
	implements Callback, Serializable
{

	public PasswordCallback(String prompt, boolean echoOn)
	{
		throw new RuntimeException("Stub!");
	}

	public String getPrompt()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isEchoOn()
	{
		throw new RuntimeException("Stub!");
	}

	public void setPassword(char password[])
	{
		throw new RuntimeException("Stub!");
	}

	public char[] getPassword()
	{
		throw new RuntimeException("Stub!");
	}

	public void clearPassword()
	{
		throw new RuntimeException("Stub!");
	}
}
