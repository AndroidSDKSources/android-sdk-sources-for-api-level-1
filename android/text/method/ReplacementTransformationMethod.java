// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReplacementTransformationMethod.java

package android.text.method;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.text.method:
//			TransformationMethod

public abstract class ReplacementTransformationMethod
	implements TransformationMethod
{

	public ReplacementTransformationMethod()
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract char[] getOriginal();

	protected abstract char[] getReplacement();

	public CharSequence getTransformation(CharSequence source, View v)
	{
		throw new RuntimeException("Stub!");
	}

	public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}
}
