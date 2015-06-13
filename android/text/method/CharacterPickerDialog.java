// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharacterPickerDialog.java

package android.text.method;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;

public class CharacterPickerDialog extends Dialog
	implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener
{

	public CharacterPickerDialog(Context context, View view, Editable text, String options, boolean insert)
	{
		super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);
		throw new RuntimeException("Stub!");
	}

	protected void onCreate(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	public void onItemClick(AdapterView parent, View view, int position, long id)
	{
		throw new RuntimeException("Stub!");
	}

	public void onClick(View v)
	{
		throw new RuntimeException("Stub!");
	}
}
