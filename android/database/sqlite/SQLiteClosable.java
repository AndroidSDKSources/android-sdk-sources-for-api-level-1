// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLiteClosable.java

package android.database.sqlite;


public abstract class SQLiteClosable
{

	public SQLiteClosable()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract void onAllReferencesReleased();

	protected void onAllReferencesReleasedFromContainer()
	{
		throw new RuntimeException("Stub!");
	}

	public void acquireReference()
	{
		throw new RuntimeException("Stub!");
	}

	public void releaseReference()
	{
		throw new RuntimeException("Stub!");
	}

	public void releaseReferenceFromContainer()
	{
		throw new RuntimeException("Stub!");
	}
}
