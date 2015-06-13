// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Format.java

package java.text;

import java.io.Serializable;

// Referenced classes of package java.text:
//			ParseException, FieldPosition, AttributedCharacterIterator, ParsePosition

public abstract class Format
	implements Serializable, Cloneable
{
	public static class Field extends AttributedCharacterIterator.Attribute
	{

		protected Field(String fieldName)
		{
			super((String)null);
			throw new RuntimeException("Stub!");
		}
	}


	public Format()
	{
		throw new RuntimeException("Stub!");
	}

	public Object clone()
	{
		throw new RuntimeException("Stub!");
	}

	public final String format(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public abstract StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition);

	public AttributedCharacterIterator formatToCharacterIterator(Object object)
	{
		throw new RuntimeException("Stub!");
	}

	public Object parseObject(String string)
		throws ParseException
	{
		throw new RuntimeException("Stub!");
	}

	public abstract Object parseObject(String s, ParsePosition parseposition);
}
