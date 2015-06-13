// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FormatFlagsConversionMismatchException.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			IllegalFormatException

public class FormatFlagsConversionMismatchException extends IllegalFormatException
	implements Serializable
{

	public FormatFlagsConversionMismatchException(String f, char c)
	{
		throw new RuntimeException("Stub!");
	}

	public String getFlags()
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
