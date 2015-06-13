// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AlertDialog.java

package android.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.app:
//			Dialog

public class AlertDialog extends Dialog
	implements DialogInterface
{
	public static class Builder
	{

		public Builder setTitle(int titleId)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setTitle(CharSequence title)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setCustomTitle(View customTitleView)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setMessage(int messageId)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setMessage(CharSequence message)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setIcon(int iconId)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setIcon(Drawable icon)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setPositiveButton(int textId, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setPositiveButton(CharSequence text, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setNegativeButton(int textId, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setNegativeButton(CharSequence text, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setNeutralButton(int textId, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setNeutralButton(CharSequence text, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setCancelable(boolean cancelable)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setItems(int itemsId, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setItems(CharSequence items[], android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setAdapter(ListAdapter adapter, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setCursor(Cursor cursor, android.content.DialogInterface.OnClickListener listener, String labelColumn)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setMultiChoiceItems(int itemsId, boolean checkedItems[], android.content.DialogInterface.OnMultiChoiceClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setMultiChoiceItems(CharSequence items[], boolean checkedItems[], android.content.DialogInterface.OnMultiChoiceClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setMultiChoiceItems(Cursor cursor, String isCheckedColumn, String labelColumn, android.content.DialogInterface.OnMultiChoiceClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setSingleChoiceItems(int itemsId, int checkedItem, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setSingleChoiceItems(Cursor cursor, int checkedItem, String labelColumn, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setSingleChoiceItems(CharSequence items[], int checkedItem, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setSingleChoiceItems(ListAdapter adapter, int checkedItem, android.content.DialogInterface.OnClickListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener listener)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setView(View view)
		{
			throw new RuntimeException("Stub!");
		}

		public Builder setInverseBackgroundForced(boolean useInverseBackground)
		{
			throw new RuntimeException("Stub!");
		}

		public AlertDialog create()
		{
			throw new RuntimeException("Stub!");
		}

		public AlertDialog show()
		{
			throw new RuntimeException("Stub!");
		}

		public Builder(Context context)
		{
			throw new RuntimeException("Stub!");
		}
	}


	protected AlertDialog(Context context)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	protected AlertDialog(Context context, int theme)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	protected AlertDialog(Context context, boolean cancelable, android.content.DialogInterface.OnCancelListener cancelListener)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	public void setTitle(CharSequence title)
	{
		throw new RuntimeException("Stub!");
	}

	public void setCustomTitle(View customTitleView)
	{
		throw new RuntimeException("Stub!");
	}

	public void setMessage(CharSequence message)
	{
		throw new RuntimeException("Stub!");
	}

	public void setView(View view)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButton(CharSequence text, Message msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButton2(CharSequence text, Message msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButton3(CharSequence text, Message msg)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButton(CharSequence text, android.content.DialogInterface.OnClickListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButton2(CharSequence text, android.content.DialogInterface.OnClickListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setButton3(CharSequence text, android.content.DialogInterface.OnClickListener listener)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIcon(int resId)
	{
		throw new RuntimeException("Stub!");
	}

	public void setIcon(Drawable icon)
	{
		throw new RuntimeException("Stub!");
	}

	public void setInverseBackgroundForced(boolean forceInverseBackground)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onCreate(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyUp(int keyCode, KeyEvent event)
	{
		throw new RuntimeException("Stub!");
	}
}
