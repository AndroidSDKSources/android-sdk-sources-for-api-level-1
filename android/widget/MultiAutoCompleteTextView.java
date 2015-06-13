// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MultiAutoCompleteTextView.java

package android.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.widget:
//			AutoCompleteTextView

public class MultiAutoCompleteTextView extends AutoCompleteTextView
{
	public static class CommaTokenizer
		implements Tokenizer
	{

		public int findTokenStart(CharSequence text, int cursor)
		{
			throw new RuntimeException("Stub!");
		}

		public int findTokenEnd(CharSequence text, int cursor)
		{
			throw new RuntimeException("Stub!");
		}

		public CharSequence terminateToken(CharSequence text)
		{
			throw new RuntimeException("Stub!");
		}

		public CommaTokenizer()
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static interface Tokenizer
	{

		public abstract int findTokenStart(CharSequence charsequence, int i);

		public abstract int findTokenEnd(CharSequence charsequence, int i);

		public abstract CharSequence terminateToken(CharSequence charsequence);
	}


	public MultiAutoCompleteTextView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public MultiAutoCompleteTextView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public MultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setTokenizer(Tokenizer t)
	{
		throw new RuntimeException("Stub!");
	}

	protected void performFiltering(CharSequence text, int keyCode)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean enoughToFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public void performValidation()
	{
		throw new RuntimeException("Stub!");
	}

	protected void performFiltering(CharSequence text, int start, int end, int keyCode)
	{
		throw new RuntimeException("Stub!");
	}

	protected void replaceText(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}
}
