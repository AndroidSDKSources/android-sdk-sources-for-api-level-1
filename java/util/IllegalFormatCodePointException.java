// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IllegalFormatCodePointException.java

package java.util;

import java.io.Serializable;

// Referenced classes of package java.util:
//			IllegalFormatException

public class IllegalFormatCodePointException extends IllegalFormatException
	implements Serializable
{

	public IllegalFormatCodePointException(int c)
	{
		throw new RuntimeException("Stub!");
	}

	public int getCodePoint()
	{
		throw new RuntimeException("Stub!");
	}

	public String getMessage()
	{
		throw new RuntimeException("Stub!");
	}
}
