// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharacterStyle.java

package android.text.style;

import android.text.TextPaint;

public abstract class CharacterStyle
{

	public CharacterStyle()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract void updateDrawState(TextPaint textpaint);

	public static CharacterStyle wrap(CharacterStyle cs)
	{
		throw new RuntimeException("Stub!");
	}

	public CharacterStyle getUnderlying()
	{
		throw new RuntimeException("Stub!");
	}
}
