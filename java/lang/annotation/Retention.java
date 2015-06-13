// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Retention.java

package java.lang.annotation;


// Referenced classes of package java.lang.annotation:
//			Annotation, RetentionPolicy

public interface Retention
	extends Annotation
{

	public abstract RetentionPolicy value();
}
