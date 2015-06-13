// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AndroidCharacter.java

package android.text;


public class AndroidCharacter
{

	public AndroidCharacter()
	{
		throw new RuntimeException("Stub!");
	}

	public static native void getDirectionalities(char ac[], byte abyte0[], int i);

	public static native boolean mirror(char ac[], int i, int j);

	public static native char getMirror(char c);
}
