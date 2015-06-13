// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MessageQueue.java

package android.os;


public class MessageQueue
{
	public static interface IdleHandler
	{

		public abstract boolean queueIdle();
	}


	MessageQueue()
	{
		throw new RuntimeException("Stub!");
	}

	public final void addIdleHandler(IdleHandler handler)
	{
		throw new RuntimeException("Stub!");
	}

	public final void removeIdleHandler(IdleHandler handler)
	{
		throw new RuntimeException("Stub!");
	}
}
