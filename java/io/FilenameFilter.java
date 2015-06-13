// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FilenameFilter.java

package java.io;


// Referenced classes of package java.io:
//			File

public interface FilenameFilter
{

	public abstract boolean accept(File file, String s);
}
