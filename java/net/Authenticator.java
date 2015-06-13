// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Authenticator.java

package java.net;


// Referenced classes of package java.net:
//			PasswordAuthentication, InetAddress, URL

public abstract class Authenticator
{
	public static final class RequestorType extends Enum
	{

		public static final RequestorType PROXY;
		public static final RequestorType SERVER;
		private static final RequestorType $VALUES[];

		public static final RequestorType[] values()
		{
			return (RequestorType[])$VALUES.clone();
		}

		public static RequestorType valueOf(String name)
		{
			return (RequestorType)Enum.valueOf(java/net/Authenticator$RequestorType, name);
		}

		static 
		{
			PROXY = new RequestorType("PROXY", 0);
			SERVER = new RequestorType("SERVER", 1);
			$VALUES = (new RequestorType[] {
				PROXY, SERVER
			});
		}

		private RequestorType(String s, int i)
		{
			super(s, i);
		}
	}


	public Authenticator()
	{
		throw new RuntimeException("Stub!");
	}

	protected PasswordAuthentication getPasswordAuthentication()
	{
		throw new RuntimeException("Stub!");
	}

	protected final int getRequestingPort()
	{
		throw new RuntimeException("Stub!");
	}

	protected final InetAddress getRequestingSite()
	{
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingPrompt()
	{
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingProtocol()
	{
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingScheme()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized PasswordAuthentication requestPasswordAuthentication(InetAddress rAddr, int rPort, String rProtocol, String rPrompt, String rScheme)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefault(Authenticator a)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized PasswordAuthentication requestPasswordAuthentication(String rHost, InetAddress rAddr, int rPort, String rProtocol, String rPrompt, String rScheme)
	{
		throw new RuntimeException("Stub!");
	}

	protected final String getRequestingHost()
	{
		throw new RuntimeException("Stub!");
	}

	public static PasswordAuthentication requestPasswordAuthentication(String rHost, InetAddress rAddr, int rPort, String rProtocol, String rPrompt, String rScheme, URL rURL, RequestorType reqType)
	{
		throw new RuntimeException("Stub!");
	}

	protected URL getRequestingURL()
	{
		throw new RuntimeException("Stub!");
	}

	protected RequestorType getRequestorType()
	{
		throw new RuntimeException("Stub!");
	}
}
