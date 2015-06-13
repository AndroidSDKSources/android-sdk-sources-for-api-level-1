// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RetentionPolicy.java

package java.lang.annotation;


public final class RetentionPolicy extends Enum
{

	public static final RetentionPolicy CLASS;
	public static final RetentionPolicy RUNTIME;
	public static final RetentionPolicy SOURCE;
	private static final RetentionPolicy $VALUES[];

	public static final RetentionPolicy[] values()
	{
		return (RetentionPolicy[])$VALUES.clone();
	}

	public static RetentionPolicy valueOf(String name)
	{
		return (RetentionPolicy)Enum.valueOf(java/lang/annotation/RetentionPolicy, name);
	}

	private RetentionPolicy(String s, int i)
	{
		super(s, i);
	}

	static 
	{
		CLASS = new RetentionPolicy("CLASS", 0);
		RUNTIME = new RetentionPolicy("RUNTIME", 1);
		SOURCE = new RetentionPolicy("SOURCE", 2);
		$VALUES = (new RetentionPolicy[] {
			CLASS, RUNTIME, SOURCE
		});
	}
}
