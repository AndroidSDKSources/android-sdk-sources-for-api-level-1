// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   CertPathBuilderResult.java

package java.security.cert;


// Referenced classes of package java.security.cert:
//			CertPath

public interface CertPathBuilderResult
	extends Cloneable
{

	public abstract Object clone();

	public abstract CertPath getCertPath();
}
