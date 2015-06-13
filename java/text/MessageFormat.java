// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MessageFormat.java

package java.text;

import java.io.InvalidObjectException;
import java.util.Locale;

// Referenced classes of package java.text:
//			Format, ParseException, AttributedCharacterIterator, FieldPosition, 
//			ParsePosition

public class MessageFormat extends Format
{
	public static class Field extends Format.Field
	{

		public static final Field ARGUMENT = null;

		protected Object readResolve()
			throws InvalidObjectException
		{
			throw new RuntimeException("Stub!");
		}


		protected Field(String fieldName)
		{
			super((String)null);
			throw new RuntimeException("Stub!");
		}
	}


	public MessageFormat(String template, Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public MessageFormat(String template)
	{
		throw new RuntimeException("Stub!");
	}

	public void applyPattern(String template)
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean equals(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public AttributedCharacterIterator formatToCharacterIterator(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public final StringBuffer format(Object objects[], StringBuffer buffer, FieldPosition field)
	{
		throw new RuntimeException("Stub!");
	}

	public final StringBuffer format(Object object, StringBuffer buffer, FieldPosition field)
	{
		throw new RuntimeException("Stub!");
	}

	public static transient String format(String template, Object objects[])
	{
		throw new RuntimeException("Stub!");
	}

	public Format[] getFormats()
	{
		throw new RuntimeException("Stub!");
	}

	public Format[] getFormatsByArgumentIndex()
	{
		throw new RuntimeException("Stub!");
	}

	public void setFormatByArgumentIndex(int argIndex, Format format)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFormatsByArgumentIndex(Format formats[])
	{
		throw new RuntimeException("Stub!");
	}

	public Locale getLocale()
	{
		throw new RuntimeException("Stub!");
	}

	public int hashCode()
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] parse(String string)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public Object[] parse(String string, ParsePosition position)
	{
		throw new RuntimeException("Stub!");
	}

	public Object parseObject(String string, ParsePosition position)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFormat(int offset, Format format)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFormats(Format formats[])
	{
		throw new RuntimeException("Stub!");
	}

	public void setLocale(Locale locale)
	{
		throw new RuntimeException("Stub!");
	}

	public String toPattern()
	{
		throw new RuntimeException("Stub!");
	}
}
