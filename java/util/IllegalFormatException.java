// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IllegalFormatException.java

package java.util;

import java.io.Serializable;

public class IllegalFormatException extends IllegalArgumentException
	implements Serializable
{

	IllegalFormatException()
	{
		throw new RuntimeException("Stub!");
	}
}
