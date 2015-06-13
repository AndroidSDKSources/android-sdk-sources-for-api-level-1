// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Checksum.java

package java.util.zip;


public interface Checksum
{

	public abstract long getValue();

	public abstract void reset();

	public abstract void update(int i);

	public abstract void update(byte abyte0[], int i, int j);
}
