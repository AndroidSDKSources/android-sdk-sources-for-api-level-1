// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SimpleCursorAdapter.java

package android.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.View;

// Referenced classes of package android.widget:
//			ResourceCursorAdapter, ImageView, TextView

public class SimpleCursorAdapter extends ResourceCursorAdapter
{
	public static interface CursorToStringConverter
	{

		public abstract CharSequence convertToString(Cursor cursor);
	}

	public static interface ViewBinder
	{

		public abstract boolean setViewValue(View view, Cursor cursor, int i);
	}


	public SimpleCursorAdapter(Context context, int layout, Cursor c, String from[], int to[])
	{
		super((Context)null, 0, (Cursor)null);
		throw new RuntimeException("Stub!");
	}

	public void bindView(View view, Context context, Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public ViewBinder getViewBinder()
	{
		throw new RuntimeException("Stub!");
	}

	public void setViewBinder(ViewBinder viewBinder)
	{
		throw new RuntimeException("Stub!");
	}

	public void setViewImage(ImageView v, String value)
	{
		throw new RuntimeException("Stub!");
	}

	public void setViewText(TextView v, String text)
	{
		throw new RuntimeException("Stub!");
	}

	public int getStringConversionColumn()
	{
		throw new RuntimeException("Stub!");
	}

	public void setStringConversionColumn(int stringConversionColumn)
	{
		throw new RuntimeException("Stub!");
	}

	public CursorToStringConverter getCursorToStringConverter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setCursorToStringConverter(CursorToStringConverter cursorToStringConverter)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence convertToString(Cursor cursor)
	{
		throw new RuntimeException("Stub!");
	}

	public void changeCursor(Cursor c)
	{
		throw new RuntimeException("Stub!");
	}
}
