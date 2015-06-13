// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Cookie.java

package org.apache.http.cookie;

import java.util.Date;

public interface Cookie
{

	public abstract String getName();

	public abstract String getValue();

	public abstract String getComment();

	public abstract String getCommentURL();

	public abstract Date getExpiryDate();

	public abstract boolean isPersistent();

	public abstract String getDomain();

	public abstract String getPath();

	public abstract int[] getPorts();

	public abstract boolean isSecure();

	public abstract int getVersion();

	public abstract boolean isExpired(Date date);
}
