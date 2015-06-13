// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLPermission.java

package java.sql;

import java.io.Serializable;
import java.security.BasicPermission;
import java.security.Guard;

public final class SQLPermission extends BasicPermission
	implements Guard, Serializable
{

	public SQLPermission(String name)
	{
		super((String)null, (String)null);
		throw new RuntimeException("Stub!");
	}

	public SQLPermission(String name, String actions)
	{
		super((String)null, (String)null);
		throw new RuntimeException("Stub!");
	}
}
