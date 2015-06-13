// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SecureClassLoader.java

package java.security;

import java.nio.ByteBuffer;

// Referenced classes of package java.security:
//			CodeSource, PermissionCollection

public class SecureClassLoader extends ClassLoader
{

	protected SecureClassLoader()
	{
		throw new RuntimeException("Stub!");
	}

	protected SecureClassLoader(ClassLoader parent)
	{
		throw new RuntimeException("Stub!");
	}

	protected PermissionCollection getPermissions(CodeSource codesource)
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class defineClass(String name, byte b[], int off, int len, CodeSource cs)
	{
		throw new RuntimeException("Stub!");
	}

	protected final Class defineClass(String name, ByteBuffer b, CodeSource cs)
	{
		throw new RuntimeException("Stub!");
	}
}
