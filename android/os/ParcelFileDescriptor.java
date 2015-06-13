// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ParcelFileDescriptor.java

package android.os;

import java.io.*;
import java.net.Socket;

// Referenced classes of package android.os:
//			Parcelable, Parcel

public class ParcelFileDescriptor
	implements Parcelable
{
	public static class AutoCloseOutputStream extends FileOutputStream
	{

		public void close()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public AutoCloseOutputStream(ParcelFileDescriptor fd)
		{
			super((FileDescriptor)null);
			throw new RuntimeException("Stub!");
		}
	}

	public static class AutoCloseInputStream extends FileInputStream
	{

		public void close()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public AutoCloseInputStream(ParcelFileDescriptor fd)
		{
			super((FileDescriptor)null);
			throw new RuntimeException("Stub!");
		}
	}


	public static final int MODE_WORLD_READABLE = 1;
	public static final int MODE_WORLD_WRITEABLE = 2;
	public static final int MODE_READ_ONLY = 0x10000000;
	public static final int MODE_WRITE_ONLY = 0x20000000;
	public static final int MODE_READ_WRITE = 0x30000000;
	public static final int MODE_CREATE = 0x8000000;
	public static final int MODE_TRUNCATE = 0x4000000;
	public static final Parcelable.Creator CREATOR = null;

	public ParcelFileDescriptor(ParcelFileDescriptor descriptor)
	{
		throw new RuntimeException("Stub!");
	}

	public static ParcelFileDescriptor open(File file, int mode)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public static ParcelFileDescriptor fromSocket(Socket socket)
	{
		throw new RuntimeException("Stub!");
	}

	public FileDescriptor getFileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
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
