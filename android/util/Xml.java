// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Xml.java

package android.util;

import java.io.*;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package android.util:
//			AttributeSet

public class Xml
{
	public static final class Encoding extends Enum
	{

		public static final Encoding ISO_8859_1;
		public static final Encoding US_ASCII;
		public static final Encoding UTF_16;
		public static final Encoding UTF_8;
		private static final Encoding $VALUES[];

		public static final Encoding[] values()
		{
			return (Encoding[])$VALUES.clone();
		}

		public static Encoding valueOf(String name)
		{
			return (Encoding)Enum.valueOf(android/util/Xml$Encoding, name);
		}

		static 
		{
			ISO_8859_1 = new Encoding("ISO_8859_1", 0);
			US_ASCII = new Encoding("US_ASCII", 1);
			UTF_16 = new Encoding("UTF_16", 2);
			UTF_8 = new Encoding("UTF_8", 3);
			$VALUES = (new Encoding[] {
				ISO_8859_1, US_ASCII, UTF_16, UTF_8
			});
		}

		private Encoding(String s, int i)
		{
			super(s, i);
		}
	}


	public static String FEATURE_RELAXED;

	public Xml()
	{
		throw new RuntimeException("Stub!");
	}

	public static void parse(String xml, ContentHandler contentHandler)
		throws SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public static void parse(Reader in, ContentHandler contentHandler)
		throws IOException, SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public static void parse(InputStream in, Encoding encoding, ContentHandler contentHandler)
		throws IOException, SAXException
	{
		throw new RuntimeException("Stub!");
	}

	public static XmlPullParser newPullParser()
	{
		throw new RuntimeException("Stub!");
	}

	public static XmlSerializer newSerializer()
	{
		throw new RuntimeException("Stub!");
	}

	public static Encoding findEncodingByName(String encodingName)
		throws UnsupportedEncodingException
	{
		throw new RuntimeException("Stub!");
	}

	public static AttributeSet asAttributeSet(XmlPullParser parser)
	{
		throw new RuntimeException("Stub!");
	}
}
