// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SpanWatcher.java

package android.text;


// Referenced classes of package android.text:
//			Spannable

public interface SpanWatcher
{

	public abstract void onSpanAdded(Spannable spannable, Object obj, int i, int j);

	public abstract void onSpanRemoved(Spannable spannable, Object obj, int i, int j);

	public abstract void onSpanChanged(Spannable spannable, Object obj, int i, int j, int k, int l);
}
