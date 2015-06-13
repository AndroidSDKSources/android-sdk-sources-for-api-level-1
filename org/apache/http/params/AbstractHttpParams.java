// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractHttpParams.java

package org.apache.http.params;


// Referenced classes of package org.apache.http.params:
//			HttpParams

public abstract class AbstractHttpParams
	implements HttpParams
{

	protected AbstractHttpParams()
	{
		throw new RuntimeException("Stub!");
	}

	public long getLongParameter(String name, long defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpParams setLongParameter(String name, long value)
	{
		throw new RuntimeException("Stub!");
	}

	public int getIntParameter(String name, int defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpParams setIntParameter(String name, int value)
	{
		throw new RuntimeException("Stub!");
	}

	public double getDoubleParameter(String name, double defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpParams setDoubleParameter(String name, double value)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getBooleanParameter(String name, boolean defaultValue)
	{
		throw new RuntimeException("Stub!");
	}

	public HttpParams setBooleanParameter(String name, boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isParameterTrue(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isParameterFalse(String name)
	{
		throw new RuntimeException("Stub!");
	}
}
