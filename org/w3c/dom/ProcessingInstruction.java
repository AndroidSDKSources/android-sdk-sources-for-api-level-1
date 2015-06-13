// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ProcessingInstruction.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			Node, DOMException

public interface ProcessingInstruction
	extends Node
{

	public abstract String getTarget();

	public abstract String getData();

	public abstract void setData(String s)
		throws DOMException;
}
