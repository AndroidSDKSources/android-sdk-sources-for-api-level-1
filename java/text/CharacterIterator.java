// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharacterIterator.java

package java.text;


public interface CharacterIterator
	extends Cloneable
{

	public static final char DONE = 65535;

	public abstract Object clone();

	public abstract char current();

	public abstract char first();

	public abstract int getBeginIndex();

	public abstract int getEndIndex();

	public abstract int getIndex();

	public abstract char last();

	public abstract char next();

	public abstract char previous();

	public abstract char setIndex(int i);
}
