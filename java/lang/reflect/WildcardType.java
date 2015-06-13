// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   WildcardType.java

package java.lang.reflect;


// Referenced classes of package java.lang.reflect:
//			Type

public interface WildcardType
	extends Type
{

	public abstract Type[] getUpperBounds();

	public abstract Type[] getLowerBounds();
}
