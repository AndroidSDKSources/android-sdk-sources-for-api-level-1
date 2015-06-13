// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TransformationMethod.java

package android.text.method;

import android.graphics.Rect;
import android.view.View;

public interface TransformationMethod
{

	public abstract CharSequence getTransformation(CharSequence charsequence, View view);

	public abstract void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect);
}
