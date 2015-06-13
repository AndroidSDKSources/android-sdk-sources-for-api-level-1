// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Closeable.java

package java.io;


// Referenced classes of package java.io:
//			IOException

public interface Closeable
{

	public abstract void close()
		throws IOException;
}
