// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Number.java

package java.lang;

import java.io.Serializable;

// Referenced classes of package java.lang:
//			Object, RuntimeException

public abstract class Number
	implements Serializable
{

	public Number()
	{
		throw new RuntimeException("Stub!");
	}

	public byte byteValue()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract double doubleValue();

	public abstract float floatValue();

	public abstract int intValue();

	public abstract long longValue();

	public short shortValue()
	{
		throw new RuntimeException("Stub!");
	}
}
