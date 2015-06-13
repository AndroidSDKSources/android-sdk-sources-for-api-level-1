// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharsetEncoder.java

package java.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

// Referenced classes of package java.nio.charset:
//			CharacterCodingException, Charset, CoderResult, CodingErrorAction

public abstract class CharsetEncoder
{

	protected CharsetEncoder(Charset cs, float averageBytesPerChar, float maxBytesPerChar)
	{
		throw new RuntimeException("Stub!");
	}

	protected CharsetEncoder(Charset cs, float averageBytesPerChar, float maxBytesPerChar, byte replacement[])
	{
		throw new RuntimeException("Stub!");
	}

	public final float averageBytesPerChar()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canEncode(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean canEncode(CharSequence sequence)
	{
		throw new RuntimeException("Stub!");
	}

	public final Charset charset()
	{
		throw new RuntimeException("Stub!");
	}

	public final ByteBuffer encode(CharBuffer in)
		throws CharacterCodingException
	{
		throw new RuntimeException("Stub!");
	}

	public final CoderResult encode(CharBuffer in, ByteBuffer out, boolean endOfInput)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract CoderResult encodeLoop(CharBuffer charbuffer, ByteBuffer bytebuffer);

	public final CoderResult flush(ByteBuffer out)
	{
		throw new RuntimeException("Stub!");
	}

	protected CoderResult implFlush(ByteBuffer out)
	{
		throw new RuntimeException("Stub!");
	}

	protected void implOnMalformedInput(CodingErrorAction newAction)
	{
		throw new RuntimeException("Stub!");
	}

	protected void implOnUnmappableCharacter(CodingErrorAction newAction)
	{
		throw new RuntimeException("Stub!");
	}

	protected void implReplaceWith(byte newReplacement[])
	{
		throw new RuntimeException("Stub!");
	}

	protected void implReset()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isLegalReplacement(byte repl[])
	{
		throw new RuntimeException("Stub!");
	}

	public CodingErrorAction malformedInputAction()
	{
		throw new RuntimeException("Stub!");
	}

	public final float maxBytesPerChar()
	{
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder onMalformedInput(CodingErrorAction newAction)
	{
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder onUnmappableCharacter(CodingErrorAction newAction)
	{
		throw new RuntimeException("Stub!");
	}

	public final byte[] replacement()
	{
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder replaceWith(byte replacement[])
	{
		throw new RuntimeException("Stub!");
	}

	public final CharsetEncoder reset()
	{
		throw new RuntimeException("Stub!");
	}

	public CodingErrorAction unmappableCharacterAction()
	{
		throw new RuntimeException("Stub!");
	}
}
