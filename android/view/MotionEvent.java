// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MotionEvent.java

package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public final class MotionEvent
	implements Parcelable
{

	public static final int ACTION_DOWN = 0;
	public static final int ACTION_UP = 1;
	public static final int ACTION_MOVE = 2;
	public static final int ACTION_CANCEL = 3;
	public static final int EDGE_TOP = 1;
	public static final int EDGE_BOTTOM = 2;
	public static final int EDGE_LEFT = 4;
	public static final int EDGE_RIGHT = 8;
	public static final android.os.Parcelable.Creator CREATOR = null;

	MotionEvent()
	{
		throw new RuntimeException("Stub!");
	}

	public static MotionEvent obtain(long downTime, long eventTime, int action, float x, float y, float pressure, 
			float size, int metaState, float xPrecision, float yPrecision, int deviceId, int edgeFlags)
	{
		throw new RuntimeException("Stub!");
	}

	public static MotionEvent obtain(long downTime, long eventTime, int action, float x, float y, int metaState)
	{
		throw new RuntimeException("Stub!");
	}

	public static MotionEvent obtain(MotionEvent o)
	{
		throw new RuntimeException("Stub!");
	}

	public void recycle()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getAction()
	{
		throw new RuntimeException("Stub!");
	}

	public final long getDownTime()
	{
		throw new RuntimeException("Stub!");
	}

	public final long getEventTime()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getX()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getY()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getPressure()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getSize()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getMetaState()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getRawX()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getRawY()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getXPrecision()
	{
		throw new RuntimeException("Stub!");
	}

	public final float getYPrecision()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getHistorySize()
	{
		throw new RuntimeException("Stub!");
	}

	public final long getHistoricalEventTime(int pos)
	{
		throw new RuntimeException("Stub!");
	}

	public final float getHistoricalX(int pos)
	{
		throw new RuntimeException("Stub!");
	}

	public final float getHistoricalY(int pos)
	{
		throw new RuntimeException("Stub!");
	}

	public final float getHistoricalPressure(int pos)
	{
		throw new RuntimeException("Stub!");
	}

	public final float getHistoricalSize(int pos)
	{
		throw new RuntimeException("Stub!");
	}

	public final int getDeviceId()
	{
		throw new RuntimeException("Stub!");
	}

	public final int getEdgeFlags()
	{
		throw new RuntimeException("Stub!");
	}

	public final void setEdgeFlags(int flags)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setAction(int action)
	{
		throw new RuntimeException("Stub!");
	}

	public final void offsetLocation(float deltaX, float deltaY)
	{
		throw new RuntimeException("Stub!");
	}

	public final void setLocation(float x, float y)
	{
		throw new RuntimeException("Stub!");
	}

	public final void addBatch(long eventTime, float x, float y, float pressure, float size, int metaState)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public int describeContents()
	{
		throw new RuntimeException("Stub!");
	}

	public void writeToParcel(Parcel out, int flags)
	{
		throw new RuntimeException("Stub!");
	}

}
