// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DialogInterface.java

package android.content;

import android.view.KeyEvent;

public interface DialogInterface
{
	public static interface OnKeyListener
	{

		public abstract boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent);
	}

	public static interface OnMultiChoiceClickListener
	{

		public abstract void onClick(DialogInterface dialoginterface, int i, boolean flag);
	}

	public static interface OnClickListener
	{

		public abstract void onClick(DialogInterface dialoginterface, int i);
	}

	public static interface OnDismissListener
	{

		public abstract void onDismiss(DialogInterface dialoginterface);
	}

	public static interface OnCancelListener
	{

		public abstract void onCancel(DialogInterface dialoginterface);
	}


	public static final int BUTTON1 = -1;
	public static final int BUTTON2 = -2;
	public static final int BUTTON3 = -3;

	public abstract void cancel();

	public abstract void dismiss();
}
