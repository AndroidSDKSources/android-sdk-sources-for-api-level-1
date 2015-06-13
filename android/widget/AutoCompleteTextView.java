// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AutoCompleteTextView.java

package android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;

// Referenced classes of package android.widget:
//			EditText, Filter, AdapterView, ListAdapter

public class AutoCompleteTextView extends EditText
	implements Filter.FilterListener
{
	public static interface Validator
	{

		public abstract boolean isValid(CharSequence charsequence);

		public abstract CharSequence fixText(CharSequence charsequence);
	}


	public AutoCompleteTextView(Context context)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AutoCompleteTextView(Context context, AttributeSet attrs)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public AutoCompleteTextView(Context context, AttributeSet attrs, int defStyle)
	{
		super((Context)null, (AttributeSet)null, 0);
		throw new RuntimeException("Stub!");
	}

	public void setCompletionHint(CharSequence hint)
	{
		throw new RuntimeException("Stub!");
	}

	public int getThreshold()
	{
		throw new RuntimeException("Stub!");
	}

	public void setThreshold(int threshold)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnItemClickListener(AdapterView.OnItemClickListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener l)
	{
		throw new RuntimeException("Stub!");
	}

	public AdapterView.OnItemClickListener getItemClickListener()
	{
		throw new RuntimeException("Stub!");
	}

	public AdapterView.OnItemSelectedListener getItemSelectedListener()
	{
		throw new RuntimeException("Stub!");
	}

	public ListAdapter getAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public void setAdapter(ListAdapter adapter)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean enoughToFilter()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onTextChanged(CharSequence text, int start, int before, int after)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean isPopupShowing()
	{
		throw new RuntimeException("Stub!");
	}

	protected CharSequence convertSelectionToString(Object selectedItem)
	{
		throw new RuntimeException("Stub!");
	}

	protected void performFiltering(CharSequence text, int keyCode)
	{
		throw new RuntimeException("Stub!");
	}

	public void performCompletion()
	{
		throw new RuntimeException("Stub!");
	}

	protected void replaceText(CharSequence text)
	{
		throw new RuntimeException("Stub!");
	}

	public void onFilterComplete(int count)
	{
		throw new RuntimeException("Stub!");
	}

	public void onWindowFocusChanged(boolean hasWindowFocus)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect)
	{
		throw new RuntimeException("Stub!");
	}

	public void dismissDropDown()
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean setFrame(int l, int t, int r, int b)
	{
		throw new RuntimeException("Stub!");
	}

	public void showDropDown()
	{
		throw new RuntimeException("Stub!");
	}

	public void setValidator(Validator validator)
	{
		throw new RuntimeException("Stub!");
	}

	public Validator getValidator()
	{
		throw new RuntimeException("Stub!");
	}

	public void performValidation()
	{
		throw new RuntimeException("Stub!");
	}

	protected Filter getFilter()
	{
		throw new RuntimeException("Stub!");
	}
}
