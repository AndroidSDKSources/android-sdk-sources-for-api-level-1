// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Preferences.java

package java.util.prefs;

import java.io.*;

// Referenced classes of package java.util.prefs:
//			BackingStoreException, InvalidPreferencesFormatException, NodeChangeListener, PreferenceChangeListener

public abstract class Preferences
{

	public static final int MAX_KEY_LENGTH = 80;
	public static final int MAX_NAME_LENGTH = 80;
	public static final int MAX_VALUE_LENGTH = 8192;

	protected Preferences()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String absolutePath();

	public abstract String[] childrenNames()
		throws BackingStoreException;

	public abstract void clear()
		throws BackingStoreException;

	public abstract void exportNode(OutputStream outputstream)
		throws IOException, BackingStoreException;

	public abstract void exportSubtree(OutputStream outputstream)
		throws IOException, BackingStoreException;

	public abstract void flush()
		throws BackingStoreException;

	public abstract String get(String s, String s1);

	public abstract boolean getBoolean(String s, boolean flag);

	public abstract byte[] getByteArray(String s, byte abyte0[]);

	public abstract double getDouble(String s, double d);

	public abstract float getFloat(String s, float f);

	public abstract int getInt(String s, int i);

	public abstract long getLong(String s, long l);

	public static void importPreferences(InputStream istream)
		throws InvalidPreferencesFormatException, IOException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isUserNode();

	public abstract String[] keys()
		throws BackingStoreException;

	public abstract String name();

	public abstract Preferences node(String s);

	public abstract boolean nodeExists(String s)
		throws BackingStoreException;

	public abstract Preferences parent();

	public abstract void put(String s, String s1);

	public abstract void putBoolean(String s, boolean flag);

	public abstract void putByteArray(String s, byte abyte0[]);

	public abstract void putDouble(String s, double d);

	public abstract void putFloat(String s, float f);

	public abstract void putInt(String s, int i);

	public abstract void putLong(String s, long l);

	public abstract void remove(String s);

	public abstract void removeNode()
		throws BackingStoreException;

	public abstract void addNodeChangeListener(NodeChangeListener nodechangelistener);

	public abstract void addPreferenceChangeListener(PreferenceChangeListener preferencechangelistener);

	public abstract void removeNodeChangeListener(NodeChangeListener nodechangelistener);

	public abstract void removePreferenceChangeListener(PreferenceChangeListener preferencechangelistener);

	public abstract void sync()
		throws BackingStoreException;

	public static Preferences systemNodeForPackage(Class c)
	{
		throw new RuntimeException("Stub!");
	}

	public static Preferences systemRoot()
	{
		throw new RuntimeException("Stub!");
	}

	public static Preferences userNodeForPackage(Class c)
	{
		throw new RuntimeException("Stub!");
	}

	public static Preferences userRoot()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String toString();
}
