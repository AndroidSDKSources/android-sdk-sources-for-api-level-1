// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RemoteViews.java

package android.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.*;
import java.lang.annotation.Annotation;

public class RemoteViews
	implements Parcelable, android.view.LayoutInflater.Filter
{
	public static class ActionException extends RuntimeException
	{

		public ActionException(String message)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface RemoteView
		extends Annotation
	{
	}


	public static final android.os.Parcelable.Creator CREATOR = null;

	public RemoteViews(String packageName, int layoutId)
	{
		throw new RuntimeException("Stub!");
	}

	public RemoteViews(Parcel parcel)
	{
		throw new RuntimeException("Stub!");
	}

	public String getPackage()
	{
		throw new RuntimeException("Stub!");
	}

	public int getLayoutId()
	{
		throw new RuntimeException("Stub!");
	}

	public void setViewVisibility(int viewId, int visibility)
	{
		throw new RuntimeException("Stub!");
	}

	public void setTextViewText(int viewId, CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageViewResource(int viewId, int srcId)
	{
		throw new RuntimeException("Stub!");
	}

	public void setImageViewUri(int viewId, Uri uri)
	{
		throw new RuntimeException("Stub!");
	}

	public void setChronometer(int viewId, long base, String format, boolean running)
	{
		throw new RuntimeException("Stub!");
	}

	public void setProgressBar(int viewId, int max, int progress, boolean indeterminate)
	{
		throw new RuntimeException("Stub!");
	}

	public View apply(Context context, ViewGroup parent)
	{
		throw new RuntimeException("Stub!");
	}

	public void reapply(Context context, View v)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onLoadClass(Class clazz)
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

}
