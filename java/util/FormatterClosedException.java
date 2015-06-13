// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FormatterClosedException.java

package java.util;

import java.io.Serializable;

public class FormatterClosedException extends IllegalStateException
	implements Serializable
{

	public FormatterClosedException()
	{
		throw new RuntimeException("Stub!");
	}
}
