// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SuppressWarnings.java

package java.lang;

import java.lang.annotation.Annotation;

// Referenced classes of package java.lang:
//			Object, String

public interface SuppressWarnings
	extends Annotation
{

	public abstract String[] value();
}
