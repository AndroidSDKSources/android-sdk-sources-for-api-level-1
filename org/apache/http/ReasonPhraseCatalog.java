// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReasonPhraseCatalog.java

package org.apache.http;

import java.util.Locale;

public interface ReasonPhraseCatalog
{

	public abstract String getReason(int i, Locale locale);
}
