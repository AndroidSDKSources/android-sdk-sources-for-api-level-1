// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContextMenu.java

package android.view;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.view:
//			Menu, View

public interface ContextMenu
	extends Menu
{
	public static interface ContextMenuInfo
	{
	}


	public abstract ContextMenu setHeaderTitle(int i);

	public abstract ContextMenu setHeaderTitle(CharSequence charsequence);

	public abstract ContextMenu setHeaderIcon(int i);

	public abstract ContextMenu setHeaderIcon(Drawable drawable);

	public abstract ContextMenu setHeaderView(View view);

	public abstract void clearHeader();
}
