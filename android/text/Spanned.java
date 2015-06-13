// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Spanned.java

package android.text;


public interface Spanned
	extends CharSequence
{

	public static final int SPAN_MARK_MARK = 17;
	public static final int SPAN_MARK_POINT = 18;
	public static final int SPAN_POINT_MARK = 33;
	public static final int SPAN_POINT_POINT = 34;
	public static final int SPAN_PARAGRAPH = 51;
	public static final int SPAN_INCLUSIVE_EXCLUSIVE = 17;
	public static final int SPAN_INCLUSIVE_INCLUSIVE = 18;
	public static final int SPAN_EXCLUSIVE_EXCLUSIVE = 33;
	public static final int SPAN_EXCLUSIVE_INCLUSIVE = 34;
	public static final int SPAN_USER_SHIFT = 24;
	public static final int SPAN_USER = 0xff000000;
	public static final int SPAN_PRIORITY_SHIFT = 16;
	public static final int SPAN_PRIORITY = 0xff0000;

	public abstract Object[] getSpans(int i, int j, Class class1);

	public abstract int getSpanStart(Object obj);

	public abstract int getSpanEnd(Object obj);

	public abstract int getSpanFlags(Object obj);

	public abstract int nextSpanTransition(int i, int j, Class class1);
}
