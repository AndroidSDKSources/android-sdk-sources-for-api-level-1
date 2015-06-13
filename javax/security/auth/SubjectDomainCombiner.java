// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SubjectDomainCombiner.java

package javax.security.auth;

import java.security.DomainCombiner;
import java.security.ProtectionDomain;

// Referenced classes of package javax.security.auth:
//			Subject

public class SubjectDomainCombiner
	implements DomainCombiner
{

	public SubjectDomainCombiner(Subject subject)
	{
		throw new RuntimeException("Stub!");
	}

	public Subject getSubject()
	{
		throw new RuntimeException("Stub!");
	}

	public ProtectionDomain[] combine(ProtectionDomain currentDomains[], ProtectionDomain assignedDomains[])
	{
		throw new RuntimeException("Stub!");
	}
}
