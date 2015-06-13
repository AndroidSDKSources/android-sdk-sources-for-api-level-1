// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SessionInputBuffer.java

package org.apache.http.io;

import java.io.IOException;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.io:
//			HttpTransportMetrics

public interface SessionInputBuffer
{

	public abstract int read(byte abyte0[], int i, int j)
		throws IOException;

	public abstract int read(byte abyte0[])
		throws IOException;

	public abstract int read()
		throws IOException;

	public abstract int readLine(CharArrayBuffer chararraybuffer)
		throws IOException;

	public abstract String readLine()
		throws IOException;

	public abstract boolean isDataAvailable(int i)
		throws IOException;

	public abstract HttpTransportMetrics getMetrics();
}
