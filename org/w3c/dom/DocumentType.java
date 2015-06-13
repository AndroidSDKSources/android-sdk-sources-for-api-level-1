// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DocumentType.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			Node, NamedNodeMap

public interface DocumentType
	extends Node
{

	public abstract String getName();

	public abstract NamedNodeMap getEntities();

	public abstract NamedNodeMap getNotations();

	public abstract String getPublicId();

	public abstract String getSystemId();

	public abstract String getInternalSubset();
}
