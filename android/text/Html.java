// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Html.java

package android.text;

import android.graphics.drawable.Drawable;
import org.xml.sax.XMLReader;

// Referenced classes of package android.text:
//			Spanned, Editable

public class Html
{
	public static interface TagHandler
	{

		public abstract void handleTag(boolean flag, String s, Editable editable, XMLReader xmlreader);
	}

	public static interface ImageGetter
	{

		public abstract Drawable getDrawable(String s);
	}


	Html()
	{
		throw new RuntimeException("Stub!");
	}

	public static Spanned fromHtml(String source)
	{
		throw new RuntimeException("Stub!");
	}

	public static Spanned fromHtml(String source, ImageGetter imageGetter, TagHandler tagHandler)
	{
		throw new RuntimeException("Stub!");
	}

	public static String toHtml(Spanned text)
	{
		throw new RuntimeException("Stub!");
	}
}
