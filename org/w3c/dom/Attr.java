// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Attr.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			Node, DOMException, Element

public interface Attr
	extends Node
{

	public abstract String getName();

	public abstract boolean getSpecified();

	public abstract String getValue();

	public abstract void setValue(String s)
		throws DOMException;

	public abstract Element getOwnerElement();
}
