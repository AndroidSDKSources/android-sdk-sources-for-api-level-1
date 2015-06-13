// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReadWriteLock.java

package java.util.concurrent.locks;


// Referenced classes of package java.util.concurrent.locks:
//			Lock

public interface ReadWriteLock
{

	public abstract Lock readLock();

	public abstract Lock writeLock();
}
