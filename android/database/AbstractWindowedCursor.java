// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbstractWindowedCursor.java

package android.database;


// Referenced classes of package android.database:
//			AbstractCursor, CursorWindow, CharArrayBuffer

public abstract class AbstractWindowedCursor extends AbstractCursor
{

	protected CursorWindow mWindow;

	public AbstractWindowedCursor()
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getBlob(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public String getString(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public short getShort(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public int getInt(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public long getLong(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public float getFloat(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public double getDouble(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isNull(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBlob(int columnIndex)
	{
		throw new RuntimeException("Stub!");
	}

	protected void checkPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public CursorWindow getWindow()
	{
		throw new RuntimeException("Stub!");
	}

	public void setWindow(CursorWindow window)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasWindow()
	{
		throw new RuntimeException("Stub!");
	}
}
