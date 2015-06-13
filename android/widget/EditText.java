// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EditText.java

package android.widget;

import android.content.Context;
import android.text.Editable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;

// Referenced classes of package android.widget:
//			TextView

public class EditText extends TextView
{

	public EditText(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public EditText(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public EditText(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	protected boolean getDefaultEditable()
	{
		throw new RuntimeException("Stub!");
	}

	protected MovementMethod getDefaultMovementMethod()
	{
		throw new RuntimeException("Stub!");
	}

	public Editable getText()
	{
		throw new RuntimeException("Stub!");
	}

	public void setText(CharSequence text, TextView.BufferType type)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelection(int start, int stop)
	{
		throw new RuntimeException("Stub!");
	}

	public void setSelection(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public void selectAll()
	{
		throw new RuntimeException("Stub!");
	}

	public void extendSelection(int index)
	{
		throw new RuntimeException("Stub!");
	}

	public volatile CharSequence getText()
	{
		return getText();
	}
}
