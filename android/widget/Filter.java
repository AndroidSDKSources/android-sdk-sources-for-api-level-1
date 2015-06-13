// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Filter.java

package android.widget;


public abstract class Filter
{
	public static interface FilterListener
	{

		public abstract void onFilterComplete(int i);
	}

	protected static class FilterResults
	{

		public Object values;
		public int count;

		public FilterResults()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public Filter()
	{
		throw new RuntimeException("Stub!");
	}

	public final void filter(CharSequence constraint)
	{
		throw new RuntimeException("Stub!");
	}

	public final void filter(CharSequence constraint, FilterListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract FilterResults performFiltering(CharSequence charsequence);

	protected abstract void publishResults(CharSequence charsequence, FilterResults filterresults);

	public CharSequence convertResultToString(Object resultValue)
	{
		throw new RuntimeException("Stub!");
	}
}
