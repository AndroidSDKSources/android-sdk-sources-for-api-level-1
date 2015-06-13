// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ViewManager.java

package android.view;


// Referenced classes of package android.view:
//			ViewGroup, View

public interface ViewManager
{

	public abstract void addView(View view, ViewGroup.LayoutParams layoutparams);

	public abstract void updateViewLayout(View view, ViewGroup.LayoutParams layoutparams);

	public abstract void removeView(View view);
}
