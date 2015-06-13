// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   X509KeyManager.java

package javax.net.ssl;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

// Referenced classes of package javax.net.ssl:
//			KeyManager

public interface X509KeyManager
	extends KeyManager
{

	public abstract String chooseClientAlias(String as[], Principal aprincipal[], Socket socket);

	public abstract String chooseServerAlias(String s, Principal aprincipal[], Socket socket);

	public abstract X509Certificate[] getCertificateChain(String s);

	public abstract String[] getClientAliases(String s, Principal aprincipal[]);

	public abstract String[] getServerAliases(String s, Principal aprincipal[]);

	public abstract PrivateKey getPrivateKey(String s);
}
