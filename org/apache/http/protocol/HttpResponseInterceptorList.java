// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   HttpResponseInterceptorList.java

package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpResponseInterceptor;

public interface HttpResponseInterceptorList
{

	public abstract void addResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor);

	public abstract void addResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor, int i);

	public abstract int getResponseInterceptorCount();

	public abstract HttpResponseInterceptor getResponseInterceptor(int i);

	public abstract void clearResponseInterceptors();

	public abstract void removeResponseInterceptorByClass(Class class1);

	public abstract void setInterceptors(List list);
}
