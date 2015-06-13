// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AbsSavedState.java

package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState
	implements Parcelable
{

	public static final AbsSavedState EMPTY_STATE = null;
	public static final android.os.Parcelable.Creator CREATOR = null;

	protected AbsSavedState(Parcelable superState)
	{
		throw new RuntimeException("Stub!");
	}

	protected AbsSavedState(Parcel source)
	{
		throw new RuntimeException("Stub!");
	}

	public final Parcelable getSuperState()
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
