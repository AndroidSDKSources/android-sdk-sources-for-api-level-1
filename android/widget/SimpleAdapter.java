// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SimpleAdapter.java

package android.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package android.widget:
//			BaseAdapter, Filterable, ImageView, TextView, 
//			Filter

public class SimpleAdapter extends BaseAdapter
	implements Filterable
{
	public static interface ViewBinder
	{

		public abstract boolean setViewValue(View view, Object obj, String s);
	}


	public SimpleAdapter(Context context, List data, int resource, String from[], int to[])
	{
		throw new RuntimeException("Stub!");
	}

	public int getCount()
	{
		throw new RuntimeException("Stub!");
	}

	public Object getItem(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public long getItemId(int position)
	{
		throw new RuntimeException("Stub!");
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDropDownViewResource(int resource)
	{
		throw new RuntimeException("Stub!");
	}

	public View getDropDownView(int position, View convertView, ViewGroup parent)
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

	public void setViewImage(ImageView v, int value)
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

	public Filter getFilter()
	{
		throw new RuntimeException("Stub!");
	}
}
