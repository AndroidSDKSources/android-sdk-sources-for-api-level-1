// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MetaKeyKeyListener.java

package android.text.method;

import android.text.Editable;
import android.text.Spannable;
import android.view.KeyEvent;
import android.view.View;

public abstract class MetaKeyKeyListener
{

	public static final int META_SHIFT_ON = 1;
	public static final int META_ALT_ON = 2;
	public static final int META_SYM_ON = 4;
	public static final int META_CAP_LOCKED = 256;
	public static final int META_ALT_LOCKED = 512;
	public static final int META_SYM_LOCKED = 1024;

	public MetaKeyKeyListener()
	{
		throw new RuntimeException("Stub!");
	}

	public static void resetMetaState(Spannable text)
	{
		throw new RuntimeException("Stub!");
	}

	public static final int getMetaState(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public static final int getMetaState(CharSequence text, int meta)
	{
		throw new RuntimeException("Stub!");
	}

	public static void adjustMetaAfterKeypress(Spannable content)
	{
		throw new RuntimeException("Stub!");
	}

	public static boolean isMetaTracker(CharSequence text, Object what)
	{
		throw new RuntimeException("Stub!");
	}

	protected static void resetLockedMeta(Spannable content)
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
}
