// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AssetFileDescriptor.java

package android.content.res;

import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;

public class AssetFileDescriptor
{

	public AssetFileDescriptor(ParcelFileDescriptor fd, long startOffset, long length)
	{
		throw new RuntimeException("Stub!");
	}

	public ParcelFileDescriptor getParcelFileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	public FileDescriptor getFileDescriptor()
	{
		throw new RuntimeException("Stub!");
	}

	public long getStartOffset()
	{
		throw new RuntimeException("Stub!");
	}

	public long getLength()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
