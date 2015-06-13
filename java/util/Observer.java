// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Observer.java

package java.util;


// Referenced classes of package java.util:
//			Observable

public interface Observer
{

	public abstract void update(Observable observable, Object obj);
}
