// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509ExtendedKeyManager.java

package javax.net.ssl;

import java.security.Principal;

// Referenced classes of package javax.net.ssl:
//			X509KeyManager, SSLEngine

public abstract class X509ExtendedKeyManager
	implements X509KeyManager
{

	protected X509ExtendedKeyManager()
	{
		throw new RuntimeException("Stub!");
	}

	public String chooseEngineClientAlias(String keyType[], Principal issuers[], SSLEngine engine)
	{
		throw new RuntimeException("Stub!");
	}

	public String chooseEngineServerAlias(String keyType, Principal issuers[], SSLEngine engine)
	{
		throw new RuntimeException("Stub!");
	}
}
