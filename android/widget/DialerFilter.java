// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DialerFilter.java

package android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;

// Referenced classes of package android.widget:
//			RelativeLayout

public class DialerFilter extends RelativeLayout
{

	public static final int DIGITS_AND_LETTERS = 1;
	public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;
	public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;
	public static final int DIGITS_ONLY = 4;
	public static final int LETTERS_ONLY = 5;

	public DialerFilter(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public DialerFilter(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	protected void onFinishInflate()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isQwertyKeyboard()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public int getMode()
	{
		throw new RuntimeException("Stub!");
	}

	public void setMode(int newMode)
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getLetters()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getDigits()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getFilterText()
	{
		throw new RuntimeException("Stub!");
	}

	public void append(String text)
	{
		throw new RuntimeException("Stub!");
	}

	public void clearText()
	{
		throw new RuntimeException("Stub!");
	}

	public void setLettersWatcher(TextWatcher watcher)
	{
		throw new RuntimeException("Stub!");
	}

	public void setDigitsWatcher(TextWatcher watcher)
	{
		throw new RuntimeException("Stub!");
	}

	public void setFilterWatcher(TextWatcher watcher)
	{
		throw new RuntimeException("Stub!");
	}

	public void removeFilterWatcher(TextWatcher watcher)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onModeChange(int oldMode, int newMode)
	{
		throw new RuntimeException("Stub!");
	}
}
