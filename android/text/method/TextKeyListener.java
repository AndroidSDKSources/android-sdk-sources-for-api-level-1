// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TextKeyListener.java

package android.text.method;

import android.text.*;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.text.method:
//			BaseKeyListener

public class TextKeyListener extends BaseKeyListener
	implements SpanWatcher
{
	public static final class Capitalize extends Enum
	{

		public static final Capitalize CHARACTERS;
		public static final Capitalize NONE;
		public static final Capitalize SENTENCES;
		public static final Capitalize WORDS;
		private static final Capitalize $VALUES[];

		public static final Capitalize[] values()
		{
			return (Capitalize[])$VALUES.clone();
		}

		public static Capitalize valueOf(String name)
		{
			return (Capitalize)Enum.valueOf(android/text/method/TextKeyListener$Capitalize, name);
		}

		static 
		{
			CHARACTERS = new Capitalize("CHARACTERS", 0);
			NONE = new Capitalize("NONE", 1);
			SENTENCES = new Capitalize("SENTENCES", 2);
			WORDS = new Capitalize("WORDS", 3);
			$VALUES = (new Capitalize[] {
				CHARACTERS, NONE, SENTENCES, WORDS
			});
		}

		private Capitalize(String s, int i)
		{
			super(s, i);
		}
	}


	public TextKeyListener(Capitalize cap, boolean autotext)
	{
		throw new RuntimeException("Stub!");
	}

	public static TextKeyListener getInstance(boolean autotext, Capitalize cap)
	{
		throw new RuntimeException("Stub!");
	}

	public static TextKeyListener getInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean shouldCap(Capitalize cap, CharSequence cs, int off)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(View view, Editable content, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public static void clear(Editable e)
	{
		throw new RuntimeException("Stub!");
	}

	public void onSpanAdded(Spannable s, Object what, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public void onSpanRemoved(Spannable s, Object what, int start, int end)
	{
		throw new RuntimeException("Stub!");
	}

	public void onSpanChanged(Spannable s, Object what, int start, int end, int st, int en)
	{
		throw new RuntimeException("Stub!");
	}

	public void release()
	{
		throw new RuntimeException("Stub!");
	}
}
