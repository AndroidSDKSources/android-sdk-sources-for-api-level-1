// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NodeChangeEvent.java

package java.util.prefs;

import java.io.Serializable;
import java.util.EventObject;

// Referenced classes of package java.util.prefs:
//			Preferences

public class NodeChangeEvent extends EventObject
	implements Serializable
{

	public NodeChangeEvent(Preferences p, Preferences c)
	{
		super((Object)null);
		throw new RuntimeException("Stub!");
	}

	public Preferences getParent()
	{
		throw new RuntimeException("Stub!");
	}

	public Preferences getChild()
	{
		throw new RuntimeException("Stub!");
	}
}
