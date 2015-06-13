// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   UrlEncodedFormEntity.java

package org.apache.http.client.entity;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.entity.StringEntity;

public class UrlEncodedFormEntity extends StringEntity
{

	public UrlEncodedFormEntity(List parameters, String encoding)
		throws UnsupportedEncodingException
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}

	public UrlEncodedFormEntity(List parameters)
		throws UnsupportedEncodingException
	{
		super((String)null);
		throw new RuntimeException("Stub!");
	}
}
