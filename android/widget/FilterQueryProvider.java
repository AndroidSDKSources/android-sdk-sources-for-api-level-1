// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FilterQueryProvider.java

package android.widget;

import android.database.Cursor;

public interface FilterQueryProvider
{

	public abstract Cursor runQuery(CharSequence charsequence);
}
