// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestSuiteLoader.java

package junit.runner;


public interface TestSuiteLoader
{

	public abstract Class load(String s)
		throws ClassNotFoundException;

	public abstract Class reload(Class class1)
		throws ClassNotFoundException;
}
