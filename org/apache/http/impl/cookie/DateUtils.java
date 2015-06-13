// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DateUtils.java

package org.apache.http.impl.cookie;

import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package org.apache.http.impl.cookie:
//			DateParseException

public final class DateUtils
{

	public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
	public static final String PATTERN_RFC1036 = "EEEE, dd-MMM-yy HH:mm:ss zzz";
	public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
	public static final TimeZone GMT = null;

	DateUtils()
	{
		throw new RuntimeException("Stub!");
	}

	public static Date parseDate(String dateValue)
		throws DateParseException
	{
		throw new RuntimeException("Stub!");
	}

	public static Date parseDate(String dateValue, String dateFormats[])
		throws DateParseException
	{
		throw new RuntimeException("Stub!");
	}

	public static Date parseDate(String dateValue, String dateFormats[], Date startDate)
		throws DateParseException
	{
		throw new RuntimeException("Stub!");
	}

	public static String formatDate(Date date)
	{
		throw new RuntimeException("Stub!");
	}

	public static String formatDate(Date date, String pattern)
	{
		throw new RuntimeException("Stub!");
	}

}
