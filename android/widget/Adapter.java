// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Adapter.java

package android.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public interface Adapter
{

	public static final int IGNORE_ITEM_VIEW_TYPE = -1;
	public static final int NO_SELECTION = 0x80000000;

	public abstract void registerDataSetObserver(DataSetObserver datasetobserver);

	public abstract void unregisterDataSetObserver(DataSetObserver datasetobserver);

	public abstract int getCount();

	public abstract Object getItem(int i);

	public abstract long getItemId(int i);

	public abstract boolean hasStableIds();

	public abstract View getView(int i, View view, ViewGroup viewgroup);

	public abstract int getItemViewType(int i);

	public abstract int getViewTypeCount();

	public abstract boolean isEmpty();
}
