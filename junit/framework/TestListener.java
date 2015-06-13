// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestListener.java

package junit.framework;


// Referenced classes of package junit.framework:
//			Test, AssertionFailedError

public interface TestListener
{

	public abstract void addError(Test test, Throwable throwable);

	public abstract void addFailure(Test test, AssertionFailedError assertionfailederror);

	public abstract void endTest(Test test);

	public abstract void startTest(Test test);
}
