// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CursorWindow.java

package android.database;

import android.database.sqlite.SQLiteClosable;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.database:
//			CharArrayBuffer

public class CursorWindow extends SQLiteClosable
	implements Parcelable
{

	public static final android.os.Parcelable.Creator CREATOR = null;

	public CursorWindow(boolean localWindow)
	{
		throw new RuntimeException("Stub!");
	}

	public int getStartPosition()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStartPosition(int pos)
	{
		throw new RuntimeException("Stub!");
	}

	public int getNumRows()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean setNumColumns(int columnNum)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean allocRow()
	{
		throw new RuntimeException("Stub!");
	}

	public void freeLastRow()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean putBlob(byte value[], int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean putString(String value, int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean putLong(long value, int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean putDouble(double value, int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean putNull(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isNull(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getBlob(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBlob(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public String getString(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public void copyStringToBuffer(int row, int col, CharArrayBuffer buffer)
	{
		throw new RuntimeException("Stub!");
	}

	public long getLong(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public double getDouble(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public short getShort(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public int getInt(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public float getFloat(int row, int col)
	{
		throw new RuntimeException("Stub!");
	}

	public void clear()
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

	public static CursorWindow newFromParcel(Parcel p)
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel dest, int flags)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onAllReferencesReleased()
	{
		throw new RuntimeException("Stub!");
	}

}
