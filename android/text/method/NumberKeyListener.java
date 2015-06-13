// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NumberKeyListener.java

package android.text.method;

import android.text.*;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.text.method:
//			BaseKeyListener

public abstract class NumberKeyListener extends BaseKeyListener
	implements InputFilter
{

	public NumberKeyListener()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract char[] getAcceptedChars();

	protected int lookup(KeyEvent event, Spannable content)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend)
	{
		throw new RuntimeException("Stub!");
	}

	protected static boolean ok(char accept[], char c)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}
}
