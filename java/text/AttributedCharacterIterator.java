// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AttributedCharacterIterator.java

package java.text;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

// Referenced classes of package java.text:
//			CharacterIterator

public interface AttributedCharacterIterator
	extends CharacterIterator
{
	public static class Attribute
		implements Serializable
	{

		public static final Attribute INPUT_METHOD_SEGMENT = null;
		public static final Attribute LANGUAGE = null;
		public static final Attribute READING = null;

		public final boolean equals(Object object)
		{
			throw new RuntimeException("Stub!");
		}

		protected String getName()
		{
			throw new RuntimeException("Stub!");
		}

		public final int hashCode()
		{
			throw new RuntimeException("Stub!");
		}

		protected Object readResolve()
			throws InvalidObjectException
		{
			throw new RuntimeException("Stub!");
		}

		public String toString()
		{
			throw new RuntimeException("Stub!");
		}


		protected Attribute(String name)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract Set getAllAttributeKeys();

	public abstract Object getAttribute(Attribute attribute);

	public abstract Map getAttributes();

	public abstract int getRunLimit();

	public abstract int getRunLimit(Attribute attribute);

	public abstract int getRunLimit(Set set);

	public abstract int getRunStart();

	public abstract int getRunStart(Attribute attribute);

	public abstract int getRunStart(Set set);
}
