// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IllegalFormatConversionException.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			IllegalFormatException

public class IllegalFormatConversionException extends IllegalFormatException
	implements Serializable
{

	public IllegalFormatConversionException(char c, Class arg)
	{
		throw new RuntimeException("Stub!");
	}

	public Class getArgumentClass()
	{
		throw new RuntimeException("Stub!");
	}

	public char getConversion()
	{
		throw new RuntimeException("Stub!");
	}

	public String getMessage()
	{
		throw new RuntimeException("Stub!");
	}
}
