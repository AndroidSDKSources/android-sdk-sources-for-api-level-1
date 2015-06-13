// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FormattedHeader.java

package org.apache.http;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http:
//			Header

public interface FormattedHeader
	extends Header
{

	public abstract CharArrayBuffer getBuffer();

	public abstract int getValuePos();
}
