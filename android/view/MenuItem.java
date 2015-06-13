// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MenuItem.java

package android.view;

import android.content.Intent;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.view:
//			ContextMenu, SubMenu

public interface MenuItem
{
	public static interface OnMenuItemClickListener
	{

		public abstract boolean onMenuItemClick(MenuItem menuitem);
	}


	public abstract int getItemId();

	public abstract int getGroupId();

	public abstract int getOrder();

	public abstract MenuItem setTitle(CharSequence charsequence);

	public abstract MenuItem setTitle(int i);

	public abstract CharSequence getTitle();

	public abstract MenuItem setTitleCondensed(CharSequence charsequence);

	public abstract CharSequence getTitleCondensed();

	public abstract MenuItem setIcon(Drawable drawable);

	public abstract MenuItem setIcon(int i);

	public abstract Drawable getIcon();

	public abstract MenuItem setIntent(Intent intent);

	public abstract Intent getIntent();

	public abstract MenuItem setShortcut(char c, char c1);

	public abstract MenuItem setNumericShortcut(char c);

	public abstract char getNumericShortcut();

	public abstract MenuItem setAlphabeticShortcut(char c);

	public abstract char getAlphabeticShortcut();

	public abstract MenuItem setCheckable(boolean flag);

	public abstract boolean isCheckable();

	public abstract MenuItem setChecked(boolean flag);

	public abstract boolean isChecked();

	public abstract MenuItem setVisible(boolean flag);

	public abstract boolean isVisible();

	public abstract MenuItem setEnabled(boolean flag);

	public abstract boolean isEnabled();

	public abstract boolean hasSubMenu();

	public abstract SubMenu getSubMenu();

	public abstract MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener);

	public abstract ContextMenu.ContextMenuInfo getMenuInfo();
}
