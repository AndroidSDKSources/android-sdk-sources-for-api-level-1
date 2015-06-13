// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AssetManager.java

package android.content.res;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package android.content.res:
//			AssetFileDescriptor, XmlResourceParser

public final class AssetManager
{
	public final class AssetInputStream extends InputStream
	{

		final AssetManager this$0;

		public final int getAssetInt()
		{
			throw new RuntimeException("Stub!");
		}

		public final int read()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public final boolean markSupported()
		{
			throw new RuntimeException("Stub!");
		}

		public final int available()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public final void close()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public final void mark(int readlimit)
		{
			throw new RuntimeException("Stub!");
		}

		public final void reset()
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public final int read(byte b[])
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public final int read(byte b[], int off, int len)
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		public final long skip(long n)
			throws IOException
		{
			throw new RuntimeException("Stub!");
		}

		protected void finalize()
			throws Throwable
		{
			throw new RuntimeException("Stub!");
		}

		AssetInputStream()
		{
			this$0 = AssetManager.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	public static final int ACCESS_UNKNOWN = 0;
	public static final int ACCESS_RANDOM = 1;
	public static final int ACCESS_STREAMING = 2;
	public static final int ACCESS_BUFFER = 3;

	AssetManager()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public final InputStream open(String fileName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final InputStream open(String fileName, int accessMode)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final AssetFileDescriptor openFd(String fileName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final native String[] list(String s)
		throws IOException;

	public final AssetFileDescriptor openNonAssetFd(String fileName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final AssetFileDescriptor openNonAssetFd(int cookie, String fileName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final XmlResourceParser openXmlResourceParser(String fileName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public final XmlResourceParser openXmlResourceParser(int cookie, String fileName)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	protected void finalize()
		throws Throwable
	{
		throw new RuntimeException("Stub!");
	}

	public final native String[] getLocales();
}
