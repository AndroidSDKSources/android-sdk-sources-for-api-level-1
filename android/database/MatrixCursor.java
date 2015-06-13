// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MatrixCursor.java

package android.database;


// Referenced classes of package android.database:
//			AbstractCursor

public class MatrixCursor extends AbstractCursor
{
	public class RowBuilder
	{

		final MatrixCursor this$0;

		public RowBuilder add(Object columnValue)
		{
			throw new RuntimeException("Stub!");
		}

		RowBuilder()
		{
			this$0 = MatrixCursor.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public MatrixCursor(String columnNames[], int initialCapacity)
	{
		throw new RuntimeException("Stub!");
	}

	public MatrixCursor(String columnNames[])
	{
		throw new RuntimeException("Stub!");
	}

	public RowBuilder newRow()
	{
		throw new RuntimeException("Stub!");
	}

	public void addRow(Object columnValues[])
	{
		throw new RuntimeException("Stub!");
	}

	public void addRow(Iterable columnValues)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCount()
	{
		throw new RuntimeException("Stub!");
	}

	public String[] getColumnNames()
	{
		throw new RuntimeException("Stub!");
	}

	public String getString(int column)
	{
		throw new RuntimeException("Stub!");
	}

	public short getShort(int column)
	{
		throw new RuntimeException("Stub!");
	}

	public int getInt(int column)
	{
		throw new RuntimeException("Stub!");
	}

	public long getLong(int column)
	{
		throw new RuntimeException("Stub!");
	}

	public float getFloat(int column)
	{
		throw new RuntimeException("Stub!");
	}

	public double getDouble(int column)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isNull(int column)
	{
		throw new RuntimeException("Stub!");
	}
}
