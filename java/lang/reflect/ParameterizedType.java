// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ParameterizedType.java

package java.lang.reflect;


// Referenced classes of package java.lang.reflect:
//			Type

public interface ParameterizedType
	extends Type
{

	public abstract Type[] getActualTypeArguments();

	public abstract Type getOwnerType();

	public abstract Type getRawType();
}