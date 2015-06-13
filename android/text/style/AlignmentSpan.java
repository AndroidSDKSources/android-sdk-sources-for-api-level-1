// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AlignmentSpan.java

package android.text.style;

import android.text.Layout;

// Referenced classes of package android.text.style:
//			ParagraphStyle

public interface AlignmentSpan
	extends ParagraphStyle
{
	public static class Standard
		implements AlignmentSpan
	{

		public android.text.Layout.Alignment getAlignment()
		{
			throw new RuntimeException("Stub!");
		}

		public Standard(android.text.Layout.Alignment align)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract android.text.Layout.Alignment getAlignment();
}
