// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ConnectionReleaseTrigger.java

package org.apache.http.conn;

import java.io.IOException;

public interface ConnectionReleaseTrigger
{

	public abstract void releaseConnection()
		throws IOException;

	public abstract void abortConnection()
		throws IOException;
}
