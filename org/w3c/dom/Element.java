// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Element.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			Node, DOMException, Attr, NodeList

public interface Element
	extends Node
{

	public abstract String getTagName();

	public abstract String getAttribute(String s);

	public abstract void setAttribute(String s, String s1)
		throws DOMException;

	public abstract void removeAttribute(String s)
		throws DOMException;

	public abstract Attr getAttributeNode(String s);

	public abstract Attr setAttributeNode(Attr attr)
		throws DOMException;

	public abstract Attr removeAttributeNode(Attr attr)
		throws DOMException;

	public abstract NodeList getElementsByTagName(String s);

	public abstract String getAttributeNS(String s, String s1);

	public abstract void setAttributeNS(String s, String s1, String s2)
		throws DOMException;

	public abstract void removeAttributeNS(String s, String s1)
		throws DOMException;

	public abstract Attr getAttributeNodeNS(String s, String s1);

	public abstract Attr setAttributeNodeNS(Attr attr)
		throws DOMException;

	public abstract NodeList getElementsByTagNameNS(String s, String s1);

	public abstract boolean hasAttribute(String s);

	public abstract boolean hasAttributeNS(String s, String s1);
}
