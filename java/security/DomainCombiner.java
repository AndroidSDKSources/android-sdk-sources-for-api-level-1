// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   DomainCombiner.java

package java.security;


// Referenced classes of package java.security:
//			ProtectionDomain

public interface DomainCombiner
{

	public abstract ProtectionDomain[] combine(ProtectionDomain aprotectiondomain[], ProtectionDomain aprotectiondomain1[]);
}
