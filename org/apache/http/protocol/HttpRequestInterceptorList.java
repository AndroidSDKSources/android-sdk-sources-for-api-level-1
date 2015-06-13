// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpRequestInterceptorList.java

package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpRequestInterceptor;

public interface HttpRequestInterceptorList
{

	public abstract void addRequestInterceptor(HttpRequestInterceptor httprequestinterceptor);

	public abstract void addRequestInterceptor(HttpRequestInterceptor httprequestinterceptor, int i);

	public abstract int getRequestInterceptorCount();

	public abstract HttpRequestInterceptor getRequestInterceptor(int i);

	public abstract void clearRequestInterceptors();

	public abstract void removeRequestInterceptorByClass(Class class1);

	public abstract void setInterceptors(List list);
}
