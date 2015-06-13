// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   URLConnection.java

package java.net;

import java.io.*;
import java.security.Permission;
import java.util.Map;

// Referenced classes of package java.net:
//			URL, FileNameMap, ContentHandlerFactory

public abstract class URLConnection
{

	protected URL url;
	protected long ifModifiedSince;
	protected boolean useCaches;
	protected boolean connected;
	protected boolean doOutput;
	protected boolean doInput;
	protected boolean allowUserInteraction;

	protected URLConnection(URL url)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void connect()
		throws IOException;

	public boolean getAllowUserInteraction()
	{
		throw new RuntimeException("Stub!");
	}

	public Object getContent()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Object getContent(Class types[])
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getContentEncoding()
	{
		throw new RuntimeException("Stub!");
	}

	public int getContentLength()
	{
		throw new RuntimeException("Stub!");
	}

	public String getContentType()
	{
		throw new RuntimeException("Stub!");
	}

	public long getDate()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean getDefaultAllowUserInteraction()
	{
		throw new RuntimeException("Stub!");
	}

	public static String getDefaultRequestProperty(String field)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getDefaultUseCaches()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getDoInput()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getDoOutput()
	{
		throw new RuntimeException("Stub!");
	}

	public long getExpiration()
	{
		throw new RuntimeException("Stub!");
	}

	public static FileNameMap getFileNameMap()
	{
		throw new RuntimeException("Stub!");
	}

	public String getHeaderField(int pos)
	{
		throw new RuntimeException("Stub!");
	}

	public Map getHeaderFields()
	{
		throw new RuntimeException("Stub!");
	}

	public Map getRequestProperties()
	{
		throw new RuntimeException("Stub!");
	}

	public void addRequestProperty(String field, String newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public String getHeaderField(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public long getHeaderFieldDate(String field, long defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public int getHeaderFieldInt(String field, int defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public String getHeaderFieldKey(int posn)
	{
		throw new RuntimeException("Stub!");
	}

	public long getIfModifiedSince()
	{
		throw new RuntimeException("Stub!");
	}

	public InputStream getInputStream()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public long getLastModified()
	{
		throw new RuntimeException("Stub!");
	}

	public OutputStream getOutputStream()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public Permission getPermission()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getRequestProperty(String field)
	{
		throw new RuntimeException("Stub!");
	}

	public URL getURL()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getUseCaches()
	{
		throw new RuntimeException("Stub!");
	}

	public static String guessContentTypeFromName(String url)
	{
		throw new RuntimeException("Stub!");
	}

	public static String guessContentTypeFromStream(InputStream is)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void setAllowUserInteraction(boolean newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setContentHandlerFactory(ContentHandlerFactory contentFactory)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultAllowUserInteraction(boolean allows)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultRequestProperty(String field, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDefaultUseCaches(boolean newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDoInput(boolean newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDoOutput(boolean newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public static void setFileNameMap(FileNameMap map)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIfModifiedSince(long newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public void setRequestProperty(String field, String newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public void setUseCaches(boolean newValue)
	{
		throw new RuntimeException("Stub!");
	}

	public void setConnectTimeout(int timeout)
	{
		throw new RuntimeException("Stub!");
	}

	public int getConnectTimeout()
	{
		throw new RuntimeException("Stub!");
	}

	public void setReadTimeout(int timeout)
	{
		throw new RuntimeException("Stub!");
	}

	public int getReadTimeout()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
