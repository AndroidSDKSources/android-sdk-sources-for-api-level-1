// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EofSensorWatcher.java

package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;

public interface EofSensorWatcher
{

	public abstract boolean eofDetected(InputStream inputstream)
		throws IOException;

	public abstract boolean streamClosed(InputStream inputstream)
		throws IOException;

	public abstract boolean streamAbort(InputStream inputstream)
		throws IOException;
}
