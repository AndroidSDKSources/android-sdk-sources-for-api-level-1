// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Destroyable.java

package javax.security.auth;


// Referenced classes of package javax.security.auth:
//			DestroyFailedException

public interface Destroyable
{

	public abstract void destroy()
		throws DestroyFailedException;

	public abstract boolean isDestroyed();
}
