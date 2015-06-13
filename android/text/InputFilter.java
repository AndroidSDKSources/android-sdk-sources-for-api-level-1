// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InputFilter.java

package android.text;


// Referenced classes of package android.text:
//			Spanned

public interface InputFilter
{
	public static class LengthFilter
		implements InputFilter
	{

		public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend)
		{
			throw new RuntimeException("Stub!");
		}

		public LengthFilter(int max)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class AllCaps
		implements InputFilter
	{

		public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend)
		{
			throw new RuntimeException("Stub!");
		}

		public AllCaps()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l);
}
