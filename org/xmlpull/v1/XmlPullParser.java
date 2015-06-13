// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   XmlPullParser.java

package org.xmlpull.v1;

import java.io.*;

// Referenced classes of package org.xmlpull.v1:
//			XmlPullParserException

public interface XmlPullParser
{

	public static final String NO_NAMESPACE = "";
	public static final int START_DOCUMENT = 0;
	public static final int END_DOCUMENT = 1;
	public static final int START_TAG = 2;
	public static final int END_TAG = 3;
	public static final int TEXT = 4;
	public static final int CDSECT = 5;
	public static final int ENTITY_REF = 6;
	public static final int IGNORABLE_WHITESPACE = 7;
	public static final int PROCESSING_INSTRUCTION = 8;
	public static final int COMMENT = 9;
	public static final int DOCDECL = 10;
	public static final String TYPES[] = null;
	public static final String FEATURE_PROCESS_NAMESPACES = "http://xmlpull.org/v1/doc/features.html#process-namespaces";
	public static final String FEATURE_REPORT_NAMESPACE_ATTRIBUTES = "http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes";
	public static final String FEATURE_PROCESS_DOCDECL = "http://xmlpull.org/v1/doc/features.html#process-docdecl";
	public static final String FEATURE_VALIDATION = "http://xmlpull.org/v1/doc/features.html#validation";

	public abstract void setFeature(String s, boolean flag)
		throws XmlPullParserException;

	public abstract boolean getFeature(String s);

	public abstract void setProperty(String s, Object obj)
		throws XmlPullParserException;

	public abstract Object getProperty(String s);

	public abstract void setInput(Reader reader)
		throws XmlPullParserException;

	public abstract void setInput(InputStream inputstream, String s)
		throws XmlPullParserException;

	public abstract String getInputEncoding();

	public abstract void defineEntityReplacementText(String s, String s1)
		throws XmlPullParserException;

	public abstract int getNamespaceCount(int i)
		throws XmlPullParserException;

	public abstract String getNamespacePrefix(int i)
		throws XmlPullParserException;

	public abstract String getNamespaceUri(int i)
		throws XmlPullParserException;

	public abstract String getNamespace(String s);

	public abstract int getDepth();

	public abstract String getPositionDescription();

	public abstract int getLineNumber();

	public abstract int getColumnNumber();

	public abstract boolean isWhitespace()
		throws XmlPullParserException;

	public abstract String getText();

	public abstract char[] getTextCharacters(int ai[]);

	public abstract String getNamespace();

	public abstract String getName();

	public abstract String getPrefix();

	public abstract boolean isEmptyElementTag()
		throws XmlPullParserException;

	public abstract int getAttributeCount();

	public abstract String getAttributeNamespace(int i);

	public abstract String getAttributeName(int i);

	public abstract String getAttributePrefix(int i);

	public abstract String getAttributeType(int i);

	public abstract boolean isAttributeDefault(int i);

	public abstract String getAttributeValue(int i);

	public abstract String getAttributeValue(String s, String s1);

	public abstract int getEventType()
		throws XmlPullParserException;

	public abstract int next()
		throws XmlPullParserException, IOException;

	public abstract int nextToken()
		throws XmlPullParserException, IOException;

	public abstract void require(int i, String s, String s1)
		throws XmlPullParserException, IOException;

	public abstract String nextText()
		throws XmlPullParserException, IOException;

	public abstract int nextTag()
		throws XmlPullParserException, IOException;

}
