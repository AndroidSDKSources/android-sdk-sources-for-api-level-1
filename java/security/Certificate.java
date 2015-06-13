// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Certificate.java

package java.security;

import java.io.*;

// Referenced classes of package java.security:
//			KeyException, Principal, PublicKey

public interface Certificate
{

	public abstract void decode(InputStream inputstream)
		throws KeyException, IOException;

	public abstract void encode(OutputStream outputstream)
		throws KeyException, IOException;

	public abstract String getFormat();

	public abstract Principal getGuarantor();

	public abstract Principal getPrincipal();

	public abstract PublicKey getPublicKey();

	public abstract String toString(boolean flag);
}
