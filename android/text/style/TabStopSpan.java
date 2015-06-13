// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TabStopSpan.java

package android.text.style;


// Referenced classes of package android.text.style:
//			ParagraphStyle

public interface TabStopSpan
	extends ParagraphStyle
{
	public static class Standard
		implements TabStopSpan
	{

		public int getTabStop()
		{
			throw new RuntimeException("Stub!");
		}

		public Standard(int where)
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract int getTabStop();
}
