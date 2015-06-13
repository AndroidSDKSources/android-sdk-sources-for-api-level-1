// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ViewParent.java

package android.view;

import android.graphics.Point;
import android.graphics.Rect;

// Referenced classes of package android.view:
//			View, ContextMenu

public interface ViewParent
{

	public abstract void requestLayout();

	public abstract boolean isLayoutRequested();

	public abstract void requestTransparentRegion(View view);

	public abstract void invalidateChild(View view, Rect rect);

	public abstract ViewParent invalidateChildInParent(int ai[], Rect rect);

	public abstract ViewParent getParent();

	public abstract void requestChildFocus(View view, View view1);

	public abstract void recomputeViewAttributes(View view);

	public abstract void clearChildFocus(View view);

	public abstract boolean getChildVisibleRect(View view, Rect rect, Point point);

	public abstract View focusSearch(View view, int i);

	public abstract void bringChildToFront(View view);

	public abstract void focusableViewAvailable(View view);

	public abstract boolean showContextMenuForChild(View view);

	public abstract void createContextMenu(ContextMenu contextmenu);

	public abstract void childDrawableStateChanged(View view);

	public abstract void requestDisallowInterceptTouchEvent(boolean flag);
}
