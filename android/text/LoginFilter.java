// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   LoginFilter.java

package android.text;


// Referenced classes of package android.text:
//			InputFilter, Spanned

public abstract class LoginFilter
	implements InputFilter
{
	public static class PasswordFilterGMail extends LoginFilter
	{

		public boolean isAllowed(char c)
		{
			throw new RuntimeException("Stub!");
		}

		public PasswordFilterGMail()
		{
			throw new RuntimeException("Stub!");
		}

		public PasswordFilterGMail(boolean appendInvalid)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class UsernameFilterGeneric extends LoginFilter
	{

		public boolean isAllowed(char c)
		{
			throw new RuntimeException("Stub!");
		}

		public UsernameFilterGeneric()
		{
			throw new RuntimeException("Stub!");
		}

		public UsernameFilterGeneric(boolean appendInvalid)
		{
			throw new RuntimeException("Stub!");
		}
	}

	public static class UsernameFilterGMail extends LoginFilter
	{

		public boolean isAllowed(char c)
		{
			throw new RuntimeException("Stub!");
		}

		public UsernameFilterGMail()
		{
			throw new RuntimeException("Stub!");
		}

		public UsernameFilterGMail(boolean appendInvalid)
		{
			throw new RuntimeException("Stub!");
		}
	}


	LoginFilter()
	{
		throw new RuntimeException("Stub!");
	}

	public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend)
	{
		throw new RuntimeException("Stub!");
	}

	public void onStart()
	{
		throw new RuntimeException("Stub!");
	}

	public void onInvalidCharacter(char c)
	{
		throw new RuntimeException("Stub!");
	}

	public void onStop()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isAllowed(char c);
}
