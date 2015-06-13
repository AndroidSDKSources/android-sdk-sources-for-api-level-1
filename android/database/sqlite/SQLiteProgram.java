// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SQLiteProgram.java

package android.database.sqlite;


// Referenced classes of package android.database.sqlite:
//			SQLiteClosable, SQLiteDatabase

public abstract class SQLiteProgram extends SQLiteClosable
{

	protected SQLiteDatabase mDatabase;
	protected int nHandle;
	protected int nStatement;

	SQLiteProgram()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAllReferencesReleased()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAllReferencesReleasedFromContainer()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getUniqueId()
	{
		throw new RuntimeException("Stub!");
	}

	protected void compile(String sql, boolean forceCompilation)
	{
		throw new RuntimeException("Stub!");
	}

	public void bindNull(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public void bindLong(int index, long value)
	{
		throw new RuntimeException("Stub!");
	}

	public void bindDouble(int index, double value)
	{
		throw new RuntimeException("Stub!");
	}

	public void bindString(int index, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public void bindBlob(int index, byte value[])
	{
		throw new RuntimeException("Stub!");
	}

	public void clearBindings()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
	{
		throw new RuntimeException("Stub!");
	}

	protected final native void native_compile(String s);

	protected final native void native_finalize();

	protected final native void native_bind_null(int i);

	protected final native void native_bind_long(int i, long l);

	protected final native void native_bind_double(int i, double d);

	protected final native void native_bind_string(int i, String s);

	protected final native void native_bind_blob(int i, byte abyte0[]);
}
