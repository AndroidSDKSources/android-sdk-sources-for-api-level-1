// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CyclicBarrier.java

package java.util.concurrent;


// Referenced classes of package java.util.concurrent:
//			BrokenBarrierException, TimeoutException, TimeUnit

public class CyclicBarrier
{

	public CyclicBarrier(int parties, Runnable barrierAction)
	{
		throw new RuntimeException("Stub!");
	}

	public CyclicBarrier(int parties)
	{
		throw new RuntimeException("Stub!");
	}

	public int getParties()
	{
		throw new RuntimeException("Stub!");
	}

	public int await()
		throws InterruptedException, BrokenBarrierException
	{
		throw new RuntimeException("Stub!");
	}

	public int await(long timeout, TimeUnit unit)
		throws InterruptedException, BrokenBarrierException, TimeoutException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isBroken()
	{
		throw new RuntimeException("Stub!");
	}

	public void reset()
	{
		throw new RuntimeException("Stub!");
	}

	public int getNumberWaiting()
	{
		throw new RuntimeException("Stub!");
	}
}
