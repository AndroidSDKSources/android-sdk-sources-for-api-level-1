// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Node.java

package org.w3c.dom;


// Referenced classes of package org.w3c.dom:
//			DOMException, NodeList, NamedNodeMap, Document

public interface Node
{

	public static final short ELEMENT_NODE = 1;
	public static final short ATTRIBUTE_NODE = 2;
	public static final short TEXT_NODE = 3;
	public static final short CDATA_SECTION_NODE = 4;
	public static final short ENTITY_REFERENCE_NODE = 5;
	public static final short ENTITY_NODE = 6;
	public static final short PROCESSING_INSTRUCTION_NODE = 7;
	public static final short COMMENT_NODE = 8;
	public static final short DOCUMENT_NODE = 9;
	public static final short DOCUMENT_TYPE_NODE = 10;
	public static final short DOCUMENT_FRAGMENT_NODE = 11;
	public static final short NOTATION_NODE = 12;

	public abstract String getNodeName();

	public abstract String getNodeValue()
		throws DOMException;

	public abstract void setNodeValue(String s)
		throws DOMException;

	public abstract short getNodeType();

	public abstract Node getParentNode();

	public abstract NodeList getChildNodes();

	public abstract Node getFirstChild();

	public abstract Node getLastChild();

	public abstract Node getPreviousSibling();

	public abstract Node getNextSibling();

	public abstract NamedNodeMap getAttributes();

	public abstract Document getOwnerDocument();

	public abstract Node insertBefore(Node node, Node node1)
		throws DOMException;

	public abstract Node replaceChild(Node node, Node node1)
		throws DOMException;

	public abstract Node removeChild(Node node)
		throws DOMException;

	public abstract Node appendChild(Node node)
		throws DOMException;

	public abstract boolean hasChildNodes();

	public abstract Node cloneNode(boolean flag);

	public abstract void normalize();

	public abstract boolean isSupported(String s, String s1);

	public abstract String getNamespaceURI();

	public abstract String getPrefix();

	public abstract void setPrefix(String s)
		throws DOMException;

	public abstract String getLocalName();

	public abstract boolean hasAttributes();
}
