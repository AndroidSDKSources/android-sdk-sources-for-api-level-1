// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MatchResult.java

package java.util.regex;


public interface MatchResult
{

	public abstract int end();

	public abstract int end(int i);

	public abstract String group();

	public abstract String group(int i);

	public abstract int groupCount();

	public abstract int start();

	public abstract int start(int i);
}
