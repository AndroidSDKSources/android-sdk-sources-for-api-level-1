// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

package junit.framework;


// Referenced classes of package junit.framework:
//			TestResult

public interface Test
{

	public abstract int countTestCases();

	public abstract void run(TestResult testresult);
}
