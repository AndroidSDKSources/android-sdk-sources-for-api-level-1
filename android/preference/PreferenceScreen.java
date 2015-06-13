// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   PreferenceScreen.java

package android.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;

// Referenced classes of package android.preference:
//			PreferenceGroup

public final class PreferenceScreen extends PreferenceGroup
	implements android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnDismissListener
{

	PreferenceScreen()
	{
		super((Context)null, (AttributeSet)null);
		throw new RuntimeException("Stub!");
	}

	public ListAdapter getRootAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	protected ListAdapter onCreateRootAdapter()
	{
		throw new RuntimeException("Stub!");
	}

	public void bind(ListView listView)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onClick()
	{
		throw new RuntimeException("Stub!");
	}

	public void onDismiss(DialogInterface dialog)
	{
		throw new RuntimeException("Stub!");
	}

	public Dialog getDialog()
	{
		throw new RuntimeException("Stub!");
	}

	public void onItemClick(AdapterView parent, View view, int position, long id)
	{
		throw new RuntimeException("Stub!");
	}

	protected boolean isOnSameScreenAsChildren()
	{
		throw new RuntimeException("Stub!");
	}

	protected Parcelable onSaveInstanceState()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onRestoreInstanceState(Parcelable state)
	{
		throw new RuntimeException("Stub!");
	}
}
