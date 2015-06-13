// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyRep.java

package java.security;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class KeyRep
	implements Serializable
{
	public static final class Type extends Enum
	{

		public static final Type PRIVATE;
		public static final Type PUBLIC;
		public static final Type SECRET;
		private static final Type $VALUES[];

		public static final Type[] values()
		{
			return (Type[])$VALUES.clone();
		}

		public static Type valueOf(String name)
		{
			return (Type)Enum.valueOf(java/security/KeyRep$Type, name);
		}

		static 
		{
			PRIVATE = new Type("PRIVATE", 0);
			PUBLIC = new Type("PUBLIC", 1);
			SECRET = new Type("SECRET", 2);
			$VALUES = (new Type[] {
				PRIVATE, PUBLIC, SECRET
			});
		}

		private Type(String s, int i)
		{
			super(s, i);
		}
	}


	public KeyRep(Type type, String algorithm, String format, byte encoded[])
	{
		throw new RuntimeException("Stub!");
	}

	protected Object readResolve()
		throws ObjectStreamException
	{
		throw new RuntimeException("Stub!");
	}
}
