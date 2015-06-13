// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Linkify.java

package android.text.util;

import android.text.Spannable;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Linkify
{
	public static interface TransformFilter
	{

		public abstract String transformUrl(Matcher matcher, String s);
	}

	public static interface MatchFilter
	{

		public abstract boolean acceptMatch(CharSequence charsequence, int i, int j);
	}


	public static final int WEB_URLS = 1;
	public static final int EMAIL_ADDRESSES = 2;
	public static final int PHONE_NUMBERS = 4;
	public static final int MAP_ADDRESSES = 8;
	public static final int ALL = 15;
	public static final MatchFilter sUrlMatchFilter = null;
	public static final MatchFilter sPhoneNumberMatchFilter = null;
	public static final TransformFilter sPhoneNumberTransformFilter = null;

	public Linkify()
	{
		throw new RuntimeException("Stub!");
	}

	public static final boolean addLinks(Spannable text, int mask)
	{
		throw new RuntimeException("Stub!");
	}

	public static final boolean addLinks(TextView text, int mask)
	{
		throw new RuntimeException("Stub!");
	}

	public static final void addLinks(TextView text, Pattern pattern, String scheme)
	{
		throw new RuntimeException("Stub!");
	}

	public static final void addLinks(TextView text, Pattern p, String scheme, MatchFilter matchFilter, TransformFilter transformFilter)
	{
		throw new RuntimeException("Stub!");
	}

	public static final boolean addLinks(Spannable text, Pattern pattern, String scheme)
	{
		throw new RuntimeException("Stub!");
	}

	public static final boolean addLinks(Spannable s, Pattern p, String scheme, MatchFilter matchFilter, TransformFilter transformFilter)
	{
		throw new RuntimeException("Stub!");
	}

}
