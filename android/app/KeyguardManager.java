// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   KeyguardManager.java

package android.app;


public class KeyguardManager
{
	public static interface OnKeyguardExitResult
	{

		public abstract void onKeyguardExitResult(boolean flag);
	}

	public class KeyguardLock
	{

		final KeyguardManager this$0;

		public void disableKeyguard()
		{
			throw new RuntimeException("Stub!");
		}

		public void reenableKeyguard()
		{
			throw new RuntimeException("Stub!");
		}

		KeyguardLock()
		{
			this$0 = KeyguardManager.this;
			super();
			throw new RuntimeException("Stub!");
		}
	}


	KeyguardManager()
	{
		throw new RuntimeException("Stub!");
	}

	public KeyguardLock newKeyguardLock(String tag)
	{
		throw new RuntimeException("Stub!");
	}

	public boolean inKeyguardRestrictedInputMode()
	{
		throw new RuntimeException("Stub!");
	}

	public void exitKeyguardSecurely(OnKeyguardExitResult callback)
	{
		throw new RuntimeException("Stub!");
	}
}
