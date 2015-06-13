// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LauncherActivity.java

package android.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package android.app:
//			ListActivity

public abstract class LauncherActivity extends ListActivity
{

	public LauncherActivity()
	{
		throw new RuntimeException("Stub!");
	}

	protected void onCreate(Bundle savedInstanceState)
	{
		throw new RuntimeException("Stub!");
	}

	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		throw new RuntimeException("Stub!");
	}

	protected abstract Intent getTargetIntent();
}
