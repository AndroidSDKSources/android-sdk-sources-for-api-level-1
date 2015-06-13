// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LayoutInflater.java

package android.view;

import android.content.Context;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.view:
//			InflateException, ViewGroup, View

public abstract class LayoutInflater
{
	public static interface Factory
	{

		public abstract View onCreateView(String s, Context context, AttributeSet attributeset);
	}

	public static interface Filter
	{

		public abstract boolean onLoadClass(Class class1);
	}


	protected LayoutInflater(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	protected LayoutInflater(LayoutInflater original, Context newContext)
	{
		throw new RuntimeException("Stub!");
	}

	public static LayoutInflater from(Context context)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract LayoutInflater cloneInContext(Context context);

	public Context getContext()
	{
		throw new RuntimeException("Stub!");
	}

	public final Factory getFactory()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFactory(Factory factory)
	{
		throw new RuntimeException("Stub!");
	}

	public Filter getFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilter(Filter filter)
	{
		throw new RuntimeException("Stub!");
	}

	public View inflate(int resource, ViewGroup root)
	{
		throw new RuntimeException("Stub!");
	}

	public View inflate(XmlPullParser parser, ViewGroup root)
	{
		throw new RuntimeException("Stub!");
	}

	public View inflate(int resource, ViewGroup root, boolean attachToRoot)
	{
		throw new RuntimeException("Stub!");
	}

	public View inflate(XmlPullParser parser, ViewGroup root, boolean attachToRoot)
	{
		throw new RuntimeException("Stub!");
	}

	public final View createView(String name, String prefix, AttributeSet attrs)
		throws ClassNotFoundException, InflateException
	{
		throw new RuntimeException("Stub!");
	}

	protected View onCreateView(String name, AttributeSet attrs)
		throws ClassNotFoundException
	{
		throw new RuntimeException("Stub!");
	}
}
