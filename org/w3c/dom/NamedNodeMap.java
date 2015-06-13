// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   NamedNodeMap.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			DOMException, Node

public interface NamedNodeMap
{

	public abstract Node getNamedItem(String s);

	public abstract Node setNamedItem(Node node)
		throws DOMException;

	public abstract Node removeNamedItem(String s)
		throws DOMException;

	public abstract Node item(int i);

	public abstract int getLength();

	public abstract Node getNamedItemNS(String s, String s1);

	public abstract Node setNamedItemNS(Node node)
		throws DOMException;

	public abstract Node removeNamedItemNS(String s, String s1)
		throws DOMException;
}
