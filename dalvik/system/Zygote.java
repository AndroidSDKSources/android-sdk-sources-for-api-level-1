// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Zygote.java

package dalvik.system;


public class Zygote
{

	Zygote()
	{
		throw new RuntimeException("Stub!");
	}

	public static native int fork();

	public static native int forkAndSpecialize(int i, int j, int ai[], boolean flag, int ai1[][]);

	public static native int forkSystemServer(int i, int j, int ai[], boolean flag, int ai1[][]);
}
