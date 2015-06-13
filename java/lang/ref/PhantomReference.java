// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PhantomReference.java

package java.lang.ref;


// Referenced classes of package java.lang.ref:
//			Reference, ReferenceQueue

public class PhantomReference extends Reference
{

	public PhantomReference(Object r, ReferenceQueue q)
	{
		throw new RuntimeException("Stub!");
	}

	public Object get()
	{
		throw new RuntimeException("Stub!");
	}
}
