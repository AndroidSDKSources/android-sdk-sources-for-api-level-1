// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PasswordTransformationMethod.java

package android.text.method;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

// Referenced classes of package android.text.method:
//			TransformationMethod

public class PasswordTransformationMethod
	implements TransformationMethod, TextWatcher
{

	public PasswordTransformationMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence getTransformation(CharSequence source, View view)
	{
		throw new RuntimeException("Stub!");
	}

	public static PasswordTransformationMethod getInstance()
	{
		throw new RuntimeException("Stub!");
	}

	public void beforeTextChanged(CharSequence s, int start, int count, int after)
	{
		throw new RuntimeException("Stub!");
	}

	public void onTextChanged(CharSequence s, int start, int before, int count)
	{
		throw new RuntimeException("Stub!");
	}

	public void afterTextChanged(Editable s)
	{
		throw new RuntimeException("Stub!");
	}

	public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}
}
