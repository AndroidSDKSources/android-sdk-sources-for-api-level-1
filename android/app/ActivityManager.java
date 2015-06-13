// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ActivityManager.java

package android.app;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class ActivityManager
{
	public static class ProcessErrorStateInfo
		implements Parcelable
	{

		public static final int NO_ERROR = 0;
		public static final int CRASHED = 1;
		public static final int NOT_RESPONDING = 2;
		public int condition;
		public String processName;
		public int pid;
		public int uid;
		public String tag;
		public String shortMsg;
		public String longMsg;
		public byte crashData[];
		public static final android.os.Parcelable.Creator CREATOR = null;

		public int describeContents()
		{
			throw new RuntimeException("Stub!");
		}

		public void writeToParcel(Parcel dest, int flags)
		{
			throw new RuntimeException("Stub!");
		}

		public void readFromParcel(Parcel source)
		{
			throw new RuntimeException("Stub!");
		}


		public ProcessErrorStateInfo()
		{
			crashData = null;
			throw new RuntimeException("Stub!");
		}
	}

	public static class MemoryInfo
		implements Parcelable
	{

		public long availMem;
		public long threshold;
		public boolean lowMemory;
		public static final android.os.Parcelable.Creator CREATOR = null;

		public int describeContents()
		{
			throw new RuntimeException("Stub!");
		}

		public void writeToParcel(Parcel dest, int flags)
		{
			throw new RuntimeException("Stub!");
		}

		public void readFromParcel(Parcel source)
		{
			throw new RuntimeException("Stub!");
		}


		public MemoryInfo()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class RunningServiceInfo
		implements Parcelable
	{

		public ComponentName service;
		public int pid;
		public String process;
		public boolean foreground;
		public long activeSince;
		public boolean started;
		public int clientCount;
		public int crashCount;
		public long lastActivityTime;
		public long restarting;
		public static final android.os.Parcelable.Creator CREATOR = null;

		public int describeContents()
		{
			throw new RuntimeException("Stub!");
		}

		public void writeToParcel(Parcel dest, int flags)
		{
			throw new RuntimeException("Stub!");
		}

		public void readFromParcel(Parcel source)
		{
			throw new RuntimeException("Stub!");
		}


		public RunningServiceInfo()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class RunningTaskInfo
		implements Parcelable
	{

		public int id;
		public ComponentName baseActivity;
		public ComponentName topActivity;
		public Bitmap thumbnail;
		public CharSequence description;
		public int numActivities;
		public int numRunning;
		public static final android.os.Parcelable.Creator CREATOR = null;

		public int describeContents()
		{
			throw new RuntimeException("Stub!");
		}

		public void writeToParcel(Parcel dest, int flags)
		{
			throw new RuntimeException("Stub!");
		}

		public void readFromParcel(Parcel source)
		{
			throw new RuntimeException("Stub!");
		}


		public RunningTaskInfo()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class RecentTaskInfo
		implements Parcelable
	{

		public int id;
		public Intent baseIntent;
		public ComponentName origActivity;
		public static final android.os.Parcelable.Creator CREATOR = null;

		public int describeContents()
		{
			throw new RuntimeException("Stub!");
		}

		public void writeToParcel(Parcel dest, int flags)
		{
			throw new RuntimeException("Stub!");
		}

		public void readFromParcel(Parcel source)
		{
			throw new RuntimeException("Stub!");
		}


		public RecentTaskInfo()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public static final int RECENT_WITH_EXCLUDED = 1;

	ActivityManager()
	{
		throw new RuntimeException("Stub!");
	}

	public List getRecentTasks(int maxNum, int flags)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public List getRunningTasks(int maxNum)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public List getRunningServices(int maxNum)
		throws SecurityException
	{
		throw new RuntimeException("Stub!");
	}

	public void getMemoryInfo(MemoryInfo outInfo)
	{
		throw new RuntimeException("Stub!");
	}

	public List getProcessesInErrorState()
	{
		throw new RuntimeException("Stub!");
	}
}
