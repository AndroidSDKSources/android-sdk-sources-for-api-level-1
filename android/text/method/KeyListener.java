// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyListener.java

package android.text.method;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;

public interface KeyListener
{

	public abstract boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyevent);

	public abstract boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyevent);
}
