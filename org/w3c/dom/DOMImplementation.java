// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DOMImplementation.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			DOMException, DocumentType, Document

public interface DOMImplementation
{

	public abstract boolean hasFeature(String s, String s1);

	public abstract DocumentType createDocumentType(String s, String s1, String s2)
		throws DOMException;

	public abstract Document createDocument(String s, String s1, DocumentType documenttype)
		throws DOMException;
}
