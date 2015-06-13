// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BaseKeyListener.java

package android.text.method;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.text.method:
//			MetaKeyKeyListener, KeyListener

public abstract class BaseKeyListener extends MetaKeyKeyListener
	implements KeyListener
{

	public BaseKeyListener()
	{
		throw new RuntimeException("Stub!");
	}

	public boolean backspace(View view, Editable content, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}
}
