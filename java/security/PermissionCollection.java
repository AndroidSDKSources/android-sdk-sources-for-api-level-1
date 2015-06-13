// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PermissionCollection.java

package java.security;

import java.io.Serializable;
import java.util.Enumeration;

// Referenced classes of package java.security:
//			Permission

public abstract class PermissionCollection
	implements Serializable
{

	public PermissionCollection()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void add(Permission permission);

	public abstract Enumeration elements();

	public abstract boolean implies(Permission permission);

	public boolean isReadOnly()
	{
		throw new RuntimeException("Stub!");
	}

	public void setReadOnly()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
