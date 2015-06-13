// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ContentProducer.java

package org.apache.http.entity;

import java.io.IOException;
import java.io.OutputStream;

public interface ContentProducer
{

	public abstract void writeTo(OutputStream outputstream)
		throws IOException;
}
