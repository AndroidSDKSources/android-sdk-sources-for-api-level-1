// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MultiTapKeyListener.java

package android.text.method;

import android.text.*;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.text.method:
//			BaseKeyListener, TextKeyListener

public class MultiTapKeyListener extends BaseKeyListener
	implements SpanWatcher
{

	public MultiTapKeyListener(TextKeyListener.Capitalize cap, boolean autotext)
	{
		throw new RuntimeException("Stub!");
	}

	public static MultiTapKeyListener getInstance(boolean autotext, TextKeyListener.Capitalize cap)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(View view, Editable content, int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public void onSpanChanged(Spannable buf, Object what, int s, int e, int start, int stop)
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
}
