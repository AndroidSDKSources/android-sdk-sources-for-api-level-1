// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SpinnerAdapter.java

package android.widget;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.widget:
//			Adapter

public interface SpinnerAdapter
	extends Adapter
{

	public abstract View getDropDownView(int i, View view, ViewGroup viewgroup);
}
