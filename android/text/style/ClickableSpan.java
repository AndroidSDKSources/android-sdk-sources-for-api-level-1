// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ClickableSpan.java

package android.text.style;

import android.text.TextPaint;
import android.view.View;

// Referenced classes of package android.text.style:
//			CharacterStyle

public abstract class ClickableSpan extends CharacterStyle
{

	public ClickableSpan()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void onClick(View view);

	public void updateDrawState(TextPaint ds)
	{
		throw new RuntimeException("Stub!");
	}
}
