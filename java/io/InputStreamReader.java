// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InputStreamReader.java

package java.io;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

// Referenced classes of package java.io:
//			Reader, UnsupportedEncodingException, IOException, InputStream

public class InputStreamReader extends Reader
{

	public InputStreamReader(InputStream in)
	{
		throw new RuntimeException("Stub!");
	}

	public InputStreamReader(InputStream in, String enc)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public InputStreamReader(InputStream in, CharsetDecoder dec)
	{
		throw new RuntimeException("Stub!");
	}

	public InputStreamReader(InputStream in, Charset charset)
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public String getEncoding()
	{
		throw new RuntimeException("Stub!");
	}

	public int read()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public int read(char buf[], int offset, int length)
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}

	public boolean ready()
		throws IOException
	{
		throw new RuntimeException("Stub!");
	}
}
