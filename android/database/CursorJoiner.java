// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CursorJoiner.java

package android.database;

import java.util.Iterator;

// Referenced classes of package android.database:
//			Cursor

public final class CursorJoiner
	implements Iterator, Iterable
{
	public static final class Result extends Enum
	{

		public static final Result BOTH;
		public static final Result LEFT;
		public static final Result RIGHT;
		private static final Result $VALUES[];

		public static final Result[] values()
		{
			return (Result[])$VALUES.clone();
		}

		public static Result valueOf(String name)
		{
			return (Result)Enum.valueOf(android/database/CursorJoiner$Result, name);
		}

		static 
		{
			BOTH = new Result("BOTH", 0);
			LEFT = new Result("LEFT", 1);
			RIGHT = new Result("RIGHT", 2);
			$VALUES = (new Result[] {
				BOTH, LEFT, RIGHT
			});
		}

		private Result(String s, int i)
		{
			super(s, i);
		}
	}


	public CursorJoiner(Cursor cursorLeft, String columnNamesLeft[], Cursor cursorRight, String columnNamesRight[])
	{
		throw new RuntimeException("Stub!");
	}

	public Iterator iterator()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext()
	{
		throw new RuntimeException("Stub!");
	}

	public Result next()
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
