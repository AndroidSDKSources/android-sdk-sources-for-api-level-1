// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Spannable.java

package android.text;


// Referenced classes of package android.text:
//			Spanned

public interface Spannable
	extends Spanned
{
	public static class Factory
	{

		public static Factory getInstance()
		{
			throw new RuntimeException("Stub!");
		}

		public Spannable newSpannable(CharSequence source)
		{
			throw new RuntimeException("Stub!");
		}

		public Factory()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract void setSpan(Object obj, int i, int j, int k);

	public abstract void removeSpan(Object obj);
}
