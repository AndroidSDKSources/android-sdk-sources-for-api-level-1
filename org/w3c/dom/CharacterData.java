// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CharacterData.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			Node, DOMException

public interface CharacterData
	extends Node
{

	public abstract String getData()
		throws DOMException;

	public abstract void setData(String s)
		throws DOMException;

	public abstract int getLength();

	public abstract String substringData(int i, int j)
		throws DOMException;

	public abstract void appendData(String s)
		throws DOMException;

	public abstract void insertData(int i, String s)
		throws DOMException;

	public abstract void deleteData(int i, int j)
		throws DOMException;

	public abstract void replaceData(int i, int j, String s)
		throws DOMException;
}
