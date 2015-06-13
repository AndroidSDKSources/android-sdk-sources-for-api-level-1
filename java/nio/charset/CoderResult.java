// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CoderResult.java

package java.nio.charset;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

// Referenced classes of package java.nio.charset:
//			UnmappableCharacterException, MalformedInputException, CharacterCodingException

public class CoderResult
{

	public static final CoderResult UNDERFLOW = null;
	public static final CoderResult OVERFLOW = null;

	CoderResult()
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized CoderResult malformedForLength(int length)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public static synchronized CoderResult unmappableForLength(int length)
		throws IllegalArgumentException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isUnderflow()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isError()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isMalformed()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isOverflow()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isUnmappable()
	{
		throw new RuntimeException("Stub!");
	}

	public int length()
		throws UnsupportedOperationException
	{
		throw new RuntimeException("Stub!");
	}

	public void throwException()
		throws BufferUnderflowException, BufferOverflowException, UnmappableCharacterException, MalformedInputException, CharacterCodingException
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

}
