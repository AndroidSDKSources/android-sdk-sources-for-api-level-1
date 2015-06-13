// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StreamTokenizer.java

package java.io;


// Referenced classes of package java.io:
//			IOException, InputStream, Reader

public class StreamTokenizer
{

	public double nval;
	public String sval;
	public static final int TT_EOF = -1;
	public static final int TT_EOL = 10;
	public static final int TT_NUMBER = -2;
	public static final int TT_WORD = -3;
	public int ttype;

	public StreamTokenizer(InputStream is)
	{
		throw new RuntimeException("Stub!");
	}

	public StreamTokenizer(Reader r)
	{
		throw new RuntimeException("Stub!");
	}

	public void commentChar(int ch)
	{
		throw new RuntimeException("Stub!");
	}

	public void eolIsSignificant(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public int lineno()
	{
		throw new RuntimeException("Stub!");
	}

	public void lowerCaseMode(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public int nextToken()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public void ordinaryChar(int ch)
	{
		throw new RuntimeException("Stub!");
	}

	public void ordinaryChars(int low, int hi)
	{
		throw new RuntimeException("Stub!");
	}

	public void parseNumbers()
	{
		throw new RuntimeException("Stub!");
	}

	public void pushBack()
	{
		throw new RuntimeException("Stub!");
	}

	public void quoteChar(int ch)
	{
		throw new RuntimeException("Stub!");
	}

	public void resetSyntax()
	{
		throw new RuntimeException("Stub!");
	}

	public void slashSlashComments(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public void slashStarComments(boolean flag)
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void whitespaceChars(int low, int hi)
	{
		throw new RuntimeException("Stub!");
	}

	public void wordChars(int low, int hi)
	{
		throw new RuntimeException("Stub!");
	}
}
