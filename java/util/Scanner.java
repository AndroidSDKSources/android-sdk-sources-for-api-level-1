// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Scanner.java

package java.util;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.channels.ReadableByteChannel;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

// Referenced classes of package java.util:
//			Iterator, Locale

public final class Scanner
	implements Iterator
{

	public Scanner(File src)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner(File src, String charsetName)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner(String src)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner(InputStream src)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner(InputStream src, String charsetName)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner(Readable src)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner(ReadableByteChannel src)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner(ReadableByteChannel src, String charsetName)
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public Pattern delimiter()
	{
		throw new RuntimeException("Stub!");
	}

	public String findInLine(Pattern pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public String findInLine(String pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public String findWithinHorizon(Pattern pattern, int horizon)
	{
		throw new RuntimeException("Stub!");
	}

	public String findWithinHorizon(String pattern, int horizon)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext(Pattern pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext(String pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBigDecimal()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBigInteger()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBigInteger(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBoolean()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextByte()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextByte(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextDouble()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextFloat()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextInt()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextInt(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextLine()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextLong()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextLong(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextShort()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextShort(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public IOException ioException()
	{
		throw new RuntimeException("Stub!");
	}

	public Locale locale()
	{
		throw new RuntimeException("Stub!");
	}

	public MatchResult match()
	{
		throw new RuntimeException("Stub!");
	}

	public String next()
	{
		throw new RuntimeException("Stub!");
	}

	public String next(Pattern pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public String next(String pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public BigDecimal nextBigDecimal()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger nextBigInteger()
	{
		throw new RuntimeException("Stub!");
	}

	public BigInteger nextBigInteger(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean nextBoolean()
	{
		throw new RuntimeException("Stub!");
	}

	public byte nextByte()
	{
		throw new RuntimeException("Stub!");
	}

	public byte nextByte(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public double nextDouble()
	{
		throw new RuntimeException("Stub!");
	}

	public float nextFloat()
	{
		throw new RuntimeException("Stub!");
	}

	public int nextInt()
	{
		throw new RuntimeException("Stub!");
	}

	public int nextInt(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public String nextLine()
	{
		throw new RuntimeException("Stub!");
	}

	public long nextLong()
	{
		throw new RuntimeException("Stub!");
	}

	public long nextLong(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public short nextShort()
	{
		throw new RuntimeException("Stub!");
	}

	public short nextShort(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public int radix()
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner skip(Pattern pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner skip(String pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner useDelimiter(Pattern pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner useDelimiter(String pattern)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner useLocale(Locale l)
	{
		throw new RuntimeException("Stub!");
	}

	public Scanner useRadix(int radix)
	{
		throw new RuntimeException("Stub!");
	}

	public void remove()
	{
		throw new RuntimeException("Stub!");
	}

	public volatile Object next()
	{
		return next();
	}
}
