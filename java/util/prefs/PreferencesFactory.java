// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PreferencesFactory.java

package java.util.prefs;


// Referenced classes of package java.util.prefs:
//			Preferences

public interface PreferencesFactory
{

	public abstract Preferences userRoot();

	public abstract Preferences systemRoot();
}
