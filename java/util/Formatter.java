// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Formatter.java

package java.util;

import java.io.*;

// Referenced classes of package java.util:
//			Locale

public final class Formatter
	implements Closeable, Flushable
{
	public static final class BigDecimalLayoutForm extends Enum
	{

		public static final BigDecimalLayoutForm DECIMAL_FLOAT;
		public static final BigDecimalLayoutForm SCIENTIFIC;
		private static final BigDecimalLayoutForm $VALUES[];

		public static final BigDecimalLayoutForm[] values()
		{
			return (BigDecimalLayoutForm[])$VALUES.clone();
		}

		public static BigDecimalLayoutForm valueOf(String name)
		{
			return (BigDecimalLayoutForm)Enum.valueOf(java/util/Formatter$BigDecimalLayoutForm, name);
		}

		static 
		{
			DECIMAL_FLOAT = new BigDecimalLayoutForm("DECIMAL_FLOAT", 0);
			SCIENTIFIC = new BigDecimalLayoutForm("SCIENTIFIC", 1);
			$VALUES = (new BigDecimalLayoutForm[] {
				DECIMAL_FLOAT, SCIENTIFIC
			});
		}

		private BigDecimalLayoutForm(String s, int i)
		{
			super(s, i);
		}
	}


	public Formatter()
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(Appendable a)
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(Locale l)
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(Appendable a, Locale l)
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(String fileName)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(String fileName, String csn)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(String fileName, String csn, Locale l)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(File file)
		throws FileNotFoundException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(File file, String csn)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(File file, String csn, Locale l)
		throws FileNotFoundException, UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(OutputStream os)
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(OutputStream os, String csn)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(OutputStream os, String csn, Locale l)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public Formatter(PrintStream ps)
	{
		throw new RuntimeException("Stub!");
	}

	public Locale locale()
	{
		throw new RuntimeException("Stub!");
	}

	public Appendable out()
	{
		throw new RuntimeException("Stub!");
	}

	public String toString()
	{
		throw new RuntimeException("Stub!");
	}

	public void flush()
	{
		throw new RuntimeException("Stub!");
	}

	public void close()
	{
		throw new RuntimeException("Stub!");
	}

	public IOException ioException()
	{
		throw new RuntimeException("Stub!");
	}

	public transient Formatter format(String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}

	public transient Formatter format(Locale l, String format, Object args[])
	{
		throw new RuntimeException("Stub!");
	}
}
