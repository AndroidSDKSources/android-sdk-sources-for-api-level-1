// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   GuardedObject.java

package java.security;

import java.io.Serializable;

// Referenced classes of package java.security:
//			Guard

public class GuardedObject
	implements Serializable
{

	public GuardedObject(Object object, Guard guard)
	{
		throw new RuntimeException("Stub!");
	}

	public Object getObject()
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}
}
