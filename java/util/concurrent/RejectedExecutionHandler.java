// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RejectedExecutionHandler.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			ThreadPoolExecutor

public interface RejectedExecutionHandler
{

	public abstract void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor);
}
