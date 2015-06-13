// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SubMenu.java

package android.view;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.view:
//			Menu, View, MenuItem

public interface SubMenu
	extends Menu
{

	public abstract SubMenu setHeaderTitle(int i);

	public abstract SubMenu setHeaderTitle(CharSequence charsequence);

	public abstract SubMenu setHeaderIcon(int i);

	public abstract SubMenu setHeaderIcon(Drawable drawable);

	public abstract SubMenu setHeaderView(View view);

	public abstract void clearHeader();

	public abstract SubMenu setIcon(int i);

	public abstract SubMenu setIcon(Drawable drawable);

	public abstract MenuItem getItem();
}
