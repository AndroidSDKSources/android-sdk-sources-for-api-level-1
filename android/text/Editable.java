// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Editable.java

package android.text;


// Referenced classes of package android.text:
//			GetChars, Spannable, InputFilter

public interface Editable
	extends CharSequence, GetChars, Spannable, Appendable
{
	public static class Factory
	{

		public static Factory getInstance()
		{
			throw new RuntimeException("Stub!");
		}

		public Editable newEditable(CharSequence source)
		{
			throw new RuntimeException("Stub!");
		}

		public Factory()
		{
			throw new RuntimeException("Stub!");
		}
	}


	public abstract Editable replace(int i, int j, CharSequence charsequence, int k, int l);

	public abstract Editable replace(int i, int j, CharSequence charsequence);

	public abstract Editable insert(int i, CharSequence charsequence, int j, int k);

	public abstract Editable insert(int i, CharSequence charsequence);

	public abstract Editable delete(int i, int j);

	public abstract Editable append(CharSequence charsequence);

	public abstract Editable append(CharSequence charsequence, int i, int j);

	public abstract Editable append(char c);

	public abstract void clear();

	public abstract void clearSpans();

	public abstract void setFilters(InputFilter ainputfilter[]);

	public abstract InputFilter[] getFilters();
}
