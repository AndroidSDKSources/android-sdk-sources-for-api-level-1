// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LoggingPermission.java

package java.util.logging;

import java.io.Serializable;
import java.security.BasicPermission;
import java.security.Guard;

public final class LoggingPermission extends BasicPermission
	implements Guard, Serializable
{

	public LoggingPermission(String name, String actions)
	{
		super((String)null, (String)null);
		throw new RuntimeException("Stub!");
	}
}
