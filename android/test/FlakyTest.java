// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FlakyTest.java

package android.test;

import java.lang.annotation.Annotation;

public interface FlakyTest
	extends Annotation
{

	public abstract int tolerance();
}
