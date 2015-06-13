// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Process.java

package java.lang;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package java.lang:
//			Object, RuntimeException, InterruptedException

public abstract class Process
{

	public Process()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void destroy();

	public abstract int exitValue();

	public abstract InputStream getErrorStream();

	public abstract InputStream getInputStream();

	public abstract OutputStream getOutputStream();

	public abstract int waitFor()
		throws InterruptedException;
}
