// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PreferenceChangeEvent.java

package java.util.prefs;

import java.io.Serializable;
import java.util.EventObject;

// Referenced classes of package java.util.prefs:
//			Preferences

public class PreferenceChangeEvent extends EventObject
	implements Serializable
{

	public PreferenceChangeEvent(Preferences p, String k, String v)
	{
		super((Object)null);
		throw new RuntimeException("Stub!");
	}

	public String getKey()
	{
		throw new RuntimeException("Stub!");
	}

	public String getNewValue()
	{
		throw new RuntimeException("Stub!");
	}

	public Preferences getNode()
	{
		throw new RuntimeException("Stub!");
	}
}
