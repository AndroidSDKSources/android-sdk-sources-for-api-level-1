// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharSequence.java

package java.lang;

// Referenced classes of package java.lang:
//			Object, String

public interface CharSequence
{

	public abstract int length();

	public abstract char charAt(int i);

	public abstract CharSequence subSequence(int i, int j);

	public abstract String toString();
}
