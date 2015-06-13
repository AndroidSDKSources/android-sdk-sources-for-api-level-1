// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   URLEncodedUtils.java

package org.apache.http.client.utils;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Scanner;
import org.apache.http.HttpEntity;

public class URLEncodedUtils
{

	public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";

	public URLEncodedUtils()
	{
		throw new RuntimeException("Stub!");
	}

	public static List parse(URI uri, String encoding)
	{
		throw new RuntimeException("Stub!");
	}

	public static List parse(HttpEntity entity)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isEncoded(HttpEntity entity)
	{
		throw new RuntimeException("Stub!");
	}

	public static void parse(List parameters, Scanner scanner, String encoding)
	{
		throw new RuntimeException("Stub!");
	}

	public static String format(List parameters, String encoding)
	{
		throw new RuntimeException("Stub!");
	}
}
