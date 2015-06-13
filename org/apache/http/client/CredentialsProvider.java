// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CredentialsProvider.java

package org.apache.http.client;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;

public interface CredentialsProvider
{

	public abstract void setCredentials(AuthScope authscope, Credentials credentials);

	public abstract Credentials getCredentials(AuthScope authscope);

	public abstract void clear();
}
