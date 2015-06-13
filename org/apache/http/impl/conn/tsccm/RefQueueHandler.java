// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RefQueueHandler.java

package org.apache.http.impl.conn.tsccm;

import java.lang.ref.Reference;

public interface RefQueueHandler
{

	public abstract void handleReference(Reference reference);
}
