// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   UserTokenHandler.java

package org.apache.http.client;

import org.apache.http.protocol.HttpContext;

public interface UserTokenHandler
{

	public abstract Object getUserToken(HttpContext httpcontext);
}
