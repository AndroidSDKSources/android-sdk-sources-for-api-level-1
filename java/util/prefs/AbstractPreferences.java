// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractPreferences.java

package java.util.prefs;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package java.util.prefs:
//			Preferences, BackingStoreException, NodeChangeListener, PreferenceChangeListener

public abstract class AbstractPreferences extends Preferences
{

	protected final Object lock;
	protected boolean newNode;

	protected AbstractPreferences(AbstractPreferences parent, String name)
	{
		throw new RuntimeException("Stub!");
	}

	protected final AbstractPreferences[] cachedChildren()
	{
		throw new RuntimeException("Stub!");
	}

	protected AbstractPreferences getChild(String name)
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isRemoved()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void flushSpi()
		throws BackingStoreException;

	protected abstract String[] childrenNamesSpi()
		throws BackingStoreException;

	protected abstract AbstractPreferences childSpi(String s);

	protected abstract void putSpi(String s, String s1);

	protected abstract String getSpi(String s);

	protected abstract String[] keysSpi()
		throws BackingStoreException;

	protected abstract void removeNodeSpi()
		throws BackingStoreException;

	protected abstract void removeSpi(String s);

	protected abstract void syncSpi()
		throws BackingStoreException;

	public String absolutePath()
	{
		throw new RuntimeException("Stub!");
	}

	public String[] childrenNames()
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public void exportNode(OutputStream ostream)
		throws IOException, BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public void exportSubtree(OutputStream ostream)
		throws IOException, BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public String get(String key, String deflt)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean getBoolean(String key, boolean deflt)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getByteArray(String key, byte deflt[])
	{
		throw new RuntimeException("Stub!");
	}

	public double getDouble(String key, double deflt)
	{
		throw new RuntimeException("Stub!");
	}

	public float getFloat(String key, float deflt)
	{
		throw new RuntimeException("Stub!");
	}

	public int getInt(String key, int deflt)
	{
		throw new RuntimeException("Stub!");
	}

	public long getLong(String key, long deflt)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isUserNode()
	{
		throw new RuntimeException("Stub!");
	}

	public String[] keys()
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public String name()
	{
		throw new RuntimeException("Stub!");
	}

	public Preferences node(String name)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean nodeExists(String name)
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public Preferences parent()
	{
		throw new RuntimeException("Stub!");
	}

	public void put(String key, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public void putBoolean(String key, boolean value)
	{
		throw new RuntimeException("Stub!");
	}

	public void putByteArray(String key, byte value[])
	{
		throw new RuntimeException("Stub!");
	}

	public void putDouble(String key, double value)
	{
		throw new RuntimeException("Stub!");
	}

	public void putFloat(String key, float value)
	{
		throw new RuntimeException("Stub!");
	}

	public void putInt(String key, int value)
	{
		throw new RuntimeException("Stub!");
	}

	public void putLong(String key, long value)
	{
		throw new RuntimeException("Stub!");
	}

	public void remove(String key)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeNode()
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public void addNodeChangeListener(NodeChangeListener ncl)
	{
		throw new RuntimeException("Stub!");
	}

	public void addPreferenceChangeListener(PreferenceChangeListener pcl)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeNodeChangeListener(NodeChangeListener ncl)
	{
		throw new RuntimeException("Stub!");
	}

	public void removePreferenceChangeListener(PreferenceChangeListener pcl)
	{
		throw new RuntimeException("Stub!");
	}

	public void sync()
		throws BackingStoreException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}
}
