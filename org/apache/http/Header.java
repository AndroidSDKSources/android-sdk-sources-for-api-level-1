// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Header.java

package org.apache.http;


// Referenced classes of package org.apache.http:
//			ParseException, HeaderElement

public interface Header
{

	public abstract String getName();

	public abstract String getValue();

	public abstract HeaderElement[] getElements()
		throws ParseException;
}
