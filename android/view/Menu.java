// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Menu.java

package android.view;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package android.view:
//			MenuItem, SubMenu, KeyEvent

public interface Menu
{

	public static final int NONE = 0;
	public static final int FIRST = 1;
	public static final int CATEGORY_CONTAINER = 0x10000;
	public static final int CATEGORY_SYSTEM = 0x20000;
	public static final int CATEGORY_SECONDARY = 0x30000;
	public static final int CATEGORY_ALTERNATIVE = 0x40000;
	public static final int FLAG_APPEND_TO_GROUP = 1;
	public static final int FLAG_PERFORM_NO_CLOSE = 1;
	public static final int FLAG_ALWAYS_PERFORM_CLOSE = 2;

	public abstract MenuItem add(CharSequence charsequence);

	public abstract MenuItem add(int i);

	public abstract MenuItem add(int i, int j, int k, CharSequence charsequence);

	public abstract MenuItem add(int i, int j, int k, int l);

	public abstract SubMenu addSubMenu(CharSequence charsequence);

	public abstract SubMenu addSubMenu(int i);

	public abstract SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence);

	public abstract SubMenu addSubMenu(int i, int j, int k, int l);

	public abstract int addIntentOptions(int i, int j, int k, ComponentName componentname, Intent aintent[], Intent intent, int l, 
			MenuItem amenuitem[]);

	public abstract void removeItem(int i);

	public abstract void removeGroup(int i);

	public abstract void clear();

	public abstract void setGroupCheckable(int i, boolean flag, boolean flag1);

	public abstract void setGroupVisible(int i, boolean flag);

	public abstract void setGroupEnabled(int i, boolean flag);

	public abstract boolean hasVisibleItems();

	public abstract MenuItem findItem(int i);

	public abstract int size();

	public abstract boolean performShortcut(int i, KeyEvent keyevent, int j);

	public abstract boolean isShortcutKey(int i, KeyEvent keyevent);

	public abstract boolean performIdentifierAction(int i, int j);

	public abstract void setQwertyMode(boolean flag);
}
