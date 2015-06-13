// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   EncodedKeySpec.java

package java.security.spec;


// Referenced classes of package java.security.spec:
//			KeySpec

public abstract class EncodedKeySpec
	implements KeySpec
{

	public EncodedKeySpec(byte encodedKey[])
	{
		throw new RuntimeException("Stub!");
	}

	public byte[] getEncoded()
	{
		throw new RuntimeException("Stub!");
	}

	public abstract String getFormat();
}
